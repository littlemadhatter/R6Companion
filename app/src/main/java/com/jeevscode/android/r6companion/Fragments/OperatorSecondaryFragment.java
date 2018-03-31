package com.jeevscode.android.r6companion.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jeevscode.android.r6companion.Activities.OperatorActivity;
import com.jeevscode.android.r6companion.R;
import com.jeevscode.android.r6companion.Helpers.WeaponHelper;
import com.jeevscode.android.r6companion.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorSecondaryFragment extends Fragment {

    private ZUtils zUtils;
    WeaponHelper wH;
    LayoutInflater layoutInflater;


    public OperatorSecondaryFragment() {

        zUtils = new ZUtils();
        wH = new WeaponHelper(getActivity());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(getOperatorSecondary(), container, false);

        ((OperatorActivity) getActivity())
                .setActionBarTitle("Secondary Weapon");

        //Assocaite Primary Weapon with Operator

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("sledge")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP226MK25View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSMG11View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thatcher")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP226MK25View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ash")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM45MEUSOCView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set57USGView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thermite")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM45MEUSOCView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set57USGView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("twitch")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP9View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setLFP586View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("montagne")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP9View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setLFP586View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("glaz")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setGSH18View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setPMMView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("fuze")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setGSH18View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setPMMView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blitz")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP12View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("iq")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP12View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("buck")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMK19MMView(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blackbeard")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setD50View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("capitao")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setPRB92View(weaponOne, layoutInflater, getActivity());

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("hibana")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setBEARING9View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setP229View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jackal")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setITA12SView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setUSP40View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ying")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setQ929View(weaponOne, layoutInflater, getActivity());

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("zofia")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setRG15View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("dokkaebi")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSMG12View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setC75AUTOView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lion")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP9View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setLFP586View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("finka")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setGSH18View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setPMMView(weaponTwo, layoutInflater, getActivity());

        }

         /* DEFENDERS */

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("smoke")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSMG11View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setP226MK25View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mute")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP226MK25View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("castle")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM45MEUSOCView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set57USGView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("pulse")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM45MEUSOCView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set57USGView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("doc")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP9View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setLFP586View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("rook")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP9View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setLFP586View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("kapkan")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setGSH18View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setPMMView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("tachanka")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setGSH18View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setPMMView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jager")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP12View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("bandit")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setP12View(weaponOne, layoutInflater, getActivity());

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("frost")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMK19MMView(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("valkyrie")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setD50View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("caveira")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setLUISONView(weaponOne, layoutInflater, getActivity());

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("echo")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setBEARING9View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setP229View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mira")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setITA12SView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setUSP40View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lesion")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setQ929View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ela")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setRG15View(weaponOne, layoutInflater, getActivity());

        }


        return view;
    }


    //Create layout based on number of Secondary Weapon owned by Operator

    public int getOperatorSecondary() {

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("sledge")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thatcher")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ash")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ash")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ash")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("montagne")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("glaz")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("fuze")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blitz")) {
            return R.layout.weapon_one;

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("iq")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("buck")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blackbeard")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("capitao")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("hibana")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jackal")) {
            return R.layout.weapon_two;

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ying")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("zofia")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("dokkaebi")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lion")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("finka")) {
            return R.layout.weapon_two;

        }

        /* DEFENDERS */


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("smoke")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mute")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("castle")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("pulse")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("doc")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("rook")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("kapkan")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("tachanka")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jager")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("frost")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("valkyrie")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("caveira")) {
            return R.layout.weapon_one;

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("echo")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mira")) {
            return R.layout.weapon_two;

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lesion")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ela")) {
            return R.layout.weapon_one;

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("vigil")) {
            return R.layout.weapon_two;

        }

        return R.layout.weapon_two;
    }



}
