package com.example.ee.ethananderikkatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PharmacyFragment extends Fragment {

    public PharmacyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.options_list, container, false);

        final ArrayList<TourDetails> features = new ArrayList<>(1);

        features.add(new TourDetails(R.drawable.nett, getContext().getString(R.string.pName4), getContext().getString(R.string.pStatus3), getContext().getString(R.string.pTime1)));
        features.add(new TourDetails(R.drawable.drugstore, getContext().getString(R.string.pName7), getContext().getString(R.string.pStatus1), getContext().getString(R.string.pTime3)));
        features.add(new TourDetails(R.drawable.alpha_pharma, getContext().getString(R.string.pName2), getContext().getString(R.string.pStatus2), getContext().getString(R.string.pTime1)));
        features.add(new TourDetails(R.drawable.fasid, getContext().getString(R.string.pName5), getContext().getString(R.string.pStatus2), getContext().getString(R.string.pTime2)));
        features.add(new TourDetails(R.drawable.healthplus, getContext().getString(R.string.pName3), getContext().getString(R.string.pStatus3), getContext().getString(R.string.pTime2)));
        features.add(new TourDetails(R.drawable.juli, getContext().getString(R.string.pName8), getContext().getString(R.string.pStatus2), getContext().getString(R.string.pTime1)));
        features.add(new TourDetails(R.drawable.medcourt, getContext().getString(R.string.pName6), getContext().getString(R.string.pStatus3), getContext().getString(R.string.pTime3)));
        features.add(new TourDetails(R.drawable.medplus, getContext().getString(R.string.pName1), getContext().getString(R.string.pStatus2), getContext().getString(R.string.pTime1)));

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
