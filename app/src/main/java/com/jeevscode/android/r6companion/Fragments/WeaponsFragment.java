package com.jeevscode.android.r6companion.Fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.jeevscode.android.r6companion.Activities.WeaponsListActivity;
import com.jeevscode.android.r6companion.MainActivity;
import com.jeevscode.android.r6companion.R;
import com.jeevscode.android.r6companion.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class WeaponsFragment extends Fragment {

    private int[] mWeaponIcons = {
            R.drawable.assault, R.drawable.submachine, R.drawable.machine, R.drawable.shotgun, R.drawable.lmg, R.drawable.pistol, R.drawable.dmr, R.drawable.sniper
    };

    private ZUtils zUtils;

    private int[] mWeaponIconImageViews = {
            R.id.assault, R.id.submachine, R.id.machine, R.id.shotgun, R.id.lmg, R.id.pistol, R.id.dmr, R.id.sniper
    };

    private ImageView imageView[];

    boolean isAssault;


    public WeaponsFragment(){

    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        for (int i = 0; i < 8; i++) {

            imageView[i] = null;

        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_weapons, container, false);

        ((MainActivity) getActivity())
                .setActionBarTitle("Weapon Categories");

        isAssault = false;
        imageView = new ImageView[8];


        final Button toggleAssault = view.findViewById(R.id.toggle_assault_list);
        final TextView assaultList = view.findViewById(R.id.assault_list);
        final Button toggleSubmachine = view.findViewById(R.id.toggle_submachine_list);
        final TextView submachineList = view.findViewById(R.id.submachine_list);
        final Button toggleMachine = view.findViewById(R.id.toggle_machine_list);
        final TextView machineList = view.findViewById(R.id.machine_list);
        final Button toggleShotgun = view.findViewById(R.id.toggle_shotgun_list);
        final TextView shotgunList = view.findViewById(R.id.shotgun_list);
        final Button toggleLMG = view.findViewById(R.id.toggle_lmg_list);
        final TextView lmgList = view.findViewById(R.id.lmg_list);
        final Button togglePistol = view.findViewById(R.id.toggle_pistol_list);
        final TextView pistolList = view.findViewById(R.id.pistol_list);
        final Button toggleDMR = view.findViewById(R.id.toggle_dmr_list);
        final TextView dmrList = view.findViewById(R.id.dmr_list);
        final Button toggleSniper = view.findViewById(R.id.toggle_sniper_list);
        final TextView sniperList = view.findViewById(R.id.sniper_list);

        assaultList.setText("L85A2 - AR33 - R4C - G36C - 556XI - F2 - AK12 - AUGA2 - 552COMMANDO - C8SFW - MK17CQB - PARA308 - TYPE89 - C7E - M762 - 416CCARBINE - V308 - SPEAR308");
        submachineList.setText("PDW9 - FMG9 - MP5K - UMP45 - MP5 - P90 - 9X19VSN - MP7 - 9MMC1 - MPX - M12 - MP5SD - VECTOR45ACP - T5SMG - SCORPIONEVO3A1 - K1A");
        machineList.setText("SMG11 - BEARING9 - C75AUTO - SMG12");
        shotgunList.setText("M590A1 - M1014 - SGCQB - SUPERNOVA - ITA12L - ITA12S - SIX12 - BOSG12.2 - SASG12 - M870 - SUPER90 - SPAS12 - SPAS15 - SIX12SD - F012");
        lmgList.setText("6P41 - 68A1 - M249 - T95LSW - LMGE");
        pistolList.setText("P226MK25 - M45MEUSOC - 57USG - P9 - LFP586 - GSH18 - PMM - P12 - MK19MM - D50 - PRB92 - P229 - USP40 - Q929 - RG15 - LUISON");
        dmrList.setText("417 - CAMRS - SR25 - MK14EBR");
        sniperList.setText("OTS03");



        //Setup Toggles to small list weapons in categories

        toggleAssault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAssault = !isAssault;

                if (isAssault){
                    assaultList.setVisibility(View.VISIBLE);
                    toggleAssault.setText("HIDE ALL");
                }else{
                    assaultList.setVisibility(View.GONE);
                    toggleAssault.setText("SHOW ALL");
                }
            }
        });

        toggleSubmachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAssault = !isAssault;

                if (isAssault){
                    submachineList.setVisibility(View.VISIBLE);
                    toggleSubmachine.setText("HIDE ALL");
                }else{
                    submachineList.setVisibility(View.GONE);
                    toggleSubmachine.setText("SHOW ALL");
                }
            }
        });

        toggleMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAssault = !isAssault;

                if (isAssault){
                    machineList.setVisibility(View.VISIBLE);
                    toggleMachine.setText("HIDE ALL");
                }else{
                    machineList.setVisibility(View.GONE);
                    toggleMachine.setText("SHOW ALL");
                }
            }
        });

        toggleShotgun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAssault = !isAssault;

                if (isAssault){
                    shotgunList.setVisibility(View.VISIBLE);
                    toggleShotgun.setText("HIDE ALL");
                }else{
                    shotgunList.setVisibility(View.GONE);
                    toggleShotgun.setText("SHOW ALL");
                }
            }
        });

        toggleLMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAssault = !isAssault;

                if (isAssault){
                    lmgList.setVisibility(View.VISIBLE);
                    toggleLMG.setText("HIDE ALL");
                }else{
                    lmgList.setVisibility(View.GONE);
                    toggleLMG.setText("SHOW ALL");
                }
            }
        });

        togglePistol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAssault = !isAssault;

                if (isAssault){
                    pistolList.setVisibility(View.VISIBLE);
                    togglePistol.setText("HIDE ALL");
                }else{
                    pistolList.setVisibility(View.GONE);
                    togglePistol.setText("SHOW ALL");
                }
            }
        });

        toggleDMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAssault = !isAssault;

                if (isAssault){
                    dmrList.setVisibility(View.VISIBLE);
                    toggleDMR.setText("HIDE ALL");
                }else{
                    dmrList.setVisibility(View.GONE);
                    toggleDMR.setText("SHOW ALL");
                }
            }
        });

        toggleSniper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAssault = !isAssault;

                if (isAssault){
                    sniperList.setVisibility(View.VISIBLE);
                    toggleSniper.setText("HIDE ALL");
                }else{
                    sniperList.setVisibility(View.GONE);
                    toggleSniper.setText("SHOW ALL");
                }
            }
        });


        assaultList.setVisibility(View.GONE);
        submachineList.setVisibility(View.GONE);
        machineList.setVisibility(View.GONE);
        shotgunList.setVisibility(View.GONE);
        lmgList.setVisibility(View.GONE);
        pistolList.setVisibility(View.GONE);
        dmrList.setVisibility(View.GONE);
        sniperList.setVisibility(View.GONE);



        zUtils = new ZUtils();

        setupWeaponIcons(view);

        return view;
    }

    //Setup Weapon Icons

    public void setupWeaponIcons(View view) {

        for (int i = 0; i < 8; i++) {

            imageView[i] = view.findViewById(mWeaponIconImageViews[i]);

            Picasso.with(getActivity()).load(mWeaponIcons[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(),300),zUtils.getPixelfromDP(getActivity(),111)).into(imageView[i]);

            imageView[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent;

                    switch (v.getId()) {

                        case R.id.assault:
                            intent = new Intent(getActivity(),WeaponsListActivity.class);
                            intent.putExtra("weapon","assault");
                            startActivity(intent);
                            break;
                        case R.id.submachine:
                            intent = new Intent(getActivity(),WeaponsListActivity.class);
                            intent.putExtra("weapon","submachine");
                            startActivity(intent);
                            break;
                        case R.id.machine:
                            intent = new Intent(getActivity(),WeaponsListActivity.class);
                            intent.putExtra("weapon","machine");
                            startActivity(intent);
                            break;
                        case R.id.shotgun:
                            intent = new Intent(getActivity(),WeaponsListActivity.class);
                            intent.putExtra("weapon","shotgun");
                            startActivity(intent);
                            break;
                        case R.id.lmg:
                            intent = new Intent(getActivity(),WeaponsListActivity.class);
                            intent.putExtra("weapon","lmg");
                            startActivity(intent);
                            break;
                        case R.id.pistol:
                            intent = new Intent(getActivity(),WeaponsListActivity.class);
                            intent.putExtra("weapon","pistol");
                            startActivity(intent);
                            break;
                        case R.id.dmr:
                            intent = new Intent(getActivity(),WeaponsListActivity.class);
                            intent.putExtra("weapon","dmr");
                            startActivity(intent);
                            break;
                        case R.id.sniper:
                            intent = new Intent(getActivity(),WeaponsListActivity.class);
                            intent.putExtra("weapon","sniper");
                            startActivity(intent);


                    }
                }
            });



        }



    }

}
