package com.zeuspalette.android.r6tab;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.zeuspalette.android.r6tab.Activities.CameraActivity;
import com.zeuspalette.android.r6tab.Activities.DisclaimerActivity;
import com.zeuspalette.android.r6tab.Activities.MapsActivity;
import com.zeuspalette.android.r6tab.Activities.RandomActivity;
import com.zeuspalette.android.r6tab.Activities.SpeedActivity;
import com.zeuspalette.android.r6tab.Fragments.AttackersFragment;
import com.zeuspalette.android.r6tab.Fragments.DefendersFragment;
import com.zeuspalette.android.r6tab.Fragments.UnitsFragment;
import com.zeuspalette.android.r6tab.Fragments.WeaponsFragment;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    NavigationView drawerNavigationView;
    private int TAG;
    private ZUtils zUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getSupportFragmentManager();

        mDrawerLayout = findViewById(R.id.drawer_container_main);
        mBottomNavigationView = findViewById(R.id.bottomnavigation_main);
        disableShiftMode(mBottomNavigationView);
        mNavigationView = findViewById(R.id.nav_drawer_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24px);
        TAG = 0;
        zUtils = new ZUtils();

        //Setup Drawer to show Menu

        drawerNavigationView = findViewById(R.id.nav_drawer_main);
        drawerNavigationView.getMenu().getItem(0).setChecked(true);
        drawerNavigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();

                        Intent intent;

                        switch (menuItem.getItemId()) {

                            case R.id.nav_drawer_attackers:

                                mFragment = new AttackersFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
                                mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_attackers);
                                TAG = 0;
                                zUtils.insertSharedPreferenceInt(MainActivity.this, "main_fragment", TAG);
                                break;
                            case R.id.nav_drawer_defenders:

                                mFragment = new DefendersFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
                                mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_defenders);
                                TAG = 1;
                                zUtils.insertSharedPreferenceInt(MainActivity.this, "main_fragment", TAG);
                                break;

                            case R.id.nav_drawer_units:

                                mFragment = new UnitsFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
                                mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_units);
                                TAG = 2;
                                zUtils.insertSharedPreferenceInt(MainActivity.this, "main_fragment", TAG);
                                break;

                            case R.id.nav_drawer_weapons:

                                mFragment = new WeaponsFragment();
                                ;
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
                                mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_weapons);
                                TAG = 3;
                                zUtils.insertSharedPreferenceInt(MainActivity.this, "main_fragment", TAG);
                                break;


                            case R.id.nav_drawer_speed:

                                intent = new Intent(MainActivity.this, SpeedActivity.class);
                                startActivity(intent);
                                break;

                            case R.id.nav_drawer_cameras:

                                intent = new Intent(MainActivity.this, CameraActivity.class);
                                startActivity(intent);
                                break;

                            case R.id.nav_drawer_maps:

                                intent = new Intent(MainActivity.this, MapsActivity.class);
                                startActivity(intent);
                                break;

                            case R.id.nav_drawer_random:

                                intent = new Intent(MainActivity.this, RandomActivity.class);
                                startActivity(intent);
                                break;


                            case R.id.nav_drawer_about:

                                intent = new Intent(MainActivity.this, DisclaimerActivity.class);
                                startActivity(intent);
                                break;

                            case R.id.nav_drawer_bug:


                                Uri uri = Uri.parse("mailto:jeeva.nasa01@gmail.com");
                                Intent myActivity2 = new Intent(Intent.ACTION_SENDTO, uri);
                                myActivity2.putExtra(Intent.EXTRA_SUBJECT,
                                        "Bug in R6 Companion Android Application");
                                startActivity(myActivity2);


                                break;

                        }
                        return true;
                    }
                });


        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {

                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {

                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {

                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {

                    }
                }
        );

        //Setup Bottom Navigation to show Menu

        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {


                        switch (item.getItemId()) {
                            case R.id.nav_bottom_attackers:


                                drawerNavigationView.getMenu().getItem(0).setChecked(true);
                                mFragment = new AttackersFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
                                TAG = 0;
                                zUtils.insertSharedPreferenceInt(MainActivity.this, "main_fragment", TAG);


                                break;

                            case R.id.nav_bottom_defenders:


                                drawerNavigationView.getMenu().getItem(1).setChecked(true);
                                mFragment = new DefendersFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
                                TAG = 1;
                                zUtils.insertSharedPreferenceInt(MainActivity.this, "main_fragment", TAG);

                                break;


                            case R.id.nav_bottom_units:

                                drawerNavigationView.getMenu().getItem(2).setChecked(true);
                                mFragment = new UnitsFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
                                TAG = 2;
                                zUtils.insertSharedPreferenceInt(MainActivity.this, "main_fragment", TAG);


                                break;

                            case R.id.nav_bottom_weapons:

                                drawerNavigationView.getMenu().getItem(3).setChecked(true);
                                mFragment = new WeaponsFragment();
                                mFragmentTransaction = mFragmentManager.beginTransaction();
                                mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
                                TAG = 3;
                                zUtils.insertSharedPreferenceInt(MainActivity.this, "main_fragment", TAG);

                                break;

                            case R.id.nav_drawer_speed:


                                Intent i1 = new Intent(MainActivity.this, SpeedActivity.class);
                                startActivityForResult(i1, 100);
                                break;

                            case R.id.nav_drawer_cameras:

                                Intent i2 = new Intent(MainActivity.this, CameraActivity.class);
                                startActivityForResult(i2, 100);
                                break;

                            case R.id.nav_drawer_random:

                                Intent i3 = new Intent(MainActivity.this, RandomActivity.class);
                                startActivityForResult(i3, 100);
                                break;


                        }
                        return true;
                    }
                });


        TAG = zUtils.getSharedPreferenceInt(this, "main_fragment", 0);

        Log.d("R6Tab", String.valueOf(TAG));

        if (TAG == 0) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragment = new AttackersFragment();
            mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
            drawerNavigationView.getMenu().getItem(0).setChecked(true);
            mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_attackers);
        }

        if (TAG == 1) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragment = new DefendersFragment();
            mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
            drawerNavigationView.getMenu().getItem(1).setChecked(true);
            mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_defenders);
        }

        if (TAG == 2) {

            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragment = new UnitsFragment();
            mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
            drawerNavigationView.getMenu().getItem(2).setChecked(true);
            mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_units);
        }

        if (TAG == 3) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragment = new WeaponsFragment();
            mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
            drawerNavigationView.getMenu().getItem(3).setChecked(true);
            mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_weapons);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        Drawable yourdrawable = menu.getItem(0).getIcon(); // change 0 with 1,2 ...
        yourdrawable.mutate();
        yourdrawable.setColorFilter(getResources().getColor(R.color.colorWhiteOne), PorterDuff.Mode.SRC_IN);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                Log.d("R6Tab", "Drawer Icon Home pressed");
                return true;

            case R.id.nav_main_info:
                takeToRating();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }


    //Retain State after Activity transition

    @Override
    protected void onPause() {
        super.onPause();


        TAG = zUtils.getSharedPreferenceInt(this, "main_fragment", 0);
        Log.d("R6Tab", String.valueOf(TAG));

        mFragment = null;

        if (TAG == 0) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragment = new AttackersFragment();
            mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
            drawerNavigationView.getMenu().getItem(0).setChecked(true);
            mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_attackers);
        }

        if (TAG == 1) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragment = new DefendersFragment();
            mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
            drawerNavigationView.getMenu().getItem(1).setChecked(true);
            mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_defenders);
        }

        if (TAG == 2) {

            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragment = new UnitsFragment();
            mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
            drawerNavigationView.getMenu().getItem(2).setChecked(true);
            mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_units);
        }

        if (TAG == 3) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragment = new WeaponsFragment();
            mFragmentTransaction.replace(R.id.fragment_container_main, mFragment).commit();
            drawerNavigationView.getMenu().getItem(3).setChecked(true);
            mBottomNavigationView.setSelectedItemId(R.id.nav_bottom_weapons);
        }


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


    //Show Rating Dialog

    public boolean takeToRating() {


        final boolean[] tmp = {false};

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_text, null);
        dialogBuilder.setView(dialogView);
        TextView tV = dialogView.findViewById(R.id.dialog);
        tV.setText(this.getResources().getString(R.string.dialog_r));
        dialogBuilder.setPositiveButton("RATE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }
        });

        dialogBuilder.setNegativeButton("SHARE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

                try {
                    final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "R6 Companion");
                    String sAux = "\nLet me recommend you this application for Rainbow Six Siege\n\n";
                    sAux = sAux + "https://play.google.com/store/apps/details?id=" + appPackageName + "\n\n";
                    i.putExtra(Intent.EXTRA_TEXT, sAux);
                    startActivity(Intent.createChooser(i, "Choos One"));
                } catch (Exception e) {
                    //e.toString();
                }
            }
        });
        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();

        return tmp[0];

    }


}
