package com.example.ducnguyenvan.pageradapterdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ViewPager mPager;
    private ViewPagerAdapter mPagerAdapter;
    private int[] mImageResources = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPager = (ViewPager) findViewById(R.id.viewPager);
        mPager.setOffscreenPageLimit(1);
        mPagerAdapter = new ViewPagerAdapter(this, mImageResources);
        mPager.setAdapter(mPagerAdapter);
    }
}
