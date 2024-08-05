package com.komputerkit.recyclerviewcardview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }
    public void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void isiData(){
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Rusdi","Ngawi"));
        siswaList.add(new Siswa("Andre","Ngawi"));
        siswaList.add(new Siswa("Rudi","Ngawi"));
        siswaList.add(new Siswa("Rusi","Ngawi"));
        siswaList.add(new Siswa("Rara","Ngawi"));
        siswaList.add(new Siswa("Roman","Ngawi"));
        siswaList.add(new Siswa("Bintang","Ngawi"));
        siswaList.add(new Siswa("Arka","Ngawi"));
        siswaList.add(new Siswa("Erpan","Ngawi"));
        siswaList.add(new Siswa("Rere","Ngawi"));
        siswaList.add(new Siswa("Dafa","Ngawi"));
        siswaList.add(new Siswa("Onel","Ngawi"));
        siswaList.add(new Siswa("Budi","Ngawi"));
        siswaList.add(new Siswa("Riski","Ngawi"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }
}