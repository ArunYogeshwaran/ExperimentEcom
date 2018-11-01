package com.example.ayogeshwaran.wishersvalley.model;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class MainGridEntity {
    private Drawable drawable;

    private String title;

    private List<MainGridEntity> mainGridEntities = new ArrayList<>();

    public MainGridEntity(Drawable drawable, String title) {
        this.drawable = drawable;
        this.title = title;
    }

    public List<MainGridEntity> getAllMainGridEntities() {
        return this.mainGridEntities;
    }

    public Drawable getDrawable() {
        return this.drawable;
    }

    public String getTitle() {
        return this.title;
    }

    public MainGridEntity getEntityByPosition(int position) {
        return mainGridEntities.get(position);
    }
}
