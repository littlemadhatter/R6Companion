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
import android.view.MenuItem;

import com.zeuspalette.android.r6tab.Fragments.OperatorUnitAttackerFragment;
import com.zeuspalette.android.r6tab.Fragments.OperatorUnitDefenderFragment;
import com.zeuspalette.android.r6tab.Fragments.OperatorUnitInfoFragment;
import com.zeuspalette.android.r6tab.R;

import java.lang.reflect.Field;

public class UnitOperatorActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    public static String mUnitTAG = "";

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mFragmentManager = null;
        mBottomNavigationView = null;
        mFragmentTransaction = null;
        mFragment = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_unit_operator);

        mUnitTAG = getIntent().getStringExtra("unit");

        mFragmentManager = getSupportFragmentManager();

        mBottomNavigationView = findViewById(R.id.bottomnavigation_unit_operator);
        disableShiftMode(mBottomNavigationView);

        Toolbar toolbar = findViewById(R.id.toolbar_unit_operator);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back_white_24px);

        //Setup Bottom Navigation for choosing between Info , Attackers and Defenders

        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.nav_bottom_unit_info:
                                mFragment = new OperatorUnitInfoFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_unit_operator,mFragment).commit();
                                break;
                            case R.id.nav_bottom_unit_attacker:
                                mFragment = new OperatorUnitAttackerFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_unit_operator,mFragment).commit();
                                break;
                            case R.id.nav_bottom_unit_defender:
                                mFragment = new OperatorUnitDefenderFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_unit_operator,mFragment).commit();
                                break;


                        }
                        return true;
                    }
                });

        setupOperator();


    }

    private void setupOperator() {

        mFragment = new OperatorUnitInfoFragment();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fragment_container_unit_operator,mFragment).commit();

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
