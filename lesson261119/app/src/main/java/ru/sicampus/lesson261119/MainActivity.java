package ru.sicampus.lesson261119;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "Стартанул onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity", "Стартанул onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity", "Стартанул onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity", "Стартанул onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MainActivity", "Стартанул onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("MainActivity", "Стартанул onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("MainActivity", "Стартанул onRestart");
    }
}