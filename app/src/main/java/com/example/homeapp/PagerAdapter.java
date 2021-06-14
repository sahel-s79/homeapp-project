package com.example.homeapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter
{

    private final  int pageCount=4;
    private String[] tabTitles =new  String[] {"Cost","Income","the budget","the report"};
    PagerAdapter(@NonNull FragmentManager fm) {
        super ( fm ,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT );
    }
    @NonNull
    @Override
    public Fragment getItem(int position){
        switch (position) {
            case 0:
                return new firstfragment ( );
            case 1:
                return new SecondFragment ( );
            case 2:
                return new ThirdFragment ( );
            case 3:
                return new fourthftagment ( );
            default:

                return null;
        }
    }
    @Override
    public  int getCount(){
        return pageCount;
    }
    @NonNull
    @Override
    public  CharSequence getPageTitle(int position){
        return  tabTitles[position];
    }
}
