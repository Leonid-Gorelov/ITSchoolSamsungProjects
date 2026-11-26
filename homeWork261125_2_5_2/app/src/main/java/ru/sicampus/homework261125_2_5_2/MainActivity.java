package ru.sicampus.homework261125_2_5_2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.sicampus.homework261125_2_5_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final String logIn = "admin";
    private final String password = "password";

    private TextView logInInput;
    private TextView passwordInput;
    private Button logInButton;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());

        logInInput = activityMainBinding.logInInput;
        passwordInput = activityMainBinding.passwordInput;
        logInButton = activityMainBinding.logInButton;
        textResult = activityMainBinding.textResult;

        logInButton.setOnClickListener(view -> {
            if (!logIn.contentEquals(logInInput.getText()) || !password.contentEquals(passwordInput.getText())) {
                setText(textResult, "Вы ошиблись в логине или пароле", Color.RED);
            } else {
                setText(textResult, "Верно", Color.GREEN);
            }

            cleanInput(logInInput);
            cleanInput(passwordInput);
        });
    }

    private void setText(TextView textView, String text, int color) {
        textView.setText(text);
        textView.setTextColor(color);
    }

    private void cleanInput(TextView textView) {
        textView.setText("");
    }
}
