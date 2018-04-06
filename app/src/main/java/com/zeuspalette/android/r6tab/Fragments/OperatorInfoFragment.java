package com.zeuspalette.android.r6tab.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeuspalette.android.r6tab.Activities.OperatorActivity;
import com.zeuspalette.android.r6tab.Helpers.OperatorHelper;
import com.zeuspalette.android.r6tab.R;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class OperatorInfoFragment extends Fragment {

    //Helper to get values
    ZUtils zUtils;
    OperatorHelper o;
    View view;

    public OperatorInfoFragment() {


    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        zUtils = null;
        view = null;
        o = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        o = new OperatorHelper(getActivity());
        zUtils = new ZUtils();

        ((OperatorActivity) getActivity())
                .setActionBarTitle("Operator Info");

        view = inflater.inflate(getOperatorLayout(), container, false);

        //Setup all Operators with their information method

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("sledge")) {

            zUtils.setOperatorInfoFragment(getActivity(), view,
                    R.id.operator_name, o.getSledgeName(), R.id.operator_dob, o.getSledgeDOB(), R.id.operator_height, o.getSledgeHeight(), R.id.operator_weight, o.getSledgeWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getSledgeImage(), o.getSledgeSpeed(),
                    R.id.operator_background, o.getSledgeBG(), R.id.operator_training, o.getSledgeTR(), R.id.operator_profile, o.getSledgePR(), R.id.operator_experience, o.getSledgeEX(), R.id.operator_notes, o.getSledgeNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thatcher")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getThatcherName(),
                    R.id.operator_dob, o.getThatcherDOB(),
                    R.id.operator_height, o.getThatcherHeight(),
                    R.id.operator_weight, o.getThatcherWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getThatcherImage(), o.getThatcherSpeed(),
                    R.id.operator_background, o.getThatcherBG(), R.id.operator_training, o.getThatcherTR(), R.id.operator_profile, o.getThatcherPR(), R.id.operator_experience, o.getThatcherEX(), R.id.operator_notes, o.getThatcherNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ash")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getAshName(),
                    R.id.operator_dob, o.getAshDOB(),
                    R.id.operator_height, o.getAshHeight(),
                    R.id.operator_weight, o.getAshWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getAshImage(), o.getAshSpeed(),
                    R.id.operator_background, o.getAshBG(), R.id.operator_training, o.getAshTR(), R.id.operator_profile, o.getAshPR(), R.id.operator_experience, o.getAshEX(), R.id.operator_notes, o.getAshNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("thermite")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getThermiteName(),
                    R.id.operator_dob, o.getThermiteDOB(),
                    R.id.operator_height, o.getThermiteHeight(),
                    R.id.operator_weight, o.getThermiteWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getThermiteImage(), o.getThermiteSpeed(),
                    R.id.operator_background, o.getThermiteBG(), R.id.operator_training, o.getThermiteTR(), R.id.operator_profile, o.getThermitePR(), R.id.operator_experience, o.getThermiteEX(), R.id.operator_notes, o.getThermiteNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("twitch")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getTwitchName(),
                    R.id.operator_dob, o.getTwitchDOB(),
                    R.id.operator_height, o.getTwitchHeight(),
                    R.id.operator_weight, o.getTwitchWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getTwitchImage(), o.getTwitchSpeed(),
                    R.id.operator_background, o.getTwitchBG(), R.id.operator_training, o.getTwitchTR(), R.id.operator_profile, o.getTwitchPR(), R.id.operator_experience, o.getTwitchEX(), R.id.operator_notes, o.getTwitchNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("montagne")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getMontagneName(),
                    R.id.operator_dob, o.getMontagneDOB(),
                    R.id.operator_height, o.getMontagneHeight(),
                    R.id.operator_weight, o.getMontagneWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getMontagneImage(), o.getMontagneSpeed(),
                    R.id.operator_background, o.getMontagneBG(), R.id.operator_training, o.getMontagneTR(), R.id.operator_profile, o.getMontagnePR(), R.id.operator_experience, o.getMontagneEX(), R.id.operator_notes, o.getMontagneNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("glaz")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getGlazName(),
                    R.id.operator_dob, o.getGlazDOB(),
                    R.id.operator_height, o.getGlazHeight(),
                    R.id.operator_weight, o.getGlazWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getGlazImage(), o.getGlazSpeed(),
                    R.id.operator_background, o.getGlazBG(), R.id.operator_training, o.getGlazTR(), R.id.operator_profile, o.getGlazPR(), R.id.operator_experience, o.getGlazEX(), R.id.operator_notes, o.getGlazNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("fuze")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getFuzeName(),
                    R.id.operator_dob, o.getFuzeDOB(),
                    R.id.operator_height, o.getFuzeHeight(),
                    R.id.operator_weight, o.getFuzeWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getFuzeImage(), o.getFuzeSpeed(),
                    R.id.operator_background, o.getFuzeBG(), R.id.operator_training, o.getFuzeTR(), R.id.operator_profile, o.getFuzePR(), R.id.operator_experience, o.getFuzeEX(), R.id.operator_notes, o.getFuzeNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blitz")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getBlitzName(),
                    R.id.operator_dob, o.getBlitzDOB(),
                    R.id.operator_height, o.getBlitzHeight(),
                    R.id.operator_weight, o.getBlitzWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getBlitzImage(), o.getBlitzSpeed(),
                    R.id.operator_background, o.getBlitzBG(), R.id.operator_training, o.getBlitzTR(), R.id.operator_profile, o.getBlitzPR(), R.id.operator_experience, o.getBlitzEX(), R.id.operator_notes, o.getBlitzNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("iq")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getIqName(),
                    R.id.operator_dob, o.getIqDOB(),
                    R.id.operator_height, o.getIqHeight(),
                    R.id.operator_weight, o.getIqWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getIqImage(), o.getIqSpeed(),
                    R.id.operator_background, o.getIqBG(), R.id.operator_training, o.getIqTR(), R.id.operator_profile, o.getIqPR(), R.id.operator_experience, o.getIqEX(), R.id.operator_notes, o.getIqNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("buck")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getBuckName(),
                    R.id.operator_dob, o.getBuckDOB(),
                    R.id.operator_height, o.getBuckHeight(),
                    R.id.operator_weight, o.getBuckWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getBuckImage(), o.getBuckSpeed(),
                    R.id.operator_background, o.getBuckBG(), R.id.operator_training, o.getBuckTR(), R.id.operator_profile, o.getBuckPR(), R.id.operator_experience, o.getBuckEX(), R.id.operator_notes, o.getBuckNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("blackbeard")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getBlackbeardName(),
                    R.id.operator_dob, o.getBlackbeardDOB(),
                    R.id.operator_height, o.getBlackbeardHeight(),
                    R.id.operator_weight, o.getBlackbeardWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getBlackbeardImage(), o.getBlackbeardSpeed(),
                    R.id.operator_background, o.getBlackbeardBG(), R.id.operator_training, o.getBlackbeardTR(), R.id.operator_profile, o.getBlackbeardPR(), R.id.operator_experience, o.getBlackbeardEX(), R.id.operator_notes, o.getBlackbeardNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("capitao")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getCapitaoName(),
                    R.id.operator_dob, o.getCapitaoDOB(),
                    R.id.operator_height, o.getCapitaoHeight(),
                    R.id.operator_weight, o.getCapitaoWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getCapitaoImage(), o.getCapitaoSpeed(),
                    R.id.operator_background, o.getCapitaoBG(), R.id.operator_training, o.getCapitaoTR(), R.id.operator_profile, o.getCapitaoPR(), R.id.operator_experience, o.getCapitaoEX(), R.id.operator_notes, o.getCapitaoNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("hibana")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getHibanaName(),
                    R.id.operator_dob, o.getHibanaDOB(),
                    R.id.operator_height, o.getHibanaHeight(),
                    R.id.operator_weight, o.getHibanaWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getHibanaImage(), o.getHibanaSpeed(),
                    R.id.operator_background, o.getHibanaBG(), R.id.operator_training, o.getHibanaTR(), R.id.operator_profile, o.getHibanaPR(), R.id.operator_experience, o.getHibanaEX(), R.id.operator_notes, o.getHibanaNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jackal")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getJackalName(),
                    R.id.operator_dob, o.getJackalDOB(),
                    R.id.operator_height, o.getJackalHeight(),
                    R.id.operator_weight, o.getJackalWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getJackalImage(), o.getJackalSpeed(),
                    R.id.operator_background, o.getJackalBG(), R.id.operator_training, o.getJackalTR(), R.id.operator_profile, o.getJackalPR(), R.id.operator_experience, o.getJackalEX(), R.id.operator_notes, o.getJackalNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ying")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getYingName(),
                    R.id.operator_dob, o.getYingDOB(),
                    R.id.operator_height, o.getYingHeight(),
                    R.id.operator_weight, o.getYingWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getYingImage(), o.getYingSpeed(),
                    R.id.operator_background, o.getYingBG(), R.id.operator_training, o.getYingTR(), R.id.operator_profile, o.getYingPR(), R.id.operator_experience, o.getYingEX(), R.id.operator_notes, o.getYingNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("zofia")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getZofiaName(),
                    R.id.operator_dob, o.getZofiaDOB(),
                    R.id.operator_height, o.getZofiaHeight(),
                    R.id.operator_weight, o.getZofiaWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getZofiaImage(), o.getZofiaSpeed(),
                    R.id.operator_background, o.getZofiaBG(), R.id.operator_training, o.getZofiaTR(), R.id.operator_profile, o.getZofiaPR(), R.id.operator_experience, o.getZofiaEX(), R.id.operator_notes, o.getZofiaNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("dokkaebi")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getDokkaebiName(),
                    R.id.operator_dob, o.getDokkaebiDOB(),
                    R.id.operator_height, o.getDokkaebiHeight(),
                    R.id.operator_weight, o.getDokkaebiWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getDokkaebiImage(), o.getDokkaebiSpeed(),
                    R.id.operator_background, o.getDokkaebiBG(), R.id.operator_training, o.getDokkaebiTR(), R.id.operator_profile, o.getDokkaebiPR(), R.id.operator_experience, o.getDokkaebiEX(), R.id.operator_notes, o.getDokkaebiNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lion")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getLionName(),
                    R.id.operator_dob, o.getLionDOB(),
                    R.id.operator_height, o.getLionHeight(),
                    R.id.operator_weight, o.getLionWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getLionImage(), o.getLionSpeed(),
                    R.id.operator_background, o.getLionBG(), R.id.operator_training, o.getLionTR(), R.id.operator_profile, o.getLionPR(), R.id.operator_experience, o.getLionEX(), R.id.operator_notes, o.getLionNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("finka")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getFinkaName(),
                    R.id.operator_dob, o.getFinkaDOB(),
                    R.id.operator_height, o.getFinkaHeight(),
                    R.id.operator_weight, o.getFinkaWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getFinkaImage(), o.getFinkaSpeed(),
                    R.id.operator_background, o.getFinkaBG(), R.id.operator_training, o.getFinkaTR(), R.id.operator_profile, o.getFinkaPR(), R.id.operator_experience, o.getFinkaEX(), R.id.operator_notes, o.getFinkaNO());
        }


        // DEFENDERS

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("smoke")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getSmokeName(),
                    R.id.operator_dob, o.getSmokeDOB(),
                    R.id.operator_height, o.getSmokeHeight(),
                    R.id.operator_weight, o.getSmokeWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getSmokeImage(), o.getSmokeSpeed(),
                    R.id.operator_background, o.getSmokeBG(), R.id.operator_training, o.getSmokeTR(), R.id.operator_profile, o.getSmokePR(), R.id.operator_experience, o.getSmokeEX(), R.id.operator_notes, o.getSmokeNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mute")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getMuteName(),
                    R.id.operator_dob, o.getMuteDOB(),
                    R.id.operator_height, o.getMuteHeight(),
                    R.id.operator_weight, o.getMuteWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getMuteImage(), o.getMuteSpeed(),
                    R.id.operator_background, o.getMuteBG(), R.id.operator_training, o.getMuteTR(), R.id.operator_profile, o.getMutePR(), R.id.operator_experience, o.getMuteEX(), R.id.operator_notes, o.getMuteNO());
        }

        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("castle")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getCastleName(),
                    R.id.operator_dob, o.getCastleDOB(),
                    R.id.operator_height, o.getCastleHeight(),
                    R.id.operator_weight, o.getCastleWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getCastleImage(), o.getCastleSpeed(),
                    R.id.operator_background, o.getCastleBG(), R.id.operator_training, o.getCastleTR(), R.id.operator_profile, o.getCastlePR(), R.id.operator_experience, o.getCastleEX(), R.id.operator_notes, o.getCastleNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("pulse")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getPulseName(),
                    R.id.operator_dob, o.getPulseDOB(),
                    R.id.operator_height, o.getPulseHeight(),
                    R.id.operator_weight, o.getPulseWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getPulseImage(), o.getPulseSpeed(),
                    R.id.operator_background, o.getPulseBG(), R.id.operator_training, o.getPulseTR(), R.id.operator_profile, o.getPulsePR(), R.id.operator_experience, o.getPulseEX(), R.id.operator_notes, o.getPulseNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("doc")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getDocName(),
                    R.id.operator_dob, o.getDocDOB(),
                    R.id.operator_height, o.getDocHeight(),
                    R.id.operator_weight, o.getDocWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getDocImage(), o.getDocSpeed(),
                    R.id.operator_background, o.getDocBG(), R.id.operator_training, o.getDocTR(), R.id.operator_profile, o.getDocPR(), R.id.operator_experience, o.getDocEX(), R.id.operator_notes, o.getDocNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("rook")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getRookName(),
                    R.id.operator_dob, o.getRookDOB(),
                    R.id.operator_height, o.getRookHeight(),
                    R.id.operator_weight, o.getRookWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getRookImage(), o.getRookSpeed(),
                    R.id.operator_background, o.getRookBG(), R.id.operator_training, o.getRookTR(), R.id.operator_profile, o.getRookPR(), R.id.operator_experience, o.getRookEX(), R.id.operator_notes, o.getRookNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("kapkan")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getKapkanName(),
                    R.id.operator_dob, o.getKapkanDOB(),
                    R.id.operator_height, o.getKapkanHeight(),
                    R.id.operator_weight, o.getKapkanWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getKapkanImage(), o.getKapkanSpeed(),
                    R.id.operator_background, o.getKapkanBG(), R.id.operator_training, o.getKapkanTR(), R.id.operator_profile, o.getKapkanPR(), R.id.operator_experience, o.getKapkanEX(), R.id.operator_notes, o.getKapkanNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("tachanka")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getTachankaName(),
                    R.id.operator_dob, o.getTachankaDOB(),
                    R.id.operator_height, o.getTachankaHeight(),
                    R.id.operator_weight, o.getTachankaWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getTachankaImage(), o.getTachankaSpeed(),
                    R.id.operator_background, o.getTachankaBG(), R.id.operator_training, o.getTachankaTR(), R.id.operator_profile, o.getTachankaPR(), R.id.operator_experience, o.getTachankaEX(), R.id.operator_notes, o.getTachankaNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("jager")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getJagerName(),
                    R.id.operator_dob, o.getJagerDOB(),
                    R.id.operator_height, o.getJagerHeight(),
                    R.id.operator_weight, o.getJagerWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getJagerImage(), o.getJagerSpeed(),
                    R.id.operator_background, o.getJagerBG(), R.id.operator_training, o.getJagerTR(), R.id.operator_profile, o.getJagerPR(), R.id.operator_experience, o.getJagerEX(), R.id.operator_notes, o.getJagerNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("bandit")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getBanditName(),
                    R.id.operator_dob, o.getBanditDOB(),
                    R.id.operator_height, o.getBanditHeight(),
                    R.id.operator_weight, o.getBanditWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getBanditImage(), o.getBanditSpeed(),
                    R.id.operator_background, o.getBanditBG(), R.id.operator_training, o.getBanditTR(), R.id.operator_profile, o.getBanditPR(), R.id.operator_experience, o.getBanditEX(), R.id.operator_notes, o.getBanditNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("frost")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getFrostName(),
                    R.id.operator_dob, o.getFrostDOB(),
                    R.id.operator_height, o.getFrostHeight(),
                    R.id.operator_weight, o.getFrostWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getFrostImage(), o.getFrostSpeed(),
                    R.id.operator_background, o.getFrostBG(), R.id.operator_training, o.getFrostTR(), R.id.operator_profile, o.getFrostPR(), R.id.operator_experience, o.getFrostEX(), R.id.operator_notes, o.getFrostNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("valkyrie")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getValkyrieName(),
                    R.id.operator_dob, o.getValkyrieDOB(),
                    R.id.operator_height, o.getValkyrieHeight(),
                    R.id.operator_weight, o.getValkyrieWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getValkyrieImage(), o.getValkyrieSpeed(),
                    R.id.operator_background, o.getValkyrieBG(), R.id.operator_training, o.getValkyrieTR(), R.id.operator_profile, o.getValkyriePR(), R.id.operator_experience, o.getValkyrieEX(), R.id.operator_notes, o.getValkyrieNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("caveira")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getCaveiraName(),
                    R.id.operator_dob, o.getCaveiraDOB(),
                    R.id.operator_height, o.getCaveiraHeight(),
                    R.id.operator_weight, o.getCaveiraWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getCaveiraImage(), o.getCaveiraSpeed(),
                    R.id.operator_background, o.getCaveiraBG(), R.id.operator_training, o.getCaveiraTR(), R.id.operator_profile, o.getCaveiraPR(), R.id.operator_experience, o.getCaveiraEX(), R.id.operator_notes, o.getCaveiraNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("echo")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getEchoName(),
                    R.id.operator_dob, o.getEchoDOB(),
                    R.id.operator_height, o.getEchoHeight(),
                    R.id.operator_weight, o.getEchoWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getEchoImage(), o.getEchoSpeed(),
                    R.id.operator_background, o.getEchoBG(), R.id.operator_training, o.getEchoTR(), R.id.operator_profile, o.getEchoPR(), R.id.operator_experience, o.getEchoEX(), R.id.operator_notes, o.getEchoNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("mira")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getMiraName(),
                    R.id.operator_dob, o.getMiraDOB(),
                    R.id.operator_height, o.getMiraHeight(),
                    R.id.operator_weight, o.getMiraWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getMiraImage(), o.getMiraSpeed(),
                    R.id.operator_background, o.getMiraBG(), R.id.operator_training, o.getMiraTR(), R.id.operator_profile, o.getMiraPR(), R.id.operator_experience, o.getMiraEX(), R.id.operator_notes, o.getMiraNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("lesion")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getLesionName(),
                    R.id.operator_dob, o.getLesionDOB(),
                    R.id.operator_height, o.getLesionHeight(),
                    R.id.operator_weight, o.getLesionWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getLesionImage(), o.getLesionSpeed(),
                    R.id.operator_background, o.getLesionBG(), R.id.operator_training, o.getLesionTR(), R.id.operator_profile, o.getLesionPR(), R.id.operator_experience, o.getLesionEX(), R.id.operator_notes, o.getLesionNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("ela")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getElaName(),
                    R.id.operator_dob, o.getElaDOB(),
                    R.id.operator_height, o.getElaHeight(),
                    R.id.operator_weight, o.getElaWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getElaImage(), o.getElaSpeed(),
                    R.id.operator_background, o.getElaBG(), R.id.operator_training, o.getElaTR(), R.id.operator_profile, o.getElaPR(), R.id.operator_experience, o.getElaEX(), R.id.operator_notes, o.getElaNO());
        }


        if (OperatorActivity.mOperatorTAG.equalsIgnoreCase("vigil")) {

            zUtils.setOperatorInfoFragment(getActivity(),
                    view, R.id.operator_name, o.getVigilName(),
                    R.id.operator_dob, o.getVigilDOB(),
                    R.id.operator_height, o.getVigilHeight(),
                    R.id.operator_weight, o.getVigilWeight(),
                    R.id.operator_image, R.id.operator_speed, o.getVigilImage(), o.getVigilSpeed(),
                    R.id.operator_background, o.getVigilBG(), R.id.operator_training, o.getVigilTR(), R.id.operator_profile, o.getVigilPR(), R.id.operator_experience, o.getVigilEX(), R.id.operator_notes, o.getVigilNO());
        }


        return view;
    }


    //Setup layout for Operator info

    public int getOperatorLayout() {

        return R.layout.fragment_operator_info;

    }




}
