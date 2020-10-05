package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button birthdayButton;
    EditText birthdayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        birthdayButton = (Button) findViewById(R.id.BirthdayButton);
        birthdayText = (EditText) findViewById(R.id.Input);
        birthdayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = birthdayText.getText().toString();
                Intent intentObj = new Intent(getApplicationContext(), finalAcrivity.class);
                intentObj.putExtra("messageKey", inputText);
                startActivity(intentObj);
            }
        });

    }
}