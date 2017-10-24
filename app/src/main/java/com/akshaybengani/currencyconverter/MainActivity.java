package com.akshaybengani.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// it only change thye doller in indian rupees
    public void convert(View view)
    {
        EditText valueDoller;
        double amountRs,amountDoller;
        valueDoller=(EditText) findViewById(R.id.doller);
        amountDoller=Double.parseDouble(valueDoller.getText().toString());
        amountRs=amountDoller*67;
        Toast.makeText(MainActivity.this,""+amountRs, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInst1anceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
