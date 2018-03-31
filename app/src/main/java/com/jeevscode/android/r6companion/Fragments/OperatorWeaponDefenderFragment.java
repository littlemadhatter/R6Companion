package com.jeevscode.android.r6companion.Fragments;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jeevscode.android.r6companion.Activities.OperatorActivity;
import com.jeevscode.android.r6companion.Activities.WeaponItemActivity;
import com.jeevscode.android.r6companion.Helpers.OperatorHelper;
import com.jeevscode.android.r6companion.R;
import com.jeevscode.android.r6companion.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorWeaponDefenderFragment extends Fragment {

    //Helper to get values
    ZUtils zUtils;
    OperatorHelper o;

    private int[] unitAttackerIcons = {};

    public OperatorWeaponDefenderFragment() {


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
            setupAttackers(view, R.drawable.ijager, "jager");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m590a1")) {
            setupAttackers(view, R.drawable.isledge, R.drawable.ithatcher, "sledge", "thatcher");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m1014")) {
            setupAttackers(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sgcqb")) {
            setupAttackers(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("supernova")) {
            setupAttackers(view, R.drawable.iecho, "echo");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12l")) {
            setupAttackers(view, R.drawable.imira, "mira");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12s")) {
            setupAttackers(view, R.drawable.imira, "mira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bosg122")) {
            setupAttackers(view, R.drawable.ivigil, "vigil");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sasg12")) {
            setupAttackers(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m870")) {
            setupAttackers(view, R.drawable.ijager, R.drawable.ibandit, "jager", "bandit");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("super90")) {
            setupAttackers(view, R.drawable.ifrost, "frost");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas12")) {
            setupAttackers(view, R.drawable.ivalkyrie, "valkyrie");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas15")) {
            setupAttackers(view, R.drawable.icaveira, "caveira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12sd")) {
            setupAttackers(view, R.drawable.ilesion, "lesion");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f012")) {
            setupAttackers(view, R.drawable.iela, "ela");
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
            setupAttackers(view, R.drawable.ismoke, R.drawable.imute, "smoke", "mute");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m45meusoc")) {
            setupAttackers(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("57usg")) {
            setupAttackers(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p9")) {
            setupAttackers(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lfp586")) {
            setupAttackers(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("gsh18")) {
            setupAttackers(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pmm")) {
            setupAttackers(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p12")) {
            setupAttackers(view, R.drawable.ijager, R.drawable.ibandit, "jager", "bandit");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk19mm")) {
            setupAttackers(view, R.drawable.ifrost, "frost");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("d50")) {
            setupAttackers(view, R.drawable.ivalkyrie, "valkyrie");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("prb92")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p229")) {
            setupAttackers(view, R.drawable.iecho, "echo");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("usp40")) {
            setupAttackers(view, R.drawable.imira, "mira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("q929")) {
            setupAttackers(view, R.drawable.ilesion, "lesion");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("rg15")) {
            setupAttackers(view, R.drawable.iela, "ela");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("luison")) {
            setupAttackers(view, R.drawable.icaveira, "caveira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg11")) {
            setupAttackers(view, R.drawable.ismoke, "smoke");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bearing9")) {
            setupAttackers(view, R.drawable.iecho, "echo");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c75auto")) {
            setupAttackers(view, R.drawable.ivigil, "ivigil");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg12")) {
            setupAttackers(view, R.drawable.ivigil, "ivigil");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pdw9")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("fmg9")) {
            setupAttackers(view, R.drawable.ismoke, "smoke");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5k")) {
            setupAttackers(view, R.drawable.imute, "mute");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ump45")) {
            setupAttackers(view, R.drawable.icastle, R.drawable.ipulse, "castle", "pulse");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5")) {
            setupAttackers(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p90")) {
            setupAttackers(view, R.drawable.idoc, R.drawable.irook, "doc", "rook");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9x19vsn")) {
            setupAttackers(view, R.drawable.ikapkan, R.drawable.itachanka, "kapkan", "tachanka");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp7")) {
            setupAttackers(view, R.drawable.ibandit, "bandit");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9mmc1")) {
            setupAttackers(view, R.drawable.ifrost, "frost");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mpx")) {
            setupAttackers(view, R.drawable.ivalkyrie, "valkyrie");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m12")) {
            setupAttackers(view, R.drawable.icaveira, "caveira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5sd")) {
            setupAttackers(view, R.drawable.iecho, "echo");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("vector45acp")) {
            setupAttackers(view, R.drawable.imira, "mira");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t5smg")) {
            setupAttackers(view, R.drawable.ilesion, "lesion");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("scorpionevo3a1")) {
            setupAttackers(view, R.drawable.iela, "ela");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("k1a")) {
            setupAttackers(view, R.drawable.ivigil, "ivigil");
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
