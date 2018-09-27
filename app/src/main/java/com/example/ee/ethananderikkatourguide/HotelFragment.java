package com.example.ee.ethananderikkatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.options_list, container, false);

        final ArrayList<TourDetails> features = new ArrayList<>(2);

        features.add(new TourDetails(R.drawable.radisson_blu, getContext().getString(R.string.hName1), getContext().getString(R.string.hCost1), getContext().getString(R.string.hLoc1)));
        features.add(new TourDetails(R.drawable.ekooo, getContext().getString(R.string.hName2), getContext().getString(R.string.hCost2), getContext().getString(R.string.hLoc2)));
        features.add(new TourDetails(R.drawable.fourp, getContext().getString(R.string.hName3), getContext().getString(R.string.hCost3), getContext().getString(R.string.hLoc3)));
        features.add(new TourDetails(R.drawable.gt, getContext().getString(R.string.hName4), getContext().getString(R.string.hCost4), getContext().getString(R.string.hLoc4)));
        features.add(new TourDetails(R.drawable.hilton, getContext().getString(R.string.hName5), getContext().getString(R.string.hCost5), getContext().getString(R.string.hLoc5)));
        features.add(new TourDetails(R.drawable.intercontinental, getContext().getString(R.string.hName6), getContext().getString(R.string.hCost6), getContext().getString(R.string.hLoc6)));
        features.add(new TourDetails(R.drawable.sheraton, getContext().getString(R.string.hName7), getContext().getString(R.string.hCost7), getContext().getString(R.string.hLoc7)));
        features.add(new TourDetails(R.drawable.ss, getContext().getString(R.string.hName8), getContext().getString(R.string.hCost8), getContext().getString(R.string.hLoc8)));

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
