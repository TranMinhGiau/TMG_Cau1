package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btnsay;
    Button btnbye;
    EditText Etxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Etxt = (EditText) findViewById(R.id.yourname);
        txt = (TextView) findViewById(R.id.mytext);
        btnsay = (Button) findViewById(R.id.buttonsay);
        btnbye = (Button) findViewById(R.id.buttonbye);
        btnsay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Xin chao: " + Etxt.getText());
            }
        });

        btnbye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Good bye: " + Etxt.getText());
            }
        });
    }


}
