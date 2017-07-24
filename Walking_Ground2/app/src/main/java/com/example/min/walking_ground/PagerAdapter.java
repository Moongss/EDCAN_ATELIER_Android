package com.example.min.walking_ground;

import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.min.walking_ground.Fragment.FragmentMain;
import com.example.min.walking_ground.Fragment.FragmentSetting;

/**
 * Created by min on 2017. 7. 24..
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int tabCount;

    public PagerAdapter(android.support.v4.app.FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }
    public PagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentMain();
            case 1:
                return new FragmentSetting();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 2;
    }
}
