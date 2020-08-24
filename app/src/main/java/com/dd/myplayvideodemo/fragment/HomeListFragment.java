package com.dd.myplayvideodemo.fragment;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.dd.myplayvideodemo.R;
import com.dd.myplayvideodemo.activity.MainActivity;
import com.dd.myplayvideodemo.adapter.HomeListAdapter;
import com.dd.myplayvideodemo.base.BaseFragment;
import com.dd.myplayvideodemo.bean.HomeListBeans;
import com.dd.myplayvideodemo.utils.Config;
import com.dd.myplayvideodemo.view.LoadingView;
import com.google.gson.Gson;
import com.pili.pldroid.player.AVOptions;
import com.pili.pldroid.player.PLOnCompletionListener;
import com.pili.pldroid.player.PLOnErrorListener;
import com.pili.pldroid.player.PLOnInfoListener;
import com.pili.pldroid.player.PLOnPreparedListener;
import com.pili.pldroid.player.PLOnVideoSizeChangedListener;
import com.pili.pldroid.player.widget.PLVideoView;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import okhttp3.Call;

public class HomeListFragment extends BaseFragment implements
        PLOnInfoListener,
        PLOnCompletionListener,
        PLOnVideoSizeChangedListener,
        PLOnErrorListener ,
        PLOnPreparedListener {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    private HomeListAdapter adapter;
    private PagerSnapHelper helper;

//    LoadingView loadingView;
    private LinearLayoutManager linearLayoutManager;
    private PLVideoView videoView;
    private int curPlayPos = -1;

    private List<HomeListBeans.BodyBean.RecordsBean> homeList ;
    private int page = 1;
    private ImageView ivCurCover;

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_home_list;
    }

    @Override
    protected void init() {
        homeList = new ArrayList<>();
        videoView = new PLVideoView(getContext());
        videoView.setDisplayAspectRatio(PLVideoView.ASPECT_RATIO_PAVED_PARENT);
//        movieSetCache();
        adapter = new HomeListAdapter( homeList);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

//        adapter.setOnLoa
        adapter.getLoadMoreModule().setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                page++;
                initMovieList();
            }
        });

        helper = new PagerSnapHelper();
        recyclerView.setOnFlingListener(null);
        helper.attachToRecyclerView(recyclerView);
/*
        loadingView = new LoadingView(getActivity());
        loadingView.start();
        if (refreshLayout != null) {
            refreshLayout.setRefreshContent(loadingView);
        }*/


        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            private int currentPage = -1;
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                if(newState== RecyclerView.SCROLL_STATE_IDLE){//如果滚动结束
                    View snapView = helper.findSnapView(linearLayoutManager);
                    int currentPageIndex = linearLayoutManager.getPosition(snapView);
                    if(currentPage!=currentPageIndex){//防止重复提示
                        currentPage = currentPageIndex;

                        if (ivCurCover != null) {
                            ivCurCover.setVisibility(View.VISIBLE);
                        }

                        Log.d("thispostion","当前是第" + currentPageIndex + "页");
//                        Toast.makeText(MainActivity.this, "当前是第" + currentPageIndex + "页", Toast.LENGTH_SHORT).show();
                        setMovieView (currentPageIndex);
                        if(currentPageIndex<=homeList.size()-2){
                            videoView.addCache(homeList.get(currentPageIndex+1).getResponse().getPlayInfoList().get(0).getPlayURL());
                            videoView.addIOCache(homeList.get(currentPageIndex+1).getResponse().getPlayInfoList().get(0).getPlayURL());

                        }

                    }
                }
            }
        });
/*
        mList.add("http://vod.shiguang.znkjsrv.com/original/workflow/1e40ab73-174113d516f-0006-fcc3-56f-08dd0.mp4");
        mList.add("http://vod.shiguang.znkjsrv.com/original/workflow/300a6760-174113ea9d4-0006-fcc3-56f-08dd0.mp4");
        mList.add("http://vod.shiguang.znkjsrv.com/original/workflow/3620838c-17413edf9ae-0006-fcc3-56f-08dd0.mp4");
        mList.add("http://vod.shiguang.znkjsrv.com/original/workflow/514474c0-174113f6106-0006-fcc3-56f-08dd0.mp4");
        mList.add("http://vod.shiguang.znkjsrv.com/original/workflow/2ea619a0-17411aa395e-0006-fcc3-56f-08dd0.mp4");*/

        adapter.notifyDataSetChanged();


//        Log.d("cuishu1","one");
//
        initMovieList();
    }

    @Override
    public void initImmersionBar() {

    }

    /*
    * 动态设置播放组件
    * */
    private void setMovieView(int index){

        Log.d("cuishu1","one"+index);

        if (index == curPlayPos) {
            return;
        }
        View itemView = linearLayoutManager.findViewByPosition(index);
        if (itemView == null) {
            return;
        }

        ViewGroup rootView = itemView.findViewById(R.id.rl_container);
        curPlayPos = index;
        //切换播放器位置
        dettachParentView(rootView);
        ImageView ivCover = rootView.findViewById(R.id.iv_cover);
        autoPlayVideo(index,ivCover);
    }

    /**
     * 移除videoview父view
     */
    private void dettachParentView(ViewGroup rootView) {
        //1.添加videoview到当前需要播放的item中,添加进item之前，保证ijkVideoView没有父view
        ViewGroup parent = (ViewGroup) videoView.getParent();
        if (parent != null) {
            parent.removeView(videoView);
        }


        videoView.setLayoutParams(rootView.getLayoutParams());
        rootView.addView(videoView, 0);
        videoView.stopPlayback();
    }
    /**
     * 自动播放视频
     */
    private void autoPlayVideo(int position,ImageView ivCover) {

        videoView.setVideoPath(homeList.get(position).getResponse().getPlayInfoList().get(0).getPlayURL());

        videoView.start();

        videoView.setOnPreparedListener(new PLOnPreparedListener() {
            @Override
            public void onPrepared(int i) {
                //延迟取消封面，避免加载视频黑屏
                new CountDownTimer(500, 200) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {
                        ivCover.setVisibility(View.GONE);
                        ivCurCover = ivCover;
                    }
                }.start();
            }
        });
        videoView.setOnInfoListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnVideoSizeChangedListener(this);
        videoView.setOnErrorListener(this);
    }

    /*
    *   加载本地缓存
    * */
    private void movieSetCache(){
        AVOptions options = new AVOptions();

        File f = new File(getActivity().getExternalFilesDir(null).getAbsolutePath() + "/myphoto/");

            Log.d("filepajjfile",f.getAbsolutePath());
        options.setString(AVOptions.KEY_CACHE_DIR, f.getAbsolutePath());
        options.setString(AVOptions.KEY_CACHE_EXT, "djlmv");
        // 请在开始播放之前配置
        videoView.setAVOptions(options);
    }


    @Override
    public void onInfo(int i, int i1) {

//        Log.d("movieinfo","i"+i);
     /*   */
    }

    /*
    * 监听到视频播放结束重新播放
    * */
    @Override
    public void onCompletion() {

//        Log.d("movieinfo2","i");
        videoView.start();
    }

    @Override
    public boolean onError(int i) {

        Log.d("movieinfo3","i"+i+homeList.get(curPlayPos).getResponse().getPlayInfoList().get(0).getPlayURL());
        Toast.makeText(getContext(), "播放异常"+i, Toast.LENGTH_SHORT).show();

          /*  videoView.delCache(homeList.get(curPlayPos).getResponse().getPlayInfoList().get(0).getPlayURL());

            videoView.setVideoPath(homeList.get(curPlayPos).getResponse().getPlayInfoList().get(0).getPlayURL());
            videoView.start();*/

        return false;
    }

    @Override
    public void onVideoSizeChanged(int i, int i1) {

        Log.d("movieinfo4","i"+i);
    }

    @Override
    public void onPrepared(int i) {

        Log.d("movieinfo5","i"+i);
    }

    /*
    *  首页的视频列表获取
    * */
    private void initMovieList(){
        OkHttpUtils
                .post()
                .url("https://newcoin.znkjsrv.com/api/video/broadcast/getVideoList")
                .addHeader("imei", "1231231231")
                .addParams("page", page + "")
                .addParams("size", 10 + "")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.d("onresponse",e.toString());

// 当前这次数据加载错误，调用此方法
                        adapter.getLoadMoreModule().loadMoreFail();
                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Log.d("onresponse",response);
                        HomeListBeans beans = new Gson().fromJson(response,HomeListBeans.class);
                        homeList.addAll(beans.getBody().getRecords());
                        if(page==1) {
                            Message message = Message.obtain();
                            message.what = 0x11;
                            handler.sendMessage(message);
                        }else{
                            // 当前这次数据加载完毕，调用此方法
                            adapter.getLoadMoreModule().loadMoreComplete();
                        }

                    }
                });
    }


    @SuppressLint("HandlerLeak")
    final Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            if (msg.what == 0x11) {


                adapter.notifyDataSetChanged();

                new CountDownTimer(1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {
                        setMovieView (0);
                        videoView.addCache(homeList.get(1).getResponse().getPlayInfoList().get(0).getPlayURL());
                        videoView.addIOCache(homeList.get(1).getResponse().getPlayInfoList().get(0).getPlayURL());

                    }
                }.start();
            }
        }
    };


}
