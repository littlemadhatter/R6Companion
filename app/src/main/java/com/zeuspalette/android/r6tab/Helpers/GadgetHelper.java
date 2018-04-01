package com.zeuspalette.android.r6tab.Helpers;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.R;

/**
 * Created by Jeeva on 11-03-2018.
 */

public class GadgetHelper {

    private Activity mActivity;
    private ZUtils zUtils;
    private LayoutInflater mLayoutInflater;

    public GadgetHelper(Activity activity) {


        mActivity = activity;
        zUtils = new ZUtils();

    }

    public String getS(int id) {

        return mActivity.getResources().getString(id);
    }

    public void setOperatorGadget(Activity activity, View view, String gadgetTitleT, String gadgetBylineT, String gadgetDescT, String gadgetOneT, String gadgetTwoT, String gadgetThreeT, String gadgetSecOneT, String gadgetSecOneCountT, String gadgetSecTwoT, String gadgetSecTwoCountT,
                                  int gadgetImageI, int gadgetSecOneImageI, int gadgetSecTwoImageI, boolean removeGadgetTwo, boolean removeGadgetThree, String tipsT) {

        ImageView gadgetImage = view.findViewById(R.id.gadget_image);
        ImageView gadgetSecOneImage = view.findViewById(R.id.gadget_sec_one_image);
        ImageView gadgetSecTwoImage = view.findViewById(R.id.gadget_sec_two_image);
        TextView gadgetTitle = view.findViewById(R.id.gadget_title);
        TextView gadgetByline = view.findViewById(R.id.gadget_byline);
        TextView gadgetDesc = view.findViewById(R.id.gadget_desc);
        TextView gadgetOne = view.findViewById(R.id.gadget_one);
        TextView gadgetTwo = view.findViewById(R.id.gadget_two);
        TextView gadgetThree = view.findViewById(R.id.gadget_three);
        TextView gadgetSecOne = view.findViewById(R.id.gadget_sec_one);
        TextView gadgetSecTwo = view.findViewById(R.id.gadget_sec_two);
        TextView gadgetSecOneCount = view.findViewById(R.id.gadget_sec_one_count);
        TextView gadgetSecTwoCount = view.findViewById(R.id.gadget_sec_two_count);
        TextView gadgetTips = view.findViewById(R.id.gadget_tip);
        ViewGroup gadgetTwoLin = view.findViewById(R.id.linear_two);
        ViewGroup gadgetThreeLin = view.findViewById(R.id.linear_three);


        gadgetTitle.setText(gadgetTitleT);
        gadgetByline.setText(gadgetBylineT);
        gadgetDesc.setText(gadgetDescT);
        gadgetOne.setText(gadgetOneT);
        gadgetTwo.setText(gadgetTwoT);
        gadgetThree.setText(gadgetThreeT);
        gadgetSecOne.setText(gadgetSecOneT);
        gadgetSecTwo.setText(gadgetSecTwoT);
        gadgetSecOneCount.setText(gadgetSecOneCountT);
        gadgetSecTwoCount.setText(gadgetSecTwoCountT);
        gadgetTips.setText(tipsT);


        if (removeGadgetTwo) {
            gadgetTwoLin.setVisibility(View.GONE);
        }

        if (removeGadgetThree) {
            gadgetThreeLin.setVisibility(View.GONE);
        }

        Picasso.with(activity).load(gadgetImageI).resize(zUtils.getPixelfromDP(activity,380),zUtils.getPixelfromDP(activity,204)).into(gadgetImage);
        Picasso.with(activity).load(gadgetSecOneImageI).resize(zUtils.getPixelfromDP(activity,150),zUtils.getPixelfromDP(activity,150)).into(gadgetSecOneImage);
        Picasso.with(activity).load(gadgetSecTwoImageI).resize(zUtils.getPixelfromDP(activity,150),zUtils.getPixelfromDP(activity,150)).into(gadgetSecTwoImage);


    }

    public void setOperatorGadget(Activity activity, View view, String gadgetTitleT, String gadgetBylineT, String gadgetDescT, String gadgetOneT, String gadgetTwoT, String gadgetThreeT, String gadgetSecOneT, String gadgetSecOneCountT, String gadgetSecTwoT, String gadgetSecTwoCountT,
                                  int gadgetImageI, int gadgetSecOneImageI, int gadgetSecTwoImageI, boolean removeGadgetTwo, boolean removeGadgetThree) {

        ImageView gadgetImage = view.findViewById(R.id.gadget_image);
        ImageView gadgetSecOneImage = view.findViewById(R.id.gadget_sec_one_image);
        ImageView gadgetSecTwoImage = view.findViewById(R.id.gadget_sec_two_image);
        TextView gadgetTitle = view.findViewById(R.id.gadget_title);
        TextView gadgetByline = view.findViewById(R.id.gadget_byline);
        TextView gadgetDesc = view.findViewById(R.id.gadget_desc);
        TextView gadgetOne = view.findViewById(R.id.gadget_one);
        TextView gadgetTwo = view.findViewById(R.id.gadget_two);
        TextView gadgetThree = view.findViewById(R.id.gadget_three);
        TextView gadgetSecOne = view.findViewById(R.id.gadget_sec_one);
        TextView gadgetSecTwo = view.findViewById(R.id.gadget_sec_two);
        TextView gadgetSecOneCount = view.findViewById(R.id.gadget_sec_one_count);
        TextView gadgetSecTwoCount = view.findViewById(R.id.gadget_sec_two_count);
        TextView gadgetTips = view.findViewById(R.id.gadget_tip);
        ViewGroup gadgetTwoLin = view.findViewById(R.id.linear_two);
        ViewGroup gadgetThreeLin = view.findViewById(R.id.linear_three);


        gadgetTitle.setText(gadgetTitleT);
        gadgetByline.setText(gadgetBylineT);
        gadgetDesc.setText(gadgetDescT);
        gadgetOne.setText(gadgetOneT);
        gadgetTwo.setText(gadgetTwoT);
        gadgetThree.setText(gadgetThreeT);
        gadgetSecOne.setText(gadgetSecOneT);
        gadgetSecTwo.setText(gadgetSecTwoT);
        gadgetSecOneCount.setText(gadgetSecOneCountT);
        gadgetSecTwoCount.setText(gadgetSecTwoCountT);



        if (removeGadgetTwo) {
            gadgetTwoLin.setVisibility(View.GONE);
        }

        if (removeGadgetThree) {
            gadgetThreeLin.setVisibility(View.GONE);
        }

        Picasso.with(activity).load(gadgetImageI).resize(zUtils.getPixelfromDP(activity,400),zUtils.getPixelfromDP(activity,215)).into(gadgetImage);
        Picasso.with(activity).load(gadgetSecOneImageI).resize(zUtils.getPixelfromDP(activity,150),zUtils.getPixelfromDP(activity,150)).into(gadgetSecOneImage);
        Picasso.with(activity).load(gadgetSecTwoImageI).resize(zUtils.getPixelfromDP(activity,150),zUtils.getPixelfromDP(activity,150)).into(gadgetSecTwoImage);

    }

    //Sledge
    public String getSledgeGadgetTitle() {
        return getS(R.string.sledge_gadget_name);
    }

    public String getSledgeGadgetByline() {
        return getS(R.string.sledge_gadget_name_byline);
    }

    public String getSledgeGadgetDesc() {
        return getS(R.string.sledge_gadget);
    }

    public String getSledgeGadgetOne() {
        return getS(R.string.sledge_gadget_one);
    }

    public String getSledgeGadgetTwo() {
        return getS(R.string.sledge_gadget_two);
    }

    public String getSledgeGadgetThree() {
        return getS(R.string.sledge_gadget_three);
    }

    public String getSledgeGadgetTips() {
        return getS(R.string.sledge_tip);
    }

    public String getSledgeGadgetSecOne() {
        return "Grenade";
    }

    public String getSledgeGadgetSecOneCount() {
        return "2";
    }

    public String getSledgeGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getSledgeGadgetSecTwoCount() {
        return "3";
    }

    public void setSledgeOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getSledgeGadgetTitle(), getSledgeGadgetByline(), getSledgeGadgetDesc(), getSledgeGadgetOne(), getSledgeGadgetTwo(), getSledgeGadgetThree(), getSledgeGadgetSecOne(), getSledgeGadgetSecOneCount(), getSledgeGadgetSecTwo(), getSledgeGadgetSecTwoCount(),
                R.drawable.sledge_gadget, R.drawable.r_grenade, R.drawable.r_stun, false, false, getSledgeGadgetTips());
    }


    //Thatcher
    public String getThatcherGadgetTitle() {
        return getS(R.string.thatcher_gadget_name);
    }

    public String getThatcherGadgetByline() {
        return getS(R.string.thatcher_gadget_name_byline);
    }

    public String getThatcherGadgetDesc() {
        return getS(R.string.thatcher_gadget);
    }

    public String getThatcherGadgetOne() {
        return getS(R.string.thatcher_gadget_one);
    }

    public String getThatcherGadgetTwo() {
        return getS(R.string.thatcher_gadget_two);
    }

    public String getThatcherGadgetTips() {
        return getS(R.string.thatcher_tip);
    }

    public String getThatcherGadgetThree() {
        return "";
    }

    public String getThatcherGadgetSecOne() {
        return "Breach";
    }

    public String getThatcherGadgetSecOneCount() {
        return "3";
    }

    public String getThatcherGadgetSecTwo() {
        return "Claymore";
    }


    public String getThatcherGadgetSecTwoCount() {
        return "1";
    }

    public void setThatcherOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getThatcherGadgetTitle(), getThatcherGadgetByline(), getThatcherGadgetDesc(), getThatcherGadgetOne(), getThatcherGadgetTwo(), getThatcherGadgetThree(), getThatcherGadgetSecOne(), getThatcherGadgetSecOneCount(), getThatcherGadgetSecTwo(), getThatcherGadgetSecTwoCount(),
                R.drawable.thatcher_gadget, R.drawable.r_breach, R.drawable.r_claymore, false, true, getThatcherGadgetTips());
    }


    //Twitch
    public String getTwitchGadgetTitle() {
        return getS(R.string.twitch_gadget_name);
    }

    public String getTwitchGadgetByline() {
        return getS(R.string.twitch_gadget_name_byline);
    }

    public String getTwitchGadgetDesc() {
        return getS(R.string.twitch_gadget);
    }

    public String getTwitchGadgetOne() {
        return getS(R.string.twitch_gadget_one);
    }

    public String getTwitchGadgetTwo() {
        return getS(R.string.twitch_gadget_two);
    }

    public String getTwitchGadgetTips() {
        return getS(R.string.twitch_tip);
    }

    public String getTwitchGadgetThree() {
        return "";
    }

    public String getTwitchGadgetSecOne() {
        return "Breach";
    }

    public String getTwitchGadgetSecOneCount() {
        return "3";
    }

    public String getTwitchGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getTwitchGadgetSecTwoCount() {
        return "3";
    }

    public void setTwitchOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getTwitchGadgetTitle(), getTwitchGadgetByline(), getTwitchGadgetDesc(), getTwitchGadgetOne(), getTwitchGadgetTwo(), getTwitchGadgetThree(), getTwitchGadgetSecOne(), getTwitchGadgetSecOneCount(), getTwitchGadgetSecTwo(), getTwitchGadgetSecTwoCount(),
                R.drawable.twitch_gadget, R.drawable.r_breach, R.drawable.r_stun, false, true, getTwitchGadgetTips());
    }

    //Ash
    public String getAshGadgetTitle() {
        return getS(R.string.ash_gadget_name);
    }

    public String getAshGadgetByline() {
        return getS(R.string.ash_gadget_name_byline);
    }

    public String getAshGadgetDesc() {
        return getS(R.string.ash_gadget);
    }

    public String getAshGadgetOne() {
        return getS(R.string.ash_gadget_one);
    }

    public String getAshGadgetTwo() {
        return getS(R.string.ash_gadget_two);
    }

    public String getAshGadgetTips() {
        return getS(R.string.ash_tip);
    }

    public String getAshGadgetThree() {
        return "";
    }

    public String getAshGadgetSecOne() {
        return "Breach";
    }

    public String getAshGadgetSecOneCount() {
        return "3";
    }

    public String getAshGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getAshGadgetSecTwoCount() {
        return "3";
    }

    public void setAshOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getAshGadgetTitle(), getAshGadgetByline(), getAshGadgetDesc(), getAshGadgetOne(), getAshGadgetTwo(), getAshGadgetThree(), getAshGadgetSecOne(), getAshGadgetSecOneCount(), getAshGadgetSecTwo(), getAshGadgetSecTwoCount(),
                R.drawable.ash_gadget, R.drawable.r_breach, R.drawable.r_stun, false, true, getAshGadgetTips());
    }


    //Thermite
    public String getThermiteGadgetTitle() {
        return getS(R.string.thermite_gadget_name);
    }

    public String getThermiteGadgetByline() {
        return getS(R.string.thermite_gadget_name_byline);
    }

    public String getThermiteGadgetDesc() {
        return getS(R.string.thermite_gadget);
    }

    public String getThermiteGadgetOne() {
        return getS(R.string.thermite_gadget_one);
    }

    public String getThermiteGadgetTwo() {
        return getS(R.string.thermite_gadget_two);
    }

    public String getThermiteGadgetTips() {
        return getS(R.string.thermite_tip);
    }

    public String getThermiteGadgetThree() {
        return "";
    }

    public String getThermiteGadgetSecOne() {
        return "Claymore";
    }

    public String getThermiteGadgetSecOneCount() {
        return "1";
    }

    public String getThermiteGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getThermiteGadgetSecTwoCount() {
        return "3";
    }

    public void setThermiteOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getThermiteGadgetTitle(), getThermiteGadgetByline(), getThermiteGadgetDesc(), getThermiteGadgetOne(), getThermiteGadgetTwo(), getThermiteGadgetThree(), getThermiteGadgetSecOne(), getThermiteGadgetSecOneCount(), getThermiteGadgetSecTwo(), getThermiteGadgetSecTwoCount(),
                R.drawable.thermite_gadget, R.drawable.r_claymore, R.drawable.r_stun, false, true, getThermiteGadgetTips());
    }

    //Montagne
    public String getMontagneGadgetTitle() {
        return getS(R.string.montagne_gadget_name);
    }

    public String getMontagneGadgetByline() {
        return getS(R.string.montagne_gadget_name_byline);
    }

    public String getMontagneGadgetDesc() {
        return getS(R.string.montagne_gadget);
    }

    public String getMontagneGadgetOne() {
        return getS(R.string.montagne_gadget_one);
    }

    public String getMontagneGadgetTwo() {
        return getS(R.string.montagne_gadget_two);
    }

    public String getMontagneGadgetThree() {
        return getS(R.string.montagne_gadget_three);
    }

    public String getMontagneGadgetTips() {
        return getS(R.string.montagne_tip);
    }

    public String getMontagneGadgetSecOne() {
        return "Stun Grenade";
    }

    public String getMontagneGadgetSecOneCount() {
        return "3";
    }

    public String getMontagneGadgetSecTwo() {
        return "Smoke";
    }


    public String getMontagneGadgetSecTwoCount() {
        return "1";
    }

    public void setMontagneOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getMontagneGadgetTitle(), getMontagneGadgetByline(), getMontagneGadgetDesc(), getMontagneGadgetOne(), getMontagneGadgetTwo(), getMontagneGadgetThree(), getMontagneGadgetSecOne(), getMontagneGadgetSecOneCount(), getMontagneGadgetSecTwo(), getMontagneGadgetSecTwoCount(),
                R.drawable.montagne_gadget, R.drawable.r_stun, R.drawable.r_smoke, false, true, getMontagneGadgetTips());
    }

    //Glaz
    public String getGlazGadgetTitle() {
        return getS(R.string.glaz_gadget_name);
    }

    public String getGlazGadgetByline() {
        return getS(R.string.glaz_gadget_name_byline);
    }

    public String getGlazGadgetDesc() {
        return getS(R.string.glaz_gadget);
    }

    public String getGlazGadgetOne() {
        return getS(R.string.glaz_gadget_one);
    }

    public String getGlazGadgetTips() {
        return getS(R.string.glaz_tip);
    }

    public String getGlazGadgetTwo() {
        return "";
    }

    public String getGlazGadgetThree() {
        return "";
    }

    public String getGlazGadgetSecOne() {
        return "Claymore";
    }

    public String getGlazGadgetSecOneCount() {
        return "1";
    }

    public String getGlazGadgetSecTwo() {
        return "Smoke";
    }


    public String getGlazGadgetSecTwoCount() {
        return "2";
    }

    public void setGlazOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getGlazGadgetTitle(), getGlazGadgetByline(), getGlazGadgetDesc(), getGlazGadgetOne(), getGlazGadgetTwo(), getGlazGadgetThree(), getGlazGadgetSecOne(), getGlazGadgetSecOneCount(), getGlazGadgetSecTwo(), getGlazGadgetSecTwoCount(),
                R.drawable.glaz_gadget, R.drawable.r_claymore, R.drawable.r_smoke, true, true, getGlazGadgetTips());
    }


    //Fuze
    public String getFuzeGadgetTitle() {
        return getS(R.string.fuze_gadget_name);
    }

    public String getFuzeGadgetByline() {
        return getS(R.string.fuze_gadget_name_byline);
    }

    public String getFuzeGadgetDesc() {
        return getS(R.string.fuze_gadget);
    }

    public String getFuzeGadgetOne() {
        return getS(R.string.fuze_gadget_one);
    }

    public String getFuzeGadgetTwo() {
        return getS(R.string.fuze_gadget_two);
    }

    public String getFuzeGadgetTips() {
        return getS(R.string.fuze_tip);
    }

    public String getFuzeGadgetThree() {
        return "";
    }

    public String getFuzeGadgetSecOne() {
        return "Breach";
    }

    public String getFuzeGadgetSecOneCount() {
        return "3";
    }

    public String getFuzeGadgetSecTwo() {
        return "Smoke";
    }


    public String getFuzeGadgetSecTwoCount() {
        return "2";
    }

    public void setFuzeOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getFuzeGadgetTitle(), getFuzeGadgetByline(), getFuzeGadgetDesc(), getFuzeGadgetOne(), getFuzeGadgetTwo(), getFuzeGadgetThree(), getFuzeGadgetSecOne(), getFuzeGadgetSecOneCount(), getFuzeGadgetSecTwo(), getFuzeGadgetSecTwoCount(),
                R.drawable.fuze_gadget, R.drawable.r_breach, R.drawable.r_smoke, false, true, getFuzeGadgetTips());
    }


    //Blitz
    public String getBlitzGadgetTitle() {
        return getS(R.string.blitz_gadget_name);
    }

    public String getBlitzGadgetByline() {
        return getS(R.string.blitz_gadget_name_byline);
    }

    public String getBlitzGadgetDesc() {
        return getS(R.string.blitz_gadget);
    }

    public String getBlitzGadgetOne() {
        return getS(R.string.blitz_gadget_one);
    }

    public String getBlitzGadgetTwo() {
        return getS(R.string.blitz_gadget_two);
    }

    public String getBlitzGadgetTips() {
        return getS(R.string.blitz_tip);
    }

    public String getBlitzGadgetThree() {
        return "";
    }

    public String getBlitzGadgetSecOne() {
        return "Breach";
    }

    public String getBlitzGadgetSecOneCount() {
        return "3";
    }

    public String getBlitzGadgetSecTwo() {
        return "Smoke";
    }


    public String getBlitzGadgetSecTwoCount() {
        return "2";
    }

    public void setBlitzOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getBlitzGadgetTitle(), getBlitzGadgetByline(), getBlitzGadgetDesc(), getBlitzGadgetOne(), getBlitzGadgetTwo(), getBlitzGadgetThree(), getBlitzGadgetSecOne(), getBlitzGadgetSecOneCount(), getBlitzGadgetSecTwo(), getBlitzGadgetSecTwoCount(),
                R.drawable.blitz_gadget, R.drawable.r_breach, R.drawable.r_smoke, false, true, getBlitzGadgetTips());
    }


    //Iq
    public String getIqGadgetTitle() {
        return getS(R.string.iq_gadget_name);
    }

    public String getIqGadgetByline() {
        return getS(R.string.iq_gadget_name_byline);
    }

    public String getIqGadgetDesc() {
        return getS(R.string.iq_gadget);
    }

    public String getIqGadgetOne() {
        return getS(R.string.iq_gadget_one);
    }

    public String getIqGadgetTwo() {
        return getS(R.string.iq_gadget_two);
    }

    public String getIqGadgetTips() {
        return getS(R.string.iq_tip);
    }

    public String getIqGadgetThree() {
        return "";
    }

    public String getIqGadgetSecOne() {
        return "Breach";
    }

    public String getIqGadgetSecOneCount() {
        return "3";
    }

    public String getIqGadgetSecTwo() {
        return "Grenade";
    }


    public String getIqGadgetSecTwoCount() {
        return "2";
    }

    public void setIqOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getIqGadgetTitle(), getIqGadgetByline(), getIqGadgetDesc(), getIqGadgetOne(), getIqGadgetTwo(), getIqGadgetThree(), getIqGadgetSecOne(), getIqGadgetSecOneCount(), getIqGadgetSecTwo(), getIqGadgetSecTwoCount(),
                R.drawable.iq_gadget, R.drawable.r_breach, R.drawable.r_grenade, false, true, getIqGadgetTips());
    }


    //Buck
    public String getBuckGadgetTitle() {
        return getS(R.string.buck_gadget_name);
    }

    public String getBuckGadgetByline() {
        return getS(R.string.buck_gadget_name_byline);
    }

    public String getBuckGadgetDesc() {
        return getS(R.string.buck_gadget);
    }

    public String getBuckGadgetOne() {
        return getS(R.string.buck_gadget_one);
    }

    public String getBuckGadgetTwo() {
        return getS(R.string.buck_gadget_two);
    }

    public String getBuckGadgetTips() {
        return getS(R.string.buck_tip);
    }

    public String getBuckGadgetThree() {
        return "";
    }

    public String getBuckGadgetSecOne() {
        return "Stun Grenade";
    }

    public String getBuckGadgetSecOneCount() {
        return "3";
    }

    public String getBuckGadgetSecTwo() {
        return "Grenade";
    }


    public String getBuckGadgetSecTwoCount() {
        return "2";
    }

    public void setBuckOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getBuckGadgetTitle(), getBuckGadgetByline(), getBuckGadgetDesc(), getBuckGadgetOne(), getBuckGadgetTwo(), getBuckGadgetThree(), getBuckGadgetSecOne(), getBuckGadgetSecOneCount(), getBuckGadgetSecTwo(), getBuckGadgetSecTwoCount(),
                R.drawable.buck_gadget, R.drawable.r_stun, R.drawable.r_grenade, false, true, getBuckGadgetTips());
    }


    //Blackbeard
    public String getBlackbeardGadgetTitle() {
        return getS(R.string.blackbeard_gadget_name);
    }

    public String getBlackbeardGadgetByline() {
        return getS(R.string.blackbeard_gadget_name_byline);
    }

    public String getBlackbeardGadgetDesc() {
        return getS(R.string.blackbeard_gadget);
    }

    public String getBlackbeardGadgetOne() {
        return getS(R.string.blackbeard_gadget_one);
    }

    public String getBlackbeardGadgetTwo() {
        return getS(R.string.blackbeard_gadget_two);
    }

    public String getBlackbeardGadgetTips() {
        return getS(R.string.blackbeard_tip);
    }

    public String getBlackbeardGadgetThree() {
        return "";
    }

    public String getBlackbeardGadgetSecOne() {
        return "Breach";
    }

    public String getBlackbeardGadgetSecOneCount() {
        return "3";
    }

    public String getBlackbeardGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getBlackbeardGadgetSecTwoCount() {
        return "3";
    }

    public void setBlackbeardOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getBlackbeardGadgetTitle(), getBlackbeardGadgetByline(), getBlackbeardGadgetDesc(), getBlackbeardGadgetOne(), getBlackbeardGadgetTwo(), getBlackbeardGadgetThree(), getBlackbeardGadgetSecOne(), getBlackbeardGadgetSecOneCount(), getBlackbeardGadgetSecTwo(), getBlackbeardGadgetSecTwoCount(),
                R.drawable.blackbeard_gadget, R.drawable.r_breach, R.drawable.r_stun, false, true, getBlackbeardGadgetTips());
    }


    //Capitao
    public String getCapitaoGadgetTitle() {
        return getS(R.string.capitao_gadget_name);
    }

    public String getCapitaoGadgetByline() {
        return getS(R.string.capitao_gadget_name_byline);
    }

    public String getCapitaoGadgetDesc() {
        return getS(R.string.capitao_gadget);
    }

    public String getCapitaoGadgetOne() {
        return getS(R.string.capitao_gadget_one);
    }

    public String getCapitaoGadgetTips() {
        return getS(R.string.capitao_tip);
    }

    public String getCapitaoGadgetTwo() {
        return "";
    }

    public String getCapitaoGadgetThree() {
        return "";
    }

    public String getCapitaoGadgetSecOne() {
        return "Claymore";
    }

    public String getCapitaoGadgetSecOneCount() {
        return "1";
    }

    public String getCapitaoGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getCapitaoGadgetSecTwoCount() {
        return "3";
    }

    public void setCapitaoOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getCapitaoGadgetTitle(), getCapitaoGadgetByline(), getCapitaoGadgetDesc(), getCapitaoGadgetOne(), getCapitaoGadgetTwo(), getCapitaoGadgetThree(), getCapitaoGadgetSecOne(), getCapitaoGadgetSecOneCount(), getCapitaoGadgetSecTwo(), getCapitaoGadgetSecTwoCount(),
                R.drawable.capitao_gadget, R.drawable.r_claymore, R.drawable.r_stun, true, true, getCapitaoGadgetTips());
    }

    //Hibana
    public String getHibanaGadgetTitle() {
        return getS(R.string.hibana_gadget_name);
    }

    public String getHibanaGadgetByline() {
        return getS(R.string.hibana_gadget_name_byline);
    }

    public String getHibanaGadgetDesc() {
        return getS(R.string.hibana_gadget);
    }

    public String getHibanaGadgetOne() {
        return getS(R.string.hibana_gadget_one);
    }

    public String getHibanaGadgetTwo() {
        return getS(R.string.hibana_gadget_two);
    }

    public String getHibanaGadgetTips() {
        return getS(R.string.hibana_tip);
    }

    public String getHibanaGadgetThree() {
        return "";
    }

    public String getHibanaGadgetSecOne() {
        return "Claymore";
    }

    public String getHibanaGadgetSecOneCount() {
        return "1";
    }

    public String getHibanaGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getHibanaGadgetSecTwoCount() {
        return "3";
    }

    public void setHibanaOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getHibanaGadgetTitle(), getHibanaGadgetByline(), getHibanaGadgetDesc(), getHibanaGadgetOne(), getHibanaGadgetTwo(), getHibanaGadgetThree(), getHibanaGadgetSecOne(), getHibanaGadgetSecOneCount(), getHibanaGadgetSecTwo(), getHibanaGadgetSecTwoCount(),
                R.drawable.hibana_gadget, R.drawable.r_claymore, R.drawable.r_stun, false, true, getHibanaGadgetTips());
    }

    //Jackal
    public String getJackalGadgetTitle() {
        return getS(R.string.jackal_gadget_name);
    }

    public String getJackalGadgetByline() {
        return getS(R.string.jackal_gadget_name_byline);
    }

    public String getJackalGadgetDesc() {
        return getS(R.string.jackal_gadget);
    }

    public String getJackalGadgetOne() {
        return getS(R.string.jackal_gadget_one);
    }

    public String getJackalGadgetTwo() {
        return getS(R.string.jackal_gadget_two);
    }

    public String getJackalGadgetTips() {
        return getS(R.string.jackal_tip);
    }

    public String getJackalGadgetThree() {
        return "";
    }

    public String getJackalGadgetSecOne() {
        return "Breach";
    }

    public String getJackalGadgetSecOneCount() {
        return "3";
    }

    public String getJackalGadgetSecTwo() {
        return "Smoke";
    }


    public String getJackalGadgetSecTwoCount() {
        return "2";
    }

    public void setJackalOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getJackalGadgetTitle(), getJackalGadgetByline(), getJackalGadgetDesc(), getJackalGadgetOne(), getJackalGadgetTwo(), getJackalGadgetThree(), getJackalGadgetSecOne(), getJackalGadgetSecOneCount(), getJackalGadgetSecTwo(), getJackalGadgetSecTwoCount(),
                R.drawable.jackal_gadget, R.drawable.r_breach, R.drawable.r_smoke, false, true, getJackalGadgetTips());
    }


    //Ying
    public String getYingGadgetTitle() {
        return getS(R.string.ying_gadget_name);
    }

    public String getYingGadgetByline() {
        return getS(R.string.ying_gadget_name_byline);
    }

    public String getYingGadgetDesc() {
        return getS(R.string.ying_gadget);
    }

    public String getYingGadgetOne() {
        return getS(R.string.ying_gadget_one);
    }

    public String getYingGadgetTips() {
        return getS(R.string.ying_tip);
    }

    public String getYingGadgetTwo() {
        return "";
    }

    public String getYingGadgetThree() {
        return "";
    }

    public String getYingGadgetSecOne() {
        return "Breach";
    }

    public String getYingGadgetSecOneCount() {
        return "3";
    }

    public String getYingGadgetSecTwo() {
        return "Smoke";
    }


    public String getYingGadgetSecTwoCount() {
        return "2";
    }

    public void setYingOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getYingGadgetTitle(), getYingGadgetByline(), getYingGadgetDesc(), getYingGadgetOne(), getYingGadgetTwo(), getYingGadgetThree(), getYingGadgetSecOne(), getYingGadgetSecOneCount(), getYingGadgetSecTwo(), getYingGadgetSecTwoCount(),
                R.drawable.ying_gadget, R.drawable.r_breach, R.drawable.r_smoke, true, true, getYingGadgetTips());
    }


    //Zofia
    public String getZofiaGadgetTitle() {
        return getS(R.string.zofia_gadget_name);
    }

    public String getZofiaGadgetByline() {
        return getS(R.string.zofia_gadget_name_byline);
    }

    public String getZofiaGadgetDesc() {
        return getS(R.string.zofia_gadget);
    }

    public String getZofiaGadgetOne() {
        return getS(R.string.zofia_gadget_one);
    }

    public String getZofiaGadgetTwo() {
        return getS(R.string.zofia_gadget_two);
    }

    public String getZofiaGadgetTips() {
        return getS(R.string.zofia_tip);
    }

    public String getZofiaGadgetThree() {
        return "";
    }

    public String getZofiaGadgetSecOne() {
        return "Claymore";
    }

    public String getZofiaGadgetSecOneCount() {
        return "1";
    }

    public String getZofiaGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getZofiaGadgetSecTwoCount() {
        return "3";
    }

    public void setZofiaOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getZofiaGadgetTitle(), getZofiaGadgetByline(), getZofiaGadgetDesc(), getZofiaGadgetOne(), getZofiaGadgetTwo(), getZofiaGadgetThree(), getZofiaGadgetSecOne(), getZofiaGadgetSecOneCount(), getZofiaGadgetSecTwo(), getZofiaGadgetSecTwoCount(),
                R.drawable.zofia_gadget, R.drawable.r_claymore, R.drawable.r_stun, false, true, getZofiaGadgetTips());
    }


    //Dokkaebi
    public String getDokkaebiGadgetTitle() {
        return getS(R.string.dokkaebi_gadget_name);
    }

    public String getDokkaebiGadgetByline() {
        return getS(R.string.dokkaebi_gadget_name_byline);
    }

    public String getDokkaebiGadgetDesc() {
        return getS(R.string.dokkaebi_gadget);
    }

    public String getDokkaebiGadgetOne() {
        return getS(R.string.dokkaebi_gadget_one);
    }

    public String getDokkaebiGadgetTwo() {
        return getS(R.string.dokkaebi_gadget_two);
    }

    public String getDokkaebiGadgetTips() {
        return getS(R.string.dokkaebi_tip);
    }

    public String getDokkaebiGadgetThree() {
        return "";
    }

    public String getDokkaebiGadgetSecOne() {
        return "Claymore";
    }

    public String getDokkaebiGadgetSecOneCount() {
        return "1";
    }

    public String getDokkaebiGadgetSecTwo() {
        return "Smoke";
    }


    public String getDokkaebiGadgetSecTwoCount() {
        return "2";
    }

    public void setDokkaebiOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getDokkaebiGadgetTitle(), getDokkaebiGadgetByline(), getDokkaebiGadgetDesc(), getDokkaebiGadgetOne(), getDokkaebiGadgetTwo(), getDokkaebiGadgetThree(), getDokkaebiGadgetSecOne(), getDokkaebiGadgetSecOneCount(), getDokkaebiGadgetSecTwo(), getDokkaebiGadgetSecTwoCount(),
                R.drawable.dokkaebi_gadget, R.drawable.r_claymore, R.drawable.r_smoke, false, true, getDokkaebiGadgetTips());
    }

    //Lion
    public String getLionGadgetTitle() {
        return getS(R.string.lion_gadget_name);
    }

    public String getLionGadgetByline() {
        return getS(R.string.lion_gadget_name_byline);
    }

    public String getLionGadgetDesc() {
        return getS(R.string.lion_gadget);
    }

    public String getLionGadgetOne() {
        return getS(R.string.lion_gadget_one);
    }

    public String getLionGadgetTwo() {
        return "";
    }

    public String getLionGadgetTips() {
        return getS(R.string.lion_tip);
    }

    public String getLionGadgetThree() {
        return "";
    }

    public String getLionGadgetSecOne() {
        return "Stun Grenade";
    }

    public String getLionGadgetSecOneCount() {
        return "3";
    }

    public String getLionGadgetSecTwo() {
        return "Claymore";
    }


    public String getLionGadgetSecTwoCount() {
        return "1";
    }

    public void setLionOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getLionGadgetTitle(), getLionGadgetByline(), getLionGadgetDesc(), getLionGadgetOne(), getLionGadgetTwo(), getLionGadgetThree(), getLionGadgetSecOne(), getLionGadgetSecOneCount(), getLionGadgetSecTwo(), getLionGadgetSecTwoCount(),
                R.drawable.lion_gadget, R.drawable.r_stun, R.drawable.r_claymore, true, true, getLionGadgetTips());
    }


    //Finka
    public String getFinkaGadgetTitle() {
        return getS(R.string.finka_gadget_name);
    }

    public String getFinkaGadgetByline() {
        return getS(R.string.finka_gadget_name_byline);
    }

    public String getFinkaGadgetDesc() {
        return getS(R.string.finka_gadget);
    }

    public String getFinkaGadgetOne() {
        return getS(R.string.finka_gadget_one);
    }

    public String getFinkaGadgetTwo() {
        return "";
    }

    public String getFinkaGadgetTips() {
        return getS(R.string.finka_tip);
    }

    public String getFinkaGadgetThree() {
        return "";
    }

    public String getFinkaGadgetSecOne() {
        return "Breach";
    }

    public String getFinkaGadgetSecOneCount() {
        return "3";
    }

    public String getFinkaGadgetSecTwo() {
        return "Stun Grenade";
    }


    public String getFinkaGadgetSecTwoCount() {
        return "3";
    }

    public void setFinkaOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getFinkaGadgetTitle(), getFinkaGadgetByline(), getFinkaGadgetDesc(), getFinkaGadgetOne(), getFinkaGadgetTwo(), getFinkaGadgetThree(), getFinkaGadgetSecOne(), getFinkaGadgetSecOneCount(), getFinkaGadgetSecTwo(), getFinkaGadgetSecTwoCount(),
                R.drawable.finnka_gadget, R.drawable.r_breach, R.drawable.r_stun, true, true, getFinkaGadgetTips());
    }



    /////DEFENDERS

    //Smoke
    public String getSmokeGadgetTitle() {
        return getS(R.string.smoke_gadget_name);
    }

    public String getSmokeGadgetByline() {
        return getS(R.string.smoke_gadget_name_byline);
    }

    public String getSmokeGadgetDesc() {
        return getS(R.string.smoke_gadget);
    }

    public String getSmokeGadgetOne() {
        return getS(R.string.smoke_gadget_one);
    }

    public String getSmokeGadgetTwo() {
        return getS(R.string.smoke_gadget_two);
    }

    public String getSmokeGadgetThree() {
        return getS(R.string.smoke_gadget_three);
    }

    public String getSmokeGadgetTips() {
        return getS(R.string.smoke_tip);
    }

    public String getSmokeGadgetSecOne() {
        return "Impact Grenade";
    }

    public String getSmokeGadgetSecOneCount() {
        return "2";
    }

    public String getSmokeGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getSmokeGadgetSecTwoCount() {
        return "2";
    }

    public void setSmokeOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getSmokeGadgetTitle(), getSmokeGadgetByline(), getSmokeGadgetDesc(), getSmokeGadgetOne(), getSmokeGadgetTwo(), getSmokeGadgetThree(), getSmokeGadgetSecOne(), getSmokeGadgetSecOneCount(), getSmokeGadgetSecTwo(), getSmokeGadgetSecTwoCount(),
                R.drawable.smoke_gadget, R.drawable.r_impact, R.drawable.r_barbed, false, false, getSmokeGadgetTips());
    }


    //Mute
    public String getMuteGadgetTitle() {
        return getS(R.string.mute_gadget_name);
    }

    public String getMuteGadgetByline() {
        return getS(R.string.mute_gadget_name_byline);
    }

    public String getMuteGadgetDesc() {
        return getS(R.string.mute_gadget);
    }

    public String getMuteGadgetOne() {
        return getS(R.string.mute_gadget_one);
    }

    public String getMuteGadgetTwo() {
        return getS(R.string.mute_gadget_two);
    }

    public String getMuteGadgetThree() {
        return getS(R.string.mute_gadget_three);
    }

    public String getMuteGadgetSecOne() {
        return "Nitro Cell";
    }

    public String getMuteGadgetTips() {
        return getS(R.string.mute_tip);
    }

    public String getMuteGadgetSecOneCount() {
        return "1";
    }

    public String getMuteGadgetSecTwo() {
        return "Deployable Shield";
    }


    public String getMuteGadgetSecTwoCount() {
        return "1";
    }

    public void setMuteOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getMuteGadgetTitle(), getMuteGadgetByline(), getMuteGadgetDesc(), getMuteGadgetOne(), getMuteGadgetTwo(), getMuteGadgetThree(), getMuteGadgetSecOne(), getMuteGadgetSecOneCount(), getMuteGadgetSecTwo(), getMuteGadgetSecTwoCount(),
                R.drawable.mute_gadget, R.drawable.r_nitro, R.drawable.r_shield, false, false, getMuteGadgetTips());
    }


    //Castle
    public String getCastleGadgetTitle() {
        return getS(R.string.castle_gadget_name);
    }

    public String getCastleGadgetByline() {
        return getS(R.string.castle_gadget_name_byline);
    }

    public String getCastleGadgetDesc() {
        return getS(R.string.castle_gadget);
    }

    public String getCastleGadgetOne() {
        return getS(R.string.castle_gadget_one);
    }

    public String getCastleGadgetTwo() {
        return getS(R.string.castle_gadget_two);
    }

    public String getCastleGadgetTips() {
        return getS(R.string.castle_tip);
    }

    public String getCastleGadgetThree() {
        return "";
    }

    public String getCastleGadgetSecOne() {
        return "Impact Grenade";
    }

    public String getCastleGadgetSecOneCount() {
        return "2";
    }

    public String getCastleGadgetSecTwo() {
        return "Deployable Shield";
    }


    public String getCastleGadgetSecTwoCount() {
        return "1";
    }

    public void setCastleOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getCastleGadgetTitle(), getCastleGadgetByline(), getCastleGadgetDesc(), getCastleGadgetOne(), getCastleGadgetTwo(), getCastleGadgetThree(), getCastleGadgetSecOne(), getCastleGadgetSecOneCount(), getCastleGadgetSecTwo(), getCastleGadgetSecTwoCount(),
                R.drawable.castle_gadget, R.drawable.r_impact, R.drawable.r_shield, false, true, getCastleGadgetTips());
    }


    //Pulse
    public String getPulseGadgetTitle() {
        return getS(R.string.pulse_gadget_name);
    }

    public String getPulseGadgetByline() {
        return getS(R.string.pulse_gadget_name_byline);
    }

    public String getPulseGadgetDesc() {
        return getS(R.string.pulse_gadget);
    }

    public String getPulseGadgetOne() {
        return getS(R.string.pulse_gadget_one);
    }

    public String getPulseGadgetTips() {
        return getS(R.string.pulse_tip);
    }

    public String getPulseGadgetTwo() {
        return "";
    }

    public String getPulseGadgetThree() {
        return "";
    }

    public String getPulseGadgetSecOne() {
        return "Nitro Cell";
    }

    public String getPulseGadgetSecOneCount() {
        return "1";
    }

    public String getPulseGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getPulseGadgetSecTwoCount() {
        return "2";
    }

    public void setPulseOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getPulseGadgetTitle(), getPulseGadgetByline(), getPulseGadgetDesc(), getPulseGadgetOne(), getPulseGadgetTwo(), getPulseGadgetThree(), getPulseGadgetSecOne(), getPulseGadgetSecOneCount(), getPulseGadgetSecTwo(), getPulseGadgetSecTwoCount(),
                R.drawable.pulse_gadget, R.drawable.r_nitro, R.drawable.r_barbed, true, true, getPulseGadgetTips());
    }


    //Doc
    public String getDocGadgetTitle() {
        return getS(R.string.doc_gadget_name);
    }

    public String getDocGadgetByline() {
        return getS(R.string.doc_gadget_name_byline);
    }

    public String getDocGadgetDesc() {
        return getS(R.string.doc_gadget);
    }

    public String getDocGadgetOne() {
        return getS(R.string.doc_gadget_one);
    }

    public String getDocGadgetTips() {
        return getS(R.string.doc_tip);
    }

    public String getDocGadgetTwo() {
        return getS(R.string.doc_gadget_two);
    }

    public String getDocGadgetThree() {
        return getS(R.string.doc_gadget_three);
    }

    public String getDocGadgetSecOne() {
        return "Deployable Shield";
    }

    public String getDocGadgetSecOneCount() {
        return "1";
    }

    public String getDocGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getDocGadgetSecTwoCount() {
        return "2";
    }

    public void setDocOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getDocGadgetTitle(), getDocGadgetByline(), getDocGadgetDesc(), getDocGadgetOne(), getDocGadgetTwo(), getDocGadgetThree(), getDocGadgetSecOne(), getDocGadgetSecOneCount(), getDocGadgetSecTwo(), getDocGadgetSecTwoCount(),
                R.drawable.doc_gadget, R.drawable.r_shield, R.drawable.r_barbed, false, false, getDocGadgetTips());
    }

    //Rook
    public String getRookGadgetTitle() {
        return getS(R.string.rook_gadget_name);
    }

    public String getRookGadgetByline() {
        return getS(R.string.rook_gadget_name_byline);
    }

    public String getRookGadgetDesc() {
        return getS(R.string.rook_gadget);
    }

    public String getRookGadgetOne() {
        return getS(R.string.rook_gadget_one);
    }

    public String getRookGadgetTwo() {
        return getS(R.string.rook_gadget_two);
    }

    public String getRookGadgetTips() {
        return getS(R.string.rook_tip);
    }

    public String getRookGadgetThree() {
        return "";
    }

    public String getRookGadgetSecOne() {
        return "Impact Grenade";
    }

    public String getRookGadgetSecOneCount() {
        return "2";
    }

    public String getRookGadgetSecTwo() {
        return "Deployable Shield";
    }


    public String getRookGadgetSecTwoCount() {
        return "1";
    }

    public void setRookOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getRookGadgetTitle(), getRookGadgetByline(), getRookGadgetDesc(), getRookGadgetOne(), getRookGadgetTwo(), getRookGadgetThree(), getRookGadgetSecOne(), getRookGadgetSecOneCount(), getRookGadgetSecTwo(), getRookGadgetSecTwoCount(),
                R.drawable.rook_gadget, R.drawable.r_impact, R.drawable.r_shield, false, true, getRookGadgetTips());
    }

    //Kapkan
    public String getKapkanGadgetTitle() {
        return getS(R.string.kapkan_gadget_name);
    }

    public String getKapkanGadgetByline() {
        return getS(R.string.kapkan_gadget_name_byline);
    }

    public String getKapkanGadgetDesc() {
        return getS(R.string.kapkan_gadget);
    }

    public String getKapkanGadgetOne() {
        return getS(R.string.kapkan_gadget_one);
    }

    public String getKapkanGadgetTwo() {
        return getS(R.string.kapkan_gadget_two);
    }

    public String getKapkanGadgetTips() {
        return getS(R.string.kapkan_tip);
    }

    public String getKapkanGadgetThree() {
        return "";
    }

    public String getKapkanGadgetSecOne() {
        return "Nitro Cell";
    }

    public String getKapkanGadgetSecOneCount() {
        return "1";
    }

    public String getKapkanGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getKapkanGadgetSecTwoCount() {
        return "2";
    }

    public void setKapkanOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getKapkanGadgetTitle(), getKapkanGadgetByline(), getKapkanGadgetDesc(), getKapkanGadgetOne(), getKapkanGadgetTwo(), getKapkanGadgetThree(), getKapkanGadgetSecOne(), getKapkanGadgetSecOneCount(), getKapkanGadgetSecTwo(), getKapkanGadgetSecTwoCount(),
                R.drawable.kapkan_gadget, R.drawable.r_nitro, R.drawable.r_barbed, false, true, getKapkanGadgetTips());
    }


    //Tachanka
    public String getTachankaGadgetTitle() {
        return getS(R.string.tachanka_gadget_name);
    }

    public String getTachankaGadgetByline() {
        return getS(R.string.tachanka_gadget_name_byline);
    }

    public String getTachankaGadgetDesc() {
        return getS(R.string.tachanka_gadget);
    }

    public String getTachankaGadgetOne() {
        return getS(R.string.tachanka_gadget_one);
    }

    public String getTachankaGadgetTwo() {
        return getS(R.string.tachanka_gadget_two);
    }

    public String getTachankaGadgetThree() {
        return "";
    }

    public String getTachankaGadgetTips() {
        return getS(R.string.tachanka_tip);
    }

    public String getTachankaGadgetSecOne() {
        return "Deployable Shield";
    }

    public String getTachankaGadgetSecOneCount() {
        return "1";
    }

    public String getTachankaGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getTachankaGadgetSecTwoCount() {
        return "2";
    }

    public void setTachankaOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getTachankaGadgetTitle(), getTachankaGadgetByline(), getTachankaGadgetDesc(), getTachankaGadgetOne(), getTachankaGadgetTwo(), getTachankaGadgetThree(), getTachankaGadgetSecOne(), getTachankaGadgetSecOneCount(), getTachankaGadgetSecTwo(), getTachankaGadgetSecTwoCount(),
                R.drawable.tachanka_gadget, R.drawable.r_shield, R.drawable.r_barbed, false, true, getTachankaGadgetTips());
    }


    //Jager
    public String getJagerGadgetTitle() {
        return getS(R.string.jager_gadget_name);
    }

    public String getJagerGadgetByline() {
        return getS(R.string.jager_gadget_name_byline);
    }

    public String getJagerGadgetDesc() {
        return getS(R.string.jager_gadget);
    }

    public String getJagerGadgetOne() {
        return getS(R.string.jager_gadget_one);
    }

    public String getJagerGadgetTwo() {
        return getS(R.string.jager_gadget_two);
    }

    public String getJagerGadgetThree() {
        return getS(R.string.jager_gadget_three);
    }

    public String getJagerGadgetTips() {
        return getS(R.string.jager_tip);
    }

    public String getJagerGadgetSecOne() {
        return "Deployable Shield";
    }

    public String getJagerGadgetSecOneCount() {
        return "1";
    }

    public String getJagerGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getJagerGadgetSecTwoCount() {
        return "2";
    }

    public void setJagerOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getJagerGadgetTitle(), getJagerGadgetByline(), getJagerGadgetDesc(), getJagerGadgetOne(), getJagerGadgetTwo(), getJagerGadgetThree(), getJagerGadgetSecOne(), getJagerGadgetSecOneCount(), getJagerGadgetSecTwo(), getJagerGadgetSecTwoCount(),
                R.drawable.jager_gadget, R.drawable.r_shield, R.drawable.r_barbed, false, false, getJagerGadgetTips());
    }

    //Bandit
    public String getBanditGadgetTitle() {
        return getS(R.string.bandit_gadget_name);
    }

    public String getBanditGadgetByline() {
        return getS(R.string.bandit_gadget_name_byline);
    }

    public String getBanditGadgetDesc() {
        return getS(R.string.bandit_gadget);
    }

    public String getBanditGadgetOne() {
        return getS(R.string.bandit_gadget_one);
    }

    public String getBanditGadgetTwo() {
        return getS(R.string.bandit_gadget_two);
    }

    public String getBanditGadgetThree() {
        return getS(R.string.bandit_gadget_three);
    }

    public String getBanditGadgetTips() {
        return getS(R.string.bandit_tip);
    }

    public String getBanditGadgetSecOne() {
        return "Barbed Wire";
    }

    public String getBanditGadgetSecOneCount() {
        return "2";
    }

    public String getBanditGadgetSecTwo() {
        return "Nitro Cell";
    }


    public String getBanditGadgetSecTwoCount() {
        return "1";
    }

    public void setBanditOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getBanditGadgetTitle(), getBanditGadgetByline(), getBanditGadgetDesc(), getBanditGadgetOne(), getBanditGadgetTwo(), getBanditGadgetThree(), getBanditGadgetSecOne(), getBanditGadgetSecOneCount(), getBanditGadgetSecTwo(), getBanditGadgetSecTwoCount(),
                R.drawable.bandit_gadget, R.drawable.r_barbed, R.drawable.r_nitro, false, false, getBanditGadgetTips());
    }


    //Frost
    public String getFrostGadgetTitle() {
        return getS(R.string.frost_gadget_name);
    }

    public String getFrostGadgetByline() {
        return getS(R.string.frost_gadget_name_byline);
    }

    public String getFrostGadgetDesc() {
        return getS(R.string.frost_gadget);
    }

    public String getFrostGadgetOne() {
        return getS(R.string.frost_gadget_one);
    }

    public String getFrostGadgetTwo() {
        return getS(R.string.frost_gadget_two);
    }

    public String getFrostGadgetTips() {
        return getS(R.string.frost_tip);
    }

    public String getFrostGadgetThree() {
        return "";
    }

    public String getFrostGadgetSecOne() {
        return "Barbed Wire";
    }

    public String getFrostGadgetSecOneCount() {
        return "1";
    }

    public String getFrostGadgetSecTwo() {
        return "Deployable Shield";
    }


    public String getFrostGadgetSecTwoCount() {
        return "1";
    }

    public void setFrostOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getFrostGadgetTitle(), getFrostGadgetByline(), getFrostGadgetDesc(), getFrostGadgetOne(), getFrostGadgetTwo(), getFrostGadgetThree(), getFrostGadgetSecOne(), getFrostGadgetSecOneCount(), getFrostGadgetSecTwo(), getFrostGadgetSecTwoCount(),
                R.drawable.frost_gadget, R.drawable.r_barbed, R.drawable.r_shield, false, true, getFrostGadgetTips());
    }


    //Valkyrie
    public String getValkyrieGadgetTitle() {
        return getS(R.string.valkyrie_gadget_name);
    }

    public String getValkyrieGadgetByline() {
        return getS(R.string.valkyrie_gadget_name_byline);
    }

    public String getValkyrieGadgetDesc() {
        return getS(R.string.valkyrie_gadget);
    }

    public String getValkyrieGadgetOne() {
        return getS(R.string.valkyrie_gadget_one);
    }

    public String getValkyrieGadgetTwo() {
        return getS(R.string.valkyrie_gadget_two);
    }

    public String getValkyrieGadgetTips() {
        return getS(R.string.valkyrie_tip);
    }

    public String getValkyrieGadgetThree() {
        return "";
    }

    public String getValkyrieGadgetSecOne() {
        return "Nitro Cell";
    }

    public String getValkyrieGadgetSecOneCount() {
        return "1";
    }

    public String getValkyrieGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getValkyrieGadgetSecTwoCount() {
        return "2";
    }

    public void setValkyrieOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getValkyrieGadgetTitle(), getValkyrieGadgetByline(), getValkyrieGadgetDesc(), getValkyrieGadgetOne(), getValkyrieGadgetTwo(), getValkyrieGadgetThree(), getValkyrieGadgetSecOne(), getValkyrieGadgetSecOneCount(), getValkyrieGadgetSecTwo(), getValkyrieGadgetSecTwoCount(),
                R.drawable.valkyrie_gadget, R.drawable.r_nitro, R.drawable.r_barbed, false, true, getValkyrieGadgetTips());
    }


    //Caveira
    public String getCaveiraGadgetTitle() {
        return getS(R.string.caveira_gadget_name);
    }

    public String getCaveiraGadgetByline() {
        return getS(R.string.caveira_gadget_name_byline);
    }

    public String getCaveiraGadgetDesc() {
        return getS(R.string.caveira_gadget);
    }

    public String getCaveiraGadgetOne() {
        return getS(R.string.caveira_gadget_one);
    }

    public String getCaveiraGadgetTwo() {
        return getS(R.string.caveira_gadget_two);
    }

    public String getCaveiraGadgetThree() {
        return "";
    }

    public String getCaveiraGadgetTips() {
        return getS(R.string.caveira_tip);
    }

    public String getCaveiraGadgetSecOne() {
        return "Impact Grenade";
    }

    public String getCaveiraGadgetSecOneCount() {
        return "2";
    }

    public String getCaveiraGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getCaveiraGadgetSecTwoCount() {
        return "2";
    }

    public void setCaveiraOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getCaveiraGadgetTitle(), getCaveiraGadgetByline(), getCaveiraGadgetDesc(), getCaveiraGadgetOne(), getCaveiraGadgetTwo(), getCaveiraGadgetThree(), getCaveiraGadgetSecOne(), getCaveiraGadgetSecOneCount(), getCaveiraGadgetSecTwo(), getCaveiraGadgetSecTwoCount(),
                R.drawable.caveira_gadget, R.drawable.r_impact, R.drawable.r_barbed, false, true, getCaveiraGadgetTips());
    }


    //Echo
    public String getEchoGadgetTitle() {
        return getS(R.string.echo_gadget_name);
    }

    public String getEchoGadgetByline() {
        return getS(R.string.echo_gadget_name_byline);
    }

    public String getEchoGadgetDesc() {
        return getS(R.string.echo_gadget);
    }

    public String getEchoGadgetOne() {
        return getS(R.string.echo_gadget_one);
    }

    public String getEchoGadgetTwo() {
        return getS(R.string.echo_gadget_two);
    }

    public String getEchoGadgetThree() {
        return "";
    }

    public String getEchoGadgetTips() {
        return getS(R.string.echo_tip);
    }


    public String getEchoGadgetSecOne() {
        return "Deployable Shield";
    }

    public String getEchoGadgetSecOneCount() {
        return "1";
    }

    public String getEchoGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getEchoGadgetSecTwoCount() {
        return "2";
    }

    public void setEchoOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getEchoGadgetTitle(), getEchoGadgetByline(), getEchoGadgetDesc(), getEchoGadgetOne(), getEchoGadgetTwo(), getEchoGadgetThree(), getEchoGadgetSecOne(), getEchoGadgetSecOneCount(), getEchoGadgetSecTwo(), getEchoGadgetSecTwoCount(),
                R.drawable.echo_gadget, R.drawable.r_shield, R.drawable.r_barbed, false, true, getEchoGadgetTips());
    }


    //Mira
    public String getMiraGadgetTitle() {
        return getS(R.string.mira_gadget_name);
    }

    public String getMiraGadgetByline() {
        return getS(R.string.mira_gadget_name_byline);
    }

    public String getMiraGadgetDesc() {
        return getS(R.string.mira_gadget);
    }

    public String getMiraGadgetOne() {
        return getS(R.string.mira_gadget_one);
    }

    public String getMiraGadgetTwo() {
        return getS(R.string.mira_gadget_two);
    }

    public String getMiraGadgetThree() {
        return "";
    }

    public String getMiraGadgetTips() {
        return getS(R.string.mira_tip);
    }

    public String getMiraGadgetSecOne() {
        return "Nitro Cell";
    }

    public String getMiraGadgetSecOneCount() {
        return "1";
    }

    public String getMiraGadgetSecTwo() {
        return "Deployable Shield";
    }


    public String getMiraGadgetSecTwoCount() {
        return "1";
    }

    public void setMiraOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getMiraGadgetTitle(), getMiraGadgetByline(), getMiraGadgetDesc(), getMiraGadgetOne(), getMiraGadgetTwo(), getMiraGadgetThree(), getMiraGadgetSecOne(), getMiraGadgetSecOneCount(), getMiraGadgetSecTwo(), getMiraGadgetSecTwoCount(),
                R.drawable.mira_gadget, R.drawable.r_nitro, R.drawable.r_shield, false, true, getMiraGadgetTips());
    }


    //Lesion
    public String getLesionGadgetTitle() {
        return getS(R.string.lesion_gadget_name);
    }

    public String getLesionGadgetByline() {
        return getS(R.string.lesion_gadget_name_byline);
    }

    public String getLesionGadgetDesc() {
        return getS(R.string.lesion_gadget);
    }

    public String getLesionGadgetOne() {
        return getS(R.string.lesion_gadget_one);
    }

    public String getLesionGadgetTwo() {
        return getS(R.string.lesion_gadget_two);
    }

    public String getLesionGadgetThree() {
        return "";
    }

    public String getLesionGadgetTips() {
        return getS(R.string.lesion_tip);
    }

    public String getLesionGadgetSecOne() {
        return "Impact Grenade";
    }

    public String getLesionGadgetSecOneCount() {
        return "2";
    }

    public String getLesionGadgetSecTwo() {
        return "Deployable Shield";
    }


    public String getLesionGadgetSecTwoCount() {
        return "1";
    }

    public void setLesionOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getLesionGadgetTitle(), getLesionGadgetByline(), getLesionGadgetDesc(), getLesionGadgetOne(), getLesionGadgetTwo(), getLesionGadgetThree(), getLesionGadgetSecOne(), getLesionGadgetSecOneCount(), getLesionGadgetSecTwo(), getLesionGadgetSecTwoCount(),
                R.drawable.lesion_gadget, R.drawable.r_impact, R.drawable.r_shield, false, false, getLesionGadgetTips());
    }

    //Ela
    public String getElaGadgetTitle() {
        return getS(R.string.ela_gadget_name);
    }

    public String getElaGadgetByline() {
        return getS(R.string.ela_gadget_name_byline);
    }

    public String getElaGadgetDesc() {
        return getS(R.string.ela_gadget);
    }

    public String getElaGadgetOne() {
        return getS(R.string.ela_gadget_one);
    }

    public String getElaGadgetTwo() {
        return getS(R.string.ela_gadget_two);
    }

    public String getElaGadgetThree() {
        return "";
    }

    public String getElaGadgetTips() {
        return getS(R.string.ela_tip);
    }

    public String getElaGadgetSecOne() {
        return "Barbed Wire";
    }

    public String getElaGadgetSecOneCount() {
        return "2";
    }

    public String getElaGadgetSecTwo() {
        return "Deployable Shield";
    }


    public String getElaGadgetSecTwoCount() {
        return "1";
    }

    public void setElaOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getElaGadgetTitle(), getElaGadgetByline(), getElaGadgetDesc(), getElaGadgetOne(), getElaGadgetTwo(), getElaGadgetThree(), getElaGadgetSecOne(), getElaGadgetSecOneCount(), getElaGadgetSecTwo(), getElaGadgetSecTwoCount(),
                R.drawable.ela_gadget, R.drawable.r_barbed, R.drawable.r_shield, false, true, getElaGadgetTips());
    }


    //Vigil
    public String getVigilGadgetTitle() {
        return getS(R.string.vigil_gadget_name);
    }

    public String getVigilGadgetByline() {
        return getS(R.string.vigil_gadget_name_byline);
    }

    public String getVigilGadgetDesc() {
        return getS(R.string.vigil_gadget);
    }

    public String getVigilGadgetOne() {
        return getS(R.string.vigil_gadget_one);
    }

    public String getVigilGadgetTwo() {
        return getS(R.string.vigil_gadget_two);
    }

    public String getVigilGadgetThree() {
        return "";
    }

    public String getVigilGadgetTips() {
        return getS(R.string.vigil_tip);
    }

    public String getVigilGadgetSecOne() {
        return "Impact Grenade";
    }

    public String getVigilGadgetSecOneCount() {
        return "2";
    }

    public String getVigilGadgetSecTwo() {
        return "Barbed Wire";
    }


    public String getVigilGadgetSecTwoCount() {
        return "2";
    }

    public void setVigilOperatorGadget(Activity activity, View view) {

        setOperatorGadget(activity, view, getVigilGadgetTitle(), getVigilGadgetByline(), getVigilGadgetDesc(), getVigilGadgetOne(), getVigilGadgetTwo(), getVigilGadgetThree(), getVigilGadgetSecOne(), getVigilGadgetSecOneCount(), getVigilGadgetSecTwo(), getVigilGadgetSecTwoCount(),
                R.drawable.vigil_gadget, R.drawable.r_impact, R.drawable.r_grenade, false, true, getVigilGadgetTips());
    }


}
