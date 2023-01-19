package com.example.assignment1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Conversion_Button = (Button) findViewById(R.id.Convert_Button);
        Button Clear_Button = (Button) findViewById(R.id.Clear_Button);
        TextView Currency_Text_View = (TextView) findViewById(R.id.Currency_Text_View);
        Currency_Text_View.setText("U.S Dollar");
        Clear_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText EGP_EditText = (EditText) findViewById(R.id.Egyptian_Pound_EditText);
                EditText Currency_EditText = (EditText) findViewById(R.id.Currency_EditText);
                EGP_EditText.setText("");
                Currency_EditText.setText("");
                Toast.makeText(getApplicationContext(),"Data Erased",Toast.LENGTH_LONG).show();
            }
        });
        Conversion_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Currency currency = new Currency();
                EditText EGP_EditText = (EditText) findViewById(R.id.Egyptian_Pound_EditText);
                EditText Currency_EditText = (EditText) findViewById(R.id.Currency_EditText);
                if((!(EGP_EditText.getText().toString().equals(""))) || (!(Currency_EditText.getText().toString().equals("")))){
                    if(!(EGP_EditText.getText().toString().equals(""))){
                        float egp = Float.parseFloat(((EditText) findViewById(R.id.Egyptian_Pound_EditText)).getText().toString());
                        currency.setCurrency((float)20);
                        currency.setEgyptian_Pound(egp);
                        float Conversion_Result = currency.To_Currency();
                        EditText To_Currency_EditText = (EditText) findViewById(R.id.Currency_EditText);
                        To_Currency_EditText.setText(String.valueOf(Conversion_Result));
                    }
                    else if(!(Currency_EditText.getText().toString().equals(""))){

                        float curr = Float.parseFloat(((EditText) findViewById(R.id.Currency_EditText)).getText().toString());
                        currency.setCurrency(curr);
                        currency.setEgyptian_Pound((float)20);
                        float Conversion_Result = currency.To_EGP();
                        EditText To_EGP_EditText = (EditText) findViewById(R.id.Egyptian_Pound_EditText);
                        To_EGP_EditText.setText(String.valueOf(Conversion_Result));
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(),"Invalid Data - Try Again",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}