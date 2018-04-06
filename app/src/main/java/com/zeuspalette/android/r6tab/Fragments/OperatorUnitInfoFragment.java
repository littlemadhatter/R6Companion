package com.zeuspalette.android.r6tab.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.Activities.UnitOperatorActivity;
import com.zeuspalette.android.r6tab.Helpers.OperatorHelper;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorUnitInfoFragment extends Fragment {

    //Helper to get values
    ZUtils zUtils;
    OperatorHelper o;
    ImageView unitImage;
    ImageView unitCountryImage;

    private int[] unitAttackerIcons = {};

    public OperatorUnitInfoFragment() {


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unitImage = null;
        unitCountryImage = null;
        o = null;
        zUtils = null;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        o = new OperatorHelper(getActivity());
        zUtils = new ZUtils();

        ((UnitOperatorActivity) getActivity())
                .setActionBarTitle("Unit Information");

        //Setup Unit information associated with a Unit

        View view = inflater.inflate(getOperatorLayout(), container, false);


        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sas")) {

            setupUnitInfo(view, R.drawable.sas, R.string.sas, R.drawable.f_sas, "U.K");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("fbi")) {

            setupUnitInfo(view, R.drawable.fbi, R.string.fbi, R.drawable.f_fbi, "U.S.A");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("gign")) {

            setupUnitInfo(view, R.drawable.gign, R.string.gign, R.drawable.f_gign, "France");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("spetznaz")) {

            setupUnitInfo(view, R.drawable.spetznaz, R.string.spetznaz, R.drawable.f_spetznaz, "Russia");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("gsg9")) {

            setupUnitInfo(view, R.drawable.gsg9, R.string.gsg9, R.drawable.f_gsg9, "Germany");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("jtf2")) {

            setupUnitInfo(view, R.drawable.jtf2, R.string.jtf2, R.drawable.f_jtf2, "Canada");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("navyseals")) {

            setupUnitInfo(view, R.drawable.navyseals, R.string.navy, R.drawable.f_fbi, "U.S.A");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("bope")) {

            setupUnitInfo(view, R.drawable.bope, R.string.bope, R.drawable.f_bope, "Brazil");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sat")) {

            setupUnitInfo(view, R.drawable.sat, R.string.sat, R.drawable.f_sat, "Japan");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("geo")) {

            setupUnitInfo(view, R.drawable.geo, R.string.geo, R.drawable.f_geo, "Spain");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("sdu")) {

            setupUnitInfo(view, R.drawable.sdu, R.string.sdu, R.drawable.f_sdu, "China");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("grom")) {

            setupUnitInfo(view, R.drawable.grom, R.string.grom, R.drawable.f_grom, "Poland");

        }

        if (UnitOperatorActivity.mUnitTAG.equalsIgnoreCase("x707thsmb")) {

            setupUnitInfo(view, R.drawable.x707thsmb, R.string.x707thsmb, R.drawable.f_x707thsmb, "South Korea");

        }

        return view;
    }


    public int getOperatorLayout() {

        return R.layout.fragment_operator_unit_info;

    }

    public void setupUnitInfo(View view, int imageID, int infoID, int imageCountryId, String stringCountry) {


        TextView unitName = view.findViewById(R.id.unit_info);
        unitImage = view.findViewById(R.id.unit_image);
        TextView unitCountryName = view.findViewById(R.id.unit_country_name);
        unitCountryImage = view.findViewById(R.id.unit_country);

        Picasso.with(getActivity()).load(imageID).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 271), zUtils.getPixelfromDP(getActivity(), 271)).into(unitImage);
        Picasso.with(getActivity()).load(imageCountryId).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).resize(zUtils.getPixelfromDP(getActivity(), 102), zUtils.getPixelfromDP(getActivity(), 60)).into(unitCountryImage);


        unitName.setText(getActivity().getResources().getString(infoID));
        unitCountryName.setText(stringCountry);
    }


}
