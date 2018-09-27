package com.example.ee.ethananderikkatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryFragment extends Fragment {

    public LibraryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.options_list, container, false);

        final ArrayList<TourDetails> features = new ArrayList<>(1);


        features.add(new TourDetails(R.drawable.nation_lib, getContext().getString(R.string.LName3), getContext().getString(R.string.LLoc2), getContext().getString(R.string.LDet4)));
        features.add(new TourDetails(R.drawable.leanhub, getContext().getString(R.string.LName2), getContext().getString(R.string.LLoc3), getContext().getString(R.string.LDet3)));
        features.add(new TourDetails(R.drawable.unilag_lib, getContext().getString(R.string.LName1), getContext().getString(R.string.LLoc1), getContext().getString(R.string.LDet2)));
        features.add(new TourDetails(R.drawable.zac_lib, getContext().getString(R.string.LName4), getContext().getString(R.string.LLoc3), getContext().getString(R.string.LDet1)));

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
