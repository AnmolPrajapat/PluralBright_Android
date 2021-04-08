package com.android.pluralbright;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edName, edPass, edCpass;
    Button btnCreate;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.login:
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_login,null);
                EditText un, pp;
                un= (EditText)view.findViewById(R.id.email);
                pp=(EditText)view.findViewById(R.id.logPass);
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Login here")
                        .setView(view)
                        .setPositiveButton("LogIn", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String uun= un.getText().toString();
                                String ppp= pp.getText().toString();
                                if(uun.equals("Anmol")&& ppp.equals("1985")){
                                    Toast.makeText(MainActivity.this,"login successfull",Toast.LENGTH_SHORT).show();
                                }
                                else
                                    Toast.makeText(MainActivity.this,"unsuccessfull login",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("cancel",null).setCancelable(false);
                AlertDialog alert = builder.create();
                alert.show();
                break;

//                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(intent);
            case R.id.about:
                Intent intent1 = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent1);
                break;
            case  R.id.settings:
                Intent intent2 = new Intent(MainActivity.this,SettingsActivity.class);
                startActivity(intent2);
                break;
            case R.id.Mail:
                Intent intent3 = new Intent(MainActivity.this,MailActivity.class);
                startActivity(intent3);
                break;
            case R.id.feedback:
                Intent intent4 = new Intent(MainActivity.this,FeedbackActivity.class);
                startActivity(intent4);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName=(EditText)findViewById(R.id.userName);
        edPass=(EditText)findViewById(R.id.password);
        edCpass=(EditText)findViewById(R.id.Cpassword);

        btnCreate=(Button)findViewById(R.id.Create);


        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String un = edName.getText().toString();
                String p = edPass.getText().toString();
//                String cp = edCpass.getText().toString();
                    Toast.makeText(MainActivity.this, "ID :" + un + "\n password :" + p, Toast.LENGTH_SHORT).show();
            }
        });


    }
    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit App")
                .setMessage("Really want to quit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No",null).setCancelable(false);
        AlertDialog alert = builder.create();
        alert.show();
    }
}