package com.jeevscode.android.r6companion.Helpers;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.jeevscode.android.r6companion.R;

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
        final SharedPreferences.Editor editor = sharedPref.edit();

        return sharedPref.getString(tag, defaultV);
    }

    public int getSharedPreferenceInt(Activity activity, String tag, int defaultV) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        return sharedPref.getInt(tag, defaultV);
    }

    public float getSharedPreferenceFloat(Activity activity, String tag, float defaultV) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        return sharedPref.getFloat(tag, defaultV);
    }

    public boolean getSharedPreferenceBoolean(Activity activity, String tag, boolean defaultV) {

        SharedPreferences sharedPref = activity.getSharedPreferences(
                activity.getResources().getString(R.string.key_preferences), Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPref.edit();

        return sharedPref.getBoolean(tag, defaultV);
    }


}