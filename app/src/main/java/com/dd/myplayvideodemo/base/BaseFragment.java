package com.dd.myplayvideodemo.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.dd.myplayvideodemo.R;
import com.gyf.immersionbar.ImmersionBar;
import com.gyf.immersionbar.components.SimpleImmersionFragment;

import butterknife.ButterKnife;

/**
 * create by libo
 * create on 2020-05-19
 * description
 */
public abstract class BaseFragment extends SimpleImmersionFragment {
    protected View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(setLayoutId(), container, false);
        ButterKnife.bind(this, rootView);

        init();
        return rootView;
    }

    protected abstract int setLayoutId();

    protected abstract void init();

}
