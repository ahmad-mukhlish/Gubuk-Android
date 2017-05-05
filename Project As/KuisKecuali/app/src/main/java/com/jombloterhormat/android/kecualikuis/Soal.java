package com.jombloterhormat.android.kecualikuis;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Soal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup radio;
    TextView soal;
    static final int maks = 10 ;

    String pilihan = "";
    int nomer = 1;
    static int skor_user = 0;

    String[] soalnya = new String[maks + 1];
    String[] a = new String[maks + 1];
    String[] b = new String[maks + 1];
    String[] c = new String[maks + 1];
    String[] d = new String[maks + 1];
    String[] kunci = new String[maks + 1];
    String[] toaster = new String[maks + 1];


    RadioButton pilA, pilB, pilC, pilD;
    Button pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        radio = (RadioGroup) findViewById(R.id.diradio);
        radio.setOnCheckedChangeListener(this);

        soal = (TextView) findViewById(R.id.soal);

        pilA = (RadioButton) findViewById(R.id.A);
        pilB = (RadioButton) findViewById(R.id.B);
        pilC = (RadioButton) findViewById(R.id.C);
        pilD = (RadioButton) findViewById(R.id.D);
        pilih = (Button) findViewById(R.id.pilih);

        bikinSoalDanJawaban();
        setTeksSoal(nomer);
    }


    public void klikA(View view) {
        pilihan = "A";
    }

    public void klikB(View view) {
        pilihan = "B";
    }

    public void klikC(View view) {
        pilihan = "C";
    }

    public void klikD(View view) {
        pilihan = "D";
    }

    public void klikPass(View view) {
        pilihan = "pass";
    }

    public void klikPilih(View view) {

        if (Skor.pindah == false) {

            if (pilihan.equals(kunci[nomer])) {
                Toast.makeText(this, "" + toaster[nomer], Toast.LENGTH_SHORT).show();
                skor_user += 10;
            } else if (pilihan.equals("pass")) {
            } else {
                skor_user -= 5;
            }
        }

        if (nomer < 10) {
            nomer++;
            setTeksSoal(nomer);
        } else {
            startActivity(new Intent(Soal.this, Skor.class));
        }
    }


    private void bikinSoalDanJawaban() {
        soalnya[1] = "1. Berikut adalah penulisan nilai src yang salah pada image view, kecuali :";
        a[1] = "@drawabel/gambar";
        b[1] = "@drawable/1123";
        c[1] = "@drawable/Gambar 123";
        d[1] = "@mipmap/ic_launcher";
        kunci[1] = "D";
        toaster[1] = "Berikut";

        soalnya[2] = "2. Berikut adalah penulisan nilai yang benar pada properti textStyle, kecuali :";
        a[2] = "bold";
        b[2] = "italic";
        c[2] = "underline";
        d[2] = "bold|italic";
        kunci[2] = "C";
        toaster[2] = "Adalah";

        soalnya[3] = "3. Berikut adalah elemen dari parent relative layout, kecuali :";
        a[3] = "orientation";
        b[3] = "layout_height";
        c[3] = "layout_width";
        d[3] = "background";
        kunci[3] = "A";
        toaster[3] = "Nama";

        soalnya[4] = "4. Berikut adalah value dari layout_width, kecuali :";
        a[4] = "match_parent";
        b[4] = "0dp";
        c[4] = "wrap_content";
        d[4] = "align_parent";
        kunci[4] = "D";
        toaster[4] = "Pengajar";

        soalnya[5] = "5. Berikut adalah jenis - jenis properti margin, kecuali : ";
        a[5] = "layout_Margin";
        b[5] = "layout_marginBottom";
        c[5] = "layout_marginLeft";
        d[5] = "layout_marginRight";
        kunci[5] = "A";
        toaster[5] = "Udacity";

        soalnya[6] = "6. Berikut adalah jenis access modifier yang diizinkan dalam java, kecuali : ";
        a[6] = "public";
        b[6] = "final";
        c[6] = "private";
        d[6] = "protected";
        kunci[6] = "B";
        toaster[6] = "Kecuali";

        soalnya[7] = "7. Berikut adalah tipe data dalam java, kecuali : ";
        a[7] = "int";
        b[7] = "double";
        c[7] = "string";
        d[7] = "float";
        kunci[7] = "C";
        toaster[7] = "Lyla";

        soalnya[8] = "8. Berikut adalah jenis method yang mengembalikan nilai, kecuali : ";
        a[8] = "Object";
        b[8] = "void";
        c[8] = "String";
        d[8] = "int";
        kunci[8] = "B";
        toaster[8] = "Jana";

        soalnya[9] = "9. Berikut adalah kata kunci yang berhubungan dalam percabangan java, kecuali : ";
        a[9] = "if";
        b[9] = "case";
        c[9] = "switch";
        d[9] = "depend";
        kunci[9] = "D";
        toaster[9] = "Kunal";

        soalnya[10] = "10. Berikut adalah yang termasuk tipe data numerik java, kecuali : ";
        a[10] = "boolean";
        b[10] = "int";
        c[10] = "double";
        d[10] = "float";
        kunci[10] = "A";
        toaster[10] = "Katherine";

    }

    @Override
    public void onCheckedChanged(RadioGroup radio, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.A: {
                pilihan = "A";
                break;
            }
            case R.id.B: {
                pilihan = "B";
                break;
            }
            case R.id.C: {
                pilihan = "C";
                break;
            }
            case R.id.D: {
                pilihan = "D";
                break;
            }
            case R.id.pass: {
                pilihan = "pass";
                break;
            }

        }
    }


    private void setTeksSoal(int nomor) {
        soal.setText(soalnya[nomor]);
        pilA.setText(a[nomor]);
        pilB.setText(b[nomor]);
        pilC.setText(c[nomor]);
        pilD.setText(d[nomor]);
        nomor++;
        pilih.setText("Lanjut ke nomor " + nomor);
        if (nomor == 11) {
            pilih.setText("Lihat skor Anda");
        }

    }


}
