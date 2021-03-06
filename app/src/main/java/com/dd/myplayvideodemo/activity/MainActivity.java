package com.dd.myplayvideodemo.activity;


import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.dd.myplayvideodemo.R;
import com.dd.myplayvideodemo.adapter.CommPagerAdapter;
import com.dd.myplayvideodemo.base.BaseActivity;
import com.dd.myplayvideodemo.bean.MainPageChangeEvent;
import com.dd.myplayvideodemo.bean.PauseVideoEvent;
import com.dd.myplayvideodemo.event.RxBus;
import com.dd.myplayvideodemo.fragment.MainFragment;
import com.dd.myplayvideodemo.fragment.UserHomeFragment;
import com.dd.myplayvideodemo.utils.Config;
import com.dd.myplayvideodemo.view.HomeViewPager;
import java.util.ArrayList;

import butterknife.BindView;
import rx.functions.Action1;

public class MainActivity extends BaseActivity {

    @BindView(R.id.viewpager)
    HomeViewPager viewPager;

    private CommPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    public static int curMainPage;
    private MainFragment mainFragment = new MainFragment();
    private UserHomeFragment personalHomeFragment = new UserHomeFragment();
    /** 上次点击返回键时间 */
    private long lastTime;
    /** 连续按返回键退出时间 */
    private final int EXIT_TIME = 2000;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void init() {

        fragments.add(mainFragment);
        fragments.add(personalHomeFragment);
        pagerAdapter = new CommPagerAdapter(getSupportFragmentManager(), fragments, new String[]{"",""});
        viewPager.setAdapter(pagerAdapter);
        viewPager.setSlide(false);
        //点击头像切换页面
        RxBus.getDefault().toObservable(MainPageChangeEvent.class)
                .subscribe((Action1<MainPageChangeEvent>) event -> {

                    if(viewPager!=null){
                    if(event.getPage()==0){
                        viewPager.setSlide(false);
                    }else if(event.getPage()==1){
                        viewPager.setSlide(true);
                    }
                    }
                });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                curMainPage = position;

                if (position == 0) {
                    RxBus.getDefault().post(new PauseVideoEvent(true));
                } else if (position == 1){
                    RxBus.getDefault().post(new PauseVideoEvent(false));
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}