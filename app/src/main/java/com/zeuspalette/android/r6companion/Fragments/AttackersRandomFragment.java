package com.zeuspalette.android.r6companion.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6companion.Activities.OperatorActivity;
import com.zeuspalette.android.r6companion.Activities.RandomActivity;
import com.zeuspalette.android.r6companion.R;
import com.zeuspalette.android.r6companion.Helpers.ZUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class AttackersRandomFragment extends Fragment {

    private ZUtils zUtils = new ZUtils();
    int prev = 0;


    public String[] opKey = {"sledge", "thatcher", "ash", "thermite", "twitch", "montagne", "glaz", "fuze", "blitz", "iq", "buck", "blackbeard", "capitao", "hibana", "jackal", "ying", "zofia", "dokkaebi", "lion", "finka"};


    HashMap<String, Integer> attackerIcons;
    HashMap<String, Integer> attackerProfileIcons;
    ArrayList<String> attackers;
    Button randomize;


    public AttackersRandomFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_random_operator, container, false);


        randomize = view.findViewById(R.id.random_button);


        zUtils = new ZUtils();

        refreshContent();


        ((RandomActivity) getActivity())
                .setActionBarTitle("Random Attacker");

        new RandomOperatorLoad(view, attackerIcons, attackerProfileIcons, attackers).execute("");


        //Create Random operator when button is clicked

        randomize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new RandomOperatorLoad(view, attackerIcons, attackerProfileIcons, attackers).execute("");

            }


        });


        return view;
    }


    public void refreshContent() {

        attackerIcons = new HashMap<>();
        attackerProfileIcons = new HashMap<>();
        attackers = new ArrayList<>();

        setupAttackerMaps();
        loadRandomAttackers();



    }

    //Load a Random Attacker based on Operator list preferences

    private void loadRandomAttackers() {


        SharedPreferences sharedPref = getActivity().getSharedPreferences(
                getActivity().getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);

        if (!(sharedPref.getBoolean("sledge", true))) {
            attackerIcons.remove("sledge");
            attackerProfileIcons.remove("sledge");
            attackers.remove("sledge");
        }
        if (!(sharedPref.getBoolean("thatcher", true))) {
            attackerIcons.remove("thatcher");
            attackerProfileIcons.remove("thatcher");
            attackers.remove("thatcher");
        }
        if (!(sharedPref.getBoolean("ash", true))) {
            attackerIcons.remove("ash");
            attackerProfileIcons.remove("ash");
            attackers.remove("ash");
        }
        if (!(sharedPref.getBoolean("thermite", true))) {
            attackerIcons.remove("thermite");
            attackerProfileIcons.remove("thermite");
            attackers.remove("thermite");
        }
        if (!(sharedPref.getBoolean("twitch", true))) {
            attackerIcons.remove("twitch");
            attackerProfileIcons.remove("twitch");
            attackers.remove("twitch");
        }
        if (!(sharedPref.getBoolean("montagne", true))) {
            attackerIcons.remove("montagne");
            attackerProfileIcons.remove("montagne");
            attackers.remove("montagne");
        }
        if (!(sharedPref.getBoolean("glaz", true))) {
            attackerIcons.remove("glaz");
            attackerProfileIcons.remove("glaz");
            attackers.remove("glaz");
        }
        if (!(sharedPref.getBoolean("fuze", true))) {
            attackerIcons.remove("fuze");
            attackerProfileIcons.remove("fuze");
            attackers.remove("fuze");
        }
        if (!(sharedPref.getBoolean("blitz", true))) {
            attackerIcons.remove("blitz");
            attackerProfileIcons.remove("blitz");
            attackers.remove("blitz");
        }
        if (!(sharedPref.getBoolean("iq", true))) {
            attackerIcons.remove("iq");
            attackerProfileIcons.remove("iq");
            attackers.remove("iq");
        }
        if (!(sharedPref.getBoolean("buck", true))) {
            attackerIcons.remove("buck");
            attackerProfileIcons.remove("buck");
            attackers.remove("buck");
        }
        if (!(sharedPref.getBoolean("blackbeard", true))) {
            attackerIcons.remove("blackbeard");
            attackerProfileIcons.remove("blackbeard");
            attackers.remove("blackbeard");
        }
        if (!(sharedPref.getBoolean("capitao", true))) {
            attackerIcons.remove("capitao");
            attackerProfileIcons.remove("capitao");
            attackers.remove("capitao");
        }
        if (!(sharedPref.getBoolean("hibana", true))) {
            attackerIcons.remove("hibana");
            attackerProfileIcons.remove("hibana");
            attackers.remove("hibana");
        }
        if (!(sharedPref.getBoolean("jackal", true))) {
            attackerIcons.remove("jackal");
            attackerProfileIcons.remove("jackal");
            attackers.remove("jackal");
        }
        if (!(sharedPref.getBoolean("ying", true))) {
            attackerIcons.remove("ying");
            attackerProfileIcons.remove("ying");
            attackers.remove("ying");
        }
        if (!(sharedPref.getBoolean("zofia", true))) {
            attackerIcons.remove("zofia");
            attackerProfileIcons.remove("zofia");
            attackers.remove("zofia");
        }
        if (!(sharedPref.getBoolean("dokkaebi", true))) {
            attackerIcons.remove("dokkaebi");
            attackerProfileIcons.remove("dokkaebi");
            attackers.remove("dokkaebi");
        }
        if (!(sharedPref.getBoolean("lion", true))) {
            attackerIcons.remove("lion");
            attackerProfileIcons.remove("lion");
            attackers.remove("lion");
        }
        if (!(sharedPref.getBoolean("finka", true))) {
            attackerIcons.remove("finka");
            attackerProfileIcons.remove("finka");
            attackers.remove("finka");
        }
    }

    //Setup all Attackers and associate them with keys. Load associated Drawables under same key

    private void setupAttackerMaps() {

        attackerIcons.put("sledge", R.drawable.sledge);
        attackerProfileIcons.put("sledge", R.drawable.isledge);
        attackers.add("sledge");
        attackerIcons.put("thatcher", R.drawable.thatcher);
        attackerProfileIcons.put("thatcher", R.drawable.ithatcher);
        attackers.add("thatcher");
        attackerIcons.put("ash", R.drawable.ash);
        attackerProfileIcons.put("ash", R.drawable.iash);
        attackers.add("ash");
        attackerIcons.put("thermite", R.drawable.thermite);
        attackerProfileIcons.put("thermite", R.drawable.ithermite);
        attackers.add("thermite");
        attackerIcons.put("twitch", R.drawable.twitch);
        attackerProfileIcons.put("twitch", R.drawable.itwitch);
        attackers.add("twitch");
        attackerIcons.put("montagne", R.drawable.montagne);
        attackerProfileIcons.put("montagne", R.drawable.imontagne);
        attackers.add("montagne");
        attackerIcons.put("glaz", R.drawable.glaz);
        attackerProfileIcons.put("glaz", R.drawable.iglaz);
        attackers.add("glaz");
        attackerIcons.put("fuze", R.drawable.fuze);
        attackerProfileIcons.put("fuze", R.drawable.ifuze);
        attackers.add("fuze");
        attackerIcons.put("blitz", R.drawable.blitz);
        attackerProfileIcons.put("blitz", R.drawable.iblitz);
        attackers.add("blitz");
        attackerIcons.put("iq", R.drawable.iq);
        attackerProfileIcons.put("iq", R.drawable.iiq);
        attackers.add("iq");
        attackerIcons.put("buck", R.drawable.buck);
        attackerProfileIcons.put("buck", R.drawable.ibuck);
        attackers.add("buck");
        attackerIcons.put("blackbeard", R.drawable.blackbeard);
        attackerProfileIcons.put("blackbeard", R.drawable.iblackbeard);
        attackers.add("blackbeard");
        attackerIcons.put("capitao", R.drawable.capitao);
        attackerProfileIcons.put("capitao", R.drawable.icapitao);
        attackers.add("capitao");
        attackerIcons.put("hibana", R.drawable.hibana);
        attackerProfileIcons.put("hibana", R.drawable.ihibana);
        attackers.add("hibana");
        attackerIcons.put("jackal", R.drawable.jackal);
        attackerProfileIcons.put("jackal", R.drawable.ijackal);
        attackers.add("jackal");
        attackerIcons.put("ying", R.drawable.ying);
        attackerProfileIcons.put("ying", R.drawable.iying);
        attackers.add("ying");
        attackerIcons.put("zofia", R.drawable.zofia);
        attackerProfileIcons.put("zofia", R.drawable.izofia);
        attackers.add("zofia");
        attackerIcons.put("dokkaebi", R.drawable.dokkaebi);
        attackerProfileIcons.put("dokkaebi", R.drawable.idokkaebi);
        attackers.add("dokkaebi");
        attackerIcons.put("lion", R.drawable.lion);
        attackerProfileIcons.put("lion", R.drawable.ilion);
        attackers.add("lion");
        attackerIcons.put("finka", R.drawable.finka);
        attackerProfileIcons.put("finka", R.drawable.ifinka);
        attackers.add("finka");


    }

    private class RandomOperatorLoad extends AsyncTask<String, String, Integer> {

        HashMap<String, Integer> attackerIcons = new HashMap<>();
        HashMap<String, Integer> attackerProfileIcons = new HashMap<>();
        ArrayList<String> attackers = new ArrayList<>();
        View view;

        RandomOperatorLoad(View v, HashMap<String, Integer> one, HashMap<String, Integer> two, ArrayList<String> three) {

            attackerIcons = one;
            attackerProfileIcons = two;
            attackers = three;
            view = v;

        }

        protected Integer doInBackground(String... tmp) {


            Random rand = new Random();

            if (attackerIcons.size() != 0) {
                int n = 0;
                while ((n = rand.nextInt(attackerIcons.size())) == prev) {

                }
                prev = n;

                return n;

            } else {

                return -1;
            }


        }

        protected void onProgressUpdate(String... progress) {


        }

        protected void onPostExecute(final Integer result) {

            if (result == -1) {

                Toast.makeText(getActivity(), "Please select any one Attacker in Settings above", Toast.LENGTH_SHORT).show();

            } else {

                refreshContent();

                ImageView icon = view.findViewById(R.id.random_icon);
                ImageView profile = view.findViewById(R.id.random_profile);

                Picasso.with(getActivity()).load(attackerIcons.get(attackers.get(result))).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 240), zUtils.getPixelfromDP(getActivity(), 240)).into(icon);
                Picasso.with(getActivity()).load(attackerProfileIcons.get(attackers.get(result))).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 120), zUtils.getPixelfromDP(getActivity(), 120)).into(profile);

                icon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent(getActivity(), OperatorActivity.class);
                        i.putExtra("operator", opKey[result]);
                        startActivity(i);
                    }
                });

                profile.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getActivity(), OperatorActivity.class);
                        i.putExtra("operator", opKey[result]);
                        startActivity(i);
                    }
                });
            }


        }
    }


}

