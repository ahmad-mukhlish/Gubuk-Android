package com.jombloterhormat.android.kecualikuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Skor extends AppCompatActivity {

    TextView sekor;
    static boolean pindah = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);
        sekor = (TextView) findViewById(R.id.skornya);
        sekor.setText("" + Soal.skor_user);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        pindah = true;
    }

    public void klikPenjelasan(View view) {
        startActivity(new Intent(Skor.this, Buka_penjelasan.class));
    }
}
