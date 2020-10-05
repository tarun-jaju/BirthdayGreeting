package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finalAcrivity extends AppCompatActivity {
     TextView receivedMessage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_acrivity);
        receivedMessage=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
        String str=intent.getStringExtra("messageKey");
        receivedMessage.setText("Happy Birthday\n" + str);

    }
}