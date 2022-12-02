package com.example.androidnc_assignmentgd1.frag;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidnc_assignmentgd1.R;
import com.example.androidnc_assignmentgd1.adapter.viewAdpter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class NewsFragment extends Fragment {

    ViewPager2 viewPager2;
    TabLayout tabLayout;
    private viewAdpter view1;

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        viewPager2 = view.findViewById(R.id.viewPage);
        tabLayout = view.findViewById(R.id.tabLayout);
        view1 = new viewAdpter(getActivity());
        viewPager2.setAdapter(view1);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Tab1");
                        break;
                    case 1:
                        tab.setText("Tab2");
                        break;
                    case 2:
                        tab.setText("Tab3");
                        break;
                }
            }
        }).attach();
        return view;
    }
}