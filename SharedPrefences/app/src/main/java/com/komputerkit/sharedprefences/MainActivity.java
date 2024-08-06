package com.komputerkit.sharedprefences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView etBarang, etStok;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        load();
    }

    public void load() {
        etBarang =findViewById(R.id.etBarang);
        etStok =findViewById(R.id.etStok);
        sharedPreferences = getSharedPreferences("barang", MODE_PRIVATE);
    }
    public void isiSharedPrefrences(String barang, float stok){
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("barang",barang);
        editor.putFloat("stok", stok);
        editor.apply();
    }

    public void simpan(View view) {
        String barang = etBarang.getText().toString();
        float stok = Float.parseFloat(etStok.getText().toString());
        if (barang.isEmpty() || stok ==0.0) {
            Toast.makeText(this, "Data Kosong", Toast.LENGTH_SHORT).show();
        }else {
            isiSharedPrefrences(barang,stok);
            Toast.makeText(this, "Data Sudah Di Simpan", Toast.LENGTH_SHORT).show();
        }
        etBarang.setText("");
        etStok.setText("");
    }

    public void tampil(View view) {
    }
}