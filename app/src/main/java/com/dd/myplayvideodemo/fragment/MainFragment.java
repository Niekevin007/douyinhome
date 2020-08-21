package com.dd.myplayvideodemo.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


import com.androidkun.xtablayout.XTabLayout;
import com.dd.myplayvideodemo.R;
import com.dd.myplayvideodemo.adapter.CommPagerAdapter;
import com.dd.myplayvideodemo.base.BaseFragment;
import com.dd.myplayvideodemo.bean.MainPageChangeEvent;
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
public class MainFragment extends BaseFragment {
    private HomeFragment currentLocationFragment;
    private Fragment recommendFragment;
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.tab_mainmenu)
    XTabLayout tabMainMenu;
    @BindView(R.id.main_ui_rv)
    RelativeLayout main_ui_rv;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private CommPagerAdapter pagerAdapter;
    /** 默认显示第一页推荐页 */
    public static int curPage = 1;

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void init() {

        setMainMenu();
        setFragments();
    }


    private void setFragments() {



        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                curPage = position;

                if(position!=0){
                    RxBus.getDefault().post(new MainPageChangeEvent(1));
                }else{
                    RxBus.getDefault().post(new MainPageChangeEvent(0));
                }

                if (position == 1) {
                    //继续播放
                    RxBus.getDefault().post(new PauseVideoEvent(true));
                } else {
                    //切换到其他页面，需要暂停视频
                    RxBus.getDefault().post(new PauseVideoEvent(false));
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setMainMenu() {

        currentLocationFragment = new HomeFragment();
        recommendFragment = new Fragment();

        fragments.add(currentLocationFragment);
        fragments.add(new Fragment());
        fragments.add(new CityFragment());
        fragments.add(recommendFragment);
        fragments.add(new Fragment());

        pagerAdapter = new CommPagerAdapter(getChildFragmentManager(), fragments, new String[] {"首页", "同城","","消息","我"});
        viewPager.setOffscreenPageLimit(5);
        viewPager.setAdapter(pagerAdapter);

        tabMainMenu.addTab(tabMainMenu.newTab().setText("首页"));
        tabMainMenu.addTab(tabMainMenu.newTab().setText("好友"));
        tabMainMenu.addTab(tabMainMenu.newTab().setText(""));
        tabMainMenu.addTab(tabMainMenu.newTab().setText("消息"));
        tabMainMenu.addTab(tabMainMenu.newTab().setText("我"));

        tabMainMenu.setupWithViewPager(viewPager);


    }


    @Override
    public void initImmersionBar() {
            ImmersionBar.with(this)
                    .init();
    }

}
