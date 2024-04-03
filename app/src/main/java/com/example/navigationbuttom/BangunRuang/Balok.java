package com.example.navigationbuttom.BangunRuang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.navigationbuttom.R;

public class Balok extends AppCompatActivity {

    EditText edpanjang;
    EditText edlebar;
    EditText edtinggi;
    Button btnhitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        edpanjang = findViewById(R.id.tvpanjang);
        edlebar = findViewById(R.id.tvlebar);
        edtinggi = findViewById(R.id.tvtinggi);
        btnhitung = findViewById(R.id.btnhitung);
        tvHasil = findViewById(R.id.tvHasil);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasbalok();
            }
        });
    }

    private void hitungLuasbalok() {
        String panjangString = edpanjang.getText().toString().trim();
        String lebarString = edlebar.getText().toString().trim();
        String tinggiString = edtinggi.getText().toString().trim();
        if (panjangString.isEmpty()) {
            edpanjang.setError("Masukkan panjang balok");
            return;
        } else if (lebarString.isEmpty()) {
            edlebar.setError("Masukkan lebar balok");
            return;
        }
        else if (tinggiString.isEmpty()) {
            edlebar.setError("Masukkan tinggi balok");
            return;
        }

        double panjang = Double.parseDouble(panjangString);
        double tinggi = Double.parseDouble(tinggiString);
        double lebar = Double.parseDouble(lebarString);
        double luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        tvHasil.setText("Luas balok: " + luas);
    }
}