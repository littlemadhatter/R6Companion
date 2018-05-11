package com.zeuspalette.android.r6tab.Helpers;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.R;

/**
 * Created by Jeeva on 14-03-2018.
 */

public class WeaponListHelper {

    public void setupLMGOperatorsInView(Activity activity, View view, String weapon) {

        ZUtils zUtils = new ZUtils();

        ImageView attackerOne = view.findViewById(R.id.list_attacker_one);
        ImageView attackerTwo = view.findViewById(R.id.list_attacker_two);
        ImageView defenderOne = view.findViewById(R.id.list_defender_one);
        ImageView defenderTwo = view.findViewById(R.id.list_defender_two);

        if (weapon.equalsIgnoreCase("6p41")) {

            Picasso.with(activity).load(R.drawable.fuze).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.finka).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);

        }

        if (weapon.equalsIgnoreCase("68a1")) {

            Picasso.with(activity).load(R.drawable.iq).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);

        }

        if (weapon.equalsIgnoreCase("m249")) {

            Picasso.with(activity).load(R.drawable.capitao).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);

        }

        if (weapon.equalsIgnoreCase("t95lsw")) {

            Picasso.with(activity).load(R.drawable.ying).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);

        }

        if (weapon.equalsIgnoreCase("lmge")) {

            Picasso.with(activity).load(R.drawable.zofia).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);

        }
    }


    public void setupAssaultOperatorsInView(final Activity activity, View view, String weapon) {

        ZUtils zUtils = new ZUtils();

        ImageView attackerOne = view.findViewById(R.id.list_attacker_one);
        ImageView attackerTwo = view.findViewById(R.id.list_attacker_two);
        ImageView defenderOne = view.findViewById(R.id.list_defender_one);
        ImageView defenderTwo = view.findViewById(R.id.list_defender_two);

        if (weapon.equalsIgnoreCase("l85a2")) {

            Picasso.with(activity).load(R.drawable.sledge).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.thatcher).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }



        if (weapon.equalsIgnoreCase("ar33")) {

            Picasso.with(activity).load(R.drawable.thatcher).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("r4c")) {

            Picasso.with(activity).load(R.drawable.ash).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("g36c")) {

            Picasso.with(activity).load(R.drawable.ash).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("556xi")) {

            Picasso.with(activity).load(R.drawable.thermite).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }


        if (weapon.equalsIgnoreCase("f2")) {

            Picasso.with(activity).load(R.drawable.twitch).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("ak12")) {

            Picasso.with(activity).load(R.drawable.fuze).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("auga2")) {

            Picasso.with(activity).load(R.drawable.iq).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("552commando")) {

            Picasso.with(activity).load(R.drawable.iq).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("c8sfw")) {

            Picasso.with(activity).load(R.drawable.buck).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("mk17cqb")) {

            Picasso.with(activity).load(R.drawable.blackbeard).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("para308")) {

            Picasso.with(activity).load(R.drawable.capitao).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("type89")) {

            Picasso.with(activity).load(R.drawable.hibana).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("c7e")) {

            Picasso.with(activity).load(R.drawable.jackal).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("m762")) {

            Picasso.with(activity).load(R.drawable.zofia).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("416ccarbine")) {

            Picasso.with(activity).load(R.drawable.jager).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("v308")) {

            Picasso.with(activity).load(R.drawable.lion).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("spear308")) {

            Picasso.with(activity).load(R.drawable.finka).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }


    }


    public void setupSubmachineOperatorsInView(final Activity activity, View view, String weapon) {

        ZUtils zUtils = new ZUtils();

        ImageView attackerOne = view.findViewById(R.id.list_attacker_one);
        ImageView attackerTwo = view.findViewById(R.id.list_attacker_two);
        ImageView defenderOne = view.findViewById(R.id.list_defender_one);
        ImageView defenderTwo = view.findViewById(R.id.list_defender_two);

        if (weapon.equalsIgnoreCase("pdw9")) {

            Picasso.with(activity).load(R.drawable.jackal).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("fmg9")) {

            Picasso.with(activity).load(R.drawable.smoke).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("mp5k")) {

            Picasso.with(activity).load(R.drawable.mute).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("ump45")) {

            Picasso.with(activity).load(R.drawable.castle).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.pulse).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("mp5")) {

            Picasso.with(activity).load(R.drawable.doc).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.rook).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("p90")) {

            Picasso.with(activity).load(R.drawable.doc).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.rook).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("9x19vsn")) {

            Picasso.with(activity).load(R.drawable.kapkan).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.tachanka).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("mp7")) {

            Picasso.with(activity).load(R.drawable.bandit).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("9mmc1")) {

            Picasso.with(activity).load(R.drawable.frost).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);

        }

        if (weapon.equalsIgnoreCase("mpx")) {

            Picasso.with(activity).load(R.drawable.valkyrie).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("m12")) {

            Picasso.with(activity).load(R.drawable.caveira).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("mp5sd")) {

            Picasso.with(activity).load(R.drawable.echo).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("vector45acp")) {

            Picasso.with(activity).load(R.drawable.mira).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("t5smg")) {

            Picasso.with(activity).load(R.drawable.lesion).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("scorpionevo3a1")) {

            Picasso.with(activity).load(R.drawable.ela).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("k1a")) {

            Picasso.with(activity).load(R.drawable.vigil).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }


    }

    public void setupPistolOperatorsInView(final Activity activity, View view, String weapon) {

        ZUtils zUtils = new ZUtils();

        ImageView attackerOne = view.findViewById(R.id.list_attacker_one);
        ImageView attackerTwo = view.findViewById(R.id.list_attacker_two);
        ImageView defenderOne = view.findViewById(R.id.list_defender_one);
        ImageView defenderTwo = view.findViewById(R.id.list_defender_two);

        if (weapon.equalsIgnoreCase("p226mk25")) {

            Picasso.with(activity).load(R.drawable.sledge).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.thatcher).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            Picasso.with(activity).load(R.drawable.smoke).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.mute).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);


        }



        if (weapon.equalsIgnoreCase("m45meusoc")) {

            Picasso.with(activity).load(R.drawable.ash).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.thermite).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            Picasso.with(activity).load(R.drawable.castle).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.pulse).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);


        }

        if (weapon.equalsIgnoreCase("57usg")) {

            Picasso.with(activity).load(R.drawable.ash).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.thermite).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            Picasso.with(activity).load(R.drawable.castle).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.pulse).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);


        }

        if (weapon.equalsIgnoreCase("p9")) {

            Picasso.with(activity).load(R.drawable.twitch).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.doc).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.rook).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            Picasso.with(activity).load(R.drawable.montagne).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);


        }

        if (weapon.equalsIgnoreCase("lfp586")) {

            Picasso.with(activity).load(R.drawable.twitch).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.doc).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.rook).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            Picasso.with(activity).load(R.drawable.montagne).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);


        }

        if (weapon.equalsIgnoreCase("gsh18")) {

            Picasso.with(activity).load(R.drawable.fuze).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.glaz).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            Picasso.with(activity).load(R.drawable.kapkan).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.tachanka).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);


        }

        if (weapon.equalsIgnoreCase("pmm")) {

            Picasso.with(activity).load(R.drawable.fuze).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.glaz).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            Picasso.with(activity).load(R.drawable.kapkan).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.tachanka).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);


        }

        if (weapon.equalsIgnoreCase("p12")) {

            Picasso.with(activity).load(R.drawable.blitz).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.iq).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            Picasso.with(activity).load(R.drawable.jager).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.bandit).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);


        }

        if (weapon.equalsIgnoreCase("mk19mm")) {

            Picasso.with(activity).load(R.drawable.buck).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.frost).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("d50")) {

            Picasso.with(activity).load(R.drawable.blackbeard).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.valkyrie).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("prb92")) {

            Picasso.with(activity).load(R.drawable.capitao).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("p229")) {

            Picasso.with(activity).load(R.drawable.hibana).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.echo).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("usp40")) {

            Picasso.with(activity).load(R.drawable.jackal).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.mira).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("q929")) {

            Picasso.with(activity).load(R.drawable.ying).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.lesion).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("rg15")) {

            Picasso.with(activity).load(R.drawable.zofia).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.ela).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("luison")) {

            Picasso.with(activity).load(R.drawable.caveira).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);
            attackerOne.setVisibility(View.GONE);


        }





    }

    public void setupMachineOperatorsInView(final Activity activity, View view, String weapon) {

        ZUtils zUtils = new ZUtils();

        ImageView attackerOne = view.findViewById(R.id.list_attacker_one);
        ImageView attackerTwo = view.findViewById(R.id.list_attacker_two);
        ImageView defenderOne = view.findViewById(R.id.list_defender_one);
        ImageView defenderTwo = view.findViewById(R.id.list_defender_two);

        if (weapon.equalsIgnoreCase("smg11")) {

            Picasso.with(activity).load(R.drawable.sledge).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.smoke).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("bearing9")) {

            Picasso.with(activity).load(R.drawable.hibana).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.echo).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("c75auto")) {

            Picasso.with(activity).load(R.drawable.dokkaebi).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.vigil).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("smg12")) {

            Picasso.with(activity).load(R.drawable.dokkaebi).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.vigil).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);

        }



    }

    public void setupDMROperatorsInView(final Activity activity, View view, String weapon) {

        ZUtils zUtils = new ZUtils();

        ImageView attackerOne = view.findViewById(R.id.list_attacker_one);
        ImageView attackerTwo = view.findViewById(R.id.list_attacker_two);
        ImageView defenderOne = view.findViewById(R.id.list_defender_one);
        ImageView defenderTwo = view.findViewById(R.id.list_defender_two);

        if (weapon.equalsIgnoreCase("417")) {

            Picasso.with(activity).load(R.drawable.twitch).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("camrs")) {

            Picasso.with(activity).load(R.drawable.buck).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("sr25")) {

            Picasso.with(activity).load(R.drawable.blackbeard).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("mk14ebr")) {

            Picasso.with(activity).load(R.drawable.dokkaebi).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

    }

    public void setupSniperOperatorsInView(final Activity activity, View view, String weapon) {

        ZUtils zUtils = new ZUtils();

        ImageView attackerOne = view.findViewById(R.id.list_attacker_one);
        ImageView attackerTwo = view.findViewById(R.id.list_attacker_two);
        ImageView defenderOne = view.findViewById(R.id.list_defender_one);
        ImageView defenderTwo = view.findViewById(R.id.list_defender_two);

        if (weapon.equalsIgnoreCase("ots03")) {

            Picasso.with(activity).load(R.drawable.glaz).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }
    }


    public void setupShotgunOperatorsInView(final Activity activity, View view, String weapon) {

        ZUtils zUtils = new ZUtils();

        ImageView attackerOne = view.findViewById(R.id.list_attacker_one);
        ImageView attackerTwo = view.findViewById(R.id.list_attacker_two);
        ImageView defenderOne = view.findViewById(R.id.list_defender_one);
        ImageView defenderTwo = view.findViewById(R.id.list_defender_two);

        if (weapon.equalsIgnoreCase("m590a1")) {

            Picasso.with(activity).load(R.drawable.sledge).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.thatcher).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerTwo);
            Picasso.with(activity).load(R.drawable.smoke).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.mute).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);


        }

        if (weapon.equalsIgnoreCase("m1014")) {


            Picasso.with(activity).load(R.drawable.thermite).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.castle).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.pulse).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            attackerTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("sgcqb")) {

            Picasso.with(activity).load(R.drawable.twitch).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.doc).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.rook).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            attackerTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("supernova")) {

            Picasso.with(activity).load(R.drawable.hibana).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.echo).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("ita12l")) {

            Picasso.with(activity).load(R.drawable.jackal).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.mira).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("ita12s")) {

            Picasso.with(activity).load(R.drawable.jackal).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.mira).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("six12")) {

            Picasso.with(activity).load(R.drawable.ying).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            attackerTwo.setVisibility(View.GONE);
            defenderOne.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("bosg122")) {

            Picasso.with(activity).load(R.drawable.dokkaebi).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.vigil).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("sasg12")) {

            Picasso.with(activity).load(R.drawable.finka).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(attackerOne);
            Picasso.with(activity).load(R.drawable.kapkan).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.tachanka).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            attackerTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("m870")) {

            Picasso.with(activity).load(R.drawable.jager).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            Picasso.with(activity).load(R.drawable.bandit).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderTwo);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("super90")) {

            Picasso.with(activity).load(R.drawable.frost).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("spas12")) {

            Picasso.with(activity).load(R.drawable.valkyrie).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("spas15")) {

            Picasso.with(activity).load(R.drawable.caveira).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("six12sd")) {

            Picasso.with(activity).load(R.drawable.lesion).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }

        if (weapon.equalsIgnoreCase("f012")) {

            Picasso.with(activity).load(R.drawable.ela).resize(zUtils.getPixelfromDP(activity,60),zUtils.getPixelfromDP(activity,57)).into(defenderOne);
            attackerOne.setVisibility(View.GONE);
            attackerTwo.setVisibility(View.GONE);
            defenderTwo.setVisibility(View.GONE);


        }
    }


}
