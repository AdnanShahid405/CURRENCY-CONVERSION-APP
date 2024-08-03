package com.example.oht;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class conversion extends AppCompatActivity {
public EditText val2;


public Float val21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        Intent intent=getIntent();
        String message= intent.getStringExtra(Dashboard.MSG);
        TextView textView=findViewById(R.id.conversoin);
        textView.setText(message);
        String val34=intent.getStringExtra(Dashboard.val);
        val2= findViewById(R.id.input);
        val21=Float.parseFloat((val34));
    }
    private double calculate(Float height, Float weight) {
        return height*weight;
    }

    public void convert(View view)
    {
        String hei= val2.getText().toString();
        Float hh=Float.parseFloat(hei);
        float vall= (float) calculate(hh,val21);
        TextView textView=findViewById(R.id.result);
        textView.setText(String.valueOf(vall));
    }
}