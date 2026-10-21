package com.example.additivehomeworkandroid261021_1_8_7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class MyView extends View {
    Paint paint = new Paint();
    int N = 10;
    float[] x = new float[N];
    float[] y = new float[N];
    float[] vx = new float[N];
    float[] vy = new float[N];
    long lastTime = System.currentTimeMillis();
    boolean isStarted = false;

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        if (!isStarted) {
            for (int i = 0; i < N; i++) {
                x[i] = (float) (Math.random() * getWidth());
                y[i] = (float) (Math.random() * getHeight());
                vx[i] = (float) (Math.random() * 0.1f);
                vy[i] = (float) (Math.random() * 0.1f);
            }

            isStarted = true;
            lastTime = System.currentTimeMillis();
        }

        long nowTime = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            canvas.drawCircle(x[i], y[i], 20, paint);

            x[i] += vx[i] * (nowTime - lastTime);
            y[i] += vy[i] * (nowTime - lastTime);
        }

        lastTime = nowTime;

        invalidate();
    }
}
