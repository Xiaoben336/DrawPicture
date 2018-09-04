package com.example.zjf.drawpicture;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.zjf.drawpicture.view.CustomView;

public class CustomViewDrawActivity extends Activity {
    private static final String TAG = CustomViewDrawActivity.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG,"进来了");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_draw);
    }
}
