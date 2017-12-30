package com.example.six11.bookafade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class PayActivity extends  AppCompatActivity{
    //--------------------declaring the second text view and buttons-----------------------
    ImageButton cash;

 TextView tv2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        tv2 = (TextView) findViewById(R.id.priceView2);
        cash = (ImageButton)findViewById(R.id.cashBtn);


        //--------------------------------------on click listeners--------------------------
        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(PayActivity.this, VerificationActivity.class);
                startActivity(intent);
            }
        });


    }


}
