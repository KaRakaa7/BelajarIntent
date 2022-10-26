package com.example.belajarintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Halamansatu extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="MESSAGE";
    public static final String KONTAK = "";
    public static final int TEXT_REQUEST=1;
    private EditText editText;
    private TextView textViewMessage, penerima;
    String kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_1);
        editText=findViewById(R.id.editText);
        textViewMessage=findViewById(R.id.text_message);
        penerima = findViewById(R.id.text_header);

        Intent intent = getIntent();
        kontak = intent.getStringExtra(MainActivity.KONTAK);
        penerima.setText(kontak);
        getSupportActionBar().setTitle(kontak);

    }

    public void openSecondActivity(View view){
        Intent intent=new Intent(Halamansatu.this, Halamandua.class);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(KONTAK, kontak);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    protected void onActivityResult (int requestCode, int resultCode,
                                     @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST && resultCode==RESULT_OK){
            String reply = data.getStringExtra(Halamandua.EXTRA_REPLY);
            textViewMessage.setText(reply);
        }
    }
}