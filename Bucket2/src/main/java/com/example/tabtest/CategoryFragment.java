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

public class CategoryFragment extends Fragment {

    public CategoryFragment() {
    }

    public static CategoryFragment newInstance() {
        return new CategoryFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.category, container, false);

        TabLayout tabLayout = view.findViewById(R.id.tl_category);
        ViewPager viewPager = view.findViewById(R.id.vp_category);

        Fragment[] arrFragments = new Fragment[5];
        arrFragments[0] = new CategoryFragment_1();
        arrFragments[1] = new CategoryFragment_2();
        arrFragments[2] = new CategoryFragment_3();
        arrFragments[3] = new CategoryFragment_4();
        arrFragments[4] = new CategoryFragment_5();

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
                    return "Do";
                case 1:
                    return "Eat";
                case 2:
                    return "Have";
                case 3:
                    return "See";
                case 4:
                    return "Go";
                default:
                    return "";
            }
        }
    }
}