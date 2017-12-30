package com.example.six11.bookafade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
  //-------------------------------declaring a buton and connecting it to the XML--------------------------------------
        Button banBtn;
        Button b2;
        banBtn = (Button)findViewById(R.id.bnBtn);
        b2 = (Button) findViewById(R.id.book2Btn);

  //-------------------------------setting an onclick listener for the button------------------------------------------

        banBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //-----------creates an intent that will switch the activity to the next one---------------------
                Intent intent = new Intent(Main2Activity.this, ServiceActivity.class);
                startActivity(intent);
            }
        });
 //--t----------------------this programms the item button to switch to the services sctivity----------------------------
        Button item1Btn;
        item1Btn = (Button) findViewById(R.id.book1Btn);
        item1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, ServiceActivity.class);
                startActivity(intent);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, PersonalInfoActivity.class);
                startActivity(intent);
            }
        });


    }
}
