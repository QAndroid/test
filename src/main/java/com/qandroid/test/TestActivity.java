package com.qandroid.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qandroid.test.leakcanary.LeakCanaryActivity;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void toLeakCanary(View view) {
        Intent intent = new Intent(this, LeakCanaryActivity.class);
        startActivity(intent);
    }
}
