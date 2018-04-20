package com.example.vga.tour_guide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class BarsFragment extends Fragment {


    public BarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        final ArrayList<Sight> sights = new ArrayList<Sight>();

        sights.add(new Sight(R.drawable.clumsies, R.string.clumsies_title, R.string.clumsies_short_desc,R.string.cat_bars,R.string.clumsies_location));
        sights.add(new Sight(R.drawable.rock, R.string.rock_title, R.string.rock_short_desc,R.string.cat_bars,R.string.rock_location));
        sights.add(new Sight(R.drawable.dogs, R.string.dogs_title, R.string.dogs_short_desc,R.string.cat_bars,R.string.dogs_location));
        sights.add(new Sight(R.drawable.halfnote, R.string.halfnote_title, R.string.halfnote_short_desc,R.string.cat_bars,R.string.halfnote_location));
        sights.add(new Sight(R.drawable.galaxy, R.string.galaxy_title, R.string.galaxy_short_desc,R.string.cat_bars,R.string.galaxy_location));

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
