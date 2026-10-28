package ru.samsung.itschool.book.cells;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;


import task.Stub;
import task.Task;

public class CellsActivity extends AppCompatActivity {

    private final Context context = this;

    private int WIDTH = 10;
    private int HEIGHT = 10;

    private Button[][] cells;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cells);
        makeCells();

        generate();

    }

    void generate() {

        //Эту строку нужно удалить
        //Task.showMessage(this, "Добавьте код в функцию активности generate() для генерации клеточного поля");


        for (int i = 0, number = 1; i < HEIGHT; i++)
            for (int j = 0; j < WIDTH; j++, number++) {
                cells[i][j].setText(number + "");
                //cells[i][j].setBackgroundColor(randomColor());
                int currentColor = randomize(0, 100) > 50 ? Color.WHITE : Color.BLACK;
                cells[i][j].setBackgroundColor(currentColor);

                cells[i][j].setTextColor(currentColor == Color.WHITE ? Color.BLACK : Color.WHITE);
            }
    }

    /*
     * NOT FOR THE BEGINNERS
     * ==================================================
     */

    int randomColor() {
        return Color.rgb(randomize(0, 255), randomize(0, 255), randomize(0, 255));
    }

    int randomize(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    int getX(View v) {
        return Integer.parseInt(((String) v.getTag()).split(",")[1]);
    }

    int getY(View v) {
        return Integer.parseInt(((String) v.getTag()).split(",")[0]);
    }

    void makeCells() {
        cells = new Button[HEIGHT][WIDTH];
        GridLayout cellsLayout = (GridLayout) findViewById(R.id.CellsLayout);
        cellsLayout.removeAllViews();
        cellsLayout.setColumnCount(WIDTH);
        for (int i = 0; i < HEIGHT; i++)
            for (int j = 0; j < WIDTH; j++) {
                LayoutInflater inflater = (LayoutInflater) getApplicationContext()
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                cells[i][j] = (Button) inflater.inflate(R.layout.cell, cellsLayout, false);
                cells[i][j].setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Эту строку нужно удалить
                        //Stub.show(context, "Добавьте код в функцию активности onClick() - реакцию на нажатие на клетку");

                        Button tappedCell = (Button) v;

                        //Получаем координтаты нажатой клетки
                        int tappedX = getX(tappedCell);
                        int tappedY = getY(tappedCell);
                        //ADD YOUR CODE HERE
                        //....

                        setColor(cells[tappedY][tappedX]);

                        System.out.println("Click");
                        for (int k = 0; k < WIDTH; k++) {
                            //cells[tappedY][k].setBackgroundColor(Color.WHITE);
//                            int currentColor = ((ColorDrawable)(cells[tappedY][k].getBackground())).getColor();
//
//                            System.out.println(currentColor);
//
//                            if(currentColor == Color.WHITE){
//                                cells[tappedY][k].setBackgroundColor(Color.BLACK);
//                                cells[tappedY][k].setTextColor(Color.WHITE);
//                            } else {
//                                cells[tappedY][k].setBackgroundColor(Color.WHITE);
//                                cells[tappedY][k].setTextColor(Color.BLACK);
//                            }
                            setColor(cells[tappedY][k]);
                        }

                        for (int k = 0; k < HEIGHT; k++) {
                            //cells[k][tappedX].setBackgroundColor(Color.WHITE);
//                            int currentColor = ((ColorDrawable)(cells[k][tappedX].getBackground())).getColor();
//
//                            if(currentColor == Color.WHITE){
//                                cells[k][tappedX].setBackgroundColor(Color.BLACK);
//                                cells[k][tappedX].setTextColor(Color.WHITE);
//                            } else {
//                                cells[k][tappedX].setBackgroundColor(Color.WHITE);
//                                cells[k][tappedX].setTextColor(Color.BLACK);
//                            }
                            setColor(cells[k][tappedX]);
                        }
                    }
                });
                cells[i][j].setOnLongClickListener(new OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        Button tappedCell = (Button) v;
                        int tappedX = getX(tappedCell);
                        int tappedY = getY(tappedCell);

                        //Эту строку нужно удалить
                        //Stub.show(context, "Добавьте код в функцию активности onLongClick() - реакцию на долгое нажатие на клетку");
                        setColor(cells[tappedY][tappedX]);
                        return false;
                    }
                });
                cells[i][j].setTag(i + "," + j);
                cellsLayout.addView(cells[i][j]);
            }
    }

    void setColor(Button cell) {
        int currentColor = ((ColorDrawable) (cell.getBackground())).getColor();

        if (currentColor == Color.WHITE) {
            cell.setBackgroundColor(Color.BLACK);
            cell.setTextColor(Color.WHITE);
        } else {
            cell.setBackgroundColor(Color.WHITE);
            cell.setTextColor(Color.BLACK);
        }
    }
}