package com.sulaimanms.pbokita2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText luasTanah, luasBangunan, hargaTanah, hargaBagunan;
    private Button btnHasil;
    private TextView txtHasil, txtHasilNJOP, txtHasilNJKP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luasTanah = (EditText)findViewById(R.id.edtluas_tanah);
        luasBangunan = (EditText)findViewById(R.id.edtluas_bangunan);
        hargaTanah = (EditText)findViewById(R.id.edtharga_tanah);
        hargaBagunan = (EditText)findViewById(R.id.edtharga_bangunan);
        btnHasil = (Button) findViewById(R.id.btn_hitung);
        txtHasilNJOP = (TextView)findViewById(R.id.txt_hasilNJOP);
        txtHasilNJKP = (TextView)findViewById(R.id.txt_hasilNJKP);
        txtHasil = (TextView)findViewById(R.id.txt_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long lt = Long.parseLong(luasTanah.getText().toString());
                long lb = Long.parseLong(luasBangunan.getText().toString());
                long ht = Long.parseLong(hargaTanah.getText().toString());
                long hb = Long.parseLong(hargaBagunan.getText().toString());


                PBB pbb = new PBB(lb, hb, lt, ht);

                txtHasilNJOP.setText(String.valueOf("Total NJOP: Rp."+(int) pbb.hasil()+",00"));
                txtHasilNJKP.setText(String.valueOf("Total NJKP: Rp."+(int) pbb.hasilNJKP()+",00"));
                txtHasil.setText(String.valueOf("Total PBB: Rp."+(int) pbb.hasilPBB()+",00"));
            }
        });

    }
}
