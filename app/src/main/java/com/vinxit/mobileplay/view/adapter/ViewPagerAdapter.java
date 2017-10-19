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
    private List<FragmentInfo> mFragmentInfos = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        initFragments();
    }
    private void initFragments(){
        mFragmentInfos.add(new FragmentInfo("推荐", MainFragment.newInstance(1)));
        mFragmentInfos.add(new FragmentInfo("分类", MainFragment.newInstance(2)));
        mFragmentInfos.add(new FragmentInfo("排行", MainFragment.newInstance(3)));
        mFragmentInfos.add(new FragmentInfo("游戏", MainFragment.newInstance(4)));
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
        return mFragmentInfos.get(position).fragment;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentInfos.get(position).title;
    }

    @Override
    public int getCount() {
        return mFragmentInfos.size();
    }

}
