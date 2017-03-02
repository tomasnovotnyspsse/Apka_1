package com.example.tom_pc.apka_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_Apka_1 extends AppCompatActivity {

    private EditText Vstup_Vysk;
    private EditText Vstup_Hmot;
    private TextView outBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__apka_1);

        Vstup_Hmot = (EditText) findViewById(R.id.Vstup_vaha);
        Vstup_Vysk = (EditText) findViewById(R.id.Vstup_vyska);
        outBMI = (TextView) findViewById(R.id.Vystup);
    }

    public void onButtonTapMe(View view){
        Toast myToast = Toast.makeText(
                getApplication(), "Nelehtej me", Toast.LENGTH_SHORT
        );
        myToast.show();
    }

    public void onButtonBMI(View view){

        double vaha=0,vyska=0,bmi;

        try {
            vaha = Double.parseDouble(Vstup_Hmot.getText().toString());
            vyska = Double.parseDouble(Vstup_Vysk.getText().toString());
        }   catch (NumberFormatException e){

            Toast myToast = Toast.makeText(getApplication(), "Špatný vstup!", Toast.LENGTH_SHORT);
            myToast.show();
        }

        finally {
            if (vaha!=0 && vyska !=0) {
                bmi = vaha / Math.pow(vyska / 100,2);
                outBMI.setText(String.valueOf(bmi));
            }
        }

    }


}
