package com.example.oht;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {
    public static final String MSG = "com.example.dollarconversion";
    public static final String val = "com.example.dollarconversion1";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void dollartopkr(View view){
        Intent intent=new Intent(this,conversion.class);
        String message= "DOLLAR TO PKR CONVERSION";
        String res1="174";
        intent.putExtra(MSG,message);
        intent.putExtra(val,res1);
        startActivity(intent);


    }
    public void dollartopound(View view){
        Intent intent= new Intent(this,conversion.class);
        String message= "DOLLAR TO POUND CONVERSION";
        String res1= "0.73";
        intent.putExtra(MSG,message);
        intent.putExtra(val,res1);
        startActivity(intent);


    }
    public void dollartoeuro(View view){
        Intent intent= new Intent(this,conversion.class);
        String message= "DOLLAR TO EURO CONVERSION";
        String res1= "0.83";
        intent.putExtra(MSG,message);
        intent.putExtra(val,res1);
        startActivity(intent);

    }
    public void dollartodirham(View view){
        Intent intent= new Intent(this,conversion.class);
        String message= "DOLLAR TO DIRHAM";
        String res1= "3.67";
        intent.putExtra(MSG,message);
        intent.putExtra(val,res1);

        startActivity(intent);

    }
    public void dollartoyaun(View view){
        Intent intent= new Intent(this,conversion.class);
        String message= "DOLLAR TO YAUN CONVERSION";
        String res1= "6.44";
        intent.putExtra(MSG,message);
        intent.putExtra(val,res1);
        startActivity(intent);

    }

}