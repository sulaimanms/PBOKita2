package com.sulaimanms.pbokita2;

/**
 * Created by Sulaiman MS on 15/12/2016.
 */

public class PBB extends NJKP{
    double persen_PBB;

    //konstruktor
    public void setPersen_NJKP(long persen_NJKP){
        this.persen_NJKP = persen_NJKP;
    }

    public void setluas_bangunan(){
        this.luas_bangunan = luas_bangunan;
    }

    public void setharga_bangunan(){
        this.harga_bangunan = harga_bangunan;
    }

    public void setluas_tanah(){
        this.luas_tanah = luas_tanah;
    }

    public void setharga_tanah(){
        this.harga_tanah = harga_tanah;
    }

    public void setpersen_NJKP(long persen_NJKP){
        this.persen_NJKP = persen_NJKP;
    }

    PBB(long luas_bangunan, long harga_bangunan, long luas_tanah, long harga_tanah) {
        super(luas_bangunan, harga_bangunan, luas_tanah, harga_tanah);
        this.persen_PBB =  0.005;
    }


    public double hasilPBB() {
        return super.hasilNJKP() * persen_PBB;
    }
}
