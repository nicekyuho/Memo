package com.nice295.memo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kyuholee on 2016. 7. 30..
 */
public  class NewMemoActivity extends AppCompatActivity {
    private static final String TAG = "NewMemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_memo);
    }
}

