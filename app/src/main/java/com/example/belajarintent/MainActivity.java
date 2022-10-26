package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String penerima;
    public static final String KONTAK = "REPLY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ADI (View view){
        Intent page1 = new Intent(MainActivity.this, Halamansatu.class);
        page1.putExtra(KONTAK, "Adi");
        startActivity(page1);
    }

    public void RONI (View view) {
        Intent page1 = new Intent(MainActivity.this, Halamansatu.class);
        page1.putExtra(KONTAK, "Roni");
        startActivity(page1);
    }

    public void KIKO (View view) {
        Intent page1 = new Intent(MainActivity.this, Halamansatu.class);
        page1.putExtra(KONTAK, "Kiko");
        startActivity(page1);
    }

}