package com.example.androidnc_assignmentgd1.frag;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidnc_assignmentgd1.DangKyActivity2;
import com.example.androidnc_assignmentgd1.R;


public class UserFragment extends Fragment {

    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        Button dk = view.findViewById(R.id.btnDk);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DangKyActivity2.class);
                startActivity(intent);
            }
        });
        return view;
    }

}