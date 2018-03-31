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

public class OperatorWeaponAttackerFragment extends Fragment {

    //Helper to get values
    ZUtils zUtils;
    OperatorHelper o;

    private int[] unitAttackerIcons = {};

    public OperatorWeaponAttackerFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        o = new OperatorHelper(getActivity());
        zUtils = new ZUtils();
        ((WeaponItemActivity) getActivity())
                .setActionBarTitle("Weapon Attackers");

        //Setup Attackers for a selected  Weapon

        View view = inflater.inflate(getOperatorLayout(), container, false);

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("l85a2")) {

            setupAttackers(view, R.drawable.isledge, R.drawable.ithatcher, "sledge", "thatcher");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ar33")) {

            setupAttackers(view, R.drawable.ithatcher, "thatcher");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("r4c")) {
            setupAttackers(view, R.drawable.iash, "ash");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("g36c")) {
            setupAttackers(view, R.drawable.iash, "ash");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("556xi")) {
            setupAttackers(view, R.drawable.ithermite, "thermite");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f2")) {
            setupAttackers(view, R.drawable.itwitch, "twitch");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ak12")) {
            setupAttackers(view, R.drawable.ifuze, "fuze");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("auga2")) {
            setupAttackers(view, R.drawable.iiq, "iq");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("552commando")) {
            setupAttackers(view, R.drawable.iiq, "iq");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c8sfw")) {
            setupAttackers(view, R.drawable.ibuck, "buck");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk17cqb")) {
            setupAttackers(view, R.drawable.iblackbeard, "blackbeard");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("para308")) {
            setupAttackers(view, R.drawable.icapitao, "capitao");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("type89")) {
            setupAttackers(view, R.drawable.ihibana, "hibana");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c7e")) {
            setupAttackers(view, R.drawable.ijackal, "jackal");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m762")) {
            setupAttackers(view, R.drawable.izofia, "zofia");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("416ccarbine")) {
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m590a1")) {
            setupAttackers(view, R.drawable.icapitao, "capitao");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m1014")) {
            setupAttackers(view, R.drawable.isledge, R.drawable.ithatcher, "sledge", "thatcher");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sgcqb")) {
            setupAttackers(view, R.drawable.itwitch, "twitch");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("supernova")) {
            setupAttackers(view, R.drawable.ihibana, "hibana");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12l")) {
            setupAttackers(view, R.drawable.ijackal, "jackal");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ita12s")) {
            setupAttackers(view, R.drawable.ijackal, "jackal");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12")) {
            setupAttackers(view, R.drawable.iying, "ying");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bosg122")) {
            setupAttackers(view, R.drawable.idokkaebi, R.drawable.ivigil, "dokkaebi", "vigil");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sasg12")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m870")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("super90")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas12")) {

        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spas15")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("six12sd")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f012")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("6p41")) {
            setupAttackers(view, R.drawable.ifuze, "fuze");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("68a1")) {
            setupAttackers(view, R.drawable.iiq, "iq");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m249")) {
            setupAttackers(view, R.drawable.icapitao, "capitao");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t95lsw")) {
            setupAttackers(view, R.drawable.iying, "ying");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lmge")) {
            setupAttackers(view, R.drawable.izofia, "zofia");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p226mk25")) {
            setupAttackers(view, R.drawable.isledge, R.drawable.ithatcher, "sledge", "thatcher");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m45meusoc")) {
            setupAttackers(view, R.drawable.iash, R.drawable.ithermite, "ash", "thermite");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("57usg")) {
            setupAttackers(view, R.drawable.iash, R.drawable.ithermite, "ash", "thermite");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p9")) {
            setupAttackers(view, R.drawable.itwitch, "twitch");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lfp586")) {
            setupAttackers(view, R.drawable.itwitch, "twitch");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("gsh18")) {
            setupAttackers(view, R.drawable.ifuze, "fuze");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pmm")) {
            setupAttackers(view, R.drawable.ifuze, "fuze");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p12")) {
            setupAttackers(view, R.drawable.iblitz, R.drawable.iiq, "blitz", "iq");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk19mm")) {
            setupAttackers(view, R.drawable.ibuck, "buck");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("d50")) {
            setupAttackers(view, R.drawable.iblackbeard, "blackbeard");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("prb92")) {
            setupAttackers(view, R.drawable.icapitao, "capitao");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p229")) {
            setupAttackers(view, R.drawable.ihibana, "hibana");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("usp40")) {
            setupAttackers(view, R.drawable.ijackal, "jackal");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("q929")) {
            setupAttackers(view, R.drawable.iying, "ying");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("rg15")) {
            setupAttackers(view, R.drawable.izofia, "zofia");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("luison")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg11")) {
            setupAttackers(view, R.drawable.isledge, "sledge");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bearing9")) {
            setupAttackers(view, R.drawable.ihibana, "hibana");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c75auto")) {
            setupAttackers(view, R.drawable.idokkaebi, "dokkaebi");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("smg12")) {
            setupAttackers(view, R.drawable.idokkaebi, "dokkaebi");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pdw9")) {
            setupAttackers(view, R.drawable.ijackal, "jackal");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("fmg9")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5k")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ump45")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("p90")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9x19vsn")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp7")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("9mmc1")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mpx")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m12")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mp5sd")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("vector45acp")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t5smg")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("scorpionevo3a1")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("k1a")) {

        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("417")) {
            setupAttackers(view, R.drawable.itwitch, "twitch");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("camrs")) {
            setupAttackers(view, R.drawable.ibuck, "buck");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sr25")) {
            setupAttackers(view, R.drawable.iblackbeard, "blackbeard");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk14ebr")) {
            setupAttackers(view, R.drawable.idokkaebi, "dokkaebi");
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ots03")) {
            setupAttackers(view, R.drawable.iglaz, "glaz");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("v308")) {
            setupAttackers(view, R.drawable.ilion, "lion");
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spear308")) {
            setupAttackers(view, R.drawable.ifinka, "finka");
        }


        return view;
    }


    public int getOperatorLayout() {

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("l85a2")) {

            return R.layout.fragment_operator_unit_two;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ar33")) {

            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("r4c")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("g36c")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("556xi")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("f2")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ak12")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("auga2")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("552commando")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c8sfw")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk17cqb")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("para308")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("type89")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("c7e")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m762")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("416ccarbine")) {
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m590a1")) {
            return R.layout.fragment_operator_unit_two;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m1014")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sgcqb")) {
            return R.layout.fragment_operator_unit_one;
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
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("bosg122")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("6p41")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("68a1")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("m249")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("t95lsw")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lmge")) {
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
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("lfp586")) {
            return R.layout.fragment_operator_unit_one;
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
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("prb92")) {
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
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("pdw9")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("417")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("camrs")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("sr25")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("mk14ebr")) {
            return R.layout.fragment_operator_unit_one;
        }
        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("ots03")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("v308")) {
            return R.layout.fragment_operator_unit_one;
        }

        if (WeaponItemActivity.mWeaponTAG.equalsIgnoreCase("spear308")) {
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
