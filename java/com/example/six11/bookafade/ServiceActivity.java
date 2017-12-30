package com.example.six11.bookafade;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class ServiceActivity extends AppCompatActivity {

    String dsign = "$ ";
    TextView tv1;
    //public static Double total = 0.00;
   Double total = 0.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        //--------------------------declaring the button------------------------------------
        FloatingActionButton nextService;

        //-------------------------------declaring the textview-----------------------------


        //---------------------------declaring the checkboxes-------------------------------
        final CheckBox cb1, cb2, cb3, cb4, cb5;






        //----------------------connecting button to the xml--------------------------------
        nextService = (FloatingActionButton)findViewById(R.id.selectionConfirm);
        nextService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //---------------------setting onclick listener and intent------------------
                Intent intent = new Intent(ServiceActivity.this, PersonalInfoActivity.class);
                startActivity(intent);
            }
        });


        //-------------------------------writing boiler plate code to attach all check boxes and textview to this document----------------------

        cb1 = (CheckBox)findViewById(R.id.cbox1);
        cb2 = (CheckBox)findViewById(R.id.cbox2);
        cb3 = (CheckBox)findViewById(R.id.cbox3);
        cb4 = (CheckBox)findViewById(R.id.cbox4);
        cb5 = (CheckBox)findViewById(R.id.cbox5);
        tv1 = (TextView)findViewById(R.id.priceView1);








        //--------------------------------settong onclick listeners for checkboxes and textview-----------------------------------------

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //----------------------the if else statement will add and subtract if the box is checked or unchecked----------------------------
                if(cb1.isChecked()){

                    total = total+10.00;
                    tv1.setText(dsign+total);

                }

                else{
                    total = total-10.00;
                    tv1.setText(dsign+total);
                }

            }

        });



        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cb2.isChecked()){

                    total = total+15.00;
                    tv1.setText(dsign+total);

                }

                else{
                    total = total-15.00;
                    tv1.setText(dsign+total);
                }


            }
        });



        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb3.isChecked()){

                    total = total+15.00;
                    tv1.setText(dsign+total);

                }

                else{
                    total = total-15.00;
                    tv1.setText(dsign+total);
                }
            }
        });



        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb4.isChecked()){

                    total = total+8.00;
                    tv1.setText(dsign+total);
                }

                else{
                    total = total-8.00;
                    tv1.setText(dsign+total);
                }
            }
        });



        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb5.isChecked()){

                    total = total+5.00;
                    tv1.setText(dsign+total);
                }

                else{
                    total = total-5.00;
                    tv1.setText(dsign+total);
                }
            }
        });







    }
}
