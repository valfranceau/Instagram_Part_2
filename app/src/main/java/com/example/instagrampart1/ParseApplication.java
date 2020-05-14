package com.example.instagrampart1;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate ( );
        // Register your parse models
        ParseObject.registerSubclass( com.example.instagrampart1.Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("val-parstagram") // should correspond to APP_ID env variable
                .clientKey("CodepathMoveFastParse")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://val-parstagram.herokuapp.com/parse/").build());
    }
}
