package com.lixue.aibei.slidingtitlebar;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by yuqingyq on 2017/8/4.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private List<Fragment> mFragmentList;

    public MyViewPagerAdapter(FragmentManager fragmentManager,
                              Context context, List<Fragment> fragmentList) {
        super(fragmentManager);
        this.mContext = context;
        this.mFragmentList = fragmentList;
    }


    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }
}
