package com.dd.myplayvideodemo.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dd.myplayvideodemo.R;
import com.dd.myplayvideodemo.bean.HomeListBeans;
import com.dd.myplayvideodemo.view.LoadingView;
import com.pili.pldroid.player.widget.PLVideoView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HomeListAdapter extends BaseQuickAdapter<HomeListBeans.BodyBean.RecordsBean, BaseViewHolder> implements LoadMoreModule {

    private LoadingView loadingView;

    /**
     * 构造方法，此示例中，在实例化Adapter时就传入了一个List。
     * 如果后期设置数据，不需要传入初始List，直接调用 super(layoutResId); 即可
     */
    public HomeListAdapter(List<HomeListBeans.BodyBean.RecordsBean> list) {
        super(R.layout.item_movie_list, list);
    }

    /**
     * 在此方法中设置item数据
     */
    @Override
    protected void convert(@NotNull BaseViewHolder helper, @NotNull HomeListBeans.BodyBean.RecordsBean item) {


    }
}