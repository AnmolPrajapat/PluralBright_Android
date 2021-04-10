package com.android.pluralbright;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CourseActivity extends AppCompatActivity {
    Button btnjava, btnpython, btncpp, btnandroid, btnweb, btnreaact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Intent intent = getIntent();
        btnjava = (Button) findViewById(R.id.java);
        btnpython = (Button) findViewById(R.id.python);
        btncpp = (Button) findViewById(R.id.cpp);
        btnandroid = (Button) findViewById(R.id.android);
        btnweb = (Button) findViewById(R.id.web);
        btnreaact = (Button) findViewById(R.id.react);

        btnjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, javaActivity.class);
                startActivity(intent);
            }
        });
        btnpython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this, pythonActivity.class);
                startActivity(intent);
            }
        });
        btncpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(CourseActivity.this,cppActivity.class);
//                startActivity(intent);
                Toast.makeText(CourseActivity.this, "cpp course enrolled", Toast.LENGTH_SHORT).show();
            }
        });
        btnandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(CourseActivity.this,androidActivity.class);
//                startActivity(intent);
                Toast.makeText(CourseActivity.this, "App development course enrolled", Toast.LENGTH_SHORT).show();
            }
        });
        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(CourseActivity.this,webActivity.class);
//                startActivity(intent);
                Toast.makeText(CourseActivity.this, "web development course enrolled", Toast.LENGTH_SHORT).show();
            }
        });
        btnreaact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(CourseActivity.this,reactActivity.class);
//                startActivity(intent);
                Toast.makeText(CourseActivity.this, "React course enrolled", Toast.LENGTH_SHORT).show();
            }
        });


    }
    @Override
    public void onBackPressed () {
        AlertDialog.Builder builder = new AlertDialog.Builder(CourseActivity.this);
        builder.setMessage("Go to main menu")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        CourseActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No stay on this activity", null).setCancelable(false);
        AlertDialog alr = builder.create();
        alr.show();
    }
    }
