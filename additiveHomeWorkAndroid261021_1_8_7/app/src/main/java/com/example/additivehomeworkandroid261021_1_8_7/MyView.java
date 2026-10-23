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
            fillRandom(x, getWidth());
            fillRandom(y, getHeight());
            fillRandom(vx, 0.1f);
            fillRandom(vy, 0.1f);

            isStarted = true;
            lastTime = System.currentTimeMillis();
        }

        long nowTime = System.currentTimeMillis();

        drawBalls(canvas);

        add(x, vx, (nowTime - lastTime));
        add(y, vy, (nowTime - lastTime));

        tryToChangeSpeed(vx, x, getWidth());
        tryToChangeSpeed(vy, y, getHeight());

        lastTime = nowTime;

        invalidate();
    }

    float rand(float multiplayer){
        return (float) (Math.random() * multiplayer);
    }

    void fillRandom(float[] array, float multiplayer){
        for (int i = 0; i < array.length; i++) {
            array[i] = rand(multiplayer);
        }
    }

    void add(float[] array, float[] values, float multiplayer){
        for (int i = 0; i < array.length; i++) {
            array[i] += values[i] * multiplayer;
        }
    }

    void tryToChangeSpeed(float[] array, float[] arrayToCheck, float valueToCheck){
        for (int i = 0; i < array.length; i++) {
            if (arrayToCheck[i] > valueToCheck || arrayToCheck[i] < 0){
                array[i] = -array[i];
            }
        }
    }

    void drawBalls(Canvas canvas){
        for (int i = 0; i < N; i++) {
            canvas.drawCircle(x[i], y[i], 20, paint);
        }
    }
}
