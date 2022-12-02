package com.example.androidnc_assignmentgd1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.androidnc_assignmentgd1.frag.MusicFragment;
import com.example.androidnc_assignmentgd1.frag.NewsFragment;
import com.example.androidnc_assignmentgd1.frag.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView view = findViewById(R.id.bottom_nav);
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.chat:
                        NewsFragment nf = new NewsFragment();
                        replaceFrg(nf);
                        break;
                    case R.id.user:
                        UserFragment uf = new UserFragment();
                        replaceFrg(uf);
                        break;
                    case R.id.music:
                        MusicFragment mf = new MusicFragment();
                        replaceFrg(mf);
                        break;
                    }
                return true;
                }
            });
        }
    public void replaceFrg(Fragment frg){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.framer,frg).commit();
    }
}
