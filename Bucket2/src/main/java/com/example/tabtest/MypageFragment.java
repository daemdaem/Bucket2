package com.example.tabtest;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MypageFragment extends Fragment {

    public MypageFragment() {
    }

    public static MypageFragment newInstance() {
        return new MypageFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.mypage, container, false);

        TabLayout tabLayout = view.findViewById(R.id.tl_mypage);
        ViewPager viewPager = view.findViewById(R.id.vp_mypage);

        Fragment[] arrFragments = new Fragment[2];
        arrFragments[0] = new MypageFragment_1();
        arrFragments[1] = new MypageFragment_2();

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), arrFragments);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

    public static class ViewPagerAdapter extends FragmentPagerAdapter {

        private Fragment[] arrFragments;

        public ViewPagerAdapter(FragmentManager fm, Fragment[] arrFragments) {
            super(fm);
            this.arrFragments = arrFragments;
        }

        @Override
        public int getCount() {
            return arrFragments.length;
        }

        @Override
        public Fragment getItem(int position)  {
            return arrFragments[position];
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "RED";
                case 1:
                    return "YELLOW";
                default:
                    return "";
            }
        }
    }
}