package com.example.zjf.drawpicture;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.File;

/*
* 也可以在activity_image_view_draw.xml文件中的ImageView控件中用android:src属性指定图片路径
* */
public class ImageViewDrawActivity extends AppCompatActivity {
    private ImageView ivImageView = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_draw);
        ivImageView = (ImageView)findViewById(R.id.ivImageView);

        Resources resources = getResources();
        Bitmap bitmap = BitmapFactory.decodeResource(resources,R.drawable.picture);

        ivImageView.setImageBitmap(bitmap);
    }
}