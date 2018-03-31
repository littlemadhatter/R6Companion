package com.jeevscode.android.r6companion.Helpers;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.jeevscode.android.r6companion.R;

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

    public void setWeaponView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity, final String weaponNameString,final int weaponDrawable,String name,String damage,String rof,String mobility,String capacity,
                              int scope,int barrel,int grip,int underbarrel) {

        View weaponImage = mLayoutInflater.inflate(R.layout.weapon_image, null);
        View weaponStats = mLayoutInflater.inflate(R.layout.weapon_stats, null);
        View weaponScope = mLayoutInflater.inflate(scope, null);
        View weaponBarrel = mLayoutInflater.inflate(barrel, null);
        View weaponGrip = mLayoutInflater.inflate(grip, null);
        View weaponUnderbarrel = mLayoutInflater.inflate(underbarrel, null);
        View weaponNotes = mLayoutInflater.inflate(R.layout.weapon_note, null);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(0,24,0,0);

        insertPoint.addView(weaponImage, 0, layoutParams);
        insertPoint.addView(weaponStats, 1,layoutParams);
        insertPoint.addView(weaponScope, 2,layoutParams);
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
        Picasso.with(activity).load(weaponDrawable).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(activity,380),zUtils.getPixelfromDP(activity,166)).into(weaponImageview);
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


        setWeaponView(insertPoint, mLayoutInflater, activity, "l785a2",R.drawable.r_l85a2,getL85A2Name(),getL85A2D(),getL85A2FR(),getL85A2M(),getL85A2C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);


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


        setWeaponView(insertPoint, mLayoutInflater, activity, "m590a1",R.drawable.r_m590a1,getM590A1Name(),getM590A1D(),getM590A1FR(),getM590A1M(),getM590A1C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);


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


        setWeaponView(insertPoint, mLayoutInflater, activity, "p226mk25",R.drawable.r_p226mk25,getP226MK25Name(),getP226MK25D(),getP226MK25FR(),getP226MK25M(),getP226MK25C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);


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


        setWeaponView(insertPoint, mLayoutInflater, activity, "smg11",R.drawable.r_smg11,getSMG11Name(),getSMG11D(),getSMG11FR(),getSMG11M(),getSMG11C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcl,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);


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

        setWeaponView(insertPoint, mLayoutInflater, activity, "ar33",R.drawable.r_ar33,getAR33Name(),getAR33D(),getAR33FR(),getAR33M(),getAR33C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "r4c",R.drawable.r_r4c,getR4CName(),getR4CD(),getR4CFR(),getR4CM(),getR4CC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcml,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "g36c",R.drawable.r_g36c,getG36CName(),getG36CD(),getG36CFR(),getG36CM(),getG36CC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "m45meusoc",R.drawable.r_m45meusoc,getM45MEUSOCName(),getM45MEUSOCD(),getM45MEUSOCFR(),getM45MEUSOCM(),getM45MEUSOCC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "x57usg",R.drawable.r_57usg,get57USGName(),get57USGD(),get57USGFR(),get57USGM(),get57USGC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "x556xi",R.drawable.r_556xi,get556XIName(),get556XID(),get556XIFR(),get556XIM(),get556XIC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "m1014",R.drawable.r_m1014,getM1014Name(),getM1014D(),getM1014FR(),getM1014M(),getM1014C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "f2",R.drawable.r_f2,getF2Name(),getF2D(),getF2FR(),getF2M(),getF2C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "x417",R.drawable.r_417,get417Name(),get417D(),get417FR(),get417M(),get417C(),
                R.layout.weapon_scope_hra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "sgcqb",R.drawable.r_sgcqb,getSGCQBName(),getSGCQBD(),getSGCQBFR(),getSGCQBM(),getSGCQBC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "p9",R.drawable.r_p9,getP9Name(),getP9D(),getP9FR(),getP9M(),getP9C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "lfp586",R.drawable.r_lfp586,getLFP586Name(),getLFP586D(),getLFP586FR(),getLFP586M(),getLFP586C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mont",R.drawable.r_mont_shield,getMONTAGNEShieldName(),getMONTAGNEShieldD(),getMONTAGNEShieldFR(),getMONTAGNEShieldM(),getMONTAGNEShieldC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_no);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "ots03",R.drawable.r_ots03,getOTS03Name(),getOTS03D(),getOTS03FR(),getOTS03M(),getOTS03C(),
                R.layout.weapon_scope_r_hrr,R.layout.weapon_barrel_sfc,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_no);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "gsh18",R.drawable.r_gsh18,getGSH18Name(),getGSH18D(),getGSH18FR(),getGSH18M(),getGSH18C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_scm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_no);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "pmm",R.drawable.r_pmm,getPMMName(),getPMMD(),getPMMFR(),getPMMM(),getPMMC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "fuze",R.drawable.r_fuze_shield,getFUZEShieldName(),getFUZEShieldD(),getFUZEShieldFR(),getFUZEShieldM(),getFUZEShieldC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_no);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "x6p41",R.drawable.r_6p41,get6P41Name(),get6P41D(),get6P41FR(),get6P41M(),get6P41C(),
                R.layout.weapon_scope_r_hrra,R.layout.weapon_barrel_sf,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "ak12",R.drawable.r_ak12,getAK12Name(),getAK12D(),getAK12FR(),getAK12M(),getAK12C(),
                R.layout.weapon_scope_r_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "blitz",R.drawable.r_blitz_shield,getBLITZShieldName(),getBLITZShieldD(),getBLITZShieldFR(),getBLITZShieldM(),getBLITZShieldC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_no);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "p12",R.drawable.r_p12,getP12Name(),getP12D(),getP12FR(),getP12M(),getP12C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "auga2",R.drawable.r_auga2,getAUGA2Name(),getAUGA2D(),getAUGA2FR(),getAUGA2M(),getAUGA2C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfc,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "552commando",R.drawable.r_552commando,get552COMMANDOName(),get552COMMANDOD(),get552COMMANDOFR(),get552COMMANDOM(),get552COMMANDOC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "68a1",R.drawable.r_68a1,get68A1Name(),get68A1D(),get68A1FR(),get68A1M(),get68A1C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfc,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "c8sfw",R.drawable.r_c8sfw,getC8SFWName(),getC8SFWD(),getC8SFWFR(),getC8SFWM(),getC8SFWC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcml,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "camrs",R.drawable.r_camrs,getCAMRSName(),getCAMRSD(),getCAMRSFR(),getCAMRSM(),getCAMRSC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mk19mm",R.drawable.r_mk19mm,getMK19MMName(),getMK19MMD(),getMK19MMFR(),getMK19MMM(),getMK19MMC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mk17cqb",R.drawable.r_mk17cqb,getMK17CQBName(),getMK17CQBD(),getMK17CQBFR(),getMK17CQBM(),getMK17CQBC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcml,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "sr25",R.drawable.r_sr25,getSR25Name(),getSR25D(),getSR25FR(),getSR25M(),getSR25C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "d50",R.drawable.r_d50,getD50Name(),getD50D(),getD50FR(),getD50M(),getD50C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "para308",R.drawable.r_para308,getPARA308Name(),getPARA308D(),getPARA308FR(),getPARA308M(),getPARA308C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcml,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "m249",R.drawable.r_m249,getM249Name(),getM249D(),getM249FR(),getM249M(),getM249C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_fc,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "prb92",R.drawable.r_prb92,getPRB92Name(),getPRB92D(),getPRB92FR(),getPRB92M(),getPRB92C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "type89",R.drawable.r_type89,getTYPE89Name(),getTYPE89D(),getTYPE89FR(),getTYPE89M(),getTYPE89C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "supernova",R.drawable.r_supernova,getSUPERNOVAName(),getSUPERNOVAD(),getSUPERNOVAFR(),getSUPERNOVAM(),getSUPERNOVAC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "p229",R.drawable.r_p229,getP229Name(),getP229D(),getP229FR(),getP229M(),getP229C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "bearing9",R.drawable.r_bearing9,getBEARING9Name(),getBEARING9D(),getBEARING9FR(),getBEARING9M(),getBEARING9C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfc,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "c7e",R.drawable.r_c7e,getC7EName(),getC7ED(),getC7EFR(),getC7EM(),getC7EC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "pdw9",R.drawable.r_pdw9,getPDW9Name(),getPDW9D(),getPDW9FR(),getPDW9M(),getPDW9C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "ita12l",R.drawable.r_ita12l,getITA12LName(),getITA12LD(),getITA12LFR(),getITA12LM(),getITA12LC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "usp40",R.drawable.r_usp40,getUSP40Name(),getUSP40D(),getUSP40FR(),getUSP40M(),getUSP40C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "ita12s",R.drawable.r_ita12s,getITA12SName(),getITA12SD(),getITA12SFR(),getITA12SM(),getITA12SC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "t95lsw",R.drawable.r_t95lsw,getT95LSWName(),getT95LSWD(),getT95LSWFR(),getT95LSWM(),getT95LSWC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "six12",R.drawable.r_six12,getSIX12Name(),getSIX12D(),getSIX12FR(),getSIX12M(),getSIX12C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "q929",R.drawable.r_q929,getQ929Name(),getQ929D(),getQ929FR(),getQ929M(),getQ929C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "m762",R.drawable.r_m762,getM762Name(),getM762D(),getM762FR(),getM762M(),getM762C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "lmge",R.drawable.r_lmge,getLMGEName(),getLMGED(),getLMGEFR(),getLMGEM(),getLMGEC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "rg15",R.drawable.r_rg15,getRG15Name(),getRG15D(),getRG15FR(),getRG15M(),getRG15C(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_sm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mk14ebr",R.drawable.r_mk14ebr,getMK14EBRName(),getMK14EBRD(),getMK14EBRFR(),getMK14EBRM(),getMK14EBRC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "bosg122",R.drawable.r_bosg122,getBOSG122Name(),getBOSG122D(),getBOSG122FR(),getBOSG122M(),getBOSG122C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

    }


    //C75AUTO

    public String getC75AUTOName() {

        return "Machine Pistol - C75AUTO";
    }

    public String getC75AUTOD() {

        return "Damage      :     45 (Supp 38)";
    }

    public String getC75AUTOFR() {

        return "Fire Rate     :     1";
    }

    public String getC75AUTOM() {

        return "Mobility      :     50";
    }

    public String getC75AUTOC() {

        return "Capacity     :     20";
    }

    public void setC75AUTOView(ViewGroup insertPoint, LayoutInflater mLayoutInflater, final Activity activity) {

        setWeaponView(insertPoint, mLayoutInflater, activity, "c75auto",R.drawable.r_c75auto,getC75AUTOName(),getC75AUTOD(),getC75AUTOFR(),getC75AUTOM(),getC75AUTOC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_s,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_no);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "smg12",R.drawable.r_smg12,getSMG12Name(),getSMG12D(),getSMG12FR(),getSMG12M(),getSMG12C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "fmg9",R.drawable.r_fmg9,getFMG9Name(),getFMG9D(),getFMG9FR(),getFMG9M(),getFMG9C(),
                R.layout.weapon_scope_rr,R.layout.weapon_barrel_sfc,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mk5k",R.drawable.r_mp5k,getMP5KName(),getMP5KD(),getMP5KFR(),getMP5KM(),getMP5KC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "ump45",R.drawable.r_ump45,getUMP45Name(),getUMP45D(),getUMP45FR(),getUMP45M(),getUMP45C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcml,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mp5",R.drawable.r_mp5,getMP5Name(),getMP5D(),getMP5FR(),getMP5M(),getMP5C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfm,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "ar33",R.drawable.r_p90,getP90Name(),getP90D(),getP90FR(),getP90M(),getP90C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfml,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "x9x19vsn",R.drawable.r_9x19vsn,get9X19VSNName(),get9X19VSND(),get9X19VSNFR(),get9X19VSNM(),get9X19VSNC(),
                R.layout.weapon_scope_r_hrr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "sasg12",R.drawable.r_sasg12,getSASG12Name(),getSASG12D(),getSASG12FR(),getSASG12M(),getSASG12C(),
                R.layout.weapon_scope_r_hrr,R.layout.weapon_barrel_s,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "m870",R.drawable.r_m870,getM870Name(),getM870D(),getM870FR(),getM870M(),getM870C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "x416ccarbine",R.drawable.r_416ccarbine,get416CCARBINEName(),get416CCARBINED(),get416CCARBINEFR(),get416CCARBINEM(),get416CCARBINEC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcml,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mp7",R.drawable.r_mp7,getMP7Name(),getMP7D(),getMP7FR(),getMP7M(),getMP7C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "x9mmc1",R.drawable.r_9mmc1,get9MMC1Name(),get9MMC1D(),get9MMC1FR(),get9MMC1M(),get9MMC1C(),
                R.layout.weapon_scope_rr,R.layout.weapon_barrel_sl,R.layout.weapon_grip_a,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "super90",R.drawable.r_super90,getSUPER90Name(),getSUPER90D(),getSUPER90FR(),getSUPER90M(),getSUPER90C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mpx",R.drawable.r_mpx,getMPXName(),getMPXD(),getMPXFR(),getMPXM(),getMPXC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "spas12",R.drawable.r_spas12,getSPAS12Name(),getSPAS12D(),getSPAS12FR(),getSPAS12M(),getSPAS12C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "m12",R.drawable.r_m12,getM12Name(),getM12D(),getM12FR(),getM12M(),getM12C(),
                R.layout.weapon_scope_rr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "spas15",R.drawable.r_spas15,getSPAS15Name(),getSPAS15D(),getSPAS15FR(),getSPAS15M(),getSPAS15C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "luison",R.drawable.r_luison,getLUISONName(),getLUISOND(),getLUISONFR(),getLUISONM(),getLUISONC(),
                R.layout.weapon_scope_no,R.layout.weapon_barrel_no,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "mp5sd",R.drawable.r_mp5sd,getMP5SDName(),getMP5SDD(),getMP5SDFR(),getMP5SDM(),getMP5SDC(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_no,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "vector45acp",R.drawable.r_mp5sd,getVECTOR45ACPName(),getVECTOR45ACPD(),getVECTOR45ACPFR(),getVECTOR45ACPM(),getVECTOR45ACPC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "t5smg",R.drawable.r_t5smg,getT5SMGName(),getT5SMGD(),getT5SMGFR(),getT5SMGM(),getT5SMGC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_no,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "scorpionevo3a1",R.drawable.r_scorpionevo3a1,getSCORPIONEVO3A1Name(),getSCORPIONEVO3A1D(),getSCORPIONEVO3A1FR(),getSCORPIONEVO3A1M(),getSCORPIONEVO3A1C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "f012",R.drawable.r_f012,getF012Name(),getF012D(),getF012FR(),getF012M(),getF012C(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sl,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "k1a",R.drawable.r_k1a,getK1AName(),getK1AD(),getK1AFR(),getK1AM(),getK1AC(),
                R.layout.weapon_scope_hrr,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "v308",R.drawable.r_v308,getV308Name(),getV308D(),getV308FR(),getV308M(),getV308C(),
                R.layout.weapon_scope_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_va,R.layout.weapon_underbarrel_l);

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

        setWeaponView(insertPoint, mLayoutInflater, activity, "spear308",R.drawable.r_spear308,getSpear308Name(),getSpear308D(),getSpear308FR(),getSpear308M(),getSpear308C(),
                R.layout.weapon_scope_r_hrra,R.layout.weapon_barrel_sfcm,R.layout.weapon_grip_v,R.layout.weapon_underbarrel_l);

    }








































}
