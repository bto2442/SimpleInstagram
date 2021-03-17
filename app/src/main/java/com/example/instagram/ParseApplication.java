package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cXAjUmMAy8JcUETbpaQ2Wfg7zp1WB78X9ISYUgdU")
                .clientKey("5Y7yEcqJQrCItG0pwbjF2igUyUCuUF3qABzWUXhQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
