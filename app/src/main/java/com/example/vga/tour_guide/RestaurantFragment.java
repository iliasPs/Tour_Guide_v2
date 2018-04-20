package com.example.vga.tour_guide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView = inflater.inflate(R.layout.sight_list, container, false);






        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.sky, R.string.dinner_sky_title, R.string.dinner_sky_short_desc,R.string.cat_restaurants,R.string.dinner_sky_location));
        sights.add(new Sight(R.drawable.aleria, R.string.aleria_title, R.string.aleria_short_desc,R.string.cat_restaurants,R.string.aleria_location));
        sights.add(new Sight(R.drawable.psarras, R.string.psarras_title, R.string.psarras_short_desc,R.string.cat_restaurants,R.string.psarras_location));
        sights.add(new Sight(R.drawable.varoulko, R.string.varoulko_title, R.string.varoulko_short_desc,R.string.cat_restaurants,R.string.varoulko_location));
        SightAdapter adapter = new SightAdapter(getActivity(), sights);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);



        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();
    }
}
