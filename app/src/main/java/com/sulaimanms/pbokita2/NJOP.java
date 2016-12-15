package com.sulaimanms.pbokita2;

import android.util.Log;

/**
 * Created by Sulaiman MS on 15/12/2016.
 */

public class NJOP extends Dasar{
    long luas_bangunan;
    long luas_tanah;
    long harga_bangunan;
    long harga_tanah;

    long nilai_bangunan;
    long nilai_tanah;
    //encapsulasi

    //konstruktor yang akan diturunkan ke subclass
    public NJOP(long luas_bangunan, long harga_bangunan, long luas_tanah, long harga_tanah){
        this.luas_bangunan = luas_bangunan;
        this.luas_tanah = luas_tanah;
        this.harga_bangunan = harga_bangunan;
        this.harga_tanah = harga_tanah;
    }

    //rumus 1
    public long nb() {
        long nilai_bangunan = luas_bangunan * harga_bangunan;
        return nilai_bangunan;
    }

    public long nt(){
        long nilai_tanah = luas_tanah * harga_tanah;
        return nilai_tanah;
    }

    @Override
    long hasil(){
        long NJOP = nt() + nb();
        Log.d("hasil: ", String.valueOf(nilai_tanah));
        return NJOP;
    }

}
