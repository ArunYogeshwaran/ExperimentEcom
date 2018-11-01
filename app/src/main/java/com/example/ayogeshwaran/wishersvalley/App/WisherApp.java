package com.example.ayogeshwaran.wishersvalley.App;

import android.app.Application;
import android.content.Context;

public class WisherApp extends Application {
    private static WisherApp context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = (WisherApp) getApplicationContext();
    }

    public static Context getAppContext() {
        return context;
    }
}
