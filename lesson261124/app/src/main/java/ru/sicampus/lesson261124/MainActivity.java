package ru.sicampus.lesson261124;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import ru.sicampus.lesson261124.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());


        setContentView(binding.getRoot());

        //Button btn = findViewById(R.id.btn_click);

        binding.btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++count;

                binding.tvCounter.setText(Integer.toString(count));
            }
        });

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