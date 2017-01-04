package com.qandroid.test.leakcanary;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qandroid.common.QBaseFragment;
import com.qandroid.test.R;
import com.qandroid.test.TestManager;

/**
 * Created by chengxiang.peng on 2017/1/3.
 */

public class LeakCanaryFragment extends QBaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_leakcanary, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(10000);
            }
        }).start();
    }
}
