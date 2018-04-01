package com.zeuspalette.android.r6tab.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeuspalette.android.r6tab.Activities.WeaponItemActivity;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.WeaponHelper;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorWeaponFragment extends Fragment {

    private ZUtils zUtils;
    WeaponHelper wH;
    LayoutInflater layoutInflater;


    public OperatorWeaponFragment() {


        zUtils = new ZUtils();

        wH = new WeaponHelper(getActivity());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(getOperatorPrimary(), container, false);

        //Setup Weapon Information for a selected  Weapon


        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("l85a2")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setL785A2View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ar33")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setAR33View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("r4c")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setR4CView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("g36c")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setG36CView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("556xi")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set556XIView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f2")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setF2View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ak12")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setAK12View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("auga2")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setAUGA2View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("552commando")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set552COMMANDOView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c8sfw")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setC8SFWView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk17cqb")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMK17CQBView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("para308")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setPARA308View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("type89")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setTYPE89View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c7e")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setC7EView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m762")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM762View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("416ccarbine")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set416CCARBINEView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m590a1")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM590A1View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m1014")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM1014View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sgcqb")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSGCQBView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("supernova")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSUPERNOVAView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12l")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setITA12LView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12s")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setITA12SView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSIX12View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bosg122")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setBOSG122View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sasg12")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSASG12View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f2")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setF2View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m870")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM870View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("super90")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSUPER90View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas12")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSPAS12View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas15")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSPAS15View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12sd")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSIX12View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f012")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setF012View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("6p41")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set6P41View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("68a1")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set68A1View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m249")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM249View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t95lsw")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setT95LSWView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lmge")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setLMGEView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p226mk25")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP226MK25View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m45meusoc")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM45MEUSOCView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("57usg")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set57USGView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p9")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP9View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lfp586")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setLFP586View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("gsh18")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setGSH18View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pmm")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setPMMView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p12")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP12View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk19mm")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMK19MMView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("d50")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setD50View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("prb92")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setPRB92View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p229")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP229View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("usp40")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setUSP40View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("q929")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setQ929View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("rg15")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setRG15View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("luison")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setLUISONView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg11")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSMG11View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bearing9")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setBEARING9View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c75auto")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setC75AUTOView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg12")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSMG12View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pdw9")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setPDW9View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("fmg9")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setFMG9View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5k")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP5KView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ump45")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setUMP45View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP5View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p90")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP90View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9x19vsn")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set9X19VSNView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp7")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP7View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9mmc1")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set9MMC1View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mpx")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMPXView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m12")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM12View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5sd")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP5SDView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("vector45acp")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setVECTOR45ACPView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t5smg")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setT5SMGView(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("scorpionevo3a1")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSCORPIONEVO3A1View(weaponOne, layoutInflater, getActivity());


        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("k1a")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setK1AView(weaponOne, layoutInflater, getActivity());


        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("417")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set417View(weaponOne, layoutInflater, getActivity());


        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("camrs")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setCAMRSView(weaponOne, layoutInflater, getActivity());


        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sr25")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSR25View(weaponOne, layoutInflater, getActivity());


        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk14ebr")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMK14EBRView(weaponOne, layoutInflater, getActivity());


        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ots03")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setOTS03View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("v308")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setV308View(weaponOne, layoutInflater, getActivity());


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spear308")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSpear308View(weaponOne, layoutInflater, getActivity());


        }




        return view;
    }


    public int getOperatorPrimary() {

        return R.layout.weapon_one;
    }


}
