package com.zeuspalette.android.r6tab.Activities;

import android.annotation.SuppressLint;
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

import com.zeuspalette.android.r6tab.Fragments.MapLevelFragment;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;
import com.zeuspalette.android.r6tab.R;

import java.lang.reflect.Field;

public class MapsLocationsActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    public static String mapId;
    public static int mapLevel;
    ZUtils zUtils;

    @Override
    protected void onDestroy() {
        super.onDestroy();

        zUtils.insertSharedPreferenceFloat(this, "customX", 0);
        zUtils.insertSharedPreferenceFloat(this, "customY", 0);
        zUtils.insertSharedPreferenceFloat(this, "customS", 0);

        zUtils = null;
        mFragmentManager = null;
        mBottomNavigationView = null;
        mFragment = null;
        mFragmentTransaction = null;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_location);

        zUtils = new ZUtils();
        mFragmentManager = getSupportFragmentManager();

        mBottomNavigationView = findViewById(R.id.bottomnavigation_main);
        disableShiftMode(mBottomNavigationView);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back_white_24px);


        //Setup Bottom Navigation in Maps to choose between levels and retain their states

        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {


                        switch (item.getItemId()) {
                            case R.id.nav_bottom_base:

                                mapLevel = 0;
                                mFragment = new MapLevelFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_maps, mFragment).commit();
                                break;
                            case R.id.nav_bottom_one:

                                mapLevel = 1;
                                mFragment = new MapLevelFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_maps, mFragment).commit();
                                break;

                            case R.id.nav_bottom_two:

                                mapLevel = 2;
                                mFragment = new MapLevelFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_maps, mFragment).commit();
                                break;

                            case R.id.nav_bottom_three:

                                mapLevel = 3;
                                mFragment = new MapLevelFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_maps, mFragment).commit();
                                break;

                            case R.id.nav_bottom_four:

                                mapLevel = 4;
                                mFragment = new MapLevelFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_maps, mFragment).commit();
                                break;

                        }
                        return true;
                    }
                });


        mapId = getIntent().getStringExtra("map_id");
        mapLevel = 1;
        mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_one);
        mFragment = new MapLevelFragment();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fragment_container_maps, mFragment).commit();


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
