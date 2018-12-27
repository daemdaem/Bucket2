package com.example.tabtest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    public static final String FRAGMENT_HOME = "FRAGMENT_HOME";
    public static final String FRAGMENT_CATEGORY = "FRAGMENT_CATEGORY";
    public static final String FRAGMENT_WRITE = "FRAGMENT_WRITE";
    public static final String FRAGMENT_MYPAGE = "FRAGMENT_MYPAGE";
    public static final String FRAGMENT_ALERT = "FRAGMENT_ALERT";

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

    {
        mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        replaceFragment(HomeFragment.newInstance(), FRAGMENT_HOME);
                        return true;
                    case R.id.navigation_category:
                        replaceFragment(CategoryFragment.newInstance(), FRAGMENT_CATEGORY);
                        return true;
                    case R.id.navigation_writingpage:
                        replaceFragment(WriteFragment.newInstance(), FRAGMENT_WRITE);
                        return true;
                    case R.id.navigation_mypage:
                        replaceFragment(MypageFragment.newInstance(), FRAGMENT_MYPAGE);
                        return true;
                    case R.id.navigation_notifications:
                        replaceFragment(NotificationFragment.newInstance(), FRAGMENT_ALERT);
                        return true;
                }
                return false;
            }

        };
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
            navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.fragment_container, HomeFragment.newInstance(),FRAGMENT_HOME)
                    .commit();
        }


    private void replaceFragment(Fragment newFragment, String tag) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, newFragment, tag)
                .commit();

    }
        }
