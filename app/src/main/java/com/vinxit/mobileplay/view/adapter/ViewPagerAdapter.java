package com.vinxit.mobileplay.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.vinxit.mobileplay.view.fragments.MainFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vinxit_HK on 2017/10/12.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{
    private List<FragmentInfo> mFragments = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }
    private void initFragments(){
        mFragments.add(new FragmentInfo("推荐", MainFragment.newInstance(1)));
    }
    public static class FragmentInfo{
        private String title;
        private Fragment fragment;
        public FragmentInfo(String title, Fragment fragment) {
            this.title = title;
            this.fragment = fragment;
        }
    }
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

}
