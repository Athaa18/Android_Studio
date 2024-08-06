package com.komputerkit.recyclerviewcardview;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> SiswaList;

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
        SiswaList = new ArrayList<Siswa>();
        SiswaList.add(new Siswa("Rusdi","Ngawi"));
        SiswaList.add(new Siswa("Andre","Ngawi"));
        SiswaList.add(new Siswa("Rudi","Ngawi"));
        SiswaList.add(new Siswa("Rusi","Ngawi"));
        SiswaList.add(new Siswa("Rara","Ngawi"));
        SiswaList.add(new Siswa("Roman","Ngawi"));
        SiswaList.add(new Siswa("Bintang","Ngawi"));
        SiswaList.add(new Siswa("Arka","Ngawi"));
        SiswaList.add(new Siswa("Erpan","Ngawi"));
        SiswaList.add(new Siswa("Rere","Ngawi"));
        SiswaList.add(new Siswa("Dafa","Ngawi"));
        SiswaList.add(new Siswa("Onel","Ngawi"));
        SiswaList.add(new Siswa("Budi","Ngawi"));
        SiswaList.add(new Siswa("Riski","Ngawi"));

        adapter = new SiswaAdapter(this, SiswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        SiswaList.add(new Siswa("RUSDI NGAWI","SOLO"));
        adapter.notifyDataSetChanged();
    }
}