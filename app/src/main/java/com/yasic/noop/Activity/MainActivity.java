package com.yasic.noop.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;
import com.yasic.noop.Adapter.ViewPagerAdapter;
import com.yasic.noop.Fragment.NoteListFgrament;
import com.yasic.noop.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /**
     * viewpager实例
     */
    private ViewPager viewPager;

    /**
     * 存储fragment列表
     */
    private List<Fragment> fragmentList;

    /**
     * toolbar实例
     */
    private Toolbar toolbar;

    /**
     * 主界面的tablayout
     */
    private TabLayout tlMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        initFAB();
        initViewPagerAndFragment();
    }

    private void initToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void initFAB(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initViewPagerAndFragment(){
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        List<String> titleList = new ArrayList<>();
        fragmentList = new ArrayList<>();
        titleList.add("Note");
        titleList.add("Note Book");
        titleList.add("More");
        fragmentList.add(new NoteListFgrament());
        fragmentList.add(new NoteListFgrament());
        fragmentList.add(new NoteListFgrament());
        tlMain = (TabLayout)findViewById(R.id.tl_main);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), titleList, fragmentList));

        tlMain.setupWithViewPager(viewPager);
        tlMain.setTabMode(TabLayout.MODE_FIXED);
        getSupportFragmentManager().beginTransaction().commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
