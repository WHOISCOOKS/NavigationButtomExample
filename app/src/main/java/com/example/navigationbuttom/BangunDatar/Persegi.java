package com.example.navigationbuttom.BangunDatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.navigationbuttom.R;

public class Persegi extends AppCompatActivity {

    EditText edpanjang;
    Button btnhitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        edpanjang = findViewById(R.id.tvpanjang);
        btnhitung = findViewById(R.id.btnhitung);
        tvHasil = findViewById(R.id.tvHasil);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });
    }

    private void hitungLuasPersegi() {
        String panjangString = edpanjang.getText().toString().trim();

        if (panjangString.isEmpty()) {
            edpanjang.setError("Masukkan panjang persegi");
            return;
        }

        double panjang = Double.parseDouble(panjangString);

        double luas = panjang * panjang;

        tvHasil.setText("Luas Persegi : " +luas);
}
}