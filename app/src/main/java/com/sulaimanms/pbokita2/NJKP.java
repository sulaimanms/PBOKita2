package com.sulaimanms.pbokita2;

import android.util.Log;

/**
 * Created by Sulaiman MS on 15/12/2016.
 */

public class NJKP extends NJOP{

    double persen_NJKP;

    //konstruktor
    public void setPersen_NJKP(long persen_NJKP){
        this.persen_NJKP = persen_NJKP;
    }

    public void setluas_bangunan(long luas_bangunan){
        this.luas_bangunan = luas_bangunan;
    }

    public void setharga_bangunan(long harga_bangunan){
        this.harga_bangunan = harga_bangunan;
    }

    public void setluas_tanah(long luas_tanah){
        this.luas_tanah = luas_tanah;
    }

    public void setharga_tanah(long harga_tanah){
        this.harga_tanah = harga_tanah;
    }

    NJKP(long luas_bangunan, long harga_bangunan, long luas_tanah, long harga_tanah) {
        super(luas_bangunan, harga_bangunan, luas_tanah, harga_tanah);
        this.persen_NJKP = 0.2;
    }



    double hasilNJKP() {
        double NJKP = super.hasil() * persen_NJKP;
        Log.d("hasilNJKP: ", String.valueOf(persen_NJKP));
        return NJKP;
    }
}
