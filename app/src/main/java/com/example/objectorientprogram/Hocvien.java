package com.example.objectorientprogram;

import android.util.Log;

public class Hocvien {
    public String ten ;
    public int tuoi;
    public String diachi;

    public Hocvien(String ten, int tuoi, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }
     final public  void dongtien(int money)
    {
        Log.d("bbb", "dongtien: "+money);

    }
}
