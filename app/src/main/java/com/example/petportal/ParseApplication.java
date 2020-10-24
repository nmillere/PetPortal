package com.example.petportal;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NxH2nL0j9VK0SZLooms9z8W5xYeYSNYkKeWbX0mE")
                .clientKey("TxZvJdWFxrRnX00G5QqDX9z0L9b2xOyQOGsYueYW")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

