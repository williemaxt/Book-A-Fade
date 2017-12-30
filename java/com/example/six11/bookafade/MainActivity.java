package com.example.six11.bookafade;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//-----------------------------declaring the button---------------------------------------------------
        Button book;
        book = (Button)findViewById(R.id.bookbtn);
        FloatingActionButton barBtn;
        barBtn = (FloatingActionButton)findViewById(R.id.floatingActionButton);
//----------------------setting an onclick listener for the login button------------------------------------
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });

//----------------------------------barberlogin begins---------------------------------------------------
        barBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.login_dialogue, null);
                Button mLogin = (Button) mView.findViewById(R.id.buttonLogin);
                final EditText mEmail = (EditText) mView.findViewById(R.id.emailBx);
                final EditText mPassword = (EditText) mView.findViewById(R.id.pwBx);
                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(MainActivity.this, BarberActivity.class);
                            startActivity(intent);

                    }
                });
                //---------------this code sets the dialogue visible-------------------------------------------------
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });

    }
}
