package com.jeevscode.android.r6companion.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.jeevscode.android.r6companion.Activities.UnitOperatorActivity;
import com.jeevscode.android.r6companion.MainActivity;
import com.jeevscode.android.r6companion.R;
import com.jeevscode.android.r6companion.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class UnitsFragment extends Fragment {

    ZUtils zUtils = new ZUtils();
    ImageView unitImages[];
    ImageView unitFlags[];

    private int[] mUnitsIcons = {
            R.drawable.s_sas, R.drawable.s_fbi, R.drawable.s_gign, R.drawable.s_spetznaz, R.drawable.s_gsg9, R.drawable.s_jtf2, R.drawable.s_navyseals,
            R.drawable.s_bope, R.drawable.s_sat, R.drawable.s_geo, R.drawable.s_sdu, R.drawable.s_grom, R.drawable.s_707thsmb
    };

    private int[] mUnitsFlags = {
            R.drawable.f_sas, R.drawable.f_fbi, R.drawable.f_gign, R.drawable.f_spetznaz, R.drawable.f_gsg9, R.drawable.f_jtf2, R.drawable.f_fbi,
            R.drawable.f_bope, R.drawable.f_sat, R.drawable.f_geo, R.drawable.f_sdu, R.drawable.f_grom, R.drawable.f_x707thsmb
    };

    private int[] mAUnitIconImageViews = {
            R.id.sas, R.id.fbi, R.id.gign, R.id.spetznaz, R.id.gsg9, R.id.jtf2, R.id.navyseals,
            R.id.bope, R.id.sat, R.id.geo, R.id.sdu, R.id.grom, R.id.x707thsmb
    };

    private int[] mAUnitFlagsImageViews = {
            R.id.f_sas, R.id.f_fbi, R.id.f_gign, R.id.f_spetznaz, R.id.f_gsg9, R.id.f_jtf2, R.id.f_navyseals,
            R.id.f_bope, R.id.f_sat, R.id.f_geo, R.id.f_sdu, R.id.f_grom, R.id.f_x707thsmb
    };


    public UnitsFragment() {

    }

    //Release all memory

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnitsIcons = null;
        mUnitsFlags = null;
        mAUnitIconImageViews = null;
        mAUnitFlagsImageViews = null;

        for (int i = 0; i < 13; i++) {

            unitImages[i] = null;
            unitFlags[i] = null;

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_units, container, false);

        ((MainActivity) getActivity())
                .setActionBarTitle("Units");

        unitImages = new ImageView[13];
        unitFlags = new ImageView[13];

        setupUnitIcons(view);


        return view;
    }


    //Setup Units


    private void setupUnitIcons(View view) {

        for (int i = 0; i < 13; i++) {

            unitImages[i] = view.findViewById(mAUnitIconImageViews[i]);
            unitFlags[i] = view.findViewById(mAUnitFlagsImageViews[i]);

            Picasso.with(getActivity()).load(mUnitsIcons[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 100), zUtils.getPixelfromDP(getActivity(), 100)).into(unitImages[i]);
            Picasso.with(getActivity()).load(mUnitsFlags[i]).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 50), zUtils.getPixelfromDP(getActivity(), 30)).into(unitFlags[i]);

            unitImages[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent i;

                    switch (v.getId()) {

                        case R.id.sas:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "sas");
                            startActivity(i);
                            break;
                        case R.id.fbi:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "fbi");
                            startActivity(i);
                            break;
                        case R.id.gign:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "gign");
                            startActivity(i);
                            break;
                        case R.id.spetznaz:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "spetznaz");
                            startActivity(i);
                            break;
                        case R.id.gsg9:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "gsg9");
                            startActivity(i);
                            break;
                        case R.id.jtf2:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "jtf2");
                            startActivity(i);
                            break;
                        case R.id.navyseals:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "navyseals");
                            startActivity(i);
                            break;
                        case R.id.bope:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "bope");
                            startActivity(i);
                            break;
                        case R.id.sat:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "sat");
                            startActivity(i);
                            break;
                        case R.id.geo:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "geo");
                            startActivity(i);
                            break;
                        case R.id.sdu:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "sdu");
                            startActivity(i);
                            break;
                        case R.id.grom:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "grom");
                            startActivity(i);
                            break;
                        case R.id.x707thsmb:
                            i = new Intent(getActivity(), UnitOperatorActivity.class);
                            i.putExtra("unit", "x707thsmb");
                            startActivity(i);


                    }
                }
            });


        }

    }
}
