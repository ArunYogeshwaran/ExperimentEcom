package com.example.ayogeshwaran.wishersvalley.ui;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.ayogeshwaran.wishersvalley.App.WisherApp;
import com.example.ayogeshwaran.wishersvalley.R;
import com.example.ayogeshwaran.wishersvalley.adapter.MainGridAdapter;
import com.example.ayogeshwaran.wishersvalley.model.MainGridEntity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivityFragment extends Fragment {
    @BindView(R.id.adView)
    protected AdView adView;

    @BindView(R.id.main_grid_view)
    protected GridView mainGridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(adRequest);

        final List<MainGridEntity> mainGridEntities = getSampleEnities();
        MainGridAdapter mainGridAdapter = new MainGridAdapter(WisherApp.getAppContext(),
                mainGridEntities);
        mainGridView.setAdapter(mainGridAdapter);
        mainGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),
                        "Item clicked is " + mainGridEntities.get(position).getTitle().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<MainGridEntity> getSampleEnities() {
        List<MainGridEntity> mainGridEntities = new ArrayList<>();
        Resources resources = WisherApp.getAppContext().getResources();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mainGridEntities.add(new MainGridEntity(resources.getDrawable(R.drawable.ic_groceries_24dp, null),
                    resources.getString(R.string.groceries)));
            mainGridEntities.add(new MainGridEntity(resources.getDrawable(R.drawable.ic_entertainment_24dp, null),
                    resources.getString(R.string.entertainment)));
            mainGridEntities.add(new MainGridEntity(resources.getDrawable(R.drawable.ic_automobile_24dp, null),
                    resources.getString(R.string.automebile)));
            mainGridEntities.add(new MainGridEntity(resources.getDrawable(R.drawable.ic_taxi_24dp, null),
                    resources.getString(R.string.taxi)));
            mainGridEntities.add(new MainGridEntity(resources.getDrawable(R.drawable.ic_health_24dp, null),
                    resources.getString(R.string.health)));
            mainGridEntities.add(new MainGridEntity(resources.getDrawable(R.drawable.ic_travel_24dp, null),
                    resources.getString(R.string.travel)));
        }
        return mainGridEntities;
    }
}
