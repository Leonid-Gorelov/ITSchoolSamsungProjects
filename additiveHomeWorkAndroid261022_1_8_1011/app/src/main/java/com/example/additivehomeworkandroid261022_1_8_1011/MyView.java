package com.example.additivehomeworkandroid261022_1_8_1011;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.view.View;

import androidx.annotation.NonNull;

public class MyView extends View {
    int N = 15;
    int[] l = new int[N];
    double x0, y0;
    double[] x = new double[N];
    double[] y = new double[N];
    int[] size = new int[N];
    int[] red = new int[N];
    int[] green = new int[N];
    int[] blue = new int[N];
    double g = 9.832f, pi = Math.PI;
    double[] w = new double[N];
    double fi0;
    double[] fi = new double[N];
    int t = 0, deltaT = 1;

    public MyView(Context context) {
        super(context);
        makePedulum();
        makeBalls();

        MyTimer timer = new MyTimer();
        timer.start();
    }

    void fillArrayRandrom(int[] a, int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
    }

    void makeBalls() {
        fillArrayRandrom(size, 10, 25);
        fillArrayRandrom(red, 50, 255);
        fillArrayRandrom(green, 50, 255);
        fillArrayRandrom(blue, 50, 255);
    }

    void makePedulum() {
        fi0 = pi / 4;
        int l_min = 100;

        for (int i = 0; i < N; i++) {
            l[i] = l_min;
            l_min += 50;
            w[i] = Math.sqrt(g / l[i]);
        }
    }

    void movePendulum() {
        t += deltaT;

        for (int i = 0; i < N; i++) {
            fi[i] = fi0 * Math.cos(w[i] * t);
            x[i] = l[i] * Math.sin(fi[i]);
            y[i] = l[i] * Math.cos(fi[i]);
        }
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        x0 = getWidth() / 2;
        y0 = getHeight() / 2;

        canvas.drawCircle((float) x0, (float) y0, 5, paint);

        for (int i = 0; i < N; i++) {
            paint.setColor(Color.BLUE);
            canvas.drawLine((float) x0, (float) y0, (float) (x0 + x[i]), (float) (y0 + y[i]), paint);
            paint.setColor(Color.rgb(red[i], green[i], blue[i]));
            canvas.drawCircle((float) (x0 + x[i]), (float) (y0 + y[i]), size[i], paint);
        }
    }

    void nextFrame() {
        movePendulum();
        invalidate();
    }

    class MyTimer extends CountDownTimer {
        MyTimer() {
            super(100000, 100);
        }

        @Override
        public void onFinish() {

        }

        @Override
        public void onTick(long l) {
            nextFrame();
        }
    }
}
