package com.example.ayogeshwaran.wishersvalley.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ayogeshwaran.wishersvalley.R;
import com.example.ayogeshwaran.wishersvalley.model.MainGridEntity;

import java.util.List;

public class MainGridAdapter extends BaseAdapter {

    private Context context;
    private List<MainGridEntity> mainGridEntities;
    LayoutInflater inflater;

    public MainGridAdapter(Context context, List<MainGridEntity> mainGridEntities) {
        this.context = context;
        this.mainGridEntities = mainGridEntities;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void updateGridEntities(List<MainGridEntity> mainGridEntities) {
        this.mainGridEntities = mainGridEntities;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.main_grid_item, null);
        }
        ImageView imageViewIcon = (ImageView) convertView.findViewById(R.id.main_grid_item_icon);
        imageViewIcon.setImageDrawable(mainGridEntities.get(position).getDrawable());

        TextView textViewTitle = convertView.findViewById(R.id.main_grid_item_title);
        textViewTitle.setText(mainGridEntities.get(position).getTitle());

        return convertView;
    }

    @Override
    public int getCount() {
        return mainGridEntities.size();
    }

    @Override
    public Object getItem(int position) {
        return mainGridEntities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}