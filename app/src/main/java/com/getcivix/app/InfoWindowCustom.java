package com.getcivix.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.getcivix.app.Models.Category;
import com.getcivix.app.Models.ReportModel;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class InfoWindowCustom implements GoogleMap.InfoWindowAdapter {
    Context context;
    LayoutInflater inflater;
    public InfoWindowCustom(Context context) {
        this.context = context;
    }
    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
    @Override
    public View getInfoWindow(Marker marker) {
        inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // R.layout.echo_info_window is a layout in my
        // res/layout folder. You can provide your own
        View v = inflater.inflate(R.layout.echo_info_window, null);

        TextView title = (TextView) v.findViewById(R.id.info_window_title);
        TextView subtitle = (TextView) v.findViewById(R.id.info_window_subtitle);
        TextView categoryType = (TextView) v.findViewById(R.id.categoryType);
        TextView categoryName = (TextView) v.findViewById(R.id.categoryName);

        ReportModel report = (ReportModel) marker.getTag();

       Category category = (Category)report.category;

        title.setText(report.comment);
        subtitle.setText(report.reportLocation);
        categoryType.setText(String.valueOf(category.catergoryType));
        categoryName.setText(category.categoryName);

        return v;
    }
}
