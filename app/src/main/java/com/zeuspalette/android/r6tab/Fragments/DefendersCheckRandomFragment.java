package com.zeuspalette.android.r6tab.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;
import com.zeuspalette.android.r6tab.R;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class DefendersCheckRandomFragment extends Fragment {

    private ZUtils zUtils;
    int prev = 0;


    public DefendersCheckRandomFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_random_check_defender, container, false);
        zUtils = new ZUtils();
        setupAttackerMaps(view);

        return view;
    }

    //Setup Checkbox for all Defenders for users to select the Defenders they own.

    private void setupAttackerMaps(View v) {


        SharedPreferences sharedPref = getActivity().getSharedPreferences(
                getActivity().getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);


        CheckBox smokeC = v.findViewById(R.id.smoke_check);
        ImageView smokeI = v.findViewById(R.id.smoke);
        Picasso.with(getActivity()).load(R.drawable.smoke).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(smokeI);

        smokeC.setChecked(sharedPref.getBoolean("smoke", true));
        smokeC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "smoke", isChecked);
            }
        });


        CheckBox muteC = v.findViewById(R.id.mute_check);
        ImageView muteI = v.findViewById(R.id.mute);
        Picasso.with(getActivity()).load(R.drawable.mute).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(muteI);

        muteC.setChecked(sharedPref.getBoolean("mute", true));
        muteC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "mute", isChecked);
            }
        });


        CheckBox castleC = v.findViewById(R.id.castle_check);
        ImageView castleI = v.findViewById(R.id.castle);
        Picasso.with(getActivity()).load(R.drawable.castle).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(castleI);

        castleC.setChecked(sharedPref.getBoolean("castle", true));
        castleC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "castle", isChecked);
            }
        });


        CheckBox pulseC = v.findViewById(R.id.pulse_check);
        ImageView pulseI = v.findViewById(R.id.pulse);
        Picasso.with(getActivity()).load(R.drawable.pulse).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(pulseI);

        pulseC.setChecked(sharedPref.getBoolean("pulse", true));
        pulseC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "pulse", isChecked);
            }
        });


        CheckBox docC = v.findViewById(R.id.doc_check);
        ImageView docI = v.findViewById(R.id.doc);
        Picasso.with(getActivity()).load(R.drawable.doc).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(docI);

        docC.setChecked(sharedPref.getBoolean("doc", true));
        docC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "doc", isChecked);
            }
        });


        CheckBox rookC = v.findViewById(R.id.rook_check);
        ImageView rookI = v.findViewById(R.id.rook);
        Picasso.with(getActivity()).load(R.drawable.rook).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(rookI);

        rookC.setChecked(sharedPref.getBoolean("rook", true));
        rookC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "rook", isChecked);
            }
        });


        CheckBox kapkanC = v.findViewById(R.id.kapkan_check);
        ImageView kapkanI = v.findViewById(R.id.kapkan);
        Picasso.with(getActivity()).load(R.drawable.kapkan).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(kapkanI);

        kapkanC.setChecked(sharedPref.getBoolean("kapkan", true));
        kapkanC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "kapkan", isChecked);
            }
        });


        CheckBox tachankaC = v.findViewById(R.id.tachanka_check);
        ImageView tachankaI = v.findViewById(R.id.tachanka);
        Picasso.with(getActivity()).load(R.drawable.tachanka).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(tachankaI);

        tachankaC.setChecked(sharedPref.getBoolean("tachanka", true));
        tachankaC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "tachanka", isChecked);
            }
        });


        CheckBox jagerC = v.findViewById(R.id.jager_check);
        ImageView jagerI = v.findViewById(R.id.jager);
        Picasso.with(getActivity()).load(R.drawable.jager).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(jagerI);

        jagerC.setChecked(sharedPref.getBoolean("jager", true));
        jagerC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "jager", isChecked);
            }
        });


        CheckBox banditC = v.findViewById(R.id.bandit_check);
        ImageView banditI = v.findViewById(R.id.bandit);
        Picasso.with(getActivity()).load(R.drawable.bandit).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(banditI);

        banditC.setChecked(sharedPref.getBoolean("bandit", true));
        banditC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "bandit", isChecked);
            }
        });


        CheckBox frostC = v.findViewById(R.id.frost_check);
        ImageView frostI = v.findViewById(R.id.frost);
        Picasso.with(getActivity()).load(R.drawable.frost).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(frostI);

        frostC.setChecked(sharedPref.getBoolean("frost", true));
        frostC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "frost", isChecked);
            }
        });


        CheckBox valkyrieC = v.findViewById(R.id.valkyrie_check);
        ImageView valkyrieI = v.findViewById(R.id.valkyrie);
        Picasso.with(getActivity()).load(R.drawable.valkyrie).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(valkyrieI);

        valkyrieC.setChecked(sharedPref.getBoolean("valkyrie", true));
        valkyrieC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "valkyrie", isChecked);
            }
        });


        CheckBox caveiraC = v.findViewById(R.id.caveira_check);
        ImageView caveiraI = v.findViewById(R.id.caveira);
        Picasso.with(getActivity()).load(R.drawable.caveira).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(caveiraI);

        caveiraC.setChecked(sharedPref.getBoolean("caveira", true));
        caveiraC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "caveira", isChecked);
            }
        });


        CheckBox echoC = v.findViewById(R.id.echo_check);
        ImageView echoI = v.findViewById(R.id.echo);
        Picasso.with(getActivity()).load(R.drawable.echo).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(echoI);

        echoC.setChecked(sharedPref.getBoolean("echo", true));
        echoC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "echo", isChecked);
            }
        });


        CheckBox miraC = v.findViewById(R.id.mira_check);
        ImageView miraI = v.findViewById(R.id.mira);
        Picasso.with(getActivity()).load(R.drawable.mira).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(miraI);

        miraC.setChecked(sharedPref.getBoolean("mira", true));
        miraC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "mira", isChecked);
            }
        });


        CheckBox lesionC = v.findViewById(R.id.lesion_check);
        ImageView lesionI = v.findViewById(R.id.lesion);
        Picasso.with(getActivity()).load(R.drawable.lesion).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(lesionI);

        lesionC.setChecked(sharedPref.getBoolean("lesion", true));
        lesionC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "lesion", isChecked);
            }
        });


        CheckBox elaC = v.findViewById(R.id.ela_check);
        ImageView elaI = v.findViewById(R.id.ela);
        Picasso.with(getActivity()).load(R.drawable.ela).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(elaI);

        elaC.setChecked(sharedPref.getBoolean("ela", true));
        elaC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "ela", isChecked);
            }
        });


        CheckBox vigilC = v.findViewById(R.id.vigil_check);
        ImageView vigilI = v.findViewById(R.id.vigil);
        Picasso.with(getActivity()).load(R.drawable.vigil).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 50)).into(vigilI);

        vigilC.setChecked(sharedPref.getBoolean("vigil", true));
        vigilC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                zUtils.insertSharedPreferenceBoolean(getActivity(), "vigil", isChecked);
            }
        });


    }


}

