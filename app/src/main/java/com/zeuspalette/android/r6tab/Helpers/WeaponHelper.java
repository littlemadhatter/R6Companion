package com.zeuspalette.android.r6tab.Helpers;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.R;

/**
 * Created by Jeeva on 11-03-2018.
 */

public class WeaponHelper {

    private Activity mActivity;
    private ZUtils zUtils;
    private LayoutInflater mLayoutInflater;

    public WeaponHelper(Activity activity) {


        mActivity = activity;
        zUtils = new ZUtils();

    }

    public String getS(int id) {

        return mActivity.getResources().getString(id);
    }

    public void setWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                              int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //PRIMARY WEAPONS

    //L85A2

    public String getL85A2Name() {

        return "Assault Rifle - L85A2";
    }

    public String getL85A2D() {

        return "Damage      :     42 (Supp 35)";
    }

    public String getL85A2FR() {

        return "Fire Rate     :     670";
    }

    public String getL85A2M() {

        return "Mobility      :     50";
    }

    public String getL85A2C() {

        return "Capacity     :     30";
    }

    public void setL785A2View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {


        setL785A2WeaponView(insertPoint, mLayoutInflater, activity, "l785a2", R.drawable.r_l85a2, getL85A2Name(), getL85A2D(), getL85A2FR(), getL85A2M(), getL85A2C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setL785A2WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "l785a2_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "l785a2_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "l785a2_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "l785a2_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "l785a2_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //M590A1

    public String getM590A1Name() {

        return "Shotgun - M590A1";
    }

    public String getM590A1D() {

        return "Damage      :     48";
    }

    public String getM590A1FR() {

        return "Fire Rate     :     1";
    }

    public String getM590A1M() {

        return "Mobility      :     50";
    }

    public String getM590A1C() {

        return "Capacity     :     7";
    }

    public void setM590A1View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {


        setM590A1WeaponView(insertPoint, mLayoutInflater, activity, "m590a1", R.drawable.r_m590a1, getM590A1Name(), getM590A1D(), getM590A1FR(), getM590A1M(), getM590A1C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);


    }

    public void setM590A1WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "m590a1_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "m590a1_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "m590a1_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "m590a1_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "m590a1_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "m590a1_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    // P226MK25


    public String getP226MK25Name() {

        return "Handgun - P226MK25";
    }

    public String getP226MK25D() {

        return "Damage      :     50 (Supp 42)";
    }

    public String getP226MK25FR() {

        return "Fire Rate     :     1";
    }

    public String getP226MK25M() {

        return "Mobility      :     50";
    }

    public String getP226MK25C() {

        return "Capacity     :     15";
    }

    public void setP226MK25View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {


        setupP226MK25WeaponView(insertPoint, mLayoutInflater, activity, "p226mk25", R.drawable.r_p226mk25, getP226MK25Name(), getP226MK25D(), getP226MK25FR(), getP226MK25M(), getP226MK25C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);


    }

    public void setupP226MK25WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                        int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "p226mk25_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "p26mk25_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "p226mk25_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "p226mk25_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "p226mk25_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    ///SMG11


    public String getSMG11Name() {

        return "Machine Pistol - SMG11";
    }

    public String getSMG11D() {

        return "Damage      :     33 (Supp 28)";
    }

    public String getSMG11FR() {

        return "Fire Rate     :     1270";
    }

    public String getSMG11M() {

        return "Mobility      :     50";
    }

    public String getSMG11C() {

        return "Capacity     :     16";
    }

    public void setSMG11View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {


        setupSMG11WeaponView(insertPoint, mLayoutInflater, activity, "smg11", R.drawable.r_smg11, getSMG11Name(), getSMG11D(), getSMG11FR(), getSMG11M(), getSMG11C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcl, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);


    }

    public void setupSMG11WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "smg11_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "smg11_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "smg11_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "smg11_under", 0);

        zUtils.barrelFCLS(flash, comp, longB, supp, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "smg11_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "smg11_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "smg11_sight", 2);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCLS(flash, comp, longB, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "smg11_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCLS(flash, comp, longB, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "smg11_barrel", 1);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCLS(flash, comp, longB, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "smg11_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCLS(flash, comp, longB, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "smg11_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "smg11_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "smg11_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //AR33

    public String getAR33Name() {

        return "Assault Rifle - AR33";
    }

    public String getAR33D() {

        return "Damage      :     41 (Supp 34)";
    }

    public String getAR33FR() {

        return "Fire Rate     :     749";
    }

    public String getAR33M() {

        return "Mobility      :     50";
    }

    public String getAR33C() {

        return "Capacity     :     25";
    }

    public void setAR33View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupAR33WeaponView(insertPoint, mLayoutInflater, activity, "ar33", R.drawable.r_ar33, getAR33Name(), getAR33D(), getAR33FR(), getAR33M(), getAR33C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupAR33WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "ar33_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "ar33_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "ar33_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "ar33_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "ar33_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "ar33_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "ar33_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "ar33_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "ar33_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "ar33_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "ar33_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "ar33_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "ar33_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "ar33_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "ar33_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //R4C

    public String getR4CName() {

        return "Assault Rifle - R4C";
    }

    public String getR4CD() {

        return "Damage      :     39 (Supp 33)";
    }

    public String getR4CFR() {

        return "Fire Rate     :     860";
    }

    public String getR4CM() {

        return "Mobility      :     50";
    }

    public String getR4CC() {

        return "Capacity     :     30";
    }

    public void setR4CView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupR4CWeaponView(insertPoint, mLayoutInflater, activity, "r4c", R.drawable.r_r4c, getR4CName(), getR4CD(), getR4CFR(), getR4CM(), getR4CC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcml, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupR4CWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "r4c_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "r4c_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "r4c_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "r4c_under", 0);

        zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "r4c_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "r4c_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "r4c_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "r4c_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "r4c_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "r4c_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 2);
                zUtils.insertSharedPreferenceInt(activity, "r4c_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 3);
                zUtils.insertSharedPreferenceInt(activity, "r4c_barrel", 3);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 4);
                zUtils.insertSharedPreferenceInt(activity, "r4c_barrel", 4);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "r4c_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "r4c_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //G36C

    public String getG36CName() {

        return "Assault Rifle - G36C";
    }

    public String getG36CD() {

        return "Damage      :     38 (Supp 32)";
    }

    public String getG36CFR() {

        return "Fire Rate     :     780";
    }

    public String getG36CM() {

        return "Mobility      :     50";
    }

    public String getG36CC() {

        return "Capacity     :     30";
    }

    public void setG36CView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupG36CWeaponView(insertPoint, mLayoutInflater, activity, "g36c", R.drawable.r_g36c, getG36CName(), getG36CD(), getG36CFR(), getG36CM(), getG36CC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupG36CWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "g36c_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "g36c_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "g36c_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "g36c_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "g36c_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "g36c_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "g36c_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "g36c_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "g36c_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "g36c_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "g36c_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "g36c_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "g36c_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "g36c_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "g36c_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //M45MEUSOC

    public String getM45MEUSOCName() {

        return "Handgun - M45 MEUSOC";
    }

    public String getM45MEUSOCD() {

        return "Damage      :     58 (Supp 49)";
    }

    public String getM45MEUSOCFR() {

        return "Fire Rate     :     1";
    }

    public String getM45MEUSOCM() {

        return "Mobility      :     50";
    }

    public String getM45MEUSOCC() {

        return "Capacity     :     7";
    }

    public void setM45MEUSOCView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupM45MEUSOCWeaponView(insertPoint, mLayoutInflater, activity, "m45meusoc", R.drawable.r_m45meusoc, getM45MEUSOCName(), getM45MEUSOCD(), getM45MEUSOCFR(), getM45MEUSOCM(), getM45MEUSOCC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupM45MEUSOCWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                         int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "m45meusoc_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "m45meusoc_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "m45meusoc_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "m45meusoc_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "m45meusoc_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //57USG

    public String get57USGName() {

        return "Handgun - 57.USG";
    }

    public String get57USGD() {

        return "Damage      :     41 (Supp 34)";
    }

    public String get57USGFR() {

        return "Fire Rate     :     749";
    }

    public String get57USGM() {

        return "Mobility      :     50";
    }

    public String get57USGC() {

        return "Capacity     :     25";
    }

    public void set57USGView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup57USGWeaponView(insertPoint, mLayoutInflater, activity, "x57usg", R.drawable.r_57usg, get57USGName(), get57USGD(), get57USGFR(), get57USGM(), get57USGC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setup57USGWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x57usg_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x57usg_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "x57usg_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "x57usg_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x57usg_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //556XI

    public String get556XIName() {

        return "Assault Rifle - 556XI";
    }

    public String get556XID() {

        return "Damage      :     47 (Supp 39)";
    }

    public String get556XIFR() {

        return "Fire Rate     :     690";
    }

    public String get556XIM() {

        return "Mobility      :     50";
    }

    public String get556XIC() {

        return "Capacity     :     30";
    }

    public void set556XIView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup556XIWeaponView(insertPoint, mLayoutInflater, activity, "x556xi", R.drawable.r_556xi, get556XIName(), get556XID(), get556XIFR(), get556XIM(), get556XIC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setup556XIWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x556xi_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "x556xi_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "x556xi_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x556xi_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x556xi_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //M1014

    public String getM1014Name() {

        return "Shotgun - M1014";
    }

    public String getM1014D() {

        return "Damage      :     34";
    }

    public String getM1014FR() {

        return "Fire Rate     :     1";
    }

    public String getM1014M() {

        return "Mobility      :     50";
    }

    public String getM1014C() {

        return "Capacity     :     8";
    }

    public void setM1014View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupM1014WeaponView(insertPoint, mLayoutInflater, activity, "m1014", R.drawable.r_m1014, getM1014Name(), getM1014D(), getM1014FR(), getM1014M(), getM1014C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupM1014WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "m1014_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "m1014_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "m1014_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "m1014_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "m1014_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "m1014_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //F2

    public String getF2Name() {

        return "Assault Rifle - F2";
    }

    public String getF2D() {

        return "Damage      :     40 (Supp 34)";
    }

    public String getF2FR() {

        return "Fire Rate     :     980";
    }

    public String getF2M() {

        return "Mobility      :     50";
    }

    public String getF2C() {

        return "Capacity     :     30";
    }

    public void setF2View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupF2WeaponView(insertPoint, mLayoutInflater, activity, "f2", R.drawable.r_f2, getF2Name(), getF2D(), getF2FR(), getF2M(), getF2C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupF2WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                  int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "f2_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "f2_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "f2_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "f2_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "f2_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "f2_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "f2_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "f2_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "f2_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "f2_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "f2_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "f2_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "f2_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "f2_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //417

    public String get417Name() {

        return "DMR - 417";
    }

    public String get417D() {

        return "Damage      :     69 (Supp 58)";
    }

    public String get417FR() {

        return "Fire Rate     :     1";
    }

    public String get417M() {

        return "Mobility      :     50";
    }

    public String get417C() {

        return "Capacity     :     10";
    }

    public void set417View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup417WeaponView(insertPoint, mLayoutInflater, activity, "x417", R.drawable.r_417, get417Name(), get417D(), get417FR(), get417M(), get417C(),
                R.layout.weapon_scope_hra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setup417WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x417_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "x417_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "x417_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x417_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRA(holo, red, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "x417_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "x417_sight", 1);
            }
        });


        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "x417_sight", 2);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "x417_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "x417_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "x417_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "x417_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "x417_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x417_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //SGCQB

    public String getSGCQBName() {

        return "Shotgun - SGCQB";
    }

    public String getSGCQBD() {

        return "Damage      :     53";
    }

    public String getSGCQBFR() {

        return "Fire Rate     :     1";
    }

    public String getSGCQBM() {

        return "Mobility      :     50";
    }

    public String getSGCQBC() {

        return "Capacity     :     7";
    }

    public void setSGCQBView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSGCQBWeaponView(insertPoint, mLayoutInflater, activity, "sgcqb", R.drawable.r_sgcqb, getSGCQBName(), getSGCQBD(), getSGCQBFR(), getSGCQBM(), getSGCQBC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupSGCQBWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "sgcqb_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "sgcqb_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "sgcqb_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "sgcqb_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "sgcqb_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "sgcqb_sight", 2);
            }
        });

        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "sgcqb_grip", 0);
            }
        });

        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "sgcqb_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //P9

    public String getP9Name() {

        return "Handgun - P9";
    }

    public String getP9D() {

        return "Damage      :     45 (Supp 38)";
    }

    public String getP9FR() {

        return "Fire Rate     :     1";
    }

    public String getP9M() {

        return "Mobility      :     50";
    }

    public String getP9C() {

        return "Capacity     :     16";
    }

    public void setP9View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupP9WeaponView(insertPoint, mLayoutInflater, activity, "p9", R.drawable.r_p9, getP9Name(), getP9D(), getP9FR(), getP9M(), getP9C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupP9WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                  int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "p9_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "p9_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "p9_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "p9_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "p9_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //LFP586

    public String getLFP586Name() {

        return "Handgun - LFP586";
    }

    public String getLFP586D() {

        return "Damage      :     78";
    }

    public String getLFP586FR() {

        return "Fire Rate     :     1";
    }

    public String getLFP586M() {

        return "Mobility      :     50";
    }

    public String getLFP586C() {

        return "Capacity     :     6";
    }

    public void setLFP586View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupLFP586WeaponView(insertPoint, mLayoutInflater, activity, "lfp586", R.drawable.r_lfp586, getLFP586Name(), getLFP586D(), getLFP586FR(), getLFP586M(), getLFP586C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupLFP586WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int laserCode = zUtils.getSharedPreferenceInt(activity, "lfp586_under", 0);

        zUtils.underL(laser, laserCode);


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "lfp586_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //MONTAGNE Shield

    public String getMONTAGNEShieldName() {

        return "Shield";
    }

    public String getMONTAGNEShieldD() {

        return "Damage      :     -";
    }

    public String getMONTAGNEShieldFR() {

        return "Fire Rate     :     -";
    }

    public String getMONTAGNEShieldM() {

        return "Mobility      :     28";
    }

    public String getMONTAGNEShieldC() {

        return "Capacity     :     -";
    }

    public void setMONTAGNEShieldView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setWeaponView(insertPoint, mLayoutInflater, activity, "mont", R.drawable.r_mont_shield, getMONTAGNEShieldName(), getMONTAGNEShieldD(), getMONTAGNEShieldFR(), getMONTAGNEShieldM(), getMONTAGNEShieldC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_no);

    }


    //OTS03

    public String getOTS03Name() {

        return "Sniper - OTS03";
    }

    public String getOTS03D() {

        return "Damage      :     85 (Supp 72)";
    }

    public String getOTS03FR() {

        return "Fire Rate     :     1";
    }

    public String getOTS03M() {

        return "Mobility      :     36";
    }

    public String getOTS03C() {

        return "Capacity     :     10";
    }

    public void setOTS03View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupOTS03WeaponView(insertPoint, mLayoutInflater, activity, "ots03", R.drawable.r_ots03, getOTS03Name(), getOTS03D(), getOTS03FR(), getOTS03M(), getOTS03C(),
                R.layout.weapon_scope_r_hrr, R.layout.weapon_barrel_sfc, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_no);

    }

    public void setupOTS03WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "ots03_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "ots03_sight", 0);

        zUtils.barrelFCS(flash, comp, supp, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "ots03_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "ots03_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "ots03_sight", 2);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "ots03_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "ots03_barrel", 1);
            }
        });


        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "ots03_barrel", 2);
            }
        });



        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //GSH18

    public String getGSH18Name() {

        return "Handgun - GSH18";
    }

    public String getGSH18D() {

        return "Damage      :     44 (Supp 37)";
    }

    public String getGSH18FR() {

        return "Fire Rate     :     1";
    }

    public String getGSH18M() {

        return "Mobility      :     50";
    }

    public String getGSH18C() {

        return "Capacity     :     18";
    }

    public void setGSH18View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupGSH18WeaponView(insertPoint, mLayoutInflater, activity, "gsh18", R.drawable.r_gsh18, getGSH18Name(), getGSH18D(), getGSH18FR(), getGSH18M(), getGSH18C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_scm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_no);

    }

    public void setupGSH18WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "gsh18_barrel", 0);

        zUtils.barrelCMS(comp, muzzle, supp, barrelCode);


        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelCMS(comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "gsh18_barrel", 0);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelCMS(comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "gsh18_barrel", 1);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelCMS(comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "gsh18_barrel", 2);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //PMM

    public String getPMMName() {

        return "Handgun - PMM";
    }

    public String getPMMD() {

        return "Damage      :     61 (Supp 51)";
    }

    public String getPMMFR() {

        return "Fire Rate     :     1";
    }

    public String getPMMM() {

        return "Mobility      :     50";
    }

    public String getPMMC() {

        return "Capacity     :     8";
    }

    public void setPMMView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupPMMWeaponView(insertPoint, mLayoutInflater, activity, "pmm", R.drawable.r_pmm, getPMMName(), getPMMD(), getPMMFR(), getPMMM(), getPMMC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupPMMWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "pmm_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "pmm_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "pmm_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "pmm_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "pmm_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //FUZEShield

    public String getFUZEShieldName() {

        return "Shield";
    }

    public String getFUZEShieldD() {

        return "Damage      :     -";
    }

    public String getFUZEShieldFR() {

        return "Fire Rate     :     -";
    }

    public String getFUZEShieldM() {

        return "Mobility      :     30";
    }

    public String getFUZEShieldC() {

        return "Capacity     :     -";
    }

    public void setFUZEShieldView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setWeaponView(insertPoint, mLayoutInflater, activity, "fuze", R.drawable.r_fuze_shield, getFUZEShieldName(), getFUZEShieldD(), getFUZEShieldFR(), getFUZEShieldM(), getFUZEShieldC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_no);

    }


    //6P41

    public String get6P41Name() {

        return "Light Machine Gun - 6P41";
    }

    public String get6P41D() {

        return "Damage      :     47 (Supp 39)";
    }

    public String get6P41FR() {

        return "Fire Rate     :     680";
    }

    public String get6P41M() {

        return "Mobility      :     50";
    }

    public String get6P41C() {

        return "Capacity     :     100";
    }

    public void set6P41View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup6P41WeaponView(insertPoint, mLayoutInflater, activity, "x6p41", R.drawable.r_6p41, get6P41Name(), get6P41D(), get6P41FR(), get6P41M(), get6P41C(),
                R.layout.weapon_scope_r_hrra, R.layout.weapon_barrel_sf, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }


    public void setup6P41WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x6p41_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "x6p41_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "6p41_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x6p41_under", 0);

        zUtils.barrelFS(flash, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "x6p41_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "x6p41_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "x6p41_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "x6p41_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFS(flash, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "x6p41_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFS(flash, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "x6p41_barrel", 1);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "x6p41_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x6p41_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }
    //AK12

    public String getAK12Name() {

        return "Assault Rifle - AK12";
    }

    public String getAK12D() {

        return "Damage      :     45 (Supp 38)";
    }

    public String getAK12FR() {

        return "Fire Rate     :     850";
    }

    public String getAK12M() {

        return "Mobility      :     50";
    }

    public String getAK12C() {

        return "Capacity     :     30";
    }

    public void setAK12View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupAK12WeaponView(insertPoint, mLayoutInflater, activity, "ak12", R.drawable.r_ak12, getAK12Name(), getAK12D(), getAK12FR(), getAK12M(), getAK12C(),
                R.layout.weapon_scope_r_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupAK12WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "ak12_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "ak12_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "ak12_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "ak12_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "ak12_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "ak12_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "ak12_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "ak12_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "ak12_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "ak12_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "ak12_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "ak12_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "ak12_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "ak12_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "ak12_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //BLITZShield

    public String getBLITZShieldName() {

        return "Shield";
    }

    public String getBLITZShieldD() {

        return "Damage      :     -";
    }

    public String getBLITZShieldFR() {

        return "Fire Rate     :     -";
    }

    public String getBLITZShieldM() {

        return "Mobility      :     30";
    }

    public String getBLITZShieldC() {

        return "Capacity     :     -";
    }

    public void setBLITZShieldView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setWeaponView(insertPoint, mLayoutInflater, activity, "blitz", R.drawable.r_blitz_shield, getBLITZShieldName(), getBLITZShieldD(), getBLITZShieldFR(), getBLITZShieldM(), getBLITZShieldC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_no);

    }

    //P12

    public String getP12Name() {

        return "Handgun - P12";
    }

    public String getP12D() {

        return "Damage      :     44 (Supp 37)";
    }

    public String getP12FR() {

        return "Fire Rate     :     1";
    }

    public String getP12M() {

        return "Mobility      :     50";
    }

    public String getP12C() {

        return "Capacity     :     15";
    }

    public void setP12View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupP12WeaponView(insertPoint, mLayoutInflater, activity, "p12", R.drawable.r_p12, getP12Name(), getP12D(), getP12FR(), getP12M(), getP12C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupP12WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "p12_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "p12_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "p12_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "p12_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "p12_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //AUGA2

    public String getAUGA2Name() {

        return "Assault Rifle - AUG A2";
    }

    public String getAUGA2D() {

        return "Damage      :     42 (Supp 35)";
    }

    public String getAUGA2FR() {

        return "Fire Rate     :     720";
    }

    public String getAUGA2M() {

        return "Mobility      :     50";
    }

    public String getAUGA2C() {

        return "Capacity     :     30";
    }

    public void setAUGA2View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupAUGA2WeaponView(insertPoint, mLayoutInflater, activity, "auga2", R.drawable.r_auga2, getAUGA2Name(), getAUGA2D(), getAUGA2FR(), getAUGA2M(), getAUGA2C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfc, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupAUGA2WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "auga2_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "auga2_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "auga2_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "auga2_under", 0);

        zUtils.barrelFCS(flash, comp, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "auga2_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "auga2_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "auga2_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "auga2_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "auga2_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "auga2_barrel", 1);
            }
        });


        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "auga2_barrel", 2);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "auga2_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "auga2_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //552COMMANDO

    public String get552COMMANDOName() {

        return "Assault Rifle - 552 Commando";
    }

    public String get552COMMANDOD() {

        return "Damage      :     48 (Supp 40)";
    }

    public String get552COMMANDOFR() {

        return "Fire Rate     :     690";
    }

    public String get552COMMANDOM() {

        return "Mobility      :     50";
    }

    public String get552COMMANDOC() {

        return "Capacity     :     30";
    }

    public void set552COMMANDOView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup552COMMANDOWeaponView(insertPoint, mLayoutInflater, activity, "x552commando", R.drawable.r_552commando, get552COMMANDOName(), get552COMMANDOD(), get552COMMANDOFR(), get552COMMANDOM(), get552COMMANDOC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setup552COMMANDOWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                           int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x552commando_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "x552commando_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "x552commando_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x552commando_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x552commando_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //68A1

    public String get68A1Name() {

        return "Light Machine Gun - 68A1";
    }

    public String get68A1D() {

        return "Damage      :     37 (Supp 31)";
    }

    public String get68A1FR() {

        return "Fire Rate     :     850";
    }

    public String get68A1M() {

        return "Mobility      :     50";
    }

    public String get68A1C() {

        return "Capacity     :     50";
    }

    public void set68A1View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup68A1WeaponView(insertPoint, mLayoutInflater, activity, "68a1", R.drawable.r_68a1, get68A1Name(), get68A1D(), get68A1FR(), get68A1M(), get68A1C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfc, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setup68A1WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x68a1_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "x68a1_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "x68a1_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x68a1_under", 0);

        zUtils.barrelFCS(flash, comp, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_barrel", 1);
            }
        });


        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_barrel", 2);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x68a1_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //C8SFW

    public String getC8SFWName() {

        return "Assault Rifle - C8SFW";
    }

    public String getC8SFWD() {

        return "Damage      :     40 (Supp 34)";
    }

    public String getC8SFWFR() {

        return "Fire Rate     :     837";
    }

    public String getC8SFWM() {

        return "Mobility      :     50";
    }

    public String getC8SFWC() {

        return "Capacity     :     30";
    }

    public void setC8SFWView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupC8SFWWeaponView(insertPoint, mLayoutInflater, activity, "c8sfw", R.drawable.r_c8sfw, getC8SFWName(), getC8SFWD(), getC8SFWFR(), getC8SFWM(), getC8SFWC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcml, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupC8SFWWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "c8sfw_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "c8sfw_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "c8sfw_under", 0);

        zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 2);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 3);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_barrel", 3);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 4);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_barrel", 4);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "c8sfw_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //CAMRS

    public String getCAMRSName() {

        return "DMR - CAMRS";
    }

    public String getCAMRSD() {

        return "Damage      :     69 (Supp 58)";
    }

    public String getCAMRSFR() {

        return "Fire Rate     :     1";
    }

    public String getCAMRSM() {

        return "Mobility      :     50";
    }

    public String getCAMRSC() {

        return "Capacity     :     20";
    }

    public void setCAMRSView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupCAMRSWeaponView(insertPoint, mLayoutInflater, activity, "camrs", R.drawable.r_camrs, getCAMRSName(), getCAMRSD(), getCAMRSFR(), getCAMRSM(), getCAMRSC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupCAMRSWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "camrs_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "camrs_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "camrs_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "camrs_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "camrs_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "camrs_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "camrs_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "camrs_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "camrs_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "camrs_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "camrs_barrel", 3);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "camrs_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //MK19MM

    public String getMK19MMName() {

        return "Handgun - MK19MM";
    }

    public String getMK19MMD() {

        return "Damage      :     48 (Supp 40)";
    }

    public String getMK19MMFR() {

        return "Fire Rate     :     1";
    }

    public String getMK19MMM() {

        return "Mobility      :     50";
    }

    public String getMK19MMC() {

        return "Capacity     :     13";
    }

    public void setMK19MMView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupMK19MMWeaponView(insertPoint, mLayoutInflater, activity, "mk19mm", R.drawable.r_mk19mm, getMK19MMName(), getMK19MMD(), getMK19MMFR(), getMK19MMM(), getMK19MMC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupMK19MMWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "mk19mm_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "mk19mm_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk19mm_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "mk19mm_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk19mm_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //MK17CQB

    public String getMK17CQBName() {

        return "Assault Rifle - MK17CQB";
    }

    public String getMK17CQBD() {

        return "Damage      :     42 (Supp 35)";
    }

    public String getMK17CQBFR() {

        return "Fire Rate     :     585";
    }

    public String getMK17CQBM() {

        return "Mobility      :     50";
    }

    public String getMK17CQBC() {

        return "Capacity     :     20";
    }

    public void setMK17CQBView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupMK17CQBWeaponView(insertPoint, mLayoutInflater, activity, "mk17cqb", R.drawable.r_mk17cqb, getMK17CQBName(), getMK17CQBD(), getMK17CQBFR(), getMK17CQBM(), getMK17CQBC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcml, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupMK17CQBWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                       int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "mk17cqb_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "mk17cqb_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "mk17cqb_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "mk17cqb_under", 0);

        zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 2);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 3);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_barrel", 3);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 4);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk17cqb_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //SR25

    public String getSR25Name() {

        return "DMR - SR25";
    }

    public String getSR25D() {

        return "Damage      :     72 (Supp 61)";
    }

    public String getSR25FR() {

        return "Fire Rate     :     1";
    }

    public String getSR25M() {

        return "Mobility      :     38";
    }

    public String getSR25C() {

        return "Capacity     :     20";
    }

    public void setSR25View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSR25WeaponView(insertPoint, mLayoutInflater, activity, "sr25", R.drawable.r_sr25, getSR25Name(), getSR25D(), getSR25FR(), getSR25M(), getSR25C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupSR25WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "sr25_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "sr25_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "sr25_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "sr25_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "sr25_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "sr25_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "sr25_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "sr25_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "sr25_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "sr25_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "sr25_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "sr25_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "sr25_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "sr25_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //D50

    public String getD50Name() {

        return "Handgun - D50";
    }

    public String getD50D() {

        return "Damage      :     71";
    }

    public String getD50FR() {

        return "Fire Rate     :     1";
    }

    public String getD50M() {

        return "Mobility      :     50";
    }

    public String getD50C() {

        return "Capacity     :     7";
    }

    public void setD50View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupD50WeaponView(insertPoint, mLayoutInflater, activity, "d50", R.drawable.r_d50, getD50Name(), getD50D(), getD50FR(), getD50M(), getD50C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupD50WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int laserCode = zUtils.getSharedPreferenceInt(activity, "d50_under", 0);

        zUtils.underL(laser, laserCode);


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "d50_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //PARA308

    public String getPARA308Name() {

        return "Assault Rifle - PARA 308";
    }

    public String getPARA308D() {

        return "Damage      :     48 (Supp 40)";
    }

    public String getPARA308FR() {

        return "Fire Rate     :     650";
    }

    public String getPARA308M() {

        return "Mobility      :     50";
    }

    public String getPARA308C() {

        return "Capacity     :     30";
    }

    public void setPARA308View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupPARA308WeaponView(insertPoint, mLayoutInflater, activity, "para308", R.drawable.r_para308, getPARA308Name(), getPARA308D(), getPARA308FR(), getPARA308M(), getPARA308C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcml, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupPARA308WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                       int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "para308_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "para308_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "para308_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "para308_under", 0);

        zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "para308_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "para308_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "para308_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "para308_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "para308_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "para308_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 2);
                zUtils.insertSharedPreferenceInt(activity, "para308_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 3);
                zUtils.insertSharedPreferenceInt(activity, "para308_barrel", 3);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 4);
                zUtils.insertSharedPreferenceInt(activity, "para308_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "para308_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "para308_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "para308_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //M249

    public String getM249Name() {

        return "Light Machine Gun - M249";
    }

    public String getM249D() {

        return "Damage      :     34";
    }

    public String getM249FR() {

        return "Fire Rate     :     650";
    }

    public String getM249M() {

        return "Mobility      :     50";
    }

    public String getM249C() {

        return "Capacity     :     100";
    }

    public void setM249View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupM249WeaponView(insertPoint, mLayoutInflater, activity, "m249", R.drawable.r_m249, getM249Name(), getM249D(), getM249FR(), getM249M(), getM249C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_fc, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupM249WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "m249_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "m249_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "m249_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "m249_under", 0);

        zUtils.barrelFC(flash, comp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "m249_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "m249_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "m249_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "m249_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFC(flash, comp, 0);
                zUtils.insertSharedPreferenceInt(activity, "m249_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFC(flash, comp, 1);
                zUtils.insertSharedPreferenceInt(activity, "m249_barrel", 1);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "m249_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "m249_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //PRB92

    public String getPRB92Name() {

        return "Handgun - PRB92";
    }

    public String getPRB92D() {

        return "Damage      :     42 (Supp 35)";
    }

    public String getPRB92FR() {

        return "Fire Rate     :     1";
    }

    public String getPRB92M() {

        return "Mobility      :     50";
    }

    public String getPRB92C() {

        return "Capacity     :     15";
    }

    public void setPRB92View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupPRB92WeaponView(insertPoint, mLayoutInflater, activity, "prb92", R.drawable.r_prb92, getPRB92Name(), getPRB92D(), getPRB92FR(), getPRB92M(), getPRB92C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupPRB92WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "prb92_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "prb92_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "prb92_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "prb92_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "prb92_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //TYPE89

    public String getTYPE89Name() {

        return "Assault Rifle - TYPE 89";
    }

    public String getTYPE89D() {

        return "Damage      :     40 (Supp 34)";
    }

    public String getTYPE89FR() {

        return "Fire Rate     :     850";
    }

    public String getTYPE89M() {

        return "Mobility      :     50";
    }

    public String getTYPE89C() {

        return "Capacity     :     20";
    }

    public void setTYPE89View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupTYPE89WeaponView(insertPoint, mLayoutInflater, activity, "type89", R.drawable.r_type89, getTYPE89Name(), getTYPE89D(), getTYPE89FR(), getTYPE89M(), getTYPE89C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupTYPE89WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "type89_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "type89_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "type89_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "type89_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "type89_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "type89_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "type89_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "type89_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "type89_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "type89_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "type89_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "type89_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "type89_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "type89_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "type89_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //SUPERNOVA

    public String getSUPERNOVAName() {

        return "Shotgun - SUPERNOVA";
    }

    public String getSUPERNOVAD() {

        return "Damage      :     48";
    }

    public String getSUPERNOVAFR() {

        return "Fire Rate     :     1";
    }

    public String getSUPERNOVAM() {

        return "Mobility      :     50";
    }

    public String getSUPERNOVAC() {

        return "Capacity     :     7";
    }

    public void setSUPERNOVAView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSUPERNOVAWeaponView(insertPoint, mLayoutInflater, activity, "supernova", R.drawable.r_supernova, getSUPERNOVAName(), getSUPERNOVAD(), getSUPERNOVAFR(), getSUPERNOVAM(), getSUPERNOVAC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupSUPERNOVAWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                         int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "supernova_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "supernova_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "supernova_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "supernova_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "supernova_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "supernova_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //P229

    public String getP229Name() {

        return "Assault Rifle - P229";
    }

    public String getP229D() {

        return "Damage      :     51 (Supp 43)";
    }

    public String getP229FR() {

        return "Fire Rate     :     1";
    }

    public String getP229M() {

        return "Mobility      :     50";
    }

    public String getP229C() {

        return "Capacity     :     12";
    }

    public void setP229View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupP229WeaponView(insertPoint, mLayoutInflater, activity, "p229", R.drawable.r_p229, getP229Name(), getP229D(), getP229FR(), getP229M(), getP229C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupP229WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "p229_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "p229_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "p229_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "p229_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "p229_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //BEARING9

    public String getBEARING9Name() {

        return "Machine Pistol - BEARING 9";
    }

    public String getBEARING9D() {

        return "Damage      :     33 (Supp 28)";
    }

    public String getBEARING9FR() {

        return "Fire Rate     :     1100";
    }

    public String getBEARING9M() {

        return "Mobility      :     50";
    }

    public String getBEARING9C() {

        return "Capacity     :     25";
    }

    public void setBEARING9View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupBEARING9WeaponView(insertPoint, mLayoutInflater, activity, "bearing9", R.drawable.r_bearing9, getBEARING9Name(), getBEARING9D(), getBEARING9FR(), getBEARING9M(), getBEARING9C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfc, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupBEARING9WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                        int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "bearing9_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "bearing9_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "bearing9_under", 0);

        zUtils.barrelFCS(flash, comp, supp, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "bearing9_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "bearing9_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "bearing9_sight", 2);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "bearing9_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "bearing9_barrel", 1);
            }
        });


        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "bearing9_barrel", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "bearing9_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //C7E

    public String getC7EName() {

        return "Assault Rifle - C7E";
    }

    public String getC7ED() {

        return "Damage      :     46 (Supp 39)";
    }

    public String getC7EFR() {

        return "Fire Rate     :     800";
    }

    public String getC7EM() {

        return "Mobility      :     50";
    }

    public String getC7EC() {

        return "Capacity     :     30";
    }

    public void setC7EView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupC7EWeaponView(insertPoint, mLayoutInflater, activity, "c7e", R.drawable.r_c7e, getC7EName(), getC7ED(), getC7EFR(), getC7EM(), getC7EC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupC7EWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "c7e_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "c7e_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "c7e_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "c7e_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "c7e_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "c7e_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "c7e_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "c7e_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "c7e_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "c7e_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "c7e_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "c7e_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "c7e_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "c7e_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "c7e_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //PDW9

    public String getPDW9Name() {

        return "Submachine Gun - PDW9";
    }

    public String getPDW9D() {

        return "Damage      :     34 (Supp 29)";
    }

    public String getPDW9FR() {

        return "Fire Rate     :     800";
    }

    public String getPDW9M() {

        return "Mobility      :     50";
    }

    public String getPDW9C() {

        return "Capacity     :     50";
    }

    public void setPDW9View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupPDW9WeaponView(insertPoint, mLayoutInflater, activity, "pdw9", R.drawable.r_pdw9, getPDW9Name(), getPDW9D(), getPDW9FR(), getPDW9M(), getPDW9C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupPDW9WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "pdw9_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "pdw9_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "pdw9_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "pdw9_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "pdw9_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //ITA12L

    public String getITA12LName() {

        return "Shotgun - ITA12L";
    }

    public String getITA12LD() {

        return "Damage      :     50";
    }

    public String getITA12LFR() {

        return "Fire Rate     :     1";
    }

    public String getITA12LM() {

        return "Mobility      :     50";
    }

    public String getITA12LC() {

        return "Capacity     :     8";
    }

    public void setITA12LView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupITA12LWeaponView(insertPoint, mLayoutInflater, activity, "ita12l", R.drawable.r_ita12l, getITA12LName(), getITA12LD(), getITA12LFR(), getITA12LM(), getITA12LC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupITA12LWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "ita12l_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "ita12l_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "ita12l_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "ita12l_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "ita12l_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "ita12l_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //USP40

    public String getUSP40Name() {

        return "Assault Rifle - USP40";
    }

    public String getUSP40D() {

        return "Damage      :     48 (Supp 40)";
    }

    public String getUSP40FR() {

        return "Fire Rate     :     1";
    }

    public String getUSP40M() {

        return "Mobility      :     50";
    }

    public String getUSP40C() {

        return "Capacity     :     12";
    }

    public void setUSP40View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupUSP40WeaponView(insertPoint, mLayoutInflater, activity, "usp40", R.drawable.r_usp40, getUSP40Name(), getUSP40D(), getUSP40FR(), getUSP40M(), getUSP40C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupUSP40WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "usp40_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "usp40_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "usp40_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "usp40_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "usp40_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //ITA12S

    public String getITA12SName() {

        return "Shotgun - ITA12S";
    }

    public String getITA12SD() {

        return "Damage      :     70";
    }

    public String getITA12SFR() {

        return "Fire Rate     :     1";
    }

    public String getITA12SM() {

        return "Mobility      :     50";
    }

    public String getITA12SC() {

        return "Capacity     :     5";
    }

    public void setITA12SView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupITA12SWeaponView(insertPoint, mLayoutInflater, activity, "ita12s", R.drawable.r_ita12s, getITA12SName(), getITA12SD(), getITA12SFR(), getITA12SM(), getITA12SC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupITA12SWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "ita12s_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "ita12s_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "ita12s_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "ita12s_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "ita12s_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "ita12s_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //T95LSW

    public String getT95LSWName() {

        return "Light Machine Gun - T95LSW";
    }

    public String getT95LSWD() {

        return "Damage      :     34 (Supp 28)";
    }

    public String getT95LSWFR() {

        return "Fire Rate     :     650";
    }

    public String getT95LSWM() {

        return "Mobility      :     50";
    }

    public String getT95LSWC() {

        return "Capacity     :     80";
    }

    public void setT95LSWView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupT95LSWWeaponView(insertPoint, mLayoutInflater, activity, "t95lsw", R.drawable.r_t95lsw, getT95LSWName(), getT95LSWD(), getT95LSWFR(), getT95LSWM(), getT95LSWC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupT95LSWWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "t95lsw_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "t95lsw_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "t95lsw_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "t95lsw_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "t95lsw_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //SIX12

    public String getSIX12Name() {

        return "Shotgun - SIX 12";
    }

    public String getSIX12D() {

        return "Damage      :     35";
    }

    public String getSIX12FR() {

        return "Fire Rate     :     1";
    }

    public String getSIX12M() {

        return "Mobility      :     50";
    }

    public String getSIX12C() {

        return "Capacity     :     6";
    }

    public void setSIX12View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSIX12WWeaponView(insertPoint, mLayoutInflater, activity, "six12", R.drawable.r_six12, getSIX12Name(), getSIX12D(), getSIX12FR(), getSIX12M(), getSIX12C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupSIX12WWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "six12_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "six12_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "six12_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "six12_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "six12_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "six12_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //Q929

    public String getQ929Name() {

        return "Handgun - Q929";
    }

    public String getQ929D() {

        return "Damage      :     60 (Supp 51)";
    }

    public String getQ929FR() {

        return "Fire Rate     :     1";
    }

    public String getQ929M() {

        return "Mobility      :     50";
    }

    public String getQ929C() {

        return "Capacity     :     10";
    }

    public void setQ929View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupQ929WWeaponView(insertPoint, mLayoutInflater, activity, "q929", R.drawable.r_q929, getQ929Name(), getQ929D(), getQ929FR(), getQ929M(), getQ929C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupQ929WWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "q929_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "q929_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "q929_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "q929_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "q929_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //M762

    public String getM762Name() {

        return "Assault Rifle - M762";
    }

    public String getM762D() {

        return "Damage      :     45 (Supp 38)";
    }

    public String getM762FR() {

        return "Fire Rate     :     730";
    }

    public String getM762M() {

        return "Mobility      :     50";
    }

    public String getM762C() {

        return "Capacity     :     30";
    }

    public void setM762View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupM762WWeaponView(insertPoint, mLayoutInflater, activity, "m762", R.drawable.r_m762, getM762Name(), getM762D(), getM762FR(), getM762M(), getM762C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupM762WWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "m762_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "m762_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "m762_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "m762_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "m762_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "m762_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "m762_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "m762_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "m762_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "m762_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "m762_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "m762_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "m762_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "m762_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "m762_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //LMGE

    public String getLMGEName() {

        return "Light Machine Gun - LMGE";
    }

    public String getLMGED() {

        return "Damage      :     32 (Supp 27)";
    }

    public String getLMGEFR() {

        return "Fire Rate     :     720";
    }

    public String getLMGEM() {

        return "Mobility      :     50";
    }

    public String getLMGEC() {

        return "Capacity     :     150";
    }

    public void setLMGEView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupLMGEWeaponView(insertPoint, mLayoutInflater, activity, "lmge", R.drawable.r_lmge, getLMGEName(), getLMGED(), getLMGEFR(), getLMGEM(), getLMGEC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupLMGEWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "lmge_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "lmge_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "lmge_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "lmge_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "lmge_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "lmge_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "lmge_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "lmge_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "lmge_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "lmge_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "lmge_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "lmge_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "lmge_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "lmge_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //RG15

    public String getRG15Name() {

        return "handgun - RG15";
    }

    public String getRG15D() {

        return "Damage      :     38 (Supp 32)";
    }

    public String getRG15FR() {

        return "Fire Rate     :     1";
    }

    public String getRG15M() {

        return "Mobility      :     50";
    }

    public String getRG15C() {

        return "Capacity     :     15";
    }

    public void setRG15View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupRG15WeaponView(insertPoint, mLayoutInflater, activity, "rg15", R.drawable.r_rg15, getRG15Name(), getRG15D(), getRG15FR(), getRG15M(), getRG15C(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_sm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupRG15WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "rg15_barrel", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "rg15_under", 0);

        zUtils.barrelMS(muzzle, supp, barrelCode);
        zUtils.underL(laser, laserCode);


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "rg15_barrel", 0);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelMS(muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "rg15_barrel", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "rg15_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //MK14EBR

    public String getMK14EBRName() {

        return "DMR - MK14EBR";
    }

    public String getMK14EBRD() {

        return "Damage      :     60 (Supp 51)";
    }

    public String getMK14EBRFR() {

        return "Fire Rate     :     1";
    }

    public String getMK14EBRM() {

        return "Mobility      :     50";
    }

    public String getMK14EBRC() {

        return "Capacity     :     20";
    }

    public void setMK14EBRView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupMK14EBRWeaponView(insertPoint, mLayoutInflater, activity, "mk14ebr", R.drawable.r_mk14ebr, getMK14EBRName(), getMK14EBRD(), getMK14EBRFR(), getMK14EBRM(), getMK14EBRC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupMK14EBRWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                       int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "mk14ebr_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "mk14ebr_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "mk14ebr_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "mk14ebr_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "mk14ebr_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //BOSG122

    public String getBOSG122Name() {

        return "Shotgun - BOSG 12.2";
    }

    public String getBOSG122D() {

        return "Damage      :     125";
    }

    public String getBOSG122FR() {

        return "Fire Rate     :     1";
    }

    public String getBOSG122M() {

        return "Mobility      :     50";
    }

    public String getBOSG122C() {

        return "Capacity     :     2";
    }

    public void setBOSG122View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupBOSG122WeaponView(insertPoint, mLayoutInflater, activity, "bosg122", R.drawable.r_bosg122, getBOSG122Name(), getBOSG122D(), getBOSG122FR(), getBOSG122M(), getBOSG122C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupBOSG122WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                       int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);


        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int sightCode = zUtils.getSharedPreferenceInt(activity, "bosg122_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "bosg122_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "bosg122_under", 0);


        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "bosg122_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "bosg122_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "bosg122_sight", 2);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "bosg122_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "bosg122_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "bosg122_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //C75AUTO

    public String getC75AUTOName() {

        return "Machine Pistol - C75AUTO";
    }

    public String getC75AUTOD() {

        return "Damage      :     45 (Supp 38)";
    }

    public String getC75AUTOFR() {

        return "Fire Rate     :     1000";
    }

    public String getC75AUTOM() {

        return "Mobility      :     50";
    }

    public String getC75AUTOC() {

        return "Capacity     :     20";
    }

    public void setC75AUTOView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupC75AUTOWeaponView(insertPoint, mLayoutInflater, activity, "c75auto", R.drawable.r_c75auto, getC75AUTOName(), getC75AUTOD(), getC75AUTOFR(), getC75AUTOM(), getC75AUTOC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_s, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_no);

    }

    public void setupC75AUTOWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                       int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "c75auto_barrel", 0);

        zUtils.barrelS(supp, barrelCode);


        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelS(supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "c75auto_barrel", 2);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //SMG12

    public String getSMG12Name() {

        return "Machine Pistol - SMG12";
    }

    public String getSMG12D() {

        return "Damage      :     28";
    }

    public String getSMG12FR() {

        return "Fire Rate     :     1270";
    }

    public String getSMG12M() {

        return "Mobility      :     50";
    }

    public String getSMG12C() {

        return "Capacity     :     32";
    }

    public void setSMG12View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSMG12WeaponView(insertPoint, mLayoutInflater, activity, "smg12", R.drawable.r_smg12, getSMG12Name(), getSMG12D(), getSMG12FR(), getSMG12M(), getSMG12C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupSMG12WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);


        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int sightCode = zUtils.getSharedPreferenceInt(activity, "smg12_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "smg12_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "smg12_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "smg12_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "smg12_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "smg12_sight", 2);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "smg12_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "smg12_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "smg12_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //FMG9

    public String getFMG9Name() {

        return "Submachine Gun - FMG 9";
    }

    public String getFMG9D() {

        return "Damage      :     30 (Supp 25)";
    }

    public String getFMG9FR() {

        return "Fire Rate     :     800";
    }

    public String getFMG9M() {

        return "Mobility      :     50";
    }

    public String getFMG9C() {

        return "Capacity     :     30";
    }

    public void setFMG9View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupFMG9WeaponView(insertPoint, mLayoutInflater, activity, "fmg9", R.drawable.r_fmg9, getFMG9Name(), getFMG9D(), getFMG9FR(), getFMG9M(), getFMG9C(),
                R.layout.weapon_scope_rr, R.layout.weapon_barrel_sfc, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupFMG9WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "fmg9_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "fmg9_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "fmg9_under", 0);

        zUtils.barrelFCS(flash, comp, supp, barrelCode);
        zUtils.sightRR(red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightRR(red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "fmg9_sight", 0);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightRR(red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "fmg9_sight", 1);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "fmg9_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "fmg9_barrel", 1);
            }
        });


        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCS(flash, comp, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "fmg9_barrel", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "fmg9_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //MP5K

    public String getMP5KName() {

        return "Submachine Gun - MP5K";
    }

    public String getMP5KD() {

        return "Damage      :     30 (Supp 25)";
    }

    public String getMP5KFR() {

        return "Fire Rate     :     800";
    }

    public String getMP5KM() {

        return "Mobility      :     50";
    }

    public String getMP5KC() {

        return "Capacity     :     30";
    }

    public void setMP5KView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupMP5KWeaponView(insertPoint, mLayoutInflater, activity, "mk5k", R.drawable.r_mp5k, getMP5KName(), getMP5KD(), getMP5KFR(), getMP5KM(), getMP5KC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupMP5KWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "mp5k_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "mp5k_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "mp5k_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5k_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "mp5k_sight", 1);
            }
        });


        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "mp5k_sight", 2);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5k_barrel", 0);
            }
        });


        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "mp5k_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "mp5k_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "mp5k_barrel", 3);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5k_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //UMP45

    public String getUMP45Name() {

        return "Submachine Gun - UMP45";
    }

    public String getUMP45D() {

        return "Damage      :     38 (Supp 32)";
    }

    public String getUMP45FR() {

        return "Fire Rate     :     600";
    }

    public String getUMP45M() {

        return "Mobility      :     50";
    }

    public String getUMP45C() {

        return "Capacity     :     25";
    }

    public void setUMP45View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupUMP45WeaponView(insertPoint, mLayoutInflater, activity, "ump45", R.drawable.r_ump45, getUMP45Name(), getUMP45D(), getUMP45FR(), getUMP45M(), getUMP45C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcml, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupUMP45WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "ump45_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "ump45_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "ump45_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "ump45_under", 0);

        zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "ump45_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "ump45_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "ump45_sight", 2);
            }
        });

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "ump45_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "ump45_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 2);
                zUtils.insertSharedPreferenceInt(activity, "ump45_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 3);
                zUtils.insertSharedPreferenceInt(activity, "ump45_barrel", 3);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 4);
                zUtils.insertSharedPreferenceInt(activity, "ump45_barrel", 3);
            }
        });

        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "ump45_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "ump45_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "ump45_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //MP5

    public String getMP5Name() {

        return "Submachine Gun - MP5";
    }

    public String getMP5D() {

        return "Damage      :     30 (Supp 25)";
    }

    public String getMP5FR() {

        return "Fire Rate     :     800";
    }

    public String getMP5M() {

        return "Mobility      :     50";
    }

    public String getMP5C() {

        return "Capacity     :     30";
    }

    public void setMP5View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupMP5WeaponView(insertPoint, mLayoutInflater, activity, "mp5", R.drawable.r_mp5, getMP5Name(), getMP5D(), getMP5FR(), getMP5M(), getMP5C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfm, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupMP5WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "mp5_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "mp5_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "mp5_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "mp5_under", 0);

        zUtils.barrelFMS(flash, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "mp5_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "mp5_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "mp5_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFMS(flash, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5_barrel", 0);
            }
        });


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFMS(flash, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "mp5_barrel", 1);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFMS(flash, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "mp5_barrel", 2);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //P90

    public String getP90Name() {

        return "Submachine Gun - P90";
    }

    public String getP90D() {

        return "Damage      :     22 (Supp 18)";
    }

    public String getP90FR() {

        return "Fire Rate     :     970";
    }

    public String getP90M() {

        return "Mobility      :     50";
    }

    public String getP90C() {

        return "Capacity     :     50";
    }

    public void setP90View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupP90WeaponView(insertPoint, mLayoutInflater, activity, "ar33", R.drawable.r_p90, getP90Name(), getP90D(), getP90FR(), getP90M(), getP90C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfml, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupP90WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "p90_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "p90_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "p90_under", 0);

        zUtils.barrelFMSL(flash, muzzle, supp, longB, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "p90_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "p90_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "p90_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "p90_sight", 3);
            }
        });

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFMSL(flash, muzzle, supp, longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "p90_barrel", 0);
            }
        });


        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFMSL(flash, muzzle, supp, longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "p90_barrel", 1);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFMSL(flash, muzzle, supp, longB, 2);
                zUtils.insertSharedPreferenceInt(activity, "p90_barrel", 2);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFMSL(flash, muzzle, supp, longB, 3);
                zUtils.insertSharedPreferenceInt(activity, "p90_barrel", 3);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "p90_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //9X19VSN

    public String get9X19VSNName() {

        return "Submachine Gun - 9X19VSN";
    }

    public String get9X19VSND() {

        return "Damage      :     34 (Supp 28)";
    }

    public String get9X19VSNFR() {

        return "Fire Rate     :     750";
    }

    public String get9X19VSNM() {

        return "Mobility      :     50";
    }

    public String get9X19VSNC() {

        return "Capacity     :     30";
    }

    public void set9X19VSNView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup9X19VSNWeaponView(insertPoint, mLayoutInflater, activity, "x9x19vsn", R.drawable.r_9x19vsn, get9X19VSNName(), get9X19VSND(), get9X19VSNFR(), get9X19VSNM(), get9X19VSNC(),
                R.layout.weapon_scope_r_hrr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setup9X19VSNWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                       int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x9x19vsn_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "x9x19vsn_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "x9x19vsn_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x9x19vsn_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_sight", 2);
            }
        });

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_barrel", 3);
            }
        });

        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x9x19vsn_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //SASG12

    public String getSASG12Name() {

        return "Shotgun - SASG12";
    }

    public String getSASG12D() {

        return "Damage      :     50";
    }

    public String getSASG12FR() {

        return "Fire Rate     :     1";
    }

    public String getSASG12M() {

        return "Mobility      :     50";
    }

    public String getSASG12C() {

        return "Capacity     :     10";
    }

    public void setSASG12View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSASG12NWeaponView(insertPoint, mLayoutInflater, activity, "sasg12", R.drawable.r_sasg12, getSASG12Name(), getSASG12D(), getSASG12FR(), getSASG12M(), getSASG12C(),
                R.layout.weapon_scope_r_hrr, R.layout.weapon_barrel_s, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupSASG12NWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                       int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "sasg12_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "sasg12_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "sasg12_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "sasg12_under", 0);

        zUtils.barrelS(supp, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "sasg12_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "sasg12_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "sasg12_sight", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelS(supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "sasg12_barrel", 0);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "sasg12_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "sasg12_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "sasg12_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //M870

    public String getM870Name() {

        return "Shotgun - M870";
    }

    public String getM870D() {

        return "Damage      :     60";
    }

    public String getM870FR() {

        return "Fire Rate     :     1";
    }

    public String getM870M() {

        return "Mobility      :     50";
    }

    public String getM870C() {

        return "Capacity     :     7";
    }

    public void setM870View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupM870WeaponView(insertPoint, mLayoutInflater, activity, "m870", R.drawable.r_m870, getM870Name(), getM870D(), getM870FR(), getM870M(), getM870C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupM870WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "m870_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "m870_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "m870_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "m870_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "m870_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "m870_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //416CCARBINE

    public String get416CCARBINEName() {

        return "Assasult Rifle - 416-C CARBINE";
    }

    public String get416CCARBINED() {

        return "Damage      :     43 (Supp 36)";
    }

    public String get416CCARBINEFR() {

        return "Fire Rate     :     740";
    }

    public String get416CCARBINEM() {

        return "Mobility      :     50";
    }

    public String get416CCARBINEC() {

        return "Capacity     :     50";
    }

    public void set416CCARBINEView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup416CCARBINEWeaponView(insertPoint, mLayoutInflater, activity, "x416ccarbine", R.drawable.r_416ccarbine, get416CCARBINEName(), get416CCARBINED(), get416CCARBINEFR(), get416CCARBINEM(), get416CCARBINEC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcml, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }


    public void setup416CCARBINEWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                           int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x416ccarbine_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "x416ccarbine_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x416ccarbine_under", 0);

        zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_sight", 2);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 2);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 3);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_barrel", 3);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMSL(flash, comp, muzzle, supp, longB, 4);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_barrel", 4);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x416ccarbine_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //MP7

    public String getMP7Name() {

        return "Submachine Gun - MP7";
    }

    public String getMP7D() {

        return "Damage      :     32 (Supp 27)";
    }

    public String getMP7FR() {

        return "Fire Rate     :     900";
    }

    public String getMP7M() {

        return "Mobility      :     50";
    }

    public String getMP7C() {

        return "Capacity     :     30";
    }

    public void setMP7View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupMP7WeaponView(insertPoint, mLayoutInflater, activity, "mp7", R.drawable.r_mp7, getMP7Name(), getMP7D(), getMP7FR(), getMP7M(), getMP7C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupMP7WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "mp7_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "mp7_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "mp7_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp7_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "mp7_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "mp7_sight", 2);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp7_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "mp7_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "mp7_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "mp7_barrel", 3);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp7_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //9MMC1

    public String get9MMC1Name() {

        return "Submachine Gun - 9MMC1";
    }

    public String get9MMC1D() {

        return "Damage      :     43 (Supp 36)";
    }

    public String get9MMC1FR() {

        return "Fire Rate     :     575";
    }

    public String get9MMC1M() {

        return "Mobility      :     50";
    }

    public String get9MMC1C() {

        return "Capacity     :     34";
    }

    public void set9MMC1View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setup9MMC1WeaponView(insertPoint, mLayoutInflater, activity, "x9mmc1", R.drawable.r_9mmc1, get9MMC1Name(), get9MMC1D(), get9MMC1FR(), get9MMC1M(), get9MMC1C(),
                R.layout.weapon_scope_rr, R.layout.weapon_barrel_sl, R.layout.weapon_grip_a, R.layout.weapon_underbarrel_l);

    }

    public void setup9MMC1WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "x9mmc1_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "x9mmc1_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "x9mmc1_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "x9mmc1_under", 0);

        zUtils.barrelSL(supp, longB, barrelCode);
        zUtils.sightRR(red, reflex, sightCode);
        zUtils.gripA(angle, gripCode);
        zUtils.underL(laser, laserCode);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightRR(red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "x9mmc1_sight", 0);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightRR(red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "x9mmc1_sight", 1);
            }
        });


        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelSL( supp, longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "x9mmc1_barrel", 0);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelSL( supp, longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "x9mmc1_barrel", 1);
            }
        });


        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripA(angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "x9mmc1_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "x9mmc1_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //SUPER90

    public String getSUPER90Name() {

        return "Shotgun - SUPER90";
    }

    public String getSUPER90D() {

        return "Damage      :     32";
    }

    public String getSUPER90FR() {

        return "Fire Rate     :     1";
    }

    public String getSUPER90M() {

        return "Mobility      :     50";
    }

    public String getSUPER90C() {

        return "Capacity     :     8";
    }

    public void setSUPER90View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setuptSUPER90WeaponView(insertPoint, mLayoutInflater, activity, "super90", R.drawable.r_super90, getSUPER90Name(), getSUPER90D(), getSUPER90FR(), getSUPER90M(), getSUPER90C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setuptSUPER90WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                        int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "super90_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "super90_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "super90_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "super90_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "super90_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "super90_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //MPX

    public String getMPXName() {

        return "Submachine Gun - MPX";
    }

    public String getMPXD() {

        return "Damage      :     26 (Supp 22)";
    }

    public String getMPXFR() {

        return "Fire Rate     :     830";
    }

    public String getMPXM() {

        return "Mobility      :     50";
    }

    public String getMPXC() {

        return "Capacity     :     30";
    }

    public void setMPXView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setuptMPXWeaponView(insertPoint, mLayoutInflater, activity, "mpx", R.drawable.r_mpx, getMPXName(), getMPXD(), getMPXFR(), getMPXM(), getMPXC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setuptMPXWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "mpx_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "mpx_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "mpx_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "mpx_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRR(holo, red, reflex,sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "mpx_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "mpx_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex,2);
                zUtils.insertSharedPreferenceInt(activity, "mpx_sight", 2);
            }
        });

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "mpx_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "mpx_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "mpx_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "mpx_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "mpx_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "mpx_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "mpx_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //SPAS12

    public String getSPAS12Name() {

        return "Shotgun - SPAS12";
    }

    public String getSPAS12D() {

        return "Damage      :     35";
    }

    public String getSPAS12FR() {

        return "Fire Rate     :     1";
    }

    public String getSPAS12M() {

        return "Mobility      :     50";
    }

    public String getSPAS12C() {

        return "Capacity     :     7";
    }

    public void setSPAS12View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSPAS12WeaponView(insertPoint, mLayoutInflater, activity, "spas12", R.drawable.r_spas12, getSPAS12Name(), getSPAS12D(), getSPAS12FR(), getSPAS12M(), getSPAS12C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupSPAS12WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "spas12_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "spas12_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "spas12_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "spas12_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "spas12_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "spas12_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //M12

    public String getM12Name() {

        return "Submachine Gun - M12";
    }

    public String getM12D() {

        return "Damage      :     36 (Supp 30)";
    }

    public String getM12FR() {

        return "Fire Rate     :     550";
    }

    public String getM12M() {

        return "Mobility      :     50";
    }

    public String getM12C() {

        return "Capacity     :     30";
    }

    public void setM12View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupM12WeaponView(insertPoint, mLayoutInflater, activity, "m12", R.drawable.r_m12, getM12Name(), getM12D(), getM12FR(), getM12M(), getM12C(),
                R.layout.weapon_scope_rr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupM12WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int barrelCode = zUtils.getSharedPreferenceInt(activity, "m12_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "m12_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "m12_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightRR(red, reflex,sightCode);
        zUtils.underL(laser, laserCode);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightRR(red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "m12_sight", 0);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightRR(red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "m12_sight", 1);
            }
        });



        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "m12_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "m12_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "m12_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "m12_barrel", 3);
            }
        });



        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "m12_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //SPAS15

    public String getSPAS15Name() {

        return "Shotgun - SPAS15";
    }

    public String getSPAS15D() {

        return "Damage      :     30";
    }

    public String getSPAS15FR() {

        return "Fire Rate     :     1";
    }

    public String getSPAS15M() {

        return "Mobility      :     50";
    }

    public String getSPAS15C() {

        return "Capacity     :     6";
    }

    public void setSPAS15View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSPAS15WeaponView(insertPoint, mLayoutInflater, activity, "spas15", R.drawable.r_spas15, getSPAS15Name(), getSPAS15D(), getSPAS15FR(), getSPAS15M(), getSPAS15C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupSPAS15WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);



        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int sightCode = zUtils.getSharedPreferenceInt(activity, "spas15_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "spas15_under", 0);

        zUtils.sightHRR(holo, red, reflex, sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "spas15_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "spas15_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 2);
                zUtils.insertSharedPreferenceInt(activity, "spas15_sight", 2);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "spas15_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //LUISON

    public String getLUISONName() {

        return "Handgun - LUISON";
    }

    public String getLUISOND() {

        return "Damage      :     99";
    }

    public String getLUISONFR() {

        return "Fire Rate     :     1";
    }

    public String getLUISONM() {

        return "Mobility      :     50";
    }

    public String getLUISONC() {

        return "Capacity     :     15";
    }

    public void setLUISONView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupLUISONWeaponView(insertPoint, mLayoutInflater, activity, "luison", R.drawable.r_luison, getLUISONName(), getLUISOND(), getLUISONFR(), getLUISONM(), getLUISONC(),
                R.layout.weapon_scope_no, R.layout.weapon_barrel_no, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupLUISONWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                      int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);


        int laserCode = zUtils.getSharedPreferenceInt(activity, "luison_under", 0);

        zUtils.underL(laser, laserCode);



        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "luison_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //MP5SD

    public String getMP5SDName() {

        return "Submachine Gun - MP5 SD";
    }

    public String getMP5SDD() {

        return "Damage      :     30";
    }

    public String getMP5SDFR() {

        return "Fire Rate     :     800";
    }

    public String getMP5SDM() {

        return "Mobility      :     50";
    }

    public String getMP5SDC() {

        return "Capacity     :     30";
    }

    public void setMP5SDView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupMP5SDWeaponView(insertPoint, mLayoutInflater, activity, "mp5sd", R.drawable.r_mp5sd, getMP5SDName(), getMP5SDD(), getMP5SDFR(), getMP5SDM(), getMP5SDC(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_no, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupMP5SDWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);


        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int sightCode = zUtils.getSharedPreferenceInt(activity, "mp5sd_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "mp5sd_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "mp5sd_under", 0);

        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5sd_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "mp5sd_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "mp5sd_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "mp5sd_sight", 3);
            }
        });




        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5sd_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "mp5sd_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "mp5sd_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //VECTOR45ACP

    public String getVECTOR45ACPName() {

        return "Submachine Gun - VECTOR.45 ACP";
    }

    public String getVECTOR45ACPD() {

        return "Damage      :     21 (Supp 17)";
    }

    public String getVECTOR45ACPFR() {

        return "Fire Rate     :     1200";
    }

    public String getVECTOR45ACPM() {

        return "Mobility      :     50";
    }

    public String getVECTOR45ACPC() {

        return "Capacity     :     25";
    }

    public void setVECTOR45ACPView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupVECTOR45ACPWeaponView(insertPoint, mLayoutInflater, activity, "vector45acp", R.drawable.r_mp5sd, getVECTOR45ACPName(), getVECTOR45ACPD(), getVECTOR45ACPFR(), getVECTOR45ACPM(), getVECTOR45ACPC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupVECTOR45ACPWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                           int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "vector45acp_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "vector45acp_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "vector45acp_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "vector45acp_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp,barrelCode);
        zUtils.sightHRR(holo, red, reflex,sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex,2);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_sight", 2);
            }
        });

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,0);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,1);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,2);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,3);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert,0);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //T5SMG

    public String getT5SMGName() {

        return "Submachine Gun - T5 SMG";
    }

    public String getT5SMGD() {

        return "Damage      :     00 (Supp 00)";
    }

    public String getT5SMGFR() {

        return "Fire Rate     :     000";
    }

    public String getT5SMGM() {

        return "Mobility      :     00";
    }

    public String getT5SMGC() {

        return "Capacity     :     00";
    }

    public void setT5SMGView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupT5SMGWeaponView(insertPoint, mLayoutInflater, activity, "t5smg", R.drawable.r_t5smg, getT5SMGName(), getT5SMGD(), getT5SMGFR(), getT5SMGM(), getT5SMGC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_no, R.layout.weapon_underbarrel_l);

    }

    public void setupT5SMGWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                     int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);


        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "t5smg_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "t5smg_sight", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "t5smg_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp,barrelCode);
        zUtils.sightHRR(holo, red, reflex,sightCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "t5smg_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "t5smg_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex,2);
                zUtils.insertSharedPreferenceInt(activity, "t5smg_sight", 2);
            }
        });

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,0);
                zUtils.insertSharedPreferenceInt(activity, "t5smg_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,1);
                zUtils.insertSharedPreferenceInt(activity, "t5smg_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,2);
                zUtils.insertSharedPreferenceInt(activity, "t5smg_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,3);
                zUtils.insertSharedPreferenceInt(activity, "t5smg_barrel", 3);
            }
        });




        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "vector45acp_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //SCORPIONEVO3A1

    public String getSCORPIONEVO3A1Name() {

        return "Submachine Gun - Scorpion EVO-3A1";
    }

    public String getSCORPIONEVO3A1D() {

        return "Damage      :     28 (Supp 23)";
    }

    public String getSCORPIONEVO3A1FR() {

        return "Fire Rate     :     1080";
    }

    public String getSCORPIONEVO3A1M() {

        return "Mobility      :     50";
    }

    public String getSCORPIONEVO3A1C() {

        return "Capacity     :     40";
    }

    public void setSCORPIONEVO3A1View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSCORPIONEVO3A1WeaponView(insertPoint, mLayoutInflater, activity, "scorpionevo3a1", R.drawable.r_scorpionevo3a1, getSCORPIONEVO3A1Name(), getSCORPIONEVO3A1D(), getSCORPIONEVO3A1FR(), getSCORPIONEVO3A1M(), getSCORPIONEVO3A1C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupSCORPIONEVO3A1WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                              int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "scorpionevo3a1_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "scorpionevo3a1_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "scorpionevo3a1_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "scorpionevo3a1_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp,barrelCode);
        zUtils.sightHRR(holo, red, reflex,sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex,2);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_sight", 2);
            }
        });

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "scorpionevo3a1_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


    //F012

    public String getF012Name() {

        return "Shotgun - F012";
    }

    public String getF012D() {

        return "Damage      :     35 (Supp 29)";
    }

    public String getF012FR() {

        return "Fire Rate     :     1";
    }

    public String getF012M() {

        return "Mobility      :     50";
    }

    public String getF012C() {

        return "Capacity     :     10";
    }

    public void setF012View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupF012WeaponView(insertPoint, mLayoutInflater, activity, "f012", R.drawable.r_f012, getF012Name(), getF012D(), getF012FR(), getF012M(), getF012C(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sl, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupF012WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox longB = insertPoint.findViewById(R.id.check_long);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "f012_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "f012_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "f012_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "f012_under", 0);

        zUtils.barrelSL(supp,longB, barrelCode);
        zUtils.sightHRR(holo, red, reflex,sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex,0);
                zUtils.insertSharedPreferenceInt(activity, "f012_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex,1);
                zUtils.insertSharedPreferenceInt(activity, "f012_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex,2);
                zUtils.insertSharedPreferenceInt(activity, "f012_sight", 2);
            }
        });


        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelSL(supp,longB, 0);
                zUtils.insertSharedPreferenceInt(activity, "f012_barrel", 0);
            }
        });

        longB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelSL(supp,longB, 1);
                zUtils.insertSharedPreferenceInt(activity, "f012_barrel", 1);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert,angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "f012_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert,angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "f012_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "f012_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //K1A

    public String getK1AName() {

        return "Submachine Gun - K1A";
    }

    public String getK1AD() {

        return "Damage      :     36 (Supp 30)";
    }

    public String getK1AFR() {

        return "Fire Rate     :     720";
    }

    public String getK1AM() {

        return "Mobility      :     50";
    }

    public String getK1AC() {

        return "Capacity     :     30";
    }

    public void setK1AView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupK1AWeaponView(insertPoint, mLayoutInflater, activity, "k1a", R.drawable.r_k1a, getK1AName(), getK1AD(), getK1AFR(), getK1AM(), getK1AC(),
                R.layout.weapon_scope_hrr, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupK1AWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                   int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "k1a_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "k1a_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "k1a_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "k1a_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp,barrelCode);
        zUtils.sightHRR(holo, red, reflex,sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 0);
                zUtils.insertSharedPreferenceInt(activity, "k1a_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex, 1);
                zUtils.insertSharedPreferenceInt(activity, "k1a_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRR(holo, red, reflex,2);
                zUtils.insertSharedPreferenceInt(activity, "k1a_sight", 2);
            }
        });

        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,0);
                zUtils.insertSharedPreferenceInt(activity, "k1a_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,1);
                zUtils.insertSharedPreferenceInt(activity, "k1a_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,2);
                zUtils.insertSharedPreferenceInt(activity, "k1a_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp,3);
                zUtils.insertSharedPreferenceInt(activity, "k1a_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "k1a_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "k1a_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "k1a_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //V308

    //V308

    public String getV308Name() {

        return "Assault Rifle - V308";
    }

    public String getV308D() {

        return "Damage      :     44 (Supp 37)";
    }

    public String getV308FR() {

        return "Fire Rate     :     850";
    }

    public String getV308M() {

        return "Mobility      :     50";
    }

    public String getV308C() {

        return "Capacity     :     50";
    }

    public void setV308View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupV308WeaponView(insertPoint, mLayoutInflater, activity, "v308", R.drawable.r_v308, getV308Name(), getV308D(), getV308FR(), getV308M(), getV308C(),
                R.layout.weapon_scope_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_va, R.layout.weapon_underbarrel_l);

    }

    public void setupV308WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);

        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);
        final CheckBox angle = insertPoint.findViewById(R.id.check_angle);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "v308_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "v308_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "v308_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "v308_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripVA(vert, angle, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "v308_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "v308_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "v308_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "v308_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "v308_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "v308_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "v308_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "v308_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 0);
                zUtils.insertSharedPreferenceInt(activity, "v308_grip", 0);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripVA(vert, angle, 1);
                zUtils.insertSharedPreferenceInt(activity, "v308_grip", 1);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "v308_under", 0);
            }
        });

        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }

    //Spear308

    public String getSpear308Name() {

        return "Assault Rifle - Spear308";
    }

    public String getSpear308D() {

        return "Damage      :     38 (Supp 32)";
    }

    public String getSpear308FR() {

        return "Fire Rate     :     780";
    }

    public String getSpear308M() {

        return "Mobility      :     50";
    }

    public String getSpear308C() {

        return "Capacity     :     30";
    }

    public void setSpear308View(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setupSpera308WeaponView(insertPoint, mLayoutInflater, activity, "spear308", R.drawable.r_spear308, getSpear308Name(), getSpear308D(), getSpear308FR(), getSpear308M(), getSpear308C(),
                R.layout.weapon_scope_r_hrra, R.layout.weapon_barrel_sfcm, R.layout.weapon_grip_v, R.layout.weapon_underbarrel_l);

    }

    public void setupSpera308WeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString, final int weaponDrawable, String name, String damage, String rof, String mobility, String capacity,
                                    int scope, int barrel, int grip, int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0, 24, 0, 0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1, layoutParams);
        insertPoint.addView(weaponScope, 2, layoutParams);
        insertPoint.addView(weaponBarrel, 3, layoutParams);
        insertPoint.addView(weaponGrip, 4, layoutParams);
        insertPoint.addView(weaponUnderbarrel, 5, layoutParams);
        insertPoint.addView(weaponNotes, 6, layoutParams);


        final CheckBox holo = insertPoint.findViewById(R.id.check_holo);
        final CheckBox reflex = insertPoint.findViewById(R.id.check_reflex);
        final CheckBox red = insertPoint.findViewById(R.id.check_red);
        final CheckBox acog = insertPoint.findViewById(R.id.check_acog);

        final CheckBox supp = insertPoint.findViewById(R.id.check_supp);
        final CheckBox flash = insertPoint.findViewById(R.id.check_flash);
        final CheckBox comp = insertPoint.findViewById(R.id.check_comp);
        final CheckBox muzzle = insertPoint.findViewById(R.id.check_muzzle);

        final CheckBox laser = insertPoint.findViewById(R.id.check_laser);

        final CheckBox vert = insertPoint.findViewById(R.id.check_vert);

        int barrelCode = zUtils.getSharedPreferenceInt(activity, "spear308_barrel", 0);
        int sightCode = zUtils.getSharedPreferenceInt(activity, "spear308_sight", 0);
        int gripCode = zUtils.getSharedPreferenceInt(activity, "spear308_grip", 0);
        int laserCode = zUtils.getSharedPreferenceInt(activity, "spear308_under", 0);

        zUtils.barrelFCMS(flash, comp, muzzle, supp, barrelCode);
        zUtils.sightHRRA(holo, red, reflex, acog, sightCode);
        zUtils.gripV(vert, gripCode);
        zUtils.underL(laser, laserCode);

        holo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 0);
                zUtils.insertSharedPreferenceInt(activity, "spear308_sight", 0);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 1);
                zUtils.insertSharedPreferenceInt(activity, "spear308_sight", 1);
            }
        });

        reflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 2);
                zUtils.insertSharedPreferenceInt(activity, "spear308_sight", 2);
            }
        });

        acog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.sightHRRA(holo, red, reflex, acog, 3);
                zUtils.insertSharedPreferenceInt(activity, "spear308_sight", 3);
            }
        });


        flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 0);
                zUtils.insertSharedPreferenceInt(activity, "spear308_barrel", 0);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 1);
                zUtils.insertSharedPreferenceInt(activity, "spear308_barrel", 1);
            }
        });

        muzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 2);
                zUtils.insertSharedPreferenceInt(activity, "spear308_barrel", 2);
            }
        });

        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.barrelFCMS(flash, comp, muzzle, supp, 3);
                zUtils.insertSharedPreferenceInt(activity, "spear308_barrel", 3);
            }
        });


        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.gripV(vert, 0);
                zUtils.insertSharedPreferenceInt(activity, "spear308_grip", 0);
            }
        });


        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zUtils.underL(laser, 0);
                zUtils.insertSharedPreferenceInt(activity, "spear308_under", 0);
            }
        });


        Drawable weaponImageDrawable = zUtils.resizeImage(weaponDrawable, activity);

        ImageView weaponImageview = insertPoint.findViewById(R.id.weapon_image);
        final TextView weaponName = insertPoint.findViewById(R.id.weapon_name);
        TextView weaponDamage = insertPoint.findViewById(R.id.weapon_damage);
        TextView weaponROF = insertPoint.findViewById(R.id.weapon_rof);
        TextView weaponMobility = insertPoint.findViewById(R.id.weapon_mobility);
        TextView weaponCapacity = insertPoint.findViewById(R.id.weapon_capacity);
        final EditText weaponNote = insertPoint.findViewById(R.id.weapon_editnote);
        Button weaponNoteButton = insertPoint.findViewById(R.id.weapon_editbutton);

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        weaponNote.setText(sharedPref.getString(String.valueOf(weaponNameString), ""));
        weaponNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString(String.valueOf(weaponNameString), String.valueOf(weaponNote.getText()));
                editor.commit();
                Toast.makeText(activity, "Note Saved", Toast.LENGTH_SHORT).show();
            }
        });

        weaponName.setText(name);
        weaponDamage.setText(damage);
        weaponROF.setText(rof);
        weaponMobility.setText(mobility);
        weaponCapacity.setText(capacity);
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity, 380), zUtils.getPixelfromDP(activity, 166)).into(weaponImageview);
    }


}
