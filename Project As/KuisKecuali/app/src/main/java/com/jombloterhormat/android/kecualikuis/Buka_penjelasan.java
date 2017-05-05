package com.jombloterhormat.android.kecualikuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Buka_penjelasan extends AppCompatActivity {

    final String kunci = "jana" ;
    EditText answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buka_penjelasan);
        answer = (EditText) findViewById(R.id.jawaban);

    }

    public void klikCek(View view) {
        String jawaban_user = answer.getText().toString();
        if (jawaban_user.equals(kunci)) {
            startActivity(new Intent(Buka_penjelasan.this, Jawaban.class));
        } else
            Toast.makeText(this, "Jawaban belum sesuai", Toast.LENGTH_SHORT).show();


    }
}
