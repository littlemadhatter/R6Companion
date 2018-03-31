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

public class DefendersRandomFragment extends Fragment {

    private ZUtils zUtils = new ZUtils();
    int prev = 0;



    public String[] opKey = {"smoke", "mute", "castle", "pulse", "doc", "rook", "kapkan", "tachanka", "jager", "bandit", "frost", "valkyrie", "caveira", "echo", "mira", "lesion", "ela", "vigil"};

    HashMap<String, Integer> defenderIcons;
    HashMap<String, Integer> defenderProfileIcons;
    ArrayList<String> defenders;
    Button randomize;

    public DefendersRandomFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_random_operator, container, false);


        Button randomize = view.findViewById(R.id.random_button);


        zUtils = new ZUtils();

        refreshContent();

        new RandomOperatorLoad(view, defenderIcons, defenderProfileIcons, defenders).execute("");

        randomize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new RandomOperatorLoad(view, defenderIcons, defenderProfileIcons, defenders).execute("");

            }


        });


        ((RandomActivity) getActivity())
                .setActionBarTitle("Random Defender");


        return view;
    }

    public void refreshContent() {

        defenderIcons = new HashMap<>();
        defenderProfileIcons = new HashMap<>();
        defenders = new ArrayList<>();

        setupAttackerMaps();
        loadRandomDefenders();

    }


    //Load a Random Defender based on Operator list preferences


    private void loadRandomDefenders() {


        SharedPreferences sharedPref = getActivity().getSharedPreferences(
                getActivity().getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);

        if (!(sharedPref.getBoolean("smoke", true))) {
            defenderIcons.remove("smoke");
            defenderProfileIcons.remove("smoke");
            defenders.remove("smoke");
        }
        if (!(sharedPref.getBoolean("mute", true))) {
            defenderIcons.remove("mute");
            defenderProfileIcons.remove("mute");
            defenders.remove("mute");
        }
        if (!(sharedPref.getBoolean("castle", true))) {
            defenderIcons.remove("castle");
            defenderProfileIcons.remove("castle");
            defenders.remove("castle");
        }
        if (!(sharedPref.getBoolean("pulse", true))) {
            defenderIcons.remove("pulse");
            defenderProfileIcons.remove("pulse");
            defenders.remove("pulse");
        }
        if (!(sharedPref.getBoolean("doc", true))) {
            defenderIcons.remove("doc");
            defenderProfileIcons.remove("doc");
            defenders.remove("doc");
        }
        if (!(sharedPref.getBoolean("rook", true))) {
            defenderIcons.remove("rook");
            defenderProfileIcons.remove("rook");
            defenders.remove("rook");
        }
        if (!(sharedPref.getBoolean("kapkan", true))) {
            defenderIcons.remove("kapkan");
            defenderProfileIcons.remove("kapkan");
            defenders.remove("kapkan");
        }
        if (!(sharedPref.getBoolean("tachanka", true))) {
            defenderIcons.remove("tachanka");
            defenderProfileIcons.remove("tachanka");
            defenders.remove("tachanka");
        }
        if (!(sharedPref.getBoolean("jager", true))) {
            defenderIcons.remove("jager");
            defenderProfileIcons.remove("jager");
            defenders.remove("jager");
        }
        if (!(sharedPref.getBoolean("bandit", true))) {
            defenderIcons.remove("bandit");
            defenderProfileIcons.remove("bandit");
            defenders.remove("bandit");
        }
        if (!(sharedPref.getBoolean("frost", true))) {
            defenderIcons.remove("frost");
            defenderProfileIcons.remove("frost");
            defenders.remove("frost");
        }
        if (!(sharedPref.getBoolean("valkyrie", true))) {
            defenderIcons.remove("valkyrie");
            defenderProfileIcons.remove("valkyrie");
            defenders.remove("valkyrie");
        }
        if (!(sharedPref.getBoolean("caveira", true))) {
            defenderIcons.remove("caveira");
            defenderProfileIcons.remove("caveira");
            defenders.remove("caveira");
        }
        if (!(sharedPref.getBoolean("echo", true))) {
            defenderIcons.remove("echo");
            defenderProfileIcons.remove("echo");
            defenders.remove("echo");
        }
        if (!(sharedPref.getBoolean("mira", true))) {
            defenderIcons.remove("mira");
            defenderProfileIcons.remove("mira");
            defenders.remove("mira");
        }
        if (!(sharedPref.getBoolean("lesion", true))) {
            defenderIcons.remove("lesion");
            defenderProfileIcons.remove("lesion");
            defenders.remove("lesion");
        }
        if (!(sharedPref.getBoolean("ela", true))) {
            defenderIcons.remove("ela");
            defenderProfileIcons.remove("ela");
            defenders.remove("ela");
        }
        if (!(sharedPref.getBoolean("vigil", true))) {
            defenderIcons.remove("vigil");
            defenderProfileIcons.remove("vigil");
            defenders.remove("vigil");
        }
    }

    //Setup all Defenders and associate them with keys. Load associated Drawables under same key

    private void setupAttackerMaps() {

        defenderIcons.put("smoke", R.drawable.smoke);
        defenderProfileIcons.put("smoke", R.drawable.ismoke);
        defenders.add("smoke");
        defenderIcons.put("mute", R.drawable.mute);
        defenderProfileIcons.put("mute", R.drawable.imute);
        defenders.add("mute");
        defenderIcons.put("castle", R.drawable.castle);
        defenderProfileIcons.put("castle", R.drawable.icastle);
        defenders.add("castle");
        defenderIcons.put("pulse", R.drawable.pulse);
        defenderProfileIcons.put("pulse", R.drawable.ipulse);
        defenders.add("pulse");
        defenderIcons.put("doc", R.drawable.doc);
        defenderProfileIcons.put("doc", R.drawable.idoc);
        defenders.add("doc");
        defenderIcons.put("rook", R.drawable.rook);
        defenderProfileIcons.put("rook", R.drawable.irook);
        defenders.add("rook");
        defenderIcons.put("kapkan", R.drawable.kapkan);
        defenderProfileIcons.put("kapkan", R.drawable.ikapkan);
        defenders.add("kapkan");
        defenderIcons.put("tachanka", R.drawable.tachanka);
        defenderProfileIcons.put("tachanka", R.drawable.itachanka);
        defenders.add("tachanka");
        defenderIcons.put("jager", R.drawable.jager);
        defenderProfileIcons.put("jager", R.drawable.ijager);
        defenders.add("jager");
        defenderIcons.put("bandit", R.drawable.bandit);
        defenderProfileIcons.put("bandit", R.drawable.ibandit);
        defenders.add("bandit");
        defenderIcons.put("frost", R.drawable.frost);
        defenderProfileIcons.put("frost", R.drawable.ifrost);
        defenders.add("frost");
        defenderIcons.put("valkyrie", R.drawable.valkyrie);
        defenderProfileIcons.put("valkyrie", R.drawable.ivalkyrie);
        defenders.add("valkyrie");
        defenderIcons.put("caveira", R.drawable.caveira);
        defenderProfileIcons.put("caveira", R.drawable.icaveira);
        defenders.add("caveira");
        defenderIcons.put("echo", R.drawable.echo);
        defenderProfileIcons.put("echo", R.drawable.iecho);
        defenders.add("echo");
        defenderIcons.put("mira", R.drawable.mira);
        defenderProfileIcons.put("mira", R.drawable.imira);
        defenders.add("mira");
        defenderIcons.put("lesion", R.drawable.lesion);
        defenderProfileIcons.put("lesion", R.drawable.ilesion);
        defenders.add("lesion");
        defenderIcons.put("ela", R.drawable.ela);
        defenderProfileIcons.put("ela", R.drawable.iela);
        defenders.add("ela");
        defenderIcons.put("vigil", R.drawable.vigil);
        defenderProfileIcons.put("vigil", R.drawable.ivigil);
        defenders.add("vigil");


    }

    private class RandomOperatorLoad extends AsyncTask<String, String, Integer> {

        HashMap<String, Integer> defenderIcons = new HashMap<>();
        HashMap<String, Integer> defenderProfileIcons = new HashMap<>();
        ArrayList<String> defenders = new ArrayList<>();
        View view;

        RandomOperatorLoad(View v, HashMap<String, Integer> one, HashMap<String, Integer> two, ArrayList<String> three) {

            defenderIcons = one;
            defenderProfileIcons = two;
            defenders = three;
            view = v;

        }

        protected Integer doInBackground(String... tmp) {


            Random rand = new Random();

            if (defenderIcons.size() != 0) {
                int n = 0;
                while ((n = rand.nextInt(defenderIcons.size())) == prev) {

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

                Toast.makeText(getActivity(), "Please select any one Defender in Settings above", Toast.LENGTH_SHORT).show();

            } else {

                refreshContent();

                ImageView icon = view.findViewById(R.id.random_icon);
                ImageView profile = view.findViewById(R.id.random_profile);

                Picasso.with(getActivity()).load(defenderIcons.get(defenders.get(result))).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 240), zUtils.getPixelfromDP(getActivity(), 240)).into(icon);
                Picasso.with(getActivity()).load(defenderProfileIcons.get(defenders.get(result))).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 120), zUtils.getPixelfromDP(getActivity(), 120)).into(profile);

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

