package com.example.zjf.drawpicture;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

public class SurfaceViewDrawActivity extends AppCompatActivity {
    private SurfaceHolder holder;
    private Paint paint;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface_view_draw);
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.svSurfaceView);

        holder = surfaceView.getHolder();
        paint = new Paint();
        holder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                Canvas canvas = holder.lockCanvas();

                Bitmap bitmap = BitmapFactory.decodeResource(SurfaceViewDrawActivity.this.getResources(),R.drawable.picture);

                canvas.drawBitmap(bitmap,0,0,paint);

                holder.unlockCanvasAndPost(canvas);

                holder.lockCanvas(new Rect(0,0,0,0));
                holder.unlockCanvasAndPost(canvas);
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {

            }
        });
    }
}
