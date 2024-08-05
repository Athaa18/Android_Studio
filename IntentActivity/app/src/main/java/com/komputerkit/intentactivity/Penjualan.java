package com.komputerkit.intentactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Penjualan extends AppCompatActivity {

    TextView tvjual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_penjualan);
        load();
        ambilData();
    }
    public  void load(){
        tvjual = findViewById(R.id.tvJual);
    }
    public void ambilData(){
        String ambil = getIntent().getStringExtra("ISI");
        tvjual.setText(ambil);
    }
}