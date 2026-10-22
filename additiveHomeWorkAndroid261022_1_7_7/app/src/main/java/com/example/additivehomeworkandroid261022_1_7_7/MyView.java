package com.example.additivehomeworkandroid261022_1_7_7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        for (int x = -getWidth(); x < getWidth(); x += 30) {
            canvas.drawLine(x, 0, x + getWidth(), getHeight(), paint);
        }

        for (int x = getWidth(); x > -getWidth(); x -= 30) {
            canvas.drawLine(x + getWidth(), 0, x, getHeight(), paint);
        }
    }
}
