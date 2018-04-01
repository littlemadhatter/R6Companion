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
import android.view.LayoutInflater;
import android.view.MenuItem;

import com.zeuspalette.android.r6tab.Fragments.OperatorWeaponAttackerFragment;
import com.zeuspalette.android.r6tab.Fragments.OperatorWeaponDefenderFragment;
import com.zeuspalette.android.r6tab.Fragments.OperatorWeaponFragment;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

import java.lang.reflect.Field;

public class WeaponItemActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    public static String mWeaponTAG = "";
    private LayoutInflater layoutInflater;
    private ZUtils zUtils;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weapons_item);

        mWeaponTAG = getIntent().getStringExtra("weapon_item");
        zUtils = new ZUtils();

        mBottomNavigationView = findViewById(R.id.bottomnavigation_weapon_item);
        disableShiftMode(mBottomNavigationView);

        mFragmentManager = getSupportFragmentManager();
        mFragment = new OperatorWeaponFragment();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fragment_weapon_item,mFragment).commit();


        Toolbar toolbar = findViewById(R.id.toolbar_unit_operator);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back_white_24px);
        actionbar.setTitle("Weapon Details");

        //Setup Bottom Navigation for choosing between Weapon Info, Attackers and Defenders

        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.nav_bottom_weapon_info:
                                mFragment = new OperatorWeaponFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_weapon_item,mFragment).commit();
                                break;
                            case R.id.nav_bottom_weapon_attacker:
                                mFragment = new OperatorWeaponAttackerFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_weapon_item,mFragment).commit();
                                break;

                            case R.id.nav_bottom_weapon_defender:
                                mFragment = new OperatorWeaponDefenderFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_weapon_item,mFragment).commit();
                                break;


                        }
                        return true;
                    }
                });



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
