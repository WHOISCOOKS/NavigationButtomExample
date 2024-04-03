package com.example.navigationbuttom.BangunRuang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.navigationbuttom.R;

public class Kubus extends AppCompatActivity {

    EditText edpanjang;
    Button btnhitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        edpanjang = findViewById(R.id.tvpanjang);
        btnhitung = findViewById(R.id.btnhitung);
        tvHasil = findViewById(R.id.tvHasil);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasKubus();
            }
        });
    }

    private void hitungLuasKubus() {
        String panjangString = edpanjang.getText().toString().trim();

        if (panjangString.isEmpty()) {
            edpanjang.setError("Masukkan panjang sisi");
            return;
        }

        double panjang = Double.parseDouble(panjangString);

        double luas = 6 * panjang * panjang;

        tvHasil.setText("Luas Kubus : " +luas);
    }
}