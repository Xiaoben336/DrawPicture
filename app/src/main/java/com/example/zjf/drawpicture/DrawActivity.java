package com.example.zjf.drawpicture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DrawActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnImageView = null;
    private Button btnSurfaceView = null;
    private Button btnCustomView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        btnImageView = (Button)findViewById(R.id.btnImageView);
        btnSurfaceView = (Button)findViewById(R.id.btnSurfaceView);
        btnCustomView = (Button)findViewById(R.id.btnCustomView);

        btnImageView.setOnClickListener(this);
        btnSurfaceView.setOnClickListener(this);
        btnCustomView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btnImageView:
                intent.setClass(this,ImageViewDrawActivity.class);
                startActivity(intent);
                break;
            case R.id.btnCustomView:
                intent.setClass(this,CustomViewDrawActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSurfaceView:
                intent.setClass(this,SurfaceViewDrawActivity.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
