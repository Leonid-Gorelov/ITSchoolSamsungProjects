package com.example.additivehomeworkandroid261022_1_8_8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import androidx.annotation.NonNull;

public class MyGraph extends View {
    double xe, ye, w;
    double x, y, h = 0.1;
    int k = 100;
    double xmin = -4, xmax = 4;
    Paint paint = new Paint();

    public MyGraph(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        int x0 = getWidth() / 2;
        int y0 = getHeight() / 2;

        paint.setStrokeWidth(5);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(30f);

        canvas.drawLine(x0, 0, x0, getHeight(), paint);
        canvas.drawText("Y", getWidth() / 2 + 10, 35, paint);
        canvas.drawLine(0, y0, getWidth(), y0, paint);
        canvas.drawText("X", getWidth() - 50, getHeight() / 2 + 50, paint);

        Path path = new Path();
        boolean first = true;
        paint.setColor(Color.BLUE);

        for (x = xmin; x < xmax; x += h) {
            y = Math.abs(x);
            xe = x0 + k * x;
            ye = y0 - k * y;

            if (first) {
                path.moveTo((float) xe, (float) ye);
                first = false;
            } else {
                path.lineTo((float) xe, (float) ye);
            }

            canvas.drawPath(path, paint);
        }

        Path path2 = new Path();
        first = true;
        paint.setColor(Color.RED);

        for (x = xmin; x < xmax; x += h) {
            y = -x * x + 3;
            xe = x0 + k * x;
            ye = y0 - k * y;

            if (first) {
                path2.moveTo((float) xe, (float) ye);
                first = false;
            } else {
                path2.lineTo((float) xe, (float) ye);
            }

            canvas.drawPath(path2, paint);
        }
    }
}
