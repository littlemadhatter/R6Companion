package com.zeuspalette.android.r6tab.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
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
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

import java.lang.reflect.Field;

public class CameraActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    private ZUtils zUtils;
    private ImageView house;
    private ImageView bank;
    private ImageView bartlett;
    private ImageView border;
    private ImageView chalet;
    private ImageView clubhouse;
    private ImageView coastline;
    private ImageView consulate;
    private ImageView favela;
    private ImageView hereford;
    private ImageView kafe;
    private ImageView kanal;
    private ImageView oregon;
    private ImageView plane;
    private ImageView sky;
    private ImageView theme;
    private ImageView tower;
    private ImageView yacht;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cameras);

        mFragmentManager = getSupportFragmentManager();

        mBottomNavigationView = findViewById(R.id.bottomnavigation_main);

        zUtils = new ZUtils();

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back_white_24px);
        actionbar.setTitle("Cameras");

        //Create Imageview for all Maps and associate Intents to corresponding Location Activities

        house = findViewById(R.id.camera_house);
        Picasso.with(this).load(R.drawable.house).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(house);
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "house");
                startActivity(i3);
            }
        });

        bank = findViewById(R.id.camera_bank);
        Picasso.with(this).load(R.drawable.bank).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(bank);
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "bank");
                startActivity(i3);
            }
        });

        bartlett = findViewById(R.id.camera_bartlett);
        Picasso.with(this).load(R.drawable.bartlett).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(bartlett);
        bartlett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "bartlett");
                startActivity(i3);
            }
        });

        border = findViewById(R.id.camera_border);
        Picasso.with(this).load(R.drawable.border).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(border);
        border.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "border");
                startActivity(i3);
            }
        });

        chalet = findViewById(R.id.camera_chalet);
        Picasso.with(this).load(R.drawable.chalet).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(chalet);
        chalet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "chalet");
                startActivity(i3);
            }
        });


        clubhouse = findViewById(R.id.camera_clubhouse);
        Picasso.with(this).load(R.drawable.clubhouse).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(clubhouse);
        clubhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "clubhouse");
                startActivity(i3);
            }
        });


        coastline = findViewById(R.id.camera_coastline);
        Picasso.with(this).load(R.drawable.coastline).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(coastline);
        coastline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "coastline");
                startActivity(i3);
            }
        });


        consulate = findViewById(R.id.camera_consulate);
        Picasso.with(this).load(R.drawable.consulate).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(consulate);
        consulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "consulate");
                startActivity(i3);
            }
        });


        favela = findViewById(R.id.camera_favela);
        Picasso.with(this).load(R.drawable.favela).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(favela);
        favela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "favela");
                startActivity(i3);
            }
        });


        hereford = findViewById(R.id.camera_hereford);
        Picasso.with(this).load(R.drawable.hereford).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(hereford);
        hereford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "hereford");
                startActivity(i3);
            }
        });


        kafe = findViewById(R.id.camera_kafe);
        Picasso.with(this).load(R.drawable.kafe).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(kafe);
        kafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "kafe");
                startActivity(i3);
            }
        });


        kanal = findViewById(R.id.camera_kanal);
        Picasso.with(this).load(R.drawable.kanal).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(kanal);
        kanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "kanal");
                startActivity(i3);
            }
        });


        oregon = findViewById(R.id.camera_oregon);
        Picasso.with(this).load(R.drawable.oregon).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(oregon);
        oregon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "oregon");
                startActivity(i3);
            }
        });


        plane = findViewById(R.id.camera_plane);
        Picasso.with(this).load(R.drawable.plane).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(plane);
        plane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "plane");
                startActivity(i3);
            }
        });


        sky = findViewById(R.id.camera_sky);
        Picasso.with(this).load(R.drawable.sky).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(sky);
        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "sky");
                startActivity(i3);
            }
        });


        theme = findViewById(R.id.camera_theme);
        Picasso.with(this).load(R.drawable.theme).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(theme);
        theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "theme");
                startActivity(i3);
            }
        });


        tower = findViewById(R.id.camera_tower);
        Picasso.with(this).load(R.drawable.tower).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(tower);
        tower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "tower");
                startActivity(i3);
            }
        });


        yacht = findViewById(R.id.camera_yacht);
        Picasso.with(this).load(R.drawable.yacht).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(yacht);
        yacht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(CameraActivity.this, CameraLocationsActivity.class);
                i3.putExtra("map_id", "yacht");
                startActivity(i3);
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
                Log.d("R6Tab", "Finishing Operator Activity");
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        house = null;
        bank = null;
        bartlett = null;
        border = null;
        chalet = null;
        clubhouse = null;
        coastline = null;
        consulate = null;
        favela = null;
        hereford = null;
        kafe = null;
        kanal = null;
        oregon = null;
        plane = null;
        sky = null;
        theme = null;
        tower = null;
        yacht = null;

        mBottomNavigationView = null;
        mFragmentManager = null;
        zUtils = null;
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
