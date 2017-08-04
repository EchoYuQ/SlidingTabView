package com.lixue.aibei.slidingtitlebar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lixue.aibei.slidingtitlebarlib.SlidingTabScript;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SlidingTabScript slidingTabScript;
    private ViewPager viewPager;
    private List<Fragment> mFragmentList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initView();
        initData();
    }

    private void initView() {
        slidingTabScript = (SlidingTabScript) findViewById(R.id.slidingTabScript);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
    }

    private void initData() {
//        int length = slidingTabScript.getTabCount();
        //增加一个标题
//        slidingTabScript.setTabViewFactory(new SlidingTabScript.TabViewFactory() {
//            @Override
//            public void addTabs(ViewGroup parent, int defaultPosition) {
//                TextView textView = new TextView(MainActivity.this);
//                textView.setText("我的");
//                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
//                lp.leftMargin = 16;
//                lp.rightMargin = 16;
//                textView.setLayoutParams(lp);
////                textView.setPadding(0, 12, 0, 14);
//                textView.setGravity(Gravity.CENTER);
//                textView.setBackgroundResource(R.drawable.selector_slide_title);
////                textView.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_slide_title));
//                textView.setTextColor(getResources().getColor(R.color.selector_slide_title));
//                textView.setTextSize(14);
//                parent.addView(textView);
//            }
//        });

//        List<String> nameStr = slidingTabScript.getTabName();
//        viewPager.setAdapter(new ViewPagerAdapter(MainActivity.this, nameStr));
        mFragmentList.add(new MyFragment1());
        mFragmentList.add(new MyFragment2());
        mFragmentList.add(new MyFragment3());
        mFragmentList.add(new MyFragment4());
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), MainActivity.this, mFragmentList));
        slidingTabScript.setViewPager(viewPager);

        slidingTabScript.selectTab(0);
    }


}
