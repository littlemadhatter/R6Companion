package com.zeuspalette.android.r6companion.Fragments;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zeuspalette.android.r6companion.Activities.OperatorActivity;
import com.zeuspalette.android.r6companion.Activities.UnitOperatorActivity;
import com.zeuspalette.android.r6companion.Helpers.OperatorHelper;
import com.zeuspalette.android.r6companion.R;
import com.zeuspalette.android.r6companion.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorUnitAttackerFragment extends Fragment {

    //Helper to get values
    ZUtils zUtils;
    OperatorHelper o;

    private int[] unitAttackerIcons = {};

    public OperatorUnitAttackerFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        o = new OperatorHelper(getActivity());
        zUtils = new ZUtils();

        ((UnitOperatorActivity) getActivity())
                .setActionBarTitle("Unit Attackers");

        //Setup Attackers associated with a Unit and setup link to check them out

        View view = inflater.inflate(getOperatorLayout(), container, false);

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sas")) {

            setupAttackers(view, R.drawable.isledge, R.drawable.ithatcher, "sledge", "thatcher");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("fbi")) {

            setupAttackers(view, R.drawable.iash, R.drawable.ithermite, "ash", "thermite");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("fbi")) {

            setupAttackers(view, R.drawable.iash, R.drawable.ithermite, "ash", "thermite");
        }


        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("gign")) {

            setupAttackers(view, R.drawable.itwitch, R.drawable.imontagne, "twitch", "montagne");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("spetznaz")) {

            setupAttackers(view, R.drawable.iglaz, R.drawable.ifuze, "glaz", "fuze");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("gsg9")) {

            setupAttackers(view, R.drawable.iblitz, R.drawable.iiq, "blitz", "iq");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("jtf2")) {

            setupAttackers(view, R.drawable.ibuck, "buck");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("navyseals")) {

            setupAttackers(view, R.drawable.iblackbeard, "blackbeard");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("bope")) {

            setupAttackers(view, R.drawable.icapitao, "capitao");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sat")) {

            setupAttackers(view, R.drawable.ihibana, "hibana");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("geo")) {

            setupAttackers(view, R.drawable.ijackal, "jackal");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sdu")) {

            setupAttackers(view, R.drawable.iying, "ying");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("grom")) {

            setupAttackers(view, R.drawable.izofia, "zofia");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("x707thsmb")) {

            setupAttackers(view, R.drawable.idokkaebi, "dokkaebi");
        }


        return view;
    }


    public int getOperatorLayout() {

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sas")) {

            return R.layout.fragment_operator_unit_two;

        }


        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("fbi")) {
            return R.layout.fragment_operator_unit_two;

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("gign")) {
            return R.layout.fragment_operator_unit_two;

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("spetznaz")) {
            return R.layout.fragment_operator_unit_two;

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("gsg9")) {
            return R.layout.fragment_operator_unit_two;

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("jtf2")) {

            return R.layout.fragment_operator_unit_one;
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("navyseals")) {

            return R.layout.fragment_operator_unit_one;

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("bope")) {


            return R.layout.fragment_operator_unit_one;
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sat")) {


            return R.layout.fragment_operator_unit_one;
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("geo")) {


            return R.layout.fragment_operator_unit_one;
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sdu")) {

            return R.layout.fragment_operator_unit_one;

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("grom")) {

            return R.layout.fragment_operator_unit_one;

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("x707thsmb")) {

            return R.layout.fragment_operator_unit_one;

        }

        return R.layout.fragment_operator_unit_two;

    }


    public void setupAttackers(View view, int id1, int id2, final String op1Name, final String op2Name) {

        Drawable one = zUtils.resizeImage(id1, getActivity());
        Drawable two = zUtils.resizeImage(id2, getActivity());

        ImageView attackerOne = view.findViewById(R.id.unit_operator_one);
        ImageView attackerTwo = view.findViewById(R.id.unit_operator_two);

        attackerOne.setImageDrawable(one);
        attackerTwo.setImageDrawable(two);


        attackerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OperatorActivity.class);
                intent.putExtra("operator", op1Name);
                startActivity(intent);
            }
        });

        attackerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OperatorActivity.class);
                intent.putExtra("operator", op2Name);
                startActivity(intent);
            }
        });

    }

    public void setupAttackers(View view, int id1, final String op1Name) {

        Drawable one = zUtils.resizeImage(id1, getActivity());

        ImageView attackerOne = view.findViewById(R.id.unit_operator_one);

        attackerOne.setImageDrawable(one);


        attackerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OperatorActivity.class);
                intent.putExtra("operator", op1Name);
                startActivity(intent);
            }
        });


    }


}
