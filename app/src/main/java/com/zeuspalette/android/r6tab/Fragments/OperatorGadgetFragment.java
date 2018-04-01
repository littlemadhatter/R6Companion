package com.zeuspalette.android.r6tab.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeuspalette.android.r6tab.Activities.OperatorActivity;
import com.zeuspalette.android.r6tab.Helpers.GadgetHelper;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorGadgetFragment extends Fragment {

    private ZUtils zUtils;
    private GadgetHelper gadgetHelper;


    public OperatorGadgetFragment() {

        zUtils = new ZUtils();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(getGadgetLayout(), container, false);

        ((OperatorActivity) getActivity())
                .setActionBarTitle("Operator Gadget");

        //Setup Gadgets for all Operators

        gadgetHelper = new GadgetHelper(getActivity());

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("sledge")) {

            gadgetHelper.setSledgeOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thatcher")) {

            gadgetHelper.setThatcherOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ash")) {

            gadgetHelper.setAshOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thermite")) {

            gadgetHelper.setThermiteOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("twitch")) {

            gadgetHelper.setTwitchOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("montagne")) {

            gadgetHelper.setMontagneOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("glaz")) {

            gadgetHelper.setGlazOperatorGadget(getActivity(), view);
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("fuze")) {

            gadgetHelper.setFuzeOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blitz")) {

            gadgetHelper.setBlitzOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("iq")) {

            gadgetHelper.setIqOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("buck")) {

            gadgetHelper.setBuckOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blackbeard")) {

            gadgetHelper.setBlackbeardOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("capitao")) {

            gadgetHelper.setCapitaoOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("hibana")) {

            gadgetHelper.setHibanaOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jackal")) {

            gadgetHelper.setJackalOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ying")) {

            gadgetHelper.setYingOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("zofia")) {

            gadgetHelper.setZofiaOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("dokkaebi")) {

            gadgetHelper.setDokkaebiOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lion")) {

            gadgetHelper.setLionOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("finka")) {

            gadgetHelper.setFinkaOperatorGadget(getActivity(), view);
        }

        /* DEFENDERS */

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("smoke")) {

            gadgetHelper.setSmokeOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mute")) {

            gadgetHelper.setMuteOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("castle")) {

            gadgetHelper.setCastleOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("pulse")) {

            gadgetHelper.setPulseOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("doc")) {

            gadgetHelper.setDocOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("rook")) {

            gadgetHelper.setRookOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("kapkan")) {

            gadgetHelper.setKapkanOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("tachanka")) {

            gadgetHelper.setTachankaOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jager")) {

            gadgetHelper.setJagerOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("bandit")) {

            gadgetHelper.setBanditOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("frost")) {

            gadgetHelper.setFrostOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("valkyrie")) {

            gadgetHelper.setValkyrieOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("caveira")) {

            gadgetHelper.setCaveiraOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("echo")) {

            gadgetHelper.setEchoOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mira")) {

            gadgetHelper.setMiraOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lesion")) {

            gadgetHelper.setLesionOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ela")) {

            gadgetHelper.setElaOperatorGadget(getActivity(), view);
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("vigil")) {

            gadgetHelper.setVigilOperatorGadget(getActivity(), view);
        }

        return view;
    }


    //Get gadget layout based on gadget count

    public int getGadgetLayout() {

        return R.layout.operator_gadget_three;
    }



}
