package com.upcwangying.apps.android.hybird.flutter;

import android.app.Application;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;

public class MyApplication extends Application {

    private FlutterEngine mFlutterEngine;

    @Override
    public void onCreate() {
        super.onCreate();
        // Instantiate a FlutterEngine.
        mFlutterEngine = new FlutterEngine(this);
        // Start executing Dart code to pre-warm the FlutterEngine.
        mFlutterEngine.getDartExecutor().executeDartEntrypoint(
                DartExecutor.DartEntrypoint.createDefault()
        );
        // Cache the FlutterEngine to be used by FlutterActivity or FlutterFragment.
        FlutterEngineCache
                .getInstance()
                .put("my_engine_id", mFlutterEngine);
    }

}
