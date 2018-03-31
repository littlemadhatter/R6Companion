package com.jeevscode.android.r6companion.Activities;

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
import android.widget.TextView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.jeevscode.android.r6companion.R;
import com.jeevscode.android.r6companion.Helpers.ZUtils;

import java.lang.reflect.Field;
import java.util.HashMap;

public class CameraLocationsActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    private ZUtils zUtils;
    private String mapName;

    private HashMap<String, String> mapNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFragmentManager = getSupportFragmentManager();

        //Associate key to Maps for setting up Cameras based on map key received in Intent

        zUtils = new ZUtils();
        mapNames = new HashMap<>();
        mapNames.put("house", "House");
        mapNames.put("oregon", "Oregon");
        mapNames.put("hereford", "Hereford Base");
        mapNames.put("clubhouse", "Club House");
        mapNames.put("plane", "Plane");
        mapNames.put("consulate", "Consulate");
        mapNames.put("bank", "Bank");
        mapNames.put("chalet", "Chalet");
        mapNames.put("kafe", "Kafe Dostoveysky");
        mapNames.put("yacht", "Yacht");
        mapNames.put("coastline", "Coastline");
        mapNames.put("border", "Border");
        mapNames.put("favela", "Favela");
        mapNames.put("sky", "Skyscraper");
        mapNames.put("bartlett", "Bartlett University");
        mapNames.put("theme", "Theme Park");
        mapNames.put("tower", "Tower");
        mapNames.put("kanal", "Kanal");


        //Get map name from Intent and setup Cameras for maps accordingly


        mapName = getIntent().getStringExtra("map_id");

        if (mapName.equalsIgnoreCase("house")) {

            final int[] imageIds = {R.drawable.house_cam_1, R.drawable.house_cam_2, R.drawable.house_cam_3, R.drawable.house_cam_4, R.drawable.house_cam_5, R.drawable.house_cam_6};
            String[] camNames = {"1F - Lobby","1F - Kitchen","Basement - Training Room","EXT - Side Street","EXT - Front Street","Basement - Garage"};

            setContentView(R.layout.activity_camera_six);
            setupSixImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("coastline")) {

            final int[] imageIds = {R.drawable.coastline_cam_1, R.drawable.coastline_cam_2, R.drawable.coastline_cam_3, R.drawable.coastline_cam_4,
                    R.drawable.coastline_cam_5, R.drawable.coastline_cam_6,R.drawable.coastline_cam_7 };
            String[] camNames = {"2F - Aquarium","2F - Hallway","1F - Main Lobby","1F Hallway",
                    "EXT - Terrace","EXT - Walkway", "EXT - Main Entrance"};

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("oregon")) {

            final int[] imageIds = {R.drawable.oregon_camera_1, R.drawable.oregon_camera_2, R.drawable.oregon_camera_3, R.drawable.oregon_camera_4, R.drawable.oregon_camera_5, R.drawable.oregon_camera_6,R.drawable.oregon_camera_7};
            String[] camNames = {"EXT - Parking","EXT - Construction Site","1F - Rear Stage","1F - Main Stairs","1F - Lobby","1F - Dining Hall" , "EXT - Junkyard"};

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("hereford")) {

            final int[] imageIds = {R.drawable.hereford_cam_1, R.drawable.hereford_cam_2, R.drawable.hereford_cam_3, R.drawable.hereford_cam_4, R.drawable.hereford_cam_5, R.drawable.hereford_cam_6};
            String[] camNames = {"Basement - Corridor","3F - Storage Corridor","2F - Corridor","1F - Corridor 1","EXT - Shooting Range","EXT - Bus Back Alley" };

            setContentView(R.layout.activity_camera_six);
            setupSixImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("clubhouse")) {

            final int[] imageIds = {R.drawable.clubhouse_cam_1, R.drawable.clubhouse_cam_2, R.drawable.clubhouse_cam_3, R.drawable.clubhouse_cam_4, R.drawable.clubhouse_cam_5, R.drawable.clubhouse_cam_6,R.drawable.clubhouse_cam_7};
            String[] camNames = {"EXT - Graffiti Area","2F - Bedroom Hallway","Basement - Basement Hallway","1F - Bar","1F - Garage","EXT - Parking" , "EXT - Parking" };

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("plane")) {

            final int[] imageIds = {R.drawable.plane_cam_1, R.drawable.plane_cam_2, R.drawable.plane_cam_3, R.drawable.plane_cam_4, R.drawable.plane_cam_5};
            String[] camNames = {"1F - Luggage Hold","1F - Cargo Hold","2F - Press Section A","3F - Cockpit Stairs","2F - Front Hallway" };

            setContentView(R.layout.activity_camera_five);
            setupFiveImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("consulate")) {

            final int[] imageIds = {R.drawable.consulate_cam_1, R.drawable.consulate_cam_2, R.drawable.consulate_cam_3, R.drawable.consulate_cam_4, R.drawable.consulate_cam_5,R.drawable.consulate_cam_6,R.drawable.consulate_cam_7,R.drawable.consulate_cam_8};
            String[] camNames = {"Basement - Locker Hallway","Basement - Garage","EXT - Garage Way" , "2F - Main Stairs" , "2F - Hallway" , "1F - Visa Office" , "1F - Lobby" , "EXT - Police Line" };

            setContentView(R.layout.activity_camera_eight);
            setupEightImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("bank")) {

            final int[] imageIds = {R.drawable.bank_cam_1, R.drawable.bank_cam_2, R.drawable.bank_cam_3, R.drawable.bank_cam_4, R.drawable.bank_cam_5,R.drawable.bank_cam_6,R.drawable.bank_cam_7};
            String[] camNames = {"Basement - Vault Lobby","1F - Office Hallway","1F - Lobby" , "2F - Skylight Stairwell" , "EXT - Back Alley" , "EXT - Garage Ramp" , "EXT - Boulevard" };

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("kanal")) {

            final int[] imageIds = {R.drawable.kanal_cam_1, R.drawable.kanal_cam_2, R.drawable.kanal_cam_3, R.drawable.kanal_cam_4, R.drawable.kanal_cam_5,R.drawable.kanal_cam_6,R.drawable.kanal_cam_7};
            String[] camNames = {"EXT - Construction Site","2F - Control Center","2F - Maps Office Hallway" , "1F - Boat Supplies Hallway" , "2F - Coast Guard Hallway" , "EXT - Sailboats" , "EXT - Lockgate" };

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("chalet")) {

            final int[] imageIds = {R.drawable.chalet_cam_1, R.drawable.chalet_cam_2, R.drawable.chalet_cam_3, R.drawable.chalet_cam_4, R.drawable.chalet_cam_5, R.drawable.chalet_cam_6};
            String[] camNames = {"Basement - Snowmobile Garage","2F - Bedroom Hallway","2F - Bedroom Hallway","2F - Library Hallway","EXT - Backyard","EXT - Front Yard" };

            setContentView(R.layout.activity_camera_six);
            setupSixImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("kafe")) {

            final int[] imageIds = {R.drawable.kafe_cam_6,R.drawable.kafe_cam_1, R.drawable.kafe_cam_2, R.drawable.kafe_cam_3, R.drawable.kafe_cam_4, R.drawable.kafe_cam_5 };
            String[] camNames = {"3F - Cocktail Lounge","2F - Pillar Dining Room","1F - Bakery","1F - Storage","EXT - Park Alley","EXT - West Main Street" };

            setContentView(R.layout.activity_camera_six);
            setupSixImages(imageIds, camNames);

        }


        if (mapName.equalsIgnoreCase("yacht")) {

            final int[] imageIds = {R.drawable.yacht_cam_1, R.drawable.yacht_cam_2, R.drawable.yacht_cam_3, R.drawable.yacht_cam_4, R.drawable.yacht_cam_5,R.drawable.yacht_cam_6,R.drawable.yacht_cam_7,R.drawable.yacht_cam_8};
            String[] camNames = { "3F - Lounge" , "2F - Front Stairs" ,"4F - Helipad Entrance" , "1F - Engine Hallway" ,"2F - Kitchen Hallway" ,"2F - Front Stairs" ,"EXT - Spa Deck" ,"EXT - Front Deck"};

            setContentView(R.layout.activity_camera_eight);
            setupEightImages(imageIds, camNames);

        }


        if (mapName.equalsIgnoreCase("border")) {

            final int[] imageIds = {R.drawable.border_cam_1, R.drawable.border_cam_2, R.drawable.border_cam_3, R.drawable.border_cam_4, R.drawable.border_cam_5,R.drawable.border_cam_6,R.drawable.border_cam_7};
            String[] camNames = {"2F - East Stairs","2F - Main Hallway","1F - Main Lobby" , "1F - Exit Hallway" , "EXT - Parking Lot" , "EXT - East Road" , "EXT - Parking Lot" };

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("favela")) {

            final int[] imageIds = {R.drawable.favela_cam_1, R.drawable.favela_cam_2, R.drawable.favela_cam_3, R.drawable.favela_cam_4, R.drawable.favela_cam_5,R.drawable.favela_cam_6,R.drawable.favela_cam_7};
            String[] camNames = {"3F - Back Stairs","2F - Aunt Hall","EXT - Rooftops" , "EXT - Courtyard" , "EXT - Football Pitch" , "1F - Stair Hall" , "1F - Laundry Room" };

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("sky")) {

            final int[] imageIds = {R.drawable.sky_cam_1, R.drawable.sky_cam_2, R.drawable.sky_cam_3, R.drawable.sky_cam_4, R.drawable.sky_cam_5,R.drawable.sky_cam_6,R.drawable.sky_cam_7};
            String[] camNames = {"1F - Restaurant","2F - Hallway","1F - House Lobby" , "2F - VIP Clearance" , "EXT - Ventilation Units" , "EXT - East Garden" , "EXT - West Garden" };

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("bartlett")) {

            final int[] imageIds = {R.drawable.bartlett_cam_1, R.drawable.bartlett_cam_2, R.drawable.bartlett_cam_3, R.drawable.bartlett_cam_4, R.drawable.bartlett_cam_5, R.drawable.bartlett_cam_6};
            String[] camNames = {"2F - Vista Hallway","2F - Compass Hallway","1F - Lobby","1F - Dining Room","EXT - Parking","EXT - Front Entrance" };

            setContentView(R.layout.activity_camera_six);
            setupSixImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("theme")) {

            final int[] imageIds = {R.drawable.theme_cam_1, R.drawable.theme_cam_2, R.drawable.theme_cam_3, R.drawable.theme_cam_4, R.drawable.theme_cam_5,R.drawable.theme_cam_6,R.drawable.theme_cam_7,R.drawable.theme_cam_8};
            String[] camNames = { "2F - Rail Platform" , "2F - Rail Corridor" ,"1F - Gallery" , "1F - Joint Corridor" ,"1F - Joint Corridor" ,"EXT - Back Alley" ,"EXT - Service Entrance" ,"EXT - Main Entrance"};

            setContentView(R.layout.activity_camera_eight);
            setupEightImages(imageIds, camNames);

        }

        if (mapName.equalsIgnoreCase("tower")) {

            final int[] imageIds = {R.drawable.tower_cam_1, R.drawable.tower_cam_2, R.drawable.tower_cam_3, R.drawable.tower_cam_4, R.drawable.tower_cam_5,R.drawable.tower_cam_6,R.drawable.tower_cam_7};
            String[] camNames = {"1F - Fountain","1F - West Balcony" , "1F - Traditional Hall" , "2F - Exhibit Room" , "2F - Gallery Main" , "2F - Company Reception","2F Center Atrium" };

            setContentView(R.layout.activity_camera_seven);
            setupSevenImages(imageIds, camNames);

        }






        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back_white_24px);
        actionbar.setTitle(mapNames.get(mapName));


    }

    //Setup Map Camera Images based on the count

    public void setupFiveImages(final int[] imageIds, String[] camNames) {

        TextView tOne = findViewById(R.id.camera_one_text);
        ImageView iOne = findViewById(R.id.camera_one_image);
        tOne.setText(camNames[4]);
        Picasso.with(this).load(imageIds[4]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iOne);
        iOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[4]);
                startActivity(i);
            }
        });

        TextView tTwo = findViewById(R.id.camera_two_text);
        ImageView iTwo = findViewById(R.id.camera_two_image);
        tTwo.setText(camNames[3]);
        Picasso.with(this).load(imageIds[3]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iTwo);
        iTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[3]);
                startActivity(i);
            }
        });

        TextView tThree = findViewById(R.id.camera_three_text);
        ImageView iThree = findViewById(R.id.camera_three_image);
        tThree.setText(camNames[2]);
        Picasso.with(this).load(imageIds[2]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iThree);
        iThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[2]);
                startActivity(i);
            }
        });

        TextView tFour = findViewById(R.id.camera_four_text);
        ImageView iFour = findViewById(R.id.camera_four_image);
        tFour.setText(camNames[1]);
        Picasso.with(this).load(imageIds[1]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iFour);
        iFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[1]);
                startActivity(i);
            }
        });

        TextView tFive = findViewById(R.id.camera_five_text);
        ImageView iFive = findViewById(R.id.camera_five_image);
        tFive.setText(camNames[0]);
        Picasso.with(this).load(imageIds[0]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iFive);
        iFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[0]);
                startActivity(i);
            }
        });


    }


    public void setupSixImages(final int[] imageIds, String[] camNames) {

        TextView tOne = findViewById(R.id.camera_one_text);
        ImageView iOne = findViewById(R.id.camera_one_image);
        tOne.setText(camNames[5]);
        Picasso.with(this).load(imageIds[5]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iOne);
        iOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[5]);
                startActivity(i);
            }
        });

        TextView tTwo = findViewById(R.id.camera_two_text);
        ImageView iTwo = findViewById(R.id.camera_two_image);
        tTwo.setText(camNames[4]);
        Picasso.with(this).load(imageIds[4]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iTwo);
        iTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[4]);
                startActivity(i);
            }
        });

        TextView tThree = findViewById(R.id.camera_three_text);
        ImageView iThree = findViewById(R.id.camera_three_image);
        tThree.setText(camNames[3]);
        Picasso.with(this).load(imageIds[3]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iThree);
        iThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[3]);
                startActivity(i);
            }
        });

        TextView tFour = findViewById(R.id.camera_four_text);
        ImageView iFour = findViewById(R.id.camera_four_image);
        tFour.setText(camNames[2]);
        Picasso.with(this).load(imageIds[2]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iFour);
        iFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[2]);
                startActivity(i);
            }
        });

        TextView tFive = findViewById(R.id.camera_five_text);
        ImageView iFive = findViewById(R.id.camera_five_image);
        tFive.setText(camNames[1]);
        Picasso.with(this).load(imageIds[1]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iFive);
        iFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[1]);
                startActivity(i);
            }
        });

        TextView tSix = findViewById(R.id.camera_six_text);
        ImageView iSix = findViewById(R.id.camera_six_image);
        tSix.setText(camNames[0]);
        Picasso.with(this).load(imageIds[0]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iSix);
        iSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[0]);
                startActivity(i);
            }
        });

    }


    public void setupSevenImages(final int[] imageIds, String[] camNames) {

        TextView tOne = findViewById(R.id.camera_one_text);
        ImageView iOne = findViewById(R.id.camera_one_image);
        tOne.setText(camNames[6]);
        Picasso.with(this).load(imageIds[6]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iOne);
        iOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[6]);
                startActivity(i);
            }
        });

        TextView tTwo = findViewById(R.id.camera_two_text);
        ImageView iTwo = findViewById(R.id.camera_two_image);
        tTwo.setText(camNames[5]);
        Picasso.with(this).load(imageIds[5]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iTwo);
        iTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[5]);
                startActivity(i);
            }
        });

        TextView tThree = findViewById(R.id.camera_three_text);
        ImageView iThree = findViewById(R.id.camera_three_image);
        tThree.setText(camNames[4]);
        Picasso.with(this).load(imageIds[4]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iThree);
        iThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[4]);
                startActivity(i);
            }
        });

        TextView tFour = findViewById(R.id.camera_four_text);
        ImageView iFour = findViewById(R.id.camera_four_image);
        tFour.setText(camNames[3]);
        Picasso.with(this).load(imageIds[3]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iFour);
        iFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[3]);
                startActivity(i);
            }
        });

        TextView tFive = findViewById(R.id.camera_five_text);
        ImageView iFive = findViewById(R.id.camera_five_image);
        tFive.setText(camNames[2]);
        Picasso.with(this).load(imageIds[2]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iFive);
        iFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[2]);
                startActivity(i);
            }
        });

        TextView tSix = findViewById(R.id.camera_six_text);
        ImageView iSix = findViewById(R.id.camera_six_image);
        tSix.setText(camNames[1]);
        Picasso.with(this).load(imageIds[1]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iSix);
        iSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[1]);
                startActivity(i);
            }
        });

        TextView tSeven = findViewById(R.id.camera_seven_text);
        ImageView iSeven = findViewById(R.id.camera_seven_image);
        tSeven.setText(camNames[0]);
        Picasso.with(this).load(imageIds[0]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iSeven);
        iSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[0]);
                startActivity(i);
            }
        });

    }


    public void setupEightImages(final int[] imageIds, String[] camNames) {

        TextView tOne = findViewById(R.id.camera_one_text);
        ImageView iOne = findViewById(R.id.camera_one_image);
        tOne.setText(camNames[7]);
        Picasso.with(this).load(imageIds[7]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iOne);
        iOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[7]);
                startActivity(i);
            }
        });

        TextView tTwo = findViewById(R.id.camera_two_text);
        ImageView iTwo = findViewById(R.id.camera_two_image);
        tTwo.setText(camNames[6]);
        Picasso.with(this).load(imageIds[6]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iTwo);
        iTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[6]);
                startActivity(i);
            }
        });

        TextView tThree = findViewById(R.id.camera_three_text);
        ImageView iThree = findViewById(R.id.camera_three_image);
        tThree.setText(camNames[5]);
        Picasso.with(this).load(imageIds[5]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iThree);
        iThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[5]);
                startActivity(i);
            }
        });

        TextView tFour = findViewById(R.id.camera_four_text);
        ImageView iFour = findViewById(R.id.camera_four_image);
        tFour.setText(camNames[4]);
        Picasso.with(this).load(imageIds[4]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iFour);
        iFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[4]);
                startActivity(i);
            }
        });

        TextView tFive = findViewById(R.id.camera_five_text);
        ImageView iFive = findViewById(R.id.camera_five_image);
        tFive.setText(camNames[3]);
        Picasso.with(this).load(imageIds[3]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iFive);
        iFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[3]);
                startActivity(i);
            }
        });

        TextView tSix = findViewById(R.id.camera_six_text);
        ImageView iSix = findViewById(R.id.camera_six_image);
        tSix.setText(camNames[2]);
        Picasso.with(this).load(imageIds[2]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iSix);
        iSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[2]);
                startActivity(i);
            }
        });

        TextView tSeven = findViewById(R.id.camera_seven_text);
        ImageView iSeven = findViewById(R.id.camera_seven_image);
        tSeven.setText(camNames[1]);
        Picasso.with(this).load(imageIds[1]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iSeven);
        iSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[1]);
                startActivity(i);
            }
        });

        TextView tEight = findViewById(R.id.camera_eight_text);
        ImageView iEight = findViewById(R.id.camera_eight_image);
        tEight.setText(camNames[0]);
        Picasso.with(this).load(imageIds[0]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(this, 280), zUtils.getPixelfromDP(this, 157)).into(iEight);
        iEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CameraLocationsActivity.this, CameraZoomActivity.class);
                i.putExtra("cam_id", imageIds[0]);
                startActivity(i);
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapNames = null;
        mapName = null;
        mFragment = null;
        mNavigationView = null;
        mBottomNavigationView = null;

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
