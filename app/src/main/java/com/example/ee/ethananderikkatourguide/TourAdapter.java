package com.example.ee.ethananderikkatourguide;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<TourDetails> {


    public TourAdapter(Context context, ArrayList<TourDetails> features) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, features);


    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_details_list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Hotels currentFeature = getItem(position);

        ImageView FeatureImage = listItemView.findViewById(R.id.first_detail);
        FeatureImage.setImageResource(((TourDetails) currentFeature).getTourFeatureImage());

        TextView FeatureName = listItemView.findViewById(R.id.second_details);
        FeatureName.setText(((TourDetails) currentFeature).getTourFeatureName());

        TextView FeatureCost = listItemView.findViewById(R.id.third_detail);
        FeatureCost.setText(((TourDetails) currentFeature).getTourFeatureCost());

        TextView FeatureOtherDetail = listItemView.findViewById(R.id.last_detail);
        FeatureOtherDetail.setText(((TourDetails) currentFeature).getTourFeatureOtherDetails());

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}
