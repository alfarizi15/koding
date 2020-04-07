package com.example.belajar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void tentang(View view) {
        Intent tentang= new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }
    
    /*
    /*Pengerjaan Tanggal 08-04-2020
    /*Deskripsi pengerjaan:mengerjakan =layout button,image,text view ,edit text,gradasi warna linked frame ,dll
    /*10117156 AldiAlfarizi IF4 
}
