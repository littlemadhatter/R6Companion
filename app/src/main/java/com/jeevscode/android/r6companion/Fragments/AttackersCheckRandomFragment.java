package com.jeevscode.android.r6companion.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.jeevscode.android.r6companion.Helpers.ZUtils;
import com.jeevscode.android.r6companion.R;



public class AttackersCheckRandomFragment extends Fragment {

    private ZUtils zUtils;
    int prev = 0;


    public AttackersCheckRandomFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_random_check_attacker, container, false);
        zUtils = new ZUtils();
        setupAttackerMaps(view);

        return view;
    }

    //Setup Checkbox for all Attackers for users to select the Attackers they own.

    private void setupAttackerMaps(View v) {


        SharedPreferences sharedPref = getActivity().getSharedPreferences(
                getActivity().getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);

        CheckBox sledgeC = v.findViewById(R.id.sledge_check);
        ImageView sledgeI = v.findViewById(R.id.sledge);
        Picasso.with(getActivity()).load(R.drawable.sledge).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(sledgeI);

        sledgeC.setChecked(sharedPref.getBoolean("sledge", true));
        sledgeC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "sledge", isChecked);
            }
        });


        CheckBox thatcherC = v.findViewById(R.id.thatcher_check);
        ImageView thatcherI = v.findViewById(R.id.thatcher);
        Picasso.with(getActivity()).load(R.drawable.thatcher).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(thatcherI);

        thatcherC.setChecked(sharedPref.getBoolean("thatcher", true));
        thatcherC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "thatcher", isChecked);
            }
        });


        CheckBox ashC = v.findViewById(R.id.ash_check);
        ImageView ashI = v.findViewById(R.id.ash);
        Picasso.with(getActivity()).load(R.drawable.ash).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(ashI);

        ashC.setChecked(sharedPref.getBoolean("ash", true));
        ashC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "ash", isChecked);
            }
        });


        CheckBox thermiteC = v.findViewById(R.id.thermite_check);
        ImageView thermiteI = v.findViewById(R.id.thermite);
        Picasso.with(getActivity()).load(R.drawable.thermite).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(thermiteI);

        thermiteC.setChecked(sharedPref.getBoolean("thermite", true));
        thermiteC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "thermite", isChecked);
            }
        });


        CheckBox twitchC = v.findViewById(R.id.twitch_check);
        ImageView twitchI = v.findViewById(R.id.twitch);
        Picasso.with(getActivity()).load(R.drawable.twitch).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(twitchI);

        twitchC.setChecked(sharedPref.getBoolean("twitch", true));
        twitchC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "twitch", isChecked);
            }
        });


        CheckBox montagneC = v.findViewById(R.id.montagne_check);
        ImageView montagneI = v.findViewById(R.id.montagne);
        Picasso.with(getActivity()).load(R.drawable.montagne).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(montagneI);

        montagneC.setChecked(sharedPref.getBoolean("montagne", true));
        montagneC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "montagne", isChecked);
            }
        });


        CheckBox glazC = v.findViewById(R.id.glaz_check);
        ImageView glazI = v.findViewById(R.id.glaz);
        Picasso.with(getActivity()).load(R.drawable.glaz).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(glazI);

        glazC.setChecked(sharedPref.getBoolean("glaz", true));
        glazC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "glaz", isChecked);
            }
        });


        CheckBox fuzeC = v.findViewById(R.id.fuze_check);
        ImageView fuzeI = v.findViewById(R.id.fuze);
        Picasso.with(getActivity()).load(R.drawable.fuze).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(fuzeI);

        fuzeC.setChecked(sharedPref.getBoolean("fuze", true));
        fuzeC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "fuze", isChecked);
            }
        });


        CheckBox blitzC = v.findViewById(R.id.blitz_check);
        ImageView blitzI = v.findViewById(R.id.blitz);
        Picasso.with(getActivity()).load(R.drawable.blitz).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(blitzI);

        blitzC.setChecked(sharedPref.getBoolean("blitz", true));
        blitzC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "blitz", isChecked);
            }
        });


        CheckBox iqC = v.findViewById(R.id.iq_check);
        ImageView iqI = v.findViewById(R.id.iq);
        Picasso.with(getActivity()).load(R.drawable.iq).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(iqI);

        iqC.setChecked(sharedPref.getBoolean("iq", true));
        iqC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "iq", isChecked);
            }
        });


        CheckBox buckC = v.findViewById(R.id.buck_check);
        ImageView buckI = v.findViewById(R.id.buck);
        Picasso.with(getActivity()).load(R.drawable.buck).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(buckI);

        buckC.setChecked(sharedPref.getBoolean("buck", true));
        buckC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "buck", isChecked);
            }
        });


        CheckBox blackbeardC = v.findViewById(R.id.blackbeard_check);
        ImageView blackbeardI = v.findViewById(R.id.blackbeard);
        Picasso.with(getActivity()).load(R.drawable.blackbeard).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(blackbeardI);

        blackbeardC.setChecked(sharedPref.getBoolean("blackbeard", true));
        blackbeardC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "blackbeard", isChecked);
            }
        });


        CheckBox capitaoC = v.findViewById(R.id.capitao_check);
        ImageView capitaoI = v.findViewById(R.id.capitao);
        Picasso.with(getActivity()).load(R.drawable.capitao).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(capitaoI);

        capitaoC.setChecked(sharedPref.getBoolean("capitao", true));
        capitaoC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "capitao", isChecked);
            }
        });


        CheckBox hibanaC = v.findViewById(R.id.hibana_check);
        ImageView hibanaI = v.findViewById(R.id.hibana);
        Picasso.with(getActivity()).load(R.drawable.hibana).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(hibanaI);

        hibanaC.setChecked(sharedPref.getBoolean("hibana", true));
        hibanaC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "hibana", isChecked);
            }
        });


        CheckBox jackalC = v.findViewById(R.id.jackal_check);
        ImageView jackalI = v.findViewById(R.id.jackal);
        Picasso.with(getActivity()).load(R.drawable.jackal).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(jackalI);

        jackalC.setChecked(sharedPref.getBoolean("jackal", true));
        jackalC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "jackal", isChecked);
            }
        });


        CheckBox yingC = v.findViewById(R.id.ying_check);
        ImageView yingI = v.findViewById(R.id.ying);
        Picasso.with(getActivity()).load(R.drawable.ying).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(yingI);

        yingC.setChecked(sharedPref.getBoolean("ying", true));
        yingC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "ying", isChecked);
            }
        });


        CheckBox zofiaC = v.findViewById(R.id.zofia_check);
        ImageView zofiaI = v.findViewById(R.id.zofia);
        Picasso.with(getActivity()).load(R.drawable.zofia).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(zofiaI);

        zofiaC.setChecked(sharedPref.getBoolean("zofia", true));
        zofiaC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "zofia", isChecked);
            }
        });


        CheckBox dokkaebiC = v.findViewById(R.id.dokkaebi_check);
        ImageView dokkaebiI = v.findViewById(R.id.dokkaebi);
        Picasso.with(getActivity()).load(R.drawable.dokkaebi).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(dokkaebiI);

        dokkaebiC.setChecked(sharedPref.getBoolean("dokkaebi", true));
        dokkaebiC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "dokkaebi", isChecked);
            }
        });


        CheckBox lionC = v.findViewById(R.id.lion_check);
        ImageView lionI = v.findViewById(R.id.lion);
        Picasso.with(getActivity()).load(R.drawable.lion).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(lionI);

        lionC.setChecked(sharedPref.getBoolean("lion", true));
        lionC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "lion", isChecked);
            }
        });


        CheckBox finkaC = v.findViewById(R.id.finka_check);
        ImageView finkaI = v.findViewById(R.id.finka);
        Picasso.with(getActivity()).load(R.drawable.finka).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 48)).into(finkaI);

        finkaC.setChecked(sharedPref.getBoolean("finka", true));
        finkaC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "finka", isChecked);
            }
        });


    }


}

