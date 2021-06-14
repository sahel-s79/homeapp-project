package com.example.homeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        ViewPager vp = findViewById ( R.id.viewpager );
        PagerAdapter PA = new PagerAdapter ( getSupportFragmentManager ( ) );
        vp.setAdapter ( PA );
        TabLayout tL = findViewById ( R.id.sliding_tabs );
        tL.setupWithViewPager ( vp );
    }
}

