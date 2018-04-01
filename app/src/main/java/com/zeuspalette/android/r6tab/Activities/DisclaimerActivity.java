package com.zeuspalette.android.r6tab.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

import java.lang.reflect.Field;

public class DisclaimerActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    private ZUtils zUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        mFragmentManager = getSupportFragmentManager();

        mBottomNavigationView = findViewById(R.id.bottomnavigation_main);

        zUtils = new ZUtils();

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back_white_24px);
        actionbar.setTitle("About");

        //Setup links for Ubisoft and Github

        ImageView ubisoftLink = findViewById(R.id.ubisoft_link);
        Picasso.with(this).load(R.drawable.ubisoft).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this,250),zUtils.getPixelfromDP(this,100)).into(ubisoftLink);
        ubisoftLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rainbow6.ubisoft.com/siege/en-us/home/index.aspx"));
                startActivity(browserIntent);
            }
        });

        ImageView githubLink = findViewById(R.id.github_link);
        Picasso.with(this).load(R.drawable.github).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this,250),zUtils.getPixelfromDP(this,100)).into(githubLink);
        githubLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/jeevak001/R6Companion"));
                startActivity(browserIntent);
            }
        });


        Button ubiLink = findViewById(R.id.ubilink);
        ubiLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rainbow6.ubisoft.com/siege/en-us/home/index.aspx"));
                startActivity(browserIntent);
            }
        });

        Button mapLink = findViewById(R.id.maplink);
        mapLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.r6maps.com/"));
                startActivity(browserIntent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }




    /* Helper Methods */


    @SuppressLint("RestrictedApi")
    private void disableShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                item.setShiftingMode(false);
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            Log.e("BNVHelper", "Unable to get shift mode field", e);
        } catch (IllegalAccessException e) {
            Log.e("BNVHelper", "Unable to change value of shift mode", e);
        }
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }


}
