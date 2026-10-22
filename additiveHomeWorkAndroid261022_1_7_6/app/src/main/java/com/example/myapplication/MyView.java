package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
//        Paint paint = new Paint();
//        paint.setColor(Color.GREEN);
//        paint.setStrokeWidth(5);
        //canvas.drawLine(0, 0, getWidth(), getHeight(), paint);
//        for (int y = 0; y < getHeight(); y += 30) {
//            canvas.drawLine(0, y, getWidth(), y, paint);
//        }

        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300, 300, 200, paint);

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(300, 300, 200, paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(500, 500, 800, 800, paint);
    }
}
