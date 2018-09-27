package com.example.ee.ethananderikkatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.options_list, container, false);

        final ArrayList<TourDetails> features = new ArrayList<>(1);


        features.add(new TourDetails(R.drawable.badagry_slave, getContext().getString(R.string.mName7), getContext().getString(R.string.mLoc2), getContext().getString(R.string.mTime3)));
        features.add(new TourDetails(R.drawable.black_heritage, getContext().getString(R.string.mName6), getContext().getString(R.string.mLoc3), getContext().getString(R.string.mTime1)));
        features.add(new TourDetails(R.drawable.kalakuta, getContext().getString(R.string.mName4), getContext().getString(R.string.mLoc4), getContext().getString(R.string.mTime2)));
        features.add(new TourDetails(R.drawable.national, getContext().getString(R.string.mName3), getContext().getString(R.string.mLoc5), getContext().getString(R.string.mTime1)));
        features.add(new TourDetails(R.drawable.nike_art, getContext().getString(R.string.mName1), getContext().getString(R.string.mLoc6), getContext().getString(R.string.mTime1)));
        features.add(new TourDetails(R.drawable.omenka, getContext().getString(R.string.mName5), getContext().getString(R.string.mLoc7), getContext().getString(R.string.mTime3)));
        features.add(new TourDetails(R.drawable.red_door, getContext().getString(R.string.mName2), getContext().getString(R.string.mLoc8), getContext().getString(R.string.mTime2)));

        TourAdapter adapter = new TourAdapter(getActivity(), features);
        ListView listView = (ListView) rootView.findViewById(R.id.options_list);
        //sets List on Adapter
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long g) {
                // Get the {@link Word} object at the given position the user clicked on
            }
        });

        return rootView;
    }
}
