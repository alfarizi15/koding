package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
    }
    public void isidata(View view) {
        Intent isidata= new Intent(Tentang.this, isidata.class);
        startActivity(isidata);
    }

    public void masuk(View view) {
        Intent masuk= new Intent(Tentang.this, masuk.class);
        startActivity(masuk);
    }
}
