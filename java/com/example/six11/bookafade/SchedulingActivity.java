package com.example.six11.bookafade;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SchedulingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduling);

        //-----------------------------------------declaring the buton----------------------------------------
        FloatingActionButton nextCal;
        //---------------------------------connecting it to the xml---------------------------------
        nextCal = (FloatingActionButton)findViewById(R.id.nextBtnCalender);
        //------------------------setting the OnClick listener---------------------------------------------
        nextCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //-----------------------------------------intent to switch Activities-------------------------------
                Intent intent = new Intent(SchedulingActivity.this, TimeActivity.class);
                startActivity(intent);
            }
        });


    }
}
