package com.zeuspalette.android.r6tab.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.Activities.OperatorActivity;
import com.zeuspalette.android.r6tab.Activities.SpeedActivity;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class DefendersSpeedFragment extends Fragment {

    private ZUtils zUtils = new ZUtils();

    private int[] mDefenderIcons = {
            R.drawable.smoke, R.drawable.mute, R.drawable.castle, R.drawable.pulse, R.drawable.doc, R.drawable.rook, R.drawable.kapkan, R.drawable.tachanka,
            R.drawable.jager, R.drawable.bandit, R.drawable.frost, R.drawable.valkyrie, R.drawable.caveira, R.drawable.echo, R.drawable.mira, R.drawable.lesion,
            R.drawable.ela, R.drawable.vigil
    };

    private int[] mDefenderIconImageViews = {
            R.id.smoke, R.id.mute, R.id.castle, R.id.pulse, R.id.doc, R.id.rook, R.id.kapkan, R.id.tachanka,
            R.id.jager, R.id.bandit, R.id.frost, R.id.valkyrie, R.id.caveira, R.id.echo, R.id.mira, R.id.lesion,
            R.id.ela, R.id.vigil
    };


    public DefendersSpeedFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_speed_defenders, container, false);

        ((SpeedActivity) getActivity())
                .setActionBarTitle("Defenders Speed");


        setupDefenderIcons(view);

        return view;
    }


    private void setupDefenderIcons(View view) {

        ImageView oneSpeed = view.findViewById(R.id.one_speed);
        ImageView twoSpeed = view.findViewById(R.id.two_speed);
        ImageView threeSpeed = view.findViewById(R.id.three_speed);
        Picasso.with(getActivity()).load(R.drawable.operatorinfo1speed).resize(zUtils.getPixelfromDP(getActivity(),210),zUtils.getPixelfromDP(getActivity(),61)).into(oneSpeed);
        Picasso.with(getActivity()).load(R.drawable.operatorinfo2speed).resize(zUtils.getPixelfromDP(getActivity(),210),zUtils.getPixelfromDP(getActivity(),61)).into(twoSpeed);
        Picasso.with(getActivity()).load(R.drawable.operatorinfo3speed).resize(zUtils.getPixelfromDP(getActivity(),210),zUtils.getPixelfromDP(getActivity(),61)).into(threeSpeed);

        for (int i = 0; i < 18; i++) {


            ImageView imageView = view.findViewById(mDefenderIconImageViews[i]);
            Picasso.with(getActivity()).load(mDefenderIcons[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(),60),zUtils.getPixelfromDP(getActivity(),57)).into(imageView);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent;

                    switch (v.getId()) {

                        case R.id.smoke:
                            Log.d("R6Tab","Smoke Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "smoke");
                            startActivity(intent);
                            break;

                        case R.id.mute:
                            Log.d("R6Tab","Mute Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "mute");
                            startActivity(intent);
                            break;
                        case R.id.castle:
                            Log.d("R6Tab","Castle Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "castle");
                            startActivity(intent);
                            break;
                        case R.id.pulse:
                            Log.d("R6Tab","Pulse Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "pulse");
                            startActivity(intent);
                            break;
                        case R.id.doc:
                            Log.d("R6Tab","Doc Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "doc");
                            startActivity(intent);
                            break;
                        case R.id.rook:
                            Log.d("R6Tab","Rook Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "rook");
                            startActivity(intent);
                            break;
                        case R.id.kapkan:
                            Log.d("R6Tab","Kapkan Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "kapkan");
                            startActivity(intent);
                            break;
                        case R.id.tachanka:
                            Log.d("R6Tab","Tachanka Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "tachanka");
                            startActivity(intent);
                            break;
                        case R.id.jager:
                            Log.d("R6Tab","Jager Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "jager");
                            startActivity(intent);
                            break;
                        case R.id.bandit:
                            Log.d("R6Tab","Bandit Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "bandit");
                            startActivity(intent);
                            break;
                        case R.id.frost:
                            Log.d("R6Tab","Frost Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "frost");
                            startActivity(intent);
                            break;
                        case R.id.valkyrie:
                            Log.d("R6Tab","Valkyrie Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "valkyrie");
                            startActivity(intent);
                            break;
                        case R.id.caveira:
                            Log.d("R6Tab","Caveira Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "caveira");
                            startActivity(intent);
                            break;
                        case R.id.echo:
                            Log.d("R6Tab","Echo Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "echo");
                            startActivity(intent);
                            break;
                        case R.id.mira:
                            Log.d("R6Tab","Mira Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "mira");
                            startActivity(intent);
                            break;
                        case R.id.lesion:
                            Log.d("R6Tab","Lesion Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "lesion");
                            startActivity(intent);
                            break;
                        case R.id.ela:
                            Log.d("R6Tab","Ela Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "ela");
                            startActivity(intent);
                            break;
                        case R.id.vigil:
                            Log.d("R6Tab","Vigil Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "vigil");
                            startActivity(intent);
                            break;


                    }
                }
            });


        }


    }


}

