package com.example.android.creatememo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopLayoutFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMemo(String top, String bottom) {
        BottomLayoutFragment bottomLayoutFragment = (BottomLayoutFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        bottomLayoutFragment.setMemo(top,bottom);
    }


}
