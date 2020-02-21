package com.conelius.earthquake.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.conelius.earthquake.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * created by Conelius on 2/21/2020 at 12:59 PM : ceekayconelius@gmail.com , github @conykay.
 */
public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {
    private View view;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomInfoWindow(Context context) {
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.custom_info_window,null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        TextView title  = view.findViewById(R.id.winTitle);
        title.setText(marker.getTitle());

        TextView magnitude = view.findViewById(R.id.magnitude);
        magnitude.setText(marker.getSnippet());

        return view;
    }
}
