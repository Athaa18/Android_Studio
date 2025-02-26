package com.komputerkit.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        load();
    }
    public void load(){
        tvHasil= findViewById(R.id.tvHasil);
    }

    public void btnUP(View view) {
        count++;
        tvHasil.setText(count+"");
    }
    public void btnDown(View view) {
        count--;
        tvHasil.setText(count+"");
    }
}