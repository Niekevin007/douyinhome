package com.dd.myplayvideodemo.fragment;

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
 * create by libo
 * create on 2020-05-19
 * description 主页fragment
 */
public class CityFragment extends BaseFragment {


    @Override
    protected int setLayoutId() {
        return R.layout.fragment_ourcity;
    }

    @Override
    protected void init() {

    }

    @Override
    public void initImmersionBar() {

            ImmersionBar.with(this)

                    .init();

    }
}
