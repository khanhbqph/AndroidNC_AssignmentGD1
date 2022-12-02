package com.example.androidnc_assignmentgd1.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.androidnc_assignmentgd1.tab.Tab1Fragment;
import com.example.androidnc_assignmentgd1.tab.Tab2Fragment;
import com.example.androidnc_assignmentgd1.tab.Tab3Fragment;

public class viewAdpter extends FragmentStateAdapter {

    public viewAdpter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            case 2:
                return new Tab3Fragment();
        }
        return new Tab1Fragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
