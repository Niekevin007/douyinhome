package com.dd.myplayvideodemo.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.dd.myplayvideodemo.R;
import com.dd.myplayvideodemo.adapter.HomeListAdapter;
import com.dd.myplayvideodemo.adapter.HomeListAdapter2;
import com.dd.myplayvideodemo.base.BaseFragment;
import com.dd.myplayvideodemo.view.LoadingView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomeListFragment extends BaseFragment {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    private HomeListAdapter2 adapter;
    private List<String> mList = new ArrayList<>();
    private PagerSnapHelper helper;

//    LoadingView loadingView;


    @Override
    protected int setLayoutId() {
        return R.layout.fragment_home_list;
    }

    @Override
    protected void init() {
        adapter = new HomeListAdapter2( mList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerView.setAdapter(adapter);
//        helper = new PagerSnapHelper();
//        recyclerView.setOnFlingListener(null);
//        helper.attachToRecyclerView(recyclerView);
/*
        loadingView = new LoadingView(getActivity());
        loadingView.start();
        if (refreshLayout != null) {
            refreshLayout.setRefreshContent(loadingView);
        }*/

        mList.add("chen");
        mList.add("chen");
        mList.add("chen");
        adapter.notifyDataSetChanged();
    }

    @Override
    public void initImmersionBar() {

    }
}
