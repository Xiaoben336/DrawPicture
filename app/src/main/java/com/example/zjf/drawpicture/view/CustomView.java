package com.example.zjf.drawpicture.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.example.zjf.drawpicture.R;

public class CustomView extends View {
    private Paint paint;
    private Bitmap bitmap;

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap,0,0,paint);
    }
    private void init(){
        Log.d("CustomView","进来了");
        paint = new Paint();
        bitmap = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.picture);
    }
}
