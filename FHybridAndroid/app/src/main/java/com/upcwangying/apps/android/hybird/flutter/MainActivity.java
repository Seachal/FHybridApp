package com.upcwangying.apps.android.hybird.flutter;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btn);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(
                FlutterActivity.createDefaultIntent(this)
        );
    }
}
