package com.example.vga.tour_guide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.drawable.benaki, R.string.benaki_title, R.string.benaki_short_desc,R.string.cat_museum,R.string.benaki_location));
        sights.add(new Sight(R.drawable.acrop_museum, R.string.acropolis_museum_title, R.string.acropolis_museum_short_desc,R.string.cat_museum,R.string.acropolis_museum_location));
        sights.add(new Sight(R.drawable.cycladic, R.string.cycladic_title, R.string.cycladic_short_desc,R.string.cat_museum,R.string.cycladic_location));
        sights.add(new Sight(R.drawable.war, R.string.war_title, R.string.war_short_desc,R.string.cat_museum,R.string.war_location));
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
