package com.example.navigationbuttom.BangunDatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.navigationbuttom.R;

public class Segitiga extends AppCompatActivity {

    EditText edpalas;
    EditText edtinggi;
    Button btnhitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        edpalas = findViewById(R.id.tvalas);
        edtinggi = findViewById(R.id.tvtinggi);
        btnhitung = findViewById(R.id.btnhitung);
        tvHasil = findViewById(R.id.tvHasil);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });
    }

    private void hitungLuasSegitiga() {
        String alasString = edpalas.getText().toString().trim();
        String tinggiString = edtinggi.getText().toString().trim();
        if (alasString.isEmpty()) {
            edpalas.setError("Masukkan alas segitiga");
            return;
        }
        else if(tinggiString.isEmpty()){
            edtinggi.setError("Masukkan tinggi segitiga");
            return;
        }

        double alas = Double.parseDouble(alasString);
        double tinggi = Double.parseDouble(tinggiString);
        double luas = 0.5 * alas * tinggi;

        tvHasil.setText("Luas Segitiga : " +luas);
    }
}