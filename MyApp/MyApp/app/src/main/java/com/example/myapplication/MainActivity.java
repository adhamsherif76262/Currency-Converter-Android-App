package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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




        Curr curr = new Curr();
        EditText usd_txt = (EditText) findViewById(R.id.Usd);
        EditText Egp_txt = (EditText) findViewById(R.id.Egp);

        Button convertbtn = (Button) findViewById(R.id.Convert);
        Button Clearbtn = (Button) findViewById(R.id.clear);


        convertbtn.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View V){

                if((usd_txt.getText().toString().equals("")) && (Egp_txt.getText().toString().equals("")) ){
                    Toast.makeText(getApplicationContext(),"Error Entry", Toast.LENGTH_LONG).show();
                }

                else if(! (Egp_txt.getText().toString().equals("")))
                {
                    float result = Float.parseFloat(Egp_txt.getText().toString());
                    curr.setCurr(result);
                    result = curr.EgpToUsd();
                    usd_txt.setText(String.valueOf(result));
                }


                else if(! (usd_txt.getText().toString().equals(""))){
                    float result = Float.parseFloat(usd_txt.getText().toString());
                    curr.setCurr(result);
                    result = curr.UsdToEgp();
                    Egp_txt.setText(String.valueOf(result));
                }

                else{
                    return;
                }


            }

        });


        Clearbtn.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View V){
                usd_txt.setText("");
                Egp_txt.setText("");
            }

        });
    }
}