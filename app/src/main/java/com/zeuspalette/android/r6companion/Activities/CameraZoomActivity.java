package com.zeuspalette.android.r6companion.Activities;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6companion.R;
import com.zeuspalette.android.r6companion.Helpers.ZUtils;

public class CameraZoomActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    private ZUtils zUtils;
    private int imageID;
    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_zoom);

        mFragmentManager = getSupportFragmentManager();

        imageID = getIntent().getIntExtra("cam_id", 0);

        //Setup Photoview for Zoom and Panning of individual Cameras

        photoView = (PhotoView) findViewById(R.id.photo_view);
        Picasso.with(this).load(imageID).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(1920, 1080).into(photoView);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        photoView = null;

    }
}
