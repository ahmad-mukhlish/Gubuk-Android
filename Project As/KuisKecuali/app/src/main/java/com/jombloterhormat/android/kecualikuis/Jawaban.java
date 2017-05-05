package com.jombloterhormat.android.kecualikuis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Jawaban extends AppCompatActivity {

    //array of String
    String[] jawaban = {"1 [D], nilai src yang benar pada image view adalah @mipmap/ic_launcher karena nama gambar tidak boleh didahului angka, tanpa spasi dan dalam folder drawable / mipmap",
                        "2 [C], underline bukanlah termasuk value untuk properti textStyle",
                        "3 [A], orientation adalah properti dari LinearLayout bukan RelativeLayout",
                        "4 [D], tidak ada value align_parent pada properti layout_width",
                        "5 [A], penulisan yang benar adalah layout_margin",
                        "6 [B], kata kunci final bukan termasuk access modifier",
                        "7 [C], penulisan tipe data string harus diawali dengan huruf besar (String)",
                        "8 [B], method void tidak mengembalikan nilai",
                        "9 [D], depend bukan merupakan kata kunci dalam java",
                        "10 [A], tidak seperti bahasa C, boolean bukan merupakan tipe data numerik dalam java"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawaban);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.layout_list, jawaban);

        ListView listView = (ListView) findViewById(R.id.jawaban_list);
        listView.setAdapter(adapter);
    }


}
