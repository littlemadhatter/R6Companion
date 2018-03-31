package com.jeevscode.android.r6companion.Fragments;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.jeevscode.android.r6companion.Activities.OperatorActivity;
import com.jeevscode.android.r6companion.Activities.SpeedActivity;
import com.jeevscode.android.r6companion.R;
import com.jeevscode.android.r6companion.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class AttackersSpeedFragment extends Fragment {

    private ZUtils zUtils = new ZUtils();

    private int[] mAttackerIcons = {
            R.drawable.sledge, R.drawable.thatcher, R.drawable.ash, R.drawable.thermite, R.drawable.twitch, R.drawable.montagne, R.drawable.glaz, R.drawable.fuze,
            R.drawable.blitz, R.drawable.iq, R.drawable.buck, R.drawable.blackbeard, R.drawable.capitao, R.drawable.hibana, R.drawable.jackal, R.drawable.ying,
            R.drawable.zofia, R.drawable.dokkaebi, R.drawable.lion, R.drawable.finka
    };

    private int[] mAttackerIconImageViews = {
            R.id.sledge, R.id.thatcher, R.id.ash, R.id.thermite, R.id.twitch, R.id.montagne, R.id.glaz, R.id.fuze,
            R.id.blitz, R.id.iq, R.id.buck, R.id.blackbeard, R.id.capitao, R.id.hibana, R.id.jackal, R.id.ying,
            R.id.zofia, R.id.dokkaebi, R.id.lion, R.id.finka
    };

    private ImageView imageView[];
    private ImageView oneSpeed;
    private ImageView twoSpeed;
    private ImageView threeSpeed;


    public AttackersSpeedFragment() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        for (int i = 0; i < 20; i++) {

            imageView[i] = null;

        }
        oneSpeed = null;
        twoSpeed = null;
        threeSpeed = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_speed_attackers, container, false);

        setupAttackerIcons(view);

        ((SpeedActivity) getActivity())
                .setActionBarTitle("Attackers Speed");

        imageView = new ImageView[20];

        return view;
    }

    private void setupAttackerIcons(View view) {

        oneSpeed = view.findViewById(R.id.one_speed);
        twoSpeed = view.findViewById(R.id.two_speed);
        threeSpeed = view.findViewById(R.id.three_speed);
        Picasso.with(getActivity()).load(R.drawable.operatorinfo1speed).resize(zUtils.getPixelfromDP(getActivity(), 210), zUtils.getPixelfromDP(getActivity(), 61)).into(oneSpeed);
        Picasso.with(getActivity()).load(R.drawable.operatorinfo2speed).resize(zUtils.getPixelfromDP(getActivity(), 210), zUtils.getPixelfromDP(getActivity(), 61)).into(twoSpeed);
        Picasso.with(getActivity()).load(R.drawable.operatorinfo3speed).resize(zUtils.getPixelfromDP(getActivity(), 210), zUtils.getPixelfromDP(getActivity(), 61)).into(threeSpeed);


        for (int i = 0; i < 20; i++) {

            imageView[i] = view.findViewById(mAttackerIconImageViews[i]);
            Picasso.with(getActivity()).load(mAttackerIcons[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 60), zUtils.getPixelfromDP(getActivity(), 57)).into(imageView[i]);


            imageView[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent;

                    switch (v.getId()) {

                        case R.id.sledge:
                            Log.d("R6Tab", "Sledge Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "sledge");
                            startActivity(intent);
                            break;

                        case R.id.thatcher:
                            Log.d("R6Tab", "Thatcher Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "thatcher");
                            startActivity(intent);
                            break;
                        case R.id.ash:
                            Log.d("R6Tab", "Ash Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "ash");
                            startActivity(intent);
                            break;
                        case R.id.thermite:
                            Log.d("R6Tab", "Thermite Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "thermite");
                            startActivity(intent);
                            break;
                        case R.id.twitch:
                            Log.d("R6Tab", "Twitch Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "twitch");
                            startActivity(intent);
                            break;
                        case R.id.montagne:
                            Log.d("R6Tab", "Montagne Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "montagne");
                            startActivity(intent);
                            break;
                        case R.id.glaz:
                            Log.d("R6Tab", "Glaz Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "glaz");
                            startActivity(intent);
                            break;
                        case R.id.fuze:
                            Log.d("R6Tab", "Fuze Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "fuze");
                            startActivity(intent);
                            break;
                        case R.id.blitz:
                            Log.d("R6Tab", "Blitz Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "blitz");
                            startActivity(intent);
                            break;
                        case R.id.iq:
                            Log.d("R6Tab", "Iq Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "iq");
                            startActivity(intent);
                            break;
                        case R.id.buck:
                            Log.d("R6Tab", "Buck Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "buck");
                            startActivity(intent);
                            break;
                        case R.id.blackbeard:
                            Log.d("R6Tab", "Blackbeard Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "blackbeard");
                            startActivity(intent);
                            break;
                        case R.id.capitao:
                            Log.d("R6Tab", "Capitao Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "capitao");
                            startActivity(intent);
                            break;
                        case R.id.hibana:
                            Log.d("R6Tab", "Hibana Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "hibana");
                            startActivity(intent);
                            break;
                        case R.id.jackal:
                            Log.d("R6Tab", "Jackal Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "jackal");
                            startActivity(intent);
                            break;
                        case R.id.ying:
                            Log.d("R6Tab", "Ying Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "ying");
                            startActivity(intent);
                            break;
                        case R.id.zofia:
                            Log.d("R6Tab", "Zofia Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "zofia");
                            startActivity(intent);
                            break;
                        case R.id.dokkaebi:
                            Log.d("R6Tab", "Dokkaebi Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "dokkaebi");
                            startActivity(intent);
                            break;
                        case R.id.lion:
                            Log.d("R6Tab", "Lion Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "lion");
                            startActivity(intent);
                            break;
                        case R.id.finka:
                            Log.d("R6Tab", "Finka Icon Selected");
                            intent = new Intent(getActivity(), OperatorActivity.class);
                            intent.putExtra("operator", "finka");
                            startActivity(intent);
                            break;


                    }
                }
            });


        }


    }

}
