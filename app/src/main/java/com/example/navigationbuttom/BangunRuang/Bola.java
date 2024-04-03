package com.example.navigationbuttom.BangunRuang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.navigationbuttom.R;

public class Bola extends AppCompatActivity {

    EditText edjarijari;
    Button btnhitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        edjarijari = findViewById(R.id.tvjarijari);
        btnhitung = findViewById(R.id.btnhitung);
        tvHasil = findViewById(R.id.tvHasil);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasBola();
            }
        });
    }

    private void hitungLuasBola() {
        String jariJariString = edjarijari.getText().toString().trim();

        if (jariJariString.isEmpty()) {
            edjarijari.setError("Masukkan jari-jari bola");
            return;
        }

        double jariJari = Double.parseDouble(jariJariString);

        double luas = 4 * Math.PI * Math.pow(jariJari, 2);

        tvHasil.setText("Luas permukaan bola: " + luas);
    }
}