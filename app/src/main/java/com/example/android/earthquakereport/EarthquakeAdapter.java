package com.example.android.earthquakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView placeView = (TextView) listItemView.findViewById(R.id.place);
        placeView.setText(currentEarthquake.getPlace());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getDate());

        TextView magView = (TextView) listItemView.findViewById(R.id.mag);
        magView.setText(currentEarthquake.getMag());

        return  listItemView;
    }
}
