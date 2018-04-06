package com.zeuspalette.android.r6tab.Fragments;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.Activities.OperatorActivity;
import com.zeuspalette.android.r6tab.Activities.UnitOperatorActivity;
import com.zeuspalette.android.r6tab.Helpers.OperatorHelper;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorUnitDefenderFragment extends Fragment {

    //Helper to get values
    ZUtils zUtils;
    OperatorHelper o;

    private int[] unitAttackerIcons = {};
    ImageView defenderOne;
    ImageView defenderTwo;

    public OperatorUnitDefenderFragment() {


    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        defenderOne = null;
        defenderTwo = null;
        zUtils = null;
        o = null;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        o = new OperatorHelper(getActivity());
        zUtils = new ZUtils();

        ((UnitOperatorActivity) getActivity())
                .setActionBarTitle("Unit Defenders");

        //Setup Defenders associated with a Unit and setup link to check them out

        View view = inflater.inflate(getOperatorLayout(), container, false);

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sas")) {

            setupDefenders(view, R.drawable.ismoke, R.drawable.imute, "smoke", "mute");
        }


        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("fbi")) {


            setupDefenders(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("gign")) {

            setupDefenders(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("spetznaz")) {


            setupDefenders(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("gsg9")) {

            setupDefenders(view, R.drawable.ijager, R.drawable.ibandit, "jager", "bandit");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("jtf2")) {


            setupDefenders(view, R.drawable.ifrost, "frost");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("navyseals")) {


            setupDefenders(view, R.drawable.ivalkyrie, "valkyrie");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("bope")) {


            setupDefenders(view, R.drawable.icaveira, "caveira");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sat")) {

            setupDefenders(view, R.drawable.iecho, "echo");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("geo")) {

            setupDefenders(view, R.drawable.imira, "mira");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sdu")) {

            setupDefenders(view, R.drawable.ilesion, "lesion");
        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("grom")) {


            setupDefenders(view, R.drawable.iela, "ela");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("x707thsmb")) {


            setupDefenders(view, R.drawable.ivigil, "vigil");

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


    public void setupDefenders(View view, int id1, int id2, final String op1Name, final String op2Name) {


        defenderOne = view.findViewById(R.id.unit_operator_one);
        defenderTwo = view.findViewById(R.id.unit_operator_two);

        Picasso.with(getActivity()).load(id1).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 271), zUtils.getPixelfromDP(getActivity(), 271)).into(defenderOne);

        Picasso.with(getActivity()).load(id2).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 271), zUtils.getPixelfromDP(getActivity(), 271)).into(defenderTwo);


        defenderOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OperatorActivity.class);
                intent.putExtra("operator", op1Name);
                startActivity(intent);
            }
        });

        defenderTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OperatorActivity.class);
                intent.putExtra("operator", op2Name);
                startActivity(intent);
            }
        });

    }

    public void setupDefenders(View view, int id1, final String op1Name) {


        defenderOne = view.findViewById(R.id.unit_operator_one);

        Picasso.with(getActivity()).load(id1).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 271), zUtils.getPixelfromDP(getActivity(), 271)).into(defenderOne);


        defenderOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OperatorActivity.class);
                intent.putExtra("operator", op1Name);
                startActivity(intent);
            }
        });


    }

}
