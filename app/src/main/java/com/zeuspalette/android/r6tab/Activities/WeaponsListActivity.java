package com.zeuspalette.android.r6tab.Activities;

import android.annotation.SuppressLint;
import android.content.Context;
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
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.WeaponListHelper;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

import java.lang.reflect.Field;

public class WeaponsListActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    private NavigationView mNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;
    private FragmentTransaction mFragmentTransaction;
    public static String mWeaponTAG = "";
    private LayoutInflater layoutInflater;
    private ZUtils zUtils;
    WeaponListHelper weaponListHelper;
    View[] weapon;
    TextView[] weaponName;
    ImageView[] weaponView;
    ViewGroup head;


    @Override
    protected void onDestroy() {
        super.onDestroy();

        zUtils = null;
        weaponListHelper = null;
        weapon = null;
        weaponName = null;
        weaponView = null;
        head = null;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weapons_list);

        mWeaponTAG = getIntent().getStringExtra("weapon");
        zUtils = new ZUtils();
        weaponListHelper = new WeaponListHelper();


        Toolbar toolbar = findViewById(R.id.toolbar_unit_operator);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back_white_24px);

        //Setup Title based on Category of Weapon

        if (mWeaponTAG.equalsIgnoreCase("assault")) {

            setupAssaultWeapon();
            actionbar.setTitle("Assault Rifles");
        }

        if (mWeaponTAG.equalsIgnoreCase("lmg")) {

            setupLMGWeapon();
            actionbar.setTitle("Light Machine Guns");
        }

        if (mWeaponTAG.equalsIgnoreCase("pistol")) {

            setupPistolWeapon();
            actionbar.setTitle("Pistols");
        }

        if (mWeaponTAG.equalsIgnoreCase("shotgun")) {

            setupShotgunWeapon();
            actionbar.setTitle("Shotguns");
        }

        if (mWeaponTAG.equalsIgnoreCase("machine")) {

            setupMachineWeapon();
            actionbar.setTitle("Machine Pistols");
        }

        if (mWeaponTAG.equalsIgnoreCase("submachine")) {

            setupSubmachineWeapon();
            actionbar.setTitle("Submachine Guns");
        }

        if (mWeaponTAG.equalsIgnoreCase("dmr")) {

            setupDMRWeapon();
            actionbar.setTitle("DMRs");
        }

        if (mWeaponTAG.equalsIgnoreCase("sniper")) {

            setupSniperWeapon();
            actionbar.setTitle("Snipers");
        }


    }

    //Setup methods and mapping based on Category selected in Activity

    private void setupMachineWeapon() {

        String[] machineWeaponsName = {"SMG11", "BEARING9", "C75AUTO", "SMG12"};
        final String[] machineWeapons = {"smg11", "bearing9", "c75auto", "smg12"};
        int[] machineWeaponsDrawable = {R.drawable.b_smg11, R.drawable.b_bearing9, R.drawable.b_c75auto, R.drawable.b_smg12};


        layoutInflater = (LayoutInflater) this.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        head = findViewById(R.id.weapon_list_head);

        weapon = new View[4];
        weaponName = new TextView[4];
        weaponView = new ImageView[4];


        for (int i = 0; i < 4; i++) {


            weapon[i] = layoutInflater.inflate(R.layout.weapon_list_image, null);
            weaponName[i] = weapon[i].findViewById(R.id.weapon_name);
            weaponView[i] = weapon[i].findViewById(R.id.weapon_image);
            weaponName[i].setText(machineWeaponsName[i]);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 24, 0, 0);
            head.addView(weapon[i], i, layoutParams);
            final int tmp = i;

            Picasso.with(WeaponsListActivity.this).load(machineWeaponsDrawable[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(WeaponsListActivity.this, 300), zUtils.getPixelfromDP(WeaponsListActivity.this, 111)).into(weaponView[i]);

            weapon[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(WeaponsListActivity.this, WeaponItemActivity.class);
                    i.putExtra("weapon_item", machineWeapons[tmp]);
                    startActivity(i);

                }
            });

            weaponListHelper.setupMachineOperatorsInView(WeaponsListActivity.this, weapon[i], machineWeapons[i]);

        }

    }

    private void setupLMGWeapon() {

        String[] lmgWeaponsName = {"6P41", "68A1", "M249", "T95LSW", "LMG-E"};
        final String[] lmgWeapons = {"6p41", "68a1", "m249", "t95lsw", "lmge"};
        int[] lmgWeaponsDrawable = {R.drawable.b_6p41, R.drawable.b_68a1, R.drawable.b_m249, R.drawable.b_t95lsw, R.drawable.b_lmge};


        layoutInflater = (LayoutInflater) this.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        head = findViewById(R.id.weapon_list_head);

        weapon = new View[5];
        weaponName = new TextView[5];
        weaponView = new ImageView[5];

        for (int i = 0; i < 5; i++) {


            weapon[i] = layoutInflater.inflate(R.layout.weapon_list_image, null);
            weaponName[i] = weapon[i].findViewById(R.id.weapon_name);
            weaponView[i] = weapon[i].findViewById(R.id.weapon_image);
            weaponName[i].setText(lmgWeaponsName[i]);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 24, 0, 0);
            head.addView(weapon[i], i, layoutParams);
            final int tmp = i;

            Picasso.with(WeaponsListActivity.this).load(lmgWeaponsDrawable[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(WeaponsListActivity.this, 300), zUtils.getPixelfromDP(WeaponsListActivity.this, 111)).into(weaponView[i]);

            weapon[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(WeaponsListActivity.this, WeaponItemActivity.class);
                    i.putExtra("weapon_item", lmgWeapons[tmp]);
                    startActivity(i);

                }
            });

            weaponListHelper.setupLMGOperatorsInView(WeaponsListActivity.this, weapon[i], lmgWeapons[i]);

        }
    }

    private void setupPistolWeapon() {

        String[] pistolWeaponsName = {"P226MK25", "M45MEUSOC", "57USG", "P9", "LFP586", "GSH18", "PMM", "P12", "MK19MM", "D50", "PRB92", "P229", "USP40", "Q929", "RG15", "LUISON"};
        final String[] pistolWeapons = {"p226mk25", "m45meusoc", "57usg", "p9", "lfp586", "gsh18", "pmm", "p12", "mk19mm", "d50", "prb92", "p229", "usp40", "q929", "rg15", "luison"};
        int[] pistolWeaponsDrawable = {R.drawable.b_p226mk25, R.drawable.b_m45meusoc, R.drawable.b_57usg, R.drawable.b_p9, R.drawable.b_lfp586, R.drawable.b_gsh18, R.drawable.b_pmm, R.drawable.b_p12, R.drawable.b_mk19mm, R.drawable.b_d50, R.drawable.b_prb92, R.drawable.b_p229, R.drawable.b_usp40, R.drawable.b_q929, R.drawable.b_rg15, R.drawable.b_luison};
        layoutInflater = (LayoutInflater) this.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        head = findViewById(R.id.weapon_list_head);

        weapon = new View[16];
        weaponName = new TextView[16];
        weaponView = new ImageView[16];

        for (int i = 0; i < 16; i++) {


            weapon[i] = layoutInflater.inflate(R.layout.weapon_list_image, null);
            weaponName[i] = weapon[i].findViewById(R.id.weapon_name);
            weaponView[i] = weapon[i].findViewById(R.id.weapon_image);
            weaponName[i].setText(pistolWeaponsName[i]);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 24, 0, 0);
            head.addView(weapon[i], i, layoutParams);
            final int tmp = i;

            Picasso.with(WeaponsListActivity.this).load(pistolWeaponsDrawable[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(WeaponsListActivity.this, 300), zUtils.getPixelfromDP(WeaponsListActivity.this, 111)).into(weaponView[i]);

            weapon[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(WeaponsListActivity.this, WeaponItemActivity.class);
                    i.putExtra("weapon_item", pistolWeapons[tmp]);
                    startActivity(i);

                }
            });

            weaponListHelper.setupPistolOperatorsInView(WeaponsListActivity.this, weapon[i], pistolWeapons[i]);
        }
    }

    private void setupSubmachineWeapon() {

        String[] submachineWeaponsName = {"PDW9", "FMG9", "MP5K", "UMP45", "MP5", "P90", "9X19VSN", "MP7", "9MM C1", "MPX", "M12", "MP5-SD", "VECTOR 45ACP", "T5 SMG", "SCORPION EVO 3A1", "K1A"};
        final String[] submachineWeapons = {"pdw9", "fmg9", "mp5k", "ump45", "mp5", "p90", "9x19vsn", "mp7", "9mmc1", "mpx", "m12", "mp5sd", "vector45acp", "t5smg", "scorpionevo3a1", "k1a"};
        int[] submachineWeaponsDrawable = {R.drawable.b_pdw9, R.drawable.b_fmg9, R.drawable.b_mp5k, R.drawable.b_ump45, R.drawable.b_mp5, R.drawable.b_p90, R.drawable.b_9x19vsn, R.drawable.b_mp7, R.drawable.b_9mmc1, R.drawable.b_mpx, R.drawable.b_m12, R.drawable.b_mp5sd, R.drawable.b_vector45acp, R.drawable.b_t5smg, R.drawable.b_scorpionevo3a1, R.drawable.b_k1a};
        layoutInflater = (LayoutInflater) this.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        head = findViewById(R.id.weapon_list_head);

        weapon = new View[16];
        weaponName = new TextView[16];
        weaponView = new ImageView[16];

        for (int i = 0; i < 16; i++) {


            weapon[i] = layoutInflater.inflate(R.layout.weapon_list_image, null);
            weaponName[i] = weapon[i].findViewById(R.id.weapon_name);
            weaponView[i] = weapon[i].findViewById(R.id.weapon_image);
            weaponName[i].setText(submachineWeaponsName[i]);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 24, 0, 0);
            head.addView(weapon[i], i, layoutParams);
            final int tmp = i;

            Picasso.with(WeaponsListActivity.this).load(submachineWeaponsDrawable[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(WeaponsListActivity.this, 300), zUtils.getPixelfromDP(WeaponsListActivity.this, 111)).into(weaponView[i]);

            weapon[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(WeaponsListActivity.this, WeaponItemActivity.class);
                    i.putExtra("weapon_item", submachineWeapons[tmp]);
                    startActivity(i);

                }
            });

            weaponListHelper.setupSubmachineOperatorsInView(WeaponsListActivity.this, weapon[i], submachineWeapons[i]);

        }
    }

    private void setupDMRWeapon() {

        String[] dmrWeaponsName = {"417", "CAMRS", "SR25", "MK14EBR"};
        final String[] dmrWeapons = {"417", "camrs", "sr25", "mk14ebr"};
        int[] dmrWeaponsDrawable = {R.drawable.b_417, R.drawable.b_camrs, R.drawable.b_sr25, R.drawable.b_mk14ebr};

        layoutInflater = (LayoutInflater) this.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        head = findViewById(R.id.weapon_list_head);

        weapon = new View[4];
        weaponName = new TextView[4];
        weaponView = new ImageView[4];

        for (int i = 0; i < 4; i++) {


            weapon[i] = layoutInflater.inflate(R.layout.weapon_list_image, null);
            weaponName[i] = weapon[i].findViewById(R.id.weapon_name);
            weaponView[i] = weapon[i].findViewById(R.id.weapon_image);
            weaponName[i].setText(dmrWeaponsName[i]);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 24, 0, 0);
            head.addView(weapon[i], i, layoutParams);
            final int tmp = i;

            Picasso.with(WeaponsListActivity.this).load(dmrWeaponsDrawable[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(WeaponsListActivity.this, 300), zUtils.getPixelfromDP(WeaponsListActivity.this, 111)).into(weaponView[i]);

            weapon[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(WeaponsListActivity.this, WeaponItemActivity.class);
                    i.putExtra("weapon_item", dmrWeapons[tmp]);
                    startActivity(i);

                }
            });

            weaponListHelper.setupDMROperatorsInView(WeaponsListActivity.this, weapon[i], dmrWeapons[i]);

        }
    }

    private void setupSniperWeapon() {

        String[] sniperWeaponsName = {"OTS03"};
        final String[] sniperWeapons = {"ots03"};
        int[] sniperWeaponsDrawable = {R.drawable.b_ots03};

        layoutInflater = (LayoutInflater) this.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        head = findViewById(R.id.weapon_list_head);

        weapon = new View[1];
        weaponName = new TextView[1];
        weaponView = new ImageView[1];

        for (int i = 0; i < 1; i++) {


            weapon[i] = layoutInflater.inflate(R.layout.weapon_list_image, null);
            weaponName[i] = weapon[i].findViewById(R.id.weapon_name);
            weaponView[i] = weapon[i].findViewById(R.id.weapon_image);
            weaponName[i].setText(sniperWeaponsName[i]);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 24, 0, 0);
            head.addView(weapon[i], i, layoutParams);
            final int tmp = i;

            Picasso.with(WeaponsListActivity.this).load(sniperWeaponsDrawable[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(WeaponsListActivity.this, 300), zUtils.getPixelfromDP(WeaponsListActivity.this, 111)).into(weaponView[i]);

            weapon[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(WeaponsListActivity.this, WeaponItemActivity.class);
                    i.putExtra("weapon_item", sniperWeapons[tmp]);
                    startActivity(i);

                }
            });

            weaponListHelper.setupSniperOperatorsInView(WeaponsListActivity.this, weapon[i], sniperWeapons[i]);

        }
    }


    private void setupAssaultWeapon() {

        String[] assaultWeaponsName = {"L85A2", "AR33", "R4C", "G36C", "556XI", "F2", "AK12", "AUGA2", "552-COMMANDO", "C8SFW", "MK17 CQB", "PARA 308", "TYPE 89", "C7E", "M762", "416C-CARBINE", "V308", "SPEAR 308"};
        final String[] assaultWeapons = {"l85a2", "ar33", "r4c", "g36c", "556xi", "f2", "ak12", "auga2", "552commando", "c8sfw", "mk17cqb", "para308", "type89", "c7e", "m762", "416ccarbine", "v308", "spear308"};
        int[] assaultWeaponsDrawable = {R.drawable.b_l85a2, R.drawable.b_ar33, R.drawable.b_r4c,
                R.drawable.b_g36c, R.drawable.b_556xi, R.drawable.b_f2, R.drawable.b_ak12, R.drawable.b_auga2,
                R.drawable.b_552commando, R.drawable.b_c8sfw, R.drawable.b_mk17cqb, R.drawable.b_para308, R.drawable.b_type89,
                R.drawable.b_c7e, R.drawable.b_m762, R.drawable.b_416ccarbine, R.drawable.b_v308, R.drawable.b_spear308};


        layoutInflater = (LayoutInflater) this.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        head = findViewById(R.id.weapon_list_head);

        weapon = new View[18];
        weaponName = new TextView[18];
        weaponView = new ImageView[18];

        for (int i = 0; i < 18; i++) {


            weapon[i] = layoutInflater.inflate(R.layout.weapon_list_image, null);
            weaponName[i] = weapon[i].findViewById(R.id.weapon_name);
            weaponView[i] = weapon[i].findViewById(R.id.weapon_image);
            weaponName[i].setText(assaultWeaponsName[i]);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 0, 0, 24);
            head.addView(weapon[i], i, layoutParams);
            final int tmp = i;

            Picasso.with(WeaponsListActivity.this).load(assaultWeaponsDrawable[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(WeaponsListActivity.this, 300), zUtils.getPixelfromDP(WeaponsListActivity.this, 111)).into(weaponView[i]);

            weapon[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(WeaponsListActivity.this, WeaponItemActivity.class);
                    i.putExtra("weapon_item", assaultWeapons[tmp]);
                    startActivity(i);

                }
            });

            weaponListHelper.setupAssaultOperatorsInView(WeaponsListActivity.this, weapon[i], assaultWeapons[i]);

        }


    }

    private void setupShotgunWeapon() {

        final String[] shotgunWeapons = {"m590a1", "m1014", "sgcqb", "supernova", "ita12l", "ita12s", "six12", "bosg122", "sasg12", "m870", "super90", "spas12", "spas15", "six12sd", "f012"};
        String[] shotgunWeaponNames = {"M590A1", "M1014", "SGCQB", "SUPERNOVA", "ITA12L", "ITA12S", "SIX12", "BOSG122", "SASG12", "M870", "SUPER90", "SPAS12", "SPAS15", "SIX12SD", "F012"};
        int[] shotgunWeaponsDrawable = {R.drawable.b_m590a1, R.drawable.b_m1014, R.drawable.b_sgcqb, R.drawable.b_supernova, R.drawable.b_ita12l, R.drawable.b_ita12s, R.drawable.b_six12, R.drawable.b_bosg122, R.drawable.b_sasg12, R.drawable.b_m870, R.drawable.b_super90, R.drawable.b_spas12, R.drawable.b_spas15, R.drawable.b_six12sd, R.drawable.b_f012};
        layoutInflater = (LayoutInflater) this.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        head = findViewById(R.id.weapon_list_head);

        weapon = new View[15];
        weaponName = new TextView[15];
        weaponView = new ImageView[15];

        for (int i = 0; i < 15; i++) {


            weapon[i] = layoutInflater.inflate(R.layout.weapon_list_image, null);
            weaponName[i] = weapon[i].findViewById(R.id.weapon_name);
            weaponView[i] = weapon[i].findViewById(R.id.weapon_image);
            weaponName[i].setText(shotgunWeaponNames[i]);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(0, 24, 0, 0);
            head.addView(weapon[i], i, layoutParams);
            final int tmp = i;

            Picasso.with(WeaponsListActivity.this).load(shotgunWeaponsDrawable[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(WeaponsListActivity.this, 300), zUtils.getPixelfromDP(WeaponsListActivity.this, 111)).into(weaponView[i]);

            weapon[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(WeaponsListActivity.this, WeaponItemActivity.class);
                    i.putExtra("weapon_item", shotgunWeapons[tmp]);
                    startActivity(i);

                }
            });

            weaponListHelper.setupShotgunOperatorsInView(WeaponsListActivity.this, weapon[i], shotgunWeapons[i]);

        }

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
