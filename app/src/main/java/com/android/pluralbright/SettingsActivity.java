package com.android.pluralbright;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
    Button btProfile,btPrivacy,btHistory,btStorage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent intent = getIntent();

        btProfile=(Button)findViewById(R.id.btnProfile);
        btPrivacy=(Button)findViewById(R.id.btnPrivacy);
        btHistory=(Button)findViewById(R.id.btnHistory);
        btStorage=(Button)findViewById(R.id.btnStorage);

//        btPrivacy.setBackgroundResource(android.R.drawable.btn_default);
        btProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  you can intent other activity for privacy also
                Toast.makeText(SettingsActivity.this,"You can not directly modify your profile",Toast.LENGTH_SHORT).show();
            }
        });
        btPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  you can intent other activity for privacy also
                Toast.makeText(SettingsActivity.this,"You can not directly modify your privacy",Toast.LENGTH_SHORT).show();
            }
        });
        btHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  you can intent other activity for privacy also
                Toast.makeText(SettingsActivity.this,"You can not directly view hisory",Toast.LENGTH_SHORT).show();
            }
        });
        btStorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  you can intent other activity for privacy also
                Toast.makeText(SettingsActivity.this,"View your storage",Toast.LENGTH_SHORT).show();
            }
        });
    }
}