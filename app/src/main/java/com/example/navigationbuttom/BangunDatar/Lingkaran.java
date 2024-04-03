package com.example.navigationbuttom.BangunDatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.navigationbuttom.R;

public class Lingkaran extends AppCompatActivity {

    EditText edphi;
    Button btnhitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        edphi = findViewById(R.id.tvphi);
        btnhitung = findViewById(R.id.btnhitung);
        tvHasil = findViewById(R.id.tvHasil);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuassegitiga();
            }
        });
    }

    private void hitungLuassegitiga() {
        String phi = edphi.getText().toString().trim();

        if (phi.isEmpty()) {
            edphi.setError("Masukkan jari jari lingkaran");
            return;
        }

        double phi_ = Double.parseDouble(phi);
        double luas = 3.14159265358979323846 * phi_ * phi_;

        tvHasil.setText("Luas Lingkaran : " +luas);
    }
}