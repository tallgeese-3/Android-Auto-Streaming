package com.example.android.uamp.services;

import android.content.Context;

import com.example.android.uamp.model.RadioResult;
import com.example.android.uamp.model.VulcanRadioResult;

import java.util.UUID;

import rx.Observable;

/**
 * Created by ewilliams on 3/18/15.
 */
public class MappingManager {


    private static final String RELEASE_CONFIG = "config.json";
    private static final String DEBUG_CONFIG = "config.debug.json";
    private CONFIG_MODE configMode;
    //private Context context;
    private RestApiManager restApiManager;

    private MappingManager(Context context, CONFIG_MODE configMode) {
        // this.context = context;
        this.configMode = configMode;
        restApiManager = RestApiManager.getInstance();
    }

    public static MappingManager getInstance(Context context, CONFIG_MODE configMode) {
        return new MappingManager(context, configMode);
    }

    public Observable<VulcanRadioResult> getRadioData(Context context, String endpoint, String uuid, String type) {
        return restApiManager.getRadioData(endpoint, uuid, type);
    }

    public Observable<String> generateRandomCallback() {
        return Observable.just(UUID.randomUUID().toString());
    }

    public enum CONFIG_MODE {RELEASE, DEBUG}
}

