package com.example.clipboardmanager;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class WebClient {
    private static OkHttpClient client=null;
    private WebClient(){
        //to prevent creation of new objects
    }
    public static OkHttpClient getInstance(){
        if(client==null){
           client= new OkHttpClient().newBuilder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .build();
        }
        return client;
    }
}
