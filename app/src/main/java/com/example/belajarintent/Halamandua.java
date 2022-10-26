package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Halamandua extends AppCompatActivity {
    private TextView textView;
    private EditText editTextReply;
    public static final String EXTRA_REPLY= "REPLY";
    String kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
        textView = findViewById(R.id.text_message);
        editTextReply =findViewById(R.id.editTextReply);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Halamansatu.EXTRA_MESSAGE);
        textView.setText(message);;
        kontak = intent.getStringExtra(Halamansatu.KONTAK);
        getSupportActionBar().setTitle(kontak);
    }
    public void returnReply(View view){
        String sreply=editTextReply.getText().toString();
        Intent replyIntent=new Intent();
        replyIntent.putExtra(EXTRA_REPLY, sreply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}