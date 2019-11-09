package com.example.objectorientprogram;

import android.util.Log;

public class Giangvien extends Hocvien {
    private  String bomon;
    public Giangvien(String ten, int tuoi, String diachi, String bomon) {
        super(ten, tuoi, diachi);
        this.bomon = bomon;
    }

    public Giangvien(String ten, int tuoi, String diachi) {
        super(ten, tuoi, diachi);
    }


}
