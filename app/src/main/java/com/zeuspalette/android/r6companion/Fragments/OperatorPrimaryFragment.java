package com.zeuspalette.android.r6companion.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeuspalette.android.r6companion.Activities.OperatorActivity;
import com.zeuspalette.android.r6companion.R;
import com.zeuspalette.android.r6companion.Helpers.WeaponHelper;
import com.zeuspalette.android.r6companion.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorPrimaryFragment extends Fragment {

    private ZUtils zUtils;
    WeaponHelper wH;
    LayoutInflater layoutInflater;


    public OperatorPrimaryFragment() {


        zUtils = new ZUtils();

        wH = new WeaponHelper(getActivity());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(getOperatorPrimary(), container, false);

        ((OperatorActivity) getActivity())
                .setActionBarTitle("Primary Weapon");


        //Assocaite Primary Weapon with Operator

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("sledge")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setL785A2View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM590A1View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thatcher")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setL785A2View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setAR33View(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.setM590A1View(weaponThree, layoutInflater, getActivity());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ash")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setR4CView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setG36CView(weaponTwo, layoutInflater, getActivity());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thermite")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set556XIView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM1014View(weaponTwo, layoutInflater, getActivity());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("twitch")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setF2View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set417View(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.setSGCQBView(weaponThree, layoutInflater, getActivity());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("montagne")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMONTAGNEShieldView(weaponOne, layoutInflater, getActivity());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("glaz")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setOTS03View(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("fuze")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setAK12View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set6P41View(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.setFUZEShieldView(weaponThree, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blitz")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setBLITZShieldView(weaponOne, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("iq")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setAUGA2View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set556XIView(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.set68A1View(weaponThree, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("buck")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setC8SFWView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setCAMRSView(weaponTwo, layoutInflater, getActivity());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blackbeard")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMK17CQBView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSR25View(weaponTwo, layoutInflater, getActivity());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("capitao")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setPARA308View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM249View(weaponTwo, layoutInflater, getActivity());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("hibana")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setTYPE89View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSUPERNOVAView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jackal")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setC7EView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setPDW9View(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.setITA12LView(weaponThree, layoutInflater, getActivity());

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ying")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setT95LSWView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSIX12View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("zofia")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM762View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setLMGEView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("dokkaebi")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMK14EBRView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setBOSG122View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lion")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setV308View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set417View(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.setSGCQBView(weaponThree, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("finka")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSpear308View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.set6P41View(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.setSASG12View(weaponThree, layoutInflater, getActivity());

        }


        /* DEFENDERS **/

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("smoke")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setFMG9View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM590A1View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mute")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP5KView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM590A1View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("castle")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setUMP45View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM1014View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("pulse")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setUMP45View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM1014View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("doc")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP5View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setP90View(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.setSGCQBView(weaponThree, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("rook")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP5View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setP90View(weaponTwo, layoutInflater, getActivity());
            ViewGroup weaponThree = (ViewGroup) view.findViewById(R.id.view_head_weapon_three);
            wH.setSGCQBView(weaponThree, layoutInflater, getActivity());

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("kapkan")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set9X19VSNView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSASG12View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("tachanka")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set9X19VSNView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSASG12View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jager")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set416CCARBINEView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM870View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("bandit")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP7View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setM870View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("frost")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.set9MMC1View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSUPER90View(weaponTwo, layoutInflater, getActivity());

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("valkyrie")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMPXView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSPAS12View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("caveira")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setM12View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSPAS15View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("echo")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setMP5SDView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSUPERNOVAView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mira")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setVECTOR45ACPView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setITA12LView(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lesion")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setT5SMGView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setSIX12View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ela")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setSCORPIONEVO3A1View(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setF012View(weaponTwo, layoutInflater, getActivity());

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("vigil")) {

            layoutInflater = (LayoutInflater) getActivity().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ViewGroup weaponOne = (ViewGroup) view.findViewById(R.id.view_head_weapon_one);
            wH.setK1AView(weaponOne, layoutInflater, getActivity());
            ViewGroup weaponTwo = (ViewGroup) view.findViewById(R.id.view_head_weapon_two);
            wH.setBOSG122View(weaponTwo, layoutInflater, getActivity());

        }



        return view;
    }


    //Create layout based on number of Primary Weapon owned by Operator

    public int getOperatorPrimary() {

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("sledge")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thatcher")) {
            return R.layout.weapon_three;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ash")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thermite")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("twitch")) {
            return R.layout.weapon_three;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("montagne")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("glaz")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("fuze")) {
            return R.layout.weapon_three;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blitz")) {
            return R.layout.weapon_one;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("iq")) {
            return R.layout.weapon_three;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("buck")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blackbeard")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("capitao")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("hibana")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jackal")) {
            return R.layout.weapon_three;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ying")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("zofia")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("dokkaebi")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lion")) {
            return R.layout.weapon_three;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("finka")) {
            return R.layout.weapon_three;

        }

         /* DEFENDERS **/

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("smoke")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mute")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("castle")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("pulse")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("doc")) {
            return R.layout.weapon_three;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("rook")) {
            return R.layout.weapon_three;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("kapkan")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("tachanka")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jager")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("bandit")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("frost")) {
            return R.layout.weapon_two;

        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("valkyrie")) {
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("caveira")) {
            return R.layout.weapon_two;

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
            return R.layout.weapon_two;

        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("vigil")) {
            return R.layout.weapon_two;

        }


        return R.layout.weapon_one;
    }



}
