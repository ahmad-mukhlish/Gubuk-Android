package com.jombloterhormat.android.kecualikuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klikMulai(View view) {
        Soal.skor_user = 0;
        Skor.pindah = false;
        startActivity(new Intent(MainActivity.this, Soal.class));
    }

    public void klikHelp(View view) {
        startActivity(new Intent(MainActivity.this, help.class));
    }


    private void ngelink(String url) {
        Uri uriUrl = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW, uriUrl));
    }

    public void klikFb(View view) {
        ngelink("https://web.facebook.com/ahmadmukhlis.saputra");
    }

    public void klikGithub(View view) {
        ngelink("https://github.com/ahmad-mukhlish");
    }

    public void klikGplus(View view) {
        ngelink("https://plus.google.com/u/0/116489913115605252616");
    }


}
