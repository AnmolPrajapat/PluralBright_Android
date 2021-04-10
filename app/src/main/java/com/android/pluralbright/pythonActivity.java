package com.android.pluralbright;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class pythonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        Intent in = getIntent();
    }
    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(pythonActivity.this);
        builder.setMessage("ARE YOU WANT TO EXIT PYTHON COURSE?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        pythonActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No! continue read" , null).setCancelable(false);
        AlertDialog alr = builder.create();
        alr.show();
    }
}