package com.example.nhom9_bai4_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 mViewPager2;
    private CircleIndicator3 mCircleIndicator3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager2 = findViewById(R.id.view_pager_2);
        mCircleIndicator3 = findViewById(R.id.circle_indicator_3);

        PhotoAdapter photoAdapter = new PhotoAdapter(this,getListPhoto());
        mViewPager2.setAdapter(photoAdapter);
        mCircleIndicator3.setViewPager(mViewPager2);
    }

    private List<Photo> getListPhoto() {
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.logo));
        list.add(new Photo(R.drawable.fb_icon));
        list.add(new Photo(R.drawable.gmail_icon));
        list.add(new Photo(R.drawable.gmail_icon_black));

        return list;
    }
}