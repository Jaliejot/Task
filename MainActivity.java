package com.example.reza.application1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;

import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;




public class MainActivity extends AppCompatActivity {
    double income, outcome, hasil;
    EditText Pemasukan1, Pemasukan2;
    TextView Hasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pemasukan1 = (EditText) findViewById(R.id.Angka1);
        Pemasukan2 = (EditText) findViewById(R.id.Angka2);

       // balance = (Button) findViewById(R.id.Floating);

        //delete = (Button) findViewById(R.id.Delete);
        Hasil = (TextView) findViewById(R.id.Hasilnya);


    }

    public void Hasilna(View view){
        if (Pemasukan1.getText().length()==0){
            Toast.makeText(this,"angkanya masih kosong",Toast.LENGTH_LONG).show();
            return;
        }else if (Pemasukan2.getText().length()==0){
            Toast.makeText(this, "agkanya masih kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        income = Double.parseDouble(Pemasukan1.getText().toString());
        outcome = Double.parseDouble(Pemasukan2.getText().toString());
        hasil = income - outcome;
        Hasil.setText(String.valueOf(hasil));
    }


    public void Delete(View v) {
        income =0;
        outcome = 0;
        hasil = 0;
        Pemasukan1.setText(String.valueOf(income));
        Pemasukan2.setText(String.valueOf(outcome));
        Hasil.setText(String.valueOf(hasil));
    }




}
