package com.styleway.app;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.text.TextUtils;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.ads.MobileAds;
import com.vanniktech.emoji.EmojiManager;
import com.vanniktech.emoji.google.GoogleEmojiProvider;
import com.styleway.app.receivers.ConnectivityReceiver;

import io.fabric.sdk.android.Fabric;

/**
 * Created by mayank on 11/2/17.
 */

public class BaseApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ConnectivityReceiver.init(this);
        Fabric.with(this, new Crashlytics());
        EmojiManager.install(new GoogleEmojiProvider());

        String admobAppId = getString(R.string.admob_app_id);
        if (!TextUtils.isEmpty(admobAppId))
            MobileAds.initialize(this, admobAppId);
    }
}
