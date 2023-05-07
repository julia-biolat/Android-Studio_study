package com.example.project6_04_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecdog = tabHost.newTabSpec("dog").setIndicator("강아지");
        tabSpecdog.setContent(R.id.dog);
        tabHost.addTab(tabSpecdog);
        TabHost.TabSpec tabSpeccat = tabHost.newTabSpec("cat").setIndicator("고양이");
        tabSpeccat.setContent(R.id.cat);
        tabHost.addTab(tabSpeccat);
        TabHost.TabSpec tabSpecrab = tabHost.newTabSpec("rab").setIndicator("토끼");
        tabSpecrab.setContent(R.id.rab);
        tabHost.addTab(tabSpecrab);
        TabHost.TabSpec tabSpechorse = tabHost.newTabSpec("horse").setIndicator("말");
        tabSpechorse.setContent(R.id.horse);
        tabHost.addTab(tabSpechorse);

        tabHost.setCurrentTab(0);
    }



}