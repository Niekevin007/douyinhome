package com.dd.myplayvideodemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/*
* 避免首页滑动冲突
* */
public class XViewPager extends ViewPager {

    // 是否禁止 viewpager 左右滑动
    private boolean xScroll = true;

    public void setSlide(boolean slide) {
        this.xScroll = slide;
    }

    public XViewPager(@NonNull Context context) {
        super(context);
    }

    public XViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        if (xScroll) {
            return false;
        } else {
            return super.onTouchEvent(arg0);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        if (xScroll) {
            return false;
        } else {
            return super.onInterceptTouchEvent(arg0);
        }
    }
    @Override
    public void setCurrentItem(int item) {
        //去除页面切换时的滑动翻页效果
        super.setCurrentItem(item, false);
    }
}