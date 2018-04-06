package com.zeuspalette.android.r6tab.Helpers;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.zeuspalette.android.r6tab.R;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class ZUtils {

    public int getPixelfromDP(Activity activity, int dp) {

        Resources r = activity.getResources();
        int px = (int) (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));

        return px;
    }

    public Drawable resizeImage(int imageResource, Activity activity) {

        Display display = activity.getWindowManager().getDefaultDisplay();

        double deviceWidth = display.getWidth();

        BitmapDrawable bd = (BitmapDrawable) activity.getResources().getDrawable(
                imageResource);
        double imageHeight = bd.getBitmap().getHeight();
        double imageWidth = bd.getBitmap().getWidth();

        double ratio = deviceWidth / imageWidth;
        int newImageHeight = (int) (imageHeight * ratio);

        Bitmap bMap = BitmapFactory.decodeResource(activity.getResources(), imageResource);
        Drawable drawable = new BitmapDrawable(activity.getResources(),
                getResizedBitmap(bMap, newImageHeight, (int) deviceWidth));

        return drawable;
    }

    public Drawable resizeImage(int imageResource, Activity activity, int width, int height) {

        Display display = activity.getWindowManager().getDefaultDisplay();

        double deviceWidth = display.getWidth();

        BitmapDrawable bd = (BitmapDrawable) activity.getResources().getDrawable(
                imageResource);
        double imageHeight = bd.getBitmap().getHeight();
        double imageWidth = bd.getBitmap().getWidth();

        double ratio = deviceWidth / imageWidth;
        int newImageHeight = (int) (imageHeight * ratio);

        Bitmap bMap = BitmapFactory.decodeResource(activity.getResources(), imageResource);
        Drawable drawable = new BitmapDrawable(activity.getResources(),
                getResizedBitmap(bMap, width, (int) height));

        return drawable;
    }

    public Bitmap getResizedBitmap(Bitmap bm, int newHeight, int newWidth) {

        int width = bm.getWidth();
        int height = bm.getHeight();

        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;

        Matrix matrix = new Matrix();

        matrix.postScale(scaleWidth, scaleHeight);

        Bitmap resizedBitmap = Bitmap.createBitmap(bm, 0, 0, width, height,
                matrix, false);

        return resizedBitmap;
    }

    /*****************************************************/

    public void setOperatorInfoFragment(Activity activity, View view, int operatorName, String operatorNameData, int operatorDOB, String operatorDOBData, int operatorHeight, String operatorHeightData, int operatorWeight, String operatorWeightData,
                                        int operatorIcon, int operatorSpeed, int operatorIconImage, int operatorSpeedImage, int operatorBG, String operatorBGData, int operatorTR, String operatorTRData, int operatorPR, String operatorPRData,
                                        int operatorEX, String operatorEXData, int operatorNO, String operatorNOData) {

        TextView name = view.findViewById(operatorName);
        TextView dob = view.findViewById(operatorDOB);
        TextView height = view.findViewById(operatorWeight);
        TextView weight = view.findViewById(operatorHeight);
        TextView background = view.findViewById(operatorBG);
        TextView profile = view.findViewById(operatorPR);
        TextView training = view.findViewById(operatorTR);
        TextView experience = view.findViewById(operatorEX);
        TextView notes = view.findViewById(operatorNO);


        ImageView icon = view.findViewById(operatorIcon);
        ImageView speed = view.findViewById(operatorSpeed);

        Picasso.with(activity.getBaseContext()).load(operatorIconImage).resize(getPixelfromDP(activity, 259), getPixelfromDP(activity, 259)).into(icon);
        Picasso.with(activity.getBaseContext()).load(operatorSpeedImage).resize(getPixelfromDP(activity, 210), getPixelfromDP(activity, 61)).into(speed);


        name.setText(operatorNameData);
        dob.setText(operatorDOBData);
        height.setText(operatorHeightData);
        weight.setText(operatorWeightData);
        background.setText(operatorBGData);
        profile.setText(operatorPRData);
        training.setText(operatorTRData);
        experience.setText(operatorEXData);
        notes.setText(operatorNOData);

    }


    /****************************************************************/

    public void insertSharedPreferenceString(Activity activity, String tag, String data) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString(tag, data);
        editor.commit();
    }

    public void insertSharedPreferenceBoolean(Activity activity, String tag, boolean data) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        editor.putBoolean(tag, data);
        editor.commit();
    }

    public void insertSharedPreferenceInt(Activity activity, String tag, int data) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        editor.putInt(tag, data);
        editor.commit();
    }

    public void insertSharedPreferenceFloat(Activity activity, String tag, float data) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        editor.putFloat(tag, data);
        editor.commit();
    }

    public String getSharedPreferenceString(Activity activity, String tag, String defaultV) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);

        return sharedPref.getString(tag, defaultV);
    }

    public int getSharedPreferenceInt(Activity activity, String tag, int defaultV) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);

        return sharedPref.getInt(tag, defaultV);
    }

    public float getSharedPreferenceFloat(Activity activity, String tag, float defaultV) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);

        return sharedPref.getFloat(tag, defaultV);
    }


    public boolean getSharedPreferenceBoolean(Activity activity, String tag, boolean defaultV) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);

        return sharedPref.getBoolean(tag, defaultV);
    }



    /* -- CHECKBOX HELPERS FOR WEAPONS. Detect Weapon Attachment which is preferred -- */

    //  BARREL CHECKBOX

    public void barrelFCMS(CheckBox flash, CheckBox comp, CheckBox muzzle, CheckBox supp, int code) {

        if (code == 0) {
            flash.setChecked(true);
            comp.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(false);
        }

        if (code == 1) {
            flash.setChecked(false);
            comp.setChecked(true);
            muzzle.setChecked(false);
            supp.setChecked(false);
        }

        if (code == 2) {
            flash.setChecked(false);
            comp.setChecked(false);
            muzzle.setChecked(true);
            supp.setChecked(false);
        }

        if (code == 3) {
            flash.setChecked(false);
            comp.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(true);
        }

    }

    public void barrelS(CheckBox supp, int code) {

        if (code == 0) {
            supp.setChecked(true);
        }

    }

    public void barrelFC(CheckBox flash, CheckBox comp, int code) {

        if (code == 0) {
            flash.setChecked(true);
            comp.setChecked(false);
        }

        if (code == 1) {
            flash.setChecked(false);
            comp.setChecked(true);
        }


    }

    public void barrelFS(CheckBox flash, CheckBox supp, int code) {

        if (code == 0) {
            flash.setChecked(true);
            supp.setChecked(false);
        }

        if (code == 1) {
            flash.setChecked(false);
            supp.setChecked(true);
        }

    }

    public void barrelCMS(CheckBox comp, CheckBox muzzle, CheckBox supp, int code) {

        if (code == 0) {
            comp.setChecked(true);
            muzzle.setChecked(false);
            supp.setChecked(false);
        }

        if (code == 1) {
            comp.setChecked(false);
            muzzle.setChecked(true);
            supp.setChecked(false);
        }

        if (code == 2) {
            comp.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(true);
        }


    }

    public void barrelFCS(CheckBox flash, CheckBox comp, CheckBox supp, int code) {

        if (code == 0) {
            flash.setChecked(true);
            comp.setChecked(false);
            supp.setChecked(false);
        }

        if (code == 1) {
            flash.setChecked(false);
            comp.setChecked(true);
            supp.setChecked(false);
        }

        if (code == 2) {
            flash.setChecked(false);
            comp.setChecked(false);
            supp.setChecked(true);
        }


    }

    public void barrelFMS(CheckBox flash, CheckBox muzzle, CheckBox supp, int code) {

        if (code == 0) {
            flash.setChecked(true);
            muzzle.setChecked(false);
            supp.setChecked(false);
        }

        if (code == 1) {
            flash.setChecked(false);
            muzzle.setChecked(true);
            supp.setChecked(false);
        }

        if (code == 2) {
            flash.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(true);
        }


    }




    public void barrelFCMSL(CheckBox flash, CheckBox comp, CheckBox muzzle, CheckBox supp, CheckBox longB, int code) {

        if (code == 0) {
            flash.setChecked(true);
            comp.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(false);
            longB.setChecked(false);
        }

        if (code == 1) {
            flash.setChecked(false);
            comp.setChecked(true);
            muzzle.setChecked(false);
            supp.setChecked(false);
            longB.setChecked(false);
        }

        if (code == 2) {
            flash.setChecked(false);
            comp.setChecked(false);
            muzzle.setChecked(true);
            supp.setChecked(false);
            longB.setChecked(false);
        }

        if (code == 3) {
            flash.setChecked(false);
            comp.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(true);
            longB.setChecked(false);
        }

        if (code == 4) {
            flash.setChecked(false);
            comp.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(false);
            longB.setChecked(true);
        }

    }

    public void barrelFMSL(CheckBox flash, CheckBox muzzle, CheckBox supp, CheckBox longB, int code) {

        if (code == 0) {
            flash.setChecked(true);
            muzzle.setChecked(false);
            supp.setChecked(false);
            longB.setChecked(false);
        }

        if (code == 1) {
            flash.setChecked(false);
            muzzle.setChecked(true);
            supp.setChecked(false);
            longB.setChecked(false);
        }

        if (code == 2) {
            flash.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(true);
            longB.setChecked(false);
        }

        if (code == 3) {
            flash.setChecked(false);
            muzzle.setChecked(false);
            supp.setChecked(false);
            longB.setChecked(true);
        }

    }

    public void barrelSL(CheckBox supp, CheckBox longB, int code) {

        if (code == 0) {
            supp.setChecked(true);
            longB.setChecked(false);
        }

        if (code == 1) {
            supp.setChecked(false);
            longB.setChecked(true);
        }

    }

    public void barrelFCLS(CheckBox flash, CheckBox comp, CheckBox longB, CheckBox supp, int code) {

        if (code == 0) {
            flash.setChecked(true);
            comp.setChecked(false);
            longB.setChecked(false);
            supp.setChecked(false);
        }

        if (code == 1) {
            flash.setChecked(false);
            comp.setChecked(true);
            longB.setChecked(false);
            supp.setChecked(false);
        }

        if (code == 2) {
            flash.setChecked(false);
            comp.setChecked(false);
            longB.setChecked(true);
            supp.setChecked(false);
        }

        if (code == 3) {
            flash.setChecked(false);
            comp.setChecked(false);
            longB.setChecked(false);
            supp.setChecked(true);
        }

    }

    public void barrelMS(CheckBox muzzle, CheckBox supp, int code) {

        if (code == 0) {
            muzzle.setChecked(true);
            supp.setChecked(false);
        }

        if (code == 1) {
            muzzle.setChecked(false);
            supp.setChecked(true);
        }


    }

    //  SIGHT CHECKBOX

    public void sightHRRA(CheckBox holo, CheckBox red, CheckBox reflex, CheckBox acog, int code) {

        if (code == 0) {
            holo.setChecked(true);
            red.setChecked(false);
            reflex.setChecked(false);
            acog.setChecked(false);
        }

        if (code == 1) {
            holo.setChecked(false);
            red.setChecked(true);
            reflex.setChecked(false);
            acog.setChecked(false);
        }

        if (code == 2) {
            holo.setChecked(false);
            red.setChecked(false);
            reflex.setChecked(true);
            acog.setChecked(false);
        }

        if (code == 3) {
            holo.setChecked(false);
            red.setChecked(false);
            reflex.setChecked(false);
            acog.setChecked(true);
        }

    }

    public void sightHRA(CheckBox holo, CheckBox red, CheckBox acog, int code) {

        if (code == 0) {
            holo.setChecked(true);
            red.setChecked(false);
            acog.setChecked(false);
        }

        if (code == 1) {
            holo.setChecked(false);
            red.setChecked(true);
            acog.setChecked(false);
        }

        if (code == 2) {
            holo.setChecked(false);
            red.setChecked(false);
            acog.setChecked(true);
        }


    }


    public void sightHRR(CheckBox holo, CheckBox red, CheckBox reflex, int code) {

        if (code == 0) {
            holo.setChecked(true);
            red.setChecked(false);
            reflex.setChecked(false);
        }

        if (code == 1) {
            holo.setChecked(false);
            red.setChecked(true);
            reflex.setChecked(false);
        }

        if (code == 2) {
            holo.setChecked(false);
            red.setChecked(false);
            reflex.setChecked(true);
        }

    }

    public void sightRR(CheckBox red, CheckBox reflex, int code) {

        if (code == 0) {
            red.setChecked(true);
            reflex.setChecked(false);
        }

        if (code == 1) {
            red.setChecked(false);
            reflex.setChecked(true);
        }

    }

    //  GRIP CHECKBOX

    public void gripVA(CheckBox vert, CheckBox angle, int code) {

        if (code == 0) {
            vert.setChecked(true);
            angle.setChecked(false);
        }

        if (code == 1) {
            vert.setChecked(false);
            angle.setChecked(true);
        }


    }

    public void gripV(CheckBox vert, int code) {

        if (code == 0) {
            vert.setChecked(true);
        }


    }

    public void gripA(CheckBox angle, int code) {

        if (code == 0) {
            angle.setChecked(true);
        }


    }

    //  LASER CHECKBOX

    public void underL(CheckBox laser, int code) {

        if (code == 0) {
            laser.setChecked(true);
        }

    }


}