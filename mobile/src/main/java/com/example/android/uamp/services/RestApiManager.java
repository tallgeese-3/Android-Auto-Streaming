package com.example.android.uamp.services;

import com.example.android.uamp.model.RadioResult;
import com.example.android.uamp.model.VulcanRadioResult;
import com.squareup.okhttp.OkHttpClient;


import java.util.UUID;
import java.util.concurrent.TimeUnit;

import retrofit.ErrorHandler;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import rx.Observable;

/**
 * Created by ewilliams on 3/17/15.
 */
public class RestApiManager implements ErrorHandler {

    private static final int SIZE_OF_CACHE = 52400;

    public static RestApiManager getInstance() {
        return new RestApiManager();
    }

    public Observable<VulcanRadioResult> getRadioData(String endpoint, String uuid, String type) {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(30, TimeUnit.SECONDS);
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(endpoint)
                .setClient(new OkClient(okHttpClient))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setErrorHandler(this)
                .build();
        return restAdapter.create(CMGDigitalRestApi.class).getRadioData(uuid, type);
    }

    @Override
    public Throwable handleError(RetrofitError cause) {
        return new Exception(cause.getMessage());
    }
}
