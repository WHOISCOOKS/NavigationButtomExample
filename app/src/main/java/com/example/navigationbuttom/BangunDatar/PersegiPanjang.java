package com.example.navigationbuttom.BangunDatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.navigationbuttom.R;

public class PersegiPanjang extends AppCompatActivity {

    EditText edpanjang;
    EditText edlebar;
    Button btnhitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        edpanjang = findViewById(R.id.tvpanjang);
        edlebar = findViewById(R.id.tvlebar);
        btnhitung = findViewById(R.id.btnhitung);
        tvHasil = findViewById(R.id.tvHasil);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegiPanjang();
            }
        });
    }

    private void hitungLuasPersegiPanjang() {
        String panjangString = edpanjang.getText().toString().trim();
        String lebarString = edlebar.getText().toString().trim();
        if (panjangString.isEmpty()) {
            edpanjang.setError("Masukkan panjang persegi panjang");
            return;
        }
        else if(lebarString.isEmpty()){
            edlebar.setError("Masukkan lebar persegi panjang");
            return;
        }

        double panjang = Double.parseDouble(panjangString);
        double lebar = Double.parseDouble(lebarString);
        double luas = panjang * lebar;

        tvHasil.setText("Luas Persegi Panjang: " +luas);
    }
}