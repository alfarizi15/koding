package com.example.belajar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class isidata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isidata);
    }

    public void masuk(View view) {
        Intent masuk= new Intent(isidata.this, masuk.class);
        startActivity(masuk);
    }
}
