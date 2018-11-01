package com.example.ayogeshwaran.wishersvalley;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.example.ayogeshwaran.wishersvalley.App.WisherApp;

public class Utils {

    public static boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) WisherApp.getAppContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnected();
    }

}
