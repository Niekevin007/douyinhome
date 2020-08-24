package com.dd.myplayvideodemo.fragment;

import com.dd.myplayvideodemo.R;
import com.dd.myplayvideodemo.base.BaseFragment;
import com.gyf.immersionbar.ImmersionBar;

/**
 * create by libo
 * create on 2020-05-19
 * description 主页fragment
 */
public class UserHomeFragment extends BaseFragment {


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
