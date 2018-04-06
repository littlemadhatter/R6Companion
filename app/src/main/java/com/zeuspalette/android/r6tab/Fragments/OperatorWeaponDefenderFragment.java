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
import com.zeuspalette.android.r6tab.Activities.WeaponItemActivity;
import com.zeuspalette.android.r6tab.Helpers.OperatorHelper;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorWeaponDefenderFragment extends Fragment {

    //Helper to get values
    ZUtils zUtils;
    OperatorHelper o;

    private int[] unitAttackerIcons = {};
    ImageView defenderOne;
    ImageView defenderTwo;

    public OperatorWeaponDefenderFragment() {


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
        ((WeaponItemActivity) getActivity())
                .setActionBarTitle("Weapon Defenders");

        View view = inflater.inflate(getOperatorLayout(), container, false);

        //Setup Defenders for a selected  Weapon

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("l85a2")) {


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ar33")) {


        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("r4c")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("g36c")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("556xi")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f2")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ak12")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("auga2")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("552commando")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c8sfw")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk17cqb")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("para308")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("type89")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c7e")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m762")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("416ccarbine")) {
            setupDefenders(view, R.drawable.ijager, "jager");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m590a1")) {
            setupDefenders(view, R.drawable.isledge, R.drawable.ithatcher, "sledge", "thatcher");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m1014")) {
            setupDefenders(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sgcqb")) {
            setupDefenders(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("supernova")) {
            setupDefenders(view, R.drawable.iecho, "echo");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12l")) {
            setupDefenders(view, R.drawable.imira, "mira");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12s")) {
            setupDefenders(view, R.drawable.imira, "mira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bosg122")) {
            setupDefenders(view, R.drawable.ivigil, "vigil");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sasg12")) {
            setupDefenders(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m870")) {
            setupDefenders(view, R.drawable.ijager, R.drawable.ibandit, "jager", "bandit");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("super90")) {
            setupDefenders(view, R.drawable.ifrost, "frost");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas12")) {
            setupDefenders(view, R.drawable.ivalkyrie, "valkyrie");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas15")) {
            setupDefenders(view, R.drawable.icaveira, "caveira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12sd")) {
            setupDefenders(view, R.drawable.ilesion, "lesion");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f012")) {
            setupDefenders(view, R.drawable.iela, "ela");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("6p41")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("68a1")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m249")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t95lsw")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lmge")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p226mk25")) {
            setupDefenders(view, R.drawable.ismoke, R.drawable.imute, "smoke", "mute");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m45meusoc")) {
            setupDefenders(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("57usg")) {
            setupDefenders(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p9")) {
            setupDefenders(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lfp586")) {
            setupDefenders(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("gsh18")) {
            setupDefenders(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pmm")) {
            setupDefenders(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p12")) {
            setupDefenders(view, R.drawable.ijager, R.drawable.ibandit, "jager", "bandit");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk19mm")) {
            setupDefenders(view, R.drawable.ifrost, "frost");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("d50")) {
            setupDefenders(view, R.drawable.ivalkyrie, "valkyrie");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("prb92")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p229")) {
            setupDefenders(view, R.drawable.iecho, "echo");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("usp40")) {
            setupDefenders(view, R.drawable.imira, "mira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("q929")) {
            setupDefenders(view, R.drawable.ilesion, "lesion");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("rg15")) {
            setupDefenders(view, R.drawable.iela, "ela");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("luison")) {
            setupDefenders(view, R.drawable.icaveira, "caveira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg11")) {
            setupDefenders(view, R.drawable.ismoke, "smoke");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bearing9")) {
            setupDefenders(view, R.drawable.iecho, "echo");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c75auto")) {
            setupDefenders(view, R.drawable.ivigil, "ivigil");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg12")) {
            setupDefenders(view, R.drawable.ivigil, "ivigil");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pdw9")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("fmg9")) {
            setupDefenders(view, R.drawable.ismoke, "smoke");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5k")) {
            setupDefenders(view, R.drawable.imute, "mute");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ump45")) {
            setupDefenders(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5")) {
            setupDefenders(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p90")) {
            setupDefenders(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9x19vsn")) {
            setupDefenders(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp7")) {
            setupDefenders(view, R.drawable.ibandit, "bandit");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9mmc1")) {
            setupDefenders(view, R.drawable.ifrost, "frost");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mpx")) {
            setupDefenders(view, R.drawable.ivalkyrie, "valkyrie");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m12")) {
            setupDefenders(view, R.drawable.icaveira, "caveira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5sd")) {
            setupDefenders(view, R.drawable.iecho, "echo");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("vector45acp")) {
            setupDefenders(view, R.drawable.imira, "mira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t5smg")) {
            setupDefenders(view, R.drawable.ilesion, "lesion");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("scorpionevo3a1")) {
            setupDefenders(view, R.drawable.iela, "ela");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("k1a")) {
            setupDefenders(view, R.drawable.ivigil, "ivigil");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("417")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("camrs")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sr25")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk14ebr")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ots03")) {

        }


        return view;
    }


    public int getOperatorLayout() {


        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("416ccarbine")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m590a1")) {
            return R.layout.fragment_operator_unit_two;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m1014")) {
            return R.layout.fragment_operator_unit_two;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sgcqb")) {
            return R.layout.fragment_operator_unit_two;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("supernova")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12l")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12s")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bosg122")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sasg12")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m870")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("super90")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas12")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas15")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12sd")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f012")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p226mk25")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m45meusoc")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("57usg")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p9")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lfp586")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("gsh18")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pmm")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p12")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk19mm")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("d50")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p229")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("usp40")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("q929")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("rg15")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("luison")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg11")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bearing9")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c75auto")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg12")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("fmg9")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5k")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ump45")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p90")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9x19vsn")) {
            return R.layout.fragment_operator_unit_two;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp7")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9mmc1")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mpx")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m12")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5sd")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("vector45acp")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t5smg")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("scorpionevo3a1")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("k1a")) {
            return R.layout.fragment_operator_unit_one;
        }


        return R.layout.fragment_operator_unit_no;

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
