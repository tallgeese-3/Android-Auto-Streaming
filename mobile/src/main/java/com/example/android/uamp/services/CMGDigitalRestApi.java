package com.example.android.uamp.services;

import com.example.android.uamp.model.VulcanRadioResult;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface CMGDigitalRestApi {
    String UUID = java.util.UUID.randomUUID().toString();

    @GET("/")
    public Observable<VulcanRadioResult> getRadioData(@Query("callback") String callback, @Query("format") String format);
}
