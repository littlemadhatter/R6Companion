package com.zeuspalette.android.r6tab.Fragments;

import android.graphics.PointF;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.zeuspalette.android.r6tab.Activities.MapsLocationsActivity;
import com.zeuspalette.android.r6tab.Helpers.ZUtils;
import com.zeuspalette.android.r6tab.R;

/**
 * Created by Jeeva on 27-02-2018.
 */

public class MapLevelFragment extends Fragment {

    private ZUtils zUtils = new ZUtils();

    private ImageView[] icons;
    PointF customCenter;
    float customScale;
    View rootView;
    private SubsamplingScaleImageView photoView;


    public MapLevelFragment() {

        zUtils = new ZUtils();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        rootView = null;
        photoView = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_map_level, container, false);

        ((MapsLocationsActivity) getActivity())
                .setActionBarTitle("Level");


        //Check for which map was selected based on Map intent key received, Associate Map Plan MIPMAPS

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("house")) {

            setupLevel(rootView, R.mipmap.house_1, R.mipmap.house_2, R.mipmap.house_3, R.mipmap.house_4, R.drawable.no, "House", "house");

        }


        if (MapsLocationsActivity.mapId.equalsIgnoreCase("bank")) {

            setupLevel(rootView, R.mipmap.bank_1, R.mipmap.bank_2, R.mipmap.bank_3, R.mipmap.bank_4, R.drawable.no, "Bank", "bank");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("border")) {

            setupLevel(rootView, R.drawable.no, R.mipmap.border_1, R.mipmap.border_2, R.mipmap.border_3, R.drawable.no, "Border", "border");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("chalet")) {

            setupLevel(rootView, R.mipmap.chalet_1, R.mipmap.chalet_2, R.mipmap.chalet_3, R.mipmap.chalet_4, R.drawable.no, "Chalet", "chalet");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("bartlett")) {

            setupLevel(rootView, R.drawable.no, R.mipmap.bartlett_1, R.mipmap.bartlett_2, R.mipmap.bartlett_3, R.drawable.no, "Bartlett", "bartlett");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("clubhouse")) {

            setupLevel(rootView, R.mipmap.clubhouse_1, R.mipmap.clubhouse_2, R.mipmap.clubhouse_3, R.mipmap.clubhouse_4, R.drawable.no, "Club House", "club");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("coastline")) {

            setupLevel(rootView, R.drawable.no, R.mipmap.coastline_1, R.mipmap.coastline_2, R.mipmap.coastline_3, R.drawable.no, "Coastline", "coastline");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("consulate")) {

            setupLevel(rootView, R.mipmap.consulate_1, R.mipmap.consulate_2, R.mipmap.consulate_3, R.mipmap.consulate_4, R.drawable.no, "Consulate", "consulate");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("favela")) {

            setupLevel(rootView, R.drawable.no, R.mipmap.favela_1, R.mipmap.favela_2, R.mipmap.favela_3, R.mipmap.favela_4, "Favela", "favela");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("hereford")) {

            setupLevel(rootView, R.mipmap.hereford_1, R.mipmap.hereford_2, R.mipmap.hereford_3, R.mipmap.hereford_4, R.mipmap.hereford_5, "Hereford Base", "hereford");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("oregon")) {

            setupLevel(rootView, R.mipmap.oregon_1, R.mipmap.oregon_2, R.mipmap.oregon_3, R.mipmap.oregon_4, R.drawable.no, "Oregon", "oregon");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("kafe")) {

            setupLevel(rootView, R.drawable.no, R.mipmap.kafe_1, R.mipmap.kafe_2, R.mipmap.kafe_3, R.mipmap.kafe_4, "Kafe Dostoyevsky", "kafe");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("kanal")) {

            setupLevel(rootView, R.mipmap.kanal_1, R.mipmap.kanal_2, R.mipmap.kanal_3, R.mipmap.kanal_4, R.drawable.no, "Kanal", "kanal");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("plane")) {

            setupLevel(rootView, R.mipmap.plane_1, R.mipmap.plane_2, R.mipmap.plane_3, R.mipmap.plane_4, R.drawable.no, "Plane", "plane");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("sky")) {

            setupLevel(rootView, R.drawable.no, R.mipmap.sky_1, R.mipmap.sky_2, R.mipmap.sky_3, R.drawable.no, "Skyscraper", "sky");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("theme")) {

            setupLevel(rootView, R.drawable.no, R.mipmap.theme_1, R.mipmap.theme_2, R.mipmap.theme_3, R.drawable.no, "Theme Park", "theme");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("tower")) {

            setupLevel(rootView, R.drawable.no, R.mipmap.tower_1, R.mipmap.tower_2, R.mipmap.tower_3, R.mipmap.tower_4, "Tower", "tower");

        }

        if (MapsLocationsActivity.mapId.equalsIgnoreCase("yacht")) {

            setupLevel(rootView, R.mipmap.yacht_1, R.mipmap.yacht_2, R.mipmap.yacht_3, R.mipmap.yacht_4, R.mipmap.yacht_5, "Yacht", "yacht");

        }


        return rootView;
    }


    //Setup Levels for Maps based on key and their IDS

    public void setupLevel(View view, int id1, int id2, int id3, int id4, int id5, String name, String mapTag) {


        ((MapsLocationsActivity) getActivity()).setActionBarTitle(name);

        if (MapsLocationsActivity.mapLevel == 0) {
            photoView = (SubsamplingScaleImageView) view.findViewById(R.id.photo_view);
            photoView.setImage(ImageSource.resource(id1));


            photoView.setScaleAndCenter(zUtils.getSharedPreferenceFloat(getActivity(), "customS", 0), new PointF(zUtils.getSharedPreferenceFloat(getActivity(), "customX", 0), zUtils.getSharedPreferenceFloat(getActivity(), "customY", 0)));


            photoView.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent event) {

                    if (event.getAction() == android.view.MotionEvent.ACTION_UP) {

                        Thread t = new Thread(new Runnable() {
                            @Override
                            public void run() {

                                zUtils.insertSharedPreferenceFloat(getActivity(), "customX", photoView.getCenter().x);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customY", photoView.getCenter().y);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customS", photoView.getScale());
                            }
                        });

                        t.start();

                    }

                    return false;
                }
            });
        }

        if (MapsLocationsActivity.mapLevel == 1) {
            photoView = (SubsamplingScaleImageView) view.findViewById(R.id.photo_view);
            photoView.setImage(ImageSource.resource(id2));


            photoView.setScaleAndCenter(zUtils.getSharedPreferenceFloat(getActivity(), "customS", 1.2f), new PointF(zUtils.getSharedPreferenceFloat(getActivity(), "customX", 100), zUtils.getSharedPreferenceFloat(getActivity(), "customY", 200)));


            photoView.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent event) {

                    if (event.getAction() == android.view.MotionEvent.ACTION_UP) {

                        Thread t = new Thread(new Runnable() {
                            @Override
                            public void run() {

                                zUtils.insertSharedPreferenceFloat(getActivity(), "customX", photoView.getCenter().x);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customY", photoView.getCenter().y);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customS", photoView.getScale());
                            }
                        });

                        t.start();

                    }

                    return false;
                }
            });
        }

        if (MapsLocationsActivity.mapLevel == 2) {
            photoView = (SubsamplingScaleImageView) view.findViewById(R.id.photo_view);
            photoView.setImage(ImageSource.resource(id3));


            photoView.setScaleAndCenter(zUtils.getSharedPreferenceFloat(getActivity(), "customS", 1.2f), new PointF(zUtils.getSharedPreferenceFloat(getActivity(), "customX", 100), zUtils.getSharedPreferenceFloat(getActivity(), "customY", 200)));


            photoView.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent event) {

                    if (event.getAction() == android.view.MotionEvent.ACTION_UP) {

                        Thread t = new Thread(new Runnable() {
                            @Override
                            public void run() {

                                zUtils.insertSharedPreferenceFloat(getActivity(), "customX", photoView.getCenter().x);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customY", photoView.getCenter().y);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customS", photoView.getScale());
                            }
                        });

                        t.start();

                    }

                    return false;
                }
            });
        }

        if (MapsLocationsActivity.mapLevel == 3) {
            photoView = (SubsamplingScaleImageView) view.findViewById(R.id.photo_view);
            photoView.setImage(ImageSource.resource(id4));


            photoView.setScaleAndCenter(zUtils.getSharedPreferenceFloat(getActivity(), "customS", 0), new PointF(zUtils.getSharedPreferenceFloat(getActivity(), "customX", 0), zUtils.getSharedPreferenceFloat(getActivity(), "customY", 0)));


            photoView.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent event) {

                    if (event.getAction() == android.view.MotionEvent.ACTION_UP) {

                        Thread t = new Thread(new Runnable() {
                            @Override
                            public void run() {

                                zUtils.insertSharedPreferenceFloat(getActivity(), "customX", photoView.getCenter().x);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customY", photoView.getCenter().y);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customS", photoView.getScale());
                            }
                        });

                        t.start();

                    }

                    return false;
                }
            });
        }

        if (MapsLocationsActivity.mapLevel == 4) {
            photoView = (SubsamplingScaleImageView) view.findViewById(R.id.photo_view);
            photoView.setImage(ImageSource.resource(id5));


            photoView.setScaleAndCenter(zUtils.getSharedPreferenceFloat(getActivity(), "customS", 0), new PointF(zUtils.getSharedPreferenceFloat(getActivity(), "customX", 0), zUtils.getSharedPreferenceFloat(getActivity(), "customY", 0)));


            photoView.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, final MotionEvent event) {

                    if (event.getAction() == android.view.MotionEvent.ACTION_UP) {


                        Thread t = new Thread(new Runnable() {
                            @Override
                            public void run() {

                                zUtils.insertSharedPreferenceFloat(getActivity(), "customX", photoView.getCenter().x);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customY", photoView.getCenter().y);
                                zUtils.insertSharedPreferenceFloat(getActivity(), "customS", photoView.getScale());


                            }
                        });

                        t.start();

                    }

                    return false;
                }
            });
        }
    }


}
