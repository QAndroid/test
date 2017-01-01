package com.qandroid.test.leakcanary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qandroid.test.R;
import com.qandroid.test.TestManager;

public class LeakCanaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leakcanary);

        TestManager testManager = TestManager.getInstance(this);
    }
}
