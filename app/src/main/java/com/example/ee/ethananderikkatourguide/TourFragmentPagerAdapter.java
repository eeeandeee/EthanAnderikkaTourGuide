package com.example.ee.ethananderikkatourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TourFragmentPagerAdapter(Context context, FragmentManager tfm) {
        super(tfm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {

        if (i == 0) {
            return new HotelFragment();
        } else if (i == 1) {
            return new LibraryFragment();
        } else if (i == 2) {
            return new MuseumFragment();
        } else {
            return new PharmacyFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hotels);
        } else if (position == 1) {
            return mContext.getString(R.string.library);
        } else if (position == 2) {
            return mContext.getString(R.string.museums);
        } else {
            return mContext.getString(R.string.pharmacies);
        }
    }
}
