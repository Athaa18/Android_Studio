package com.komputerkit.konversisuhu;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        load();
        isiSpinner();
    }
    public void load(){
        spinner = findViewById(R.id.spinner);
    }

    public  void isiSpinner(){
        String[] isi = {"Celcius To Remaur", "Celcius To Fahrenhelt", "Celcius To Kelvin"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,isi);
        spinner.setAdapter(adapter);
    }

    public void btnKonversi(View view) {
        String pilihan =spinner.getSelectedItem().toString();

        System.out.println(pilihan);
    }
}