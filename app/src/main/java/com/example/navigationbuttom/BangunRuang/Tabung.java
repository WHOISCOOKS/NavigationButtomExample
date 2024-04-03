package com.example.navigationbuttom.BangunRuang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.navigationbuttom.R;

public class Tabung extends AppCompatActivity {

    EditText edjarijari;
    EditText edtinggi;
    Button btnhitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        edjarijari = findViewById(R.id.tvjarijari);
        edtinggi = findViewById(R.id.tvtinggi);
        btnhitung = findViewById(R.id.btnhitung);
        tvHasil = findViewById(R.id.tvHasil);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasTabung();
            }
        });
    }

    private void hitungLuasTabung() {
        String jariJariString = edjarijari.getText().toString().trim();
        String tinggiString = edtinggi.getText().toString().trim();

        if (jariJariString.isEmpty()) {
            edjarijari.setError("Masukkan jari-jari tabung");
            return;
        } else if (tinggiString.isEmpty()) {
            edtinggi.setError("Masukkan tinggi tabung");
            return;
        }

        double jariJari = Double.parseDouble(jariJariString);
        double tinggi = Double.parseDouble(tinggiString);

        double luas = 2 * Math.PI * jariJari * (jariJari + tinggi);

        tvHasil.setText("Luas permukaan tabung: " + luas);
    }
}