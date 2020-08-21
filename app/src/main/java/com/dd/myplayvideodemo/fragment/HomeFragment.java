package com.dd.myplayvideodemo.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.dd.myplayvideodemo.R;
import com.dd.myplayvideodemo.adapter.CommPagerAdapter;
import com.dd.myplayvideodemo.base.BaseFragment;
import com.dd.myplayvideodemo.bean.PauseVideoEvent;
import com.dd.myplayvideodemo.event.RxBus;
import com.gyf.immersionbar.ImmersionBar;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * 推荐同城界面
 */
public class HomeFragment extends BaseFragment {
    private HomeListFragment currentLocationFragment;
    private HomeListFragment recommendFragment;
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.tab_title)
    XTabLayout tabTitle;
    @BindView(R.id.status_line)
    View status_line;
    @BindView(R.id.main_ui_rv)
    RelativeLayout main_ui_rv;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private CommPagerAdapter pagerAdapter;
    /** 默认显示第一页推荐页 */
    public static int curPage = 1;

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init() {
        initStatus();
        setFragments();
    }

    /*
    *  动态设置标题栏置黑
    * */
    private void initStatus() {
        RelativeLayout relativeLayout = new RelativeLayout(getActivity());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT   ,
               getStatusBarHeight(getActivity())));

        status_line.setLayoutParams(relativeLayout.getLayoutParams());
    }

    private void setFragments() {
        currentLocationFragment = new HomeListFragment();
        recommendFragment = new HomeListFragment();
        fragments.add(currentLocationFragment);
        fragments.add(recommendFragment);

        tabTitle.addTab(tabTitle.newTab().setText("海淀"));
        tabTitle.addTab(tabTitle.newTab().setText("推荐"));

        pagerAdapter = new CommPagerAdapter(getChildFragmentManager(), fragments, new String[] {"海淀", "推荐"});
        viewPager.setAdapter(pagerAdapter);
        tabTitle.setupWithViewPager(viewPager);

        tabTitle.getTabAt(1).select();

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                curPage = position;
/*
                if (position == 1) {
                    //继续播放
                    RxBus.getDefault().post(new PauseVideoEvent(true));
                } else {
                    //切换到其他页面，需要暂停视频
                    RxBus.getDefault().post(new PauseVideoEvent(false));
                }*/
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



    @Override
    public void initImmersionBar() {
            ImmersionBar.with(this)
                    .init();
    }


    /**
     * 获取状态栏高度
     * @param context
     * @return
     */
    public static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        int height = resources.getDimensionPixelSize(resourceId);
        return height;
    }
}
