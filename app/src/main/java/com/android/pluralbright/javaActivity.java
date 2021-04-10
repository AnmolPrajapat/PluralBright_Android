package com.android.pluralbright;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class javaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        Intent intent = getIntent();
    }
    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(javaActivity.this);
        builder.setMessage("ARE YOU WANT TO EXIT JAVA COURSE?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        javaActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No! continue read" , null).setCancelable(false);
        AlertDialog alr = builder.create();
        alr.show();
    }
}