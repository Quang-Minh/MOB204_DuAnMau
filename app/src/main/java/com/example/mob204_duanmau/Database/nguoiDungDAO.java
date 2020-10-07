package com.example.mob204_duanmau.Database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.mob204_duanmau.Model.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class nguoiDungDAO {
    private MySQLite mySQLite;

    public nguoiDungDAO(MySQLite mySQLite) {
        this.mySQLite = mySQLite;
    }
    public void xoaNguoiDung(String id){
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        sqLiteDatabase.delete("QuanLyNguoiDung","maTaiKhoan=?",new String[]{id});
    }

    public long themNguoiDung(NguoiDung nguoiDung){
        SQLiteDatabase sqLiteDatabase =mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("maTaiKhoan",nguoiDung.maTaiKhoan);
        contentValues.put("tenTaiKhoan",nguoiDung.tenTaiKhoan);
        contentValues.put("matKhau",nguoiDung.matKhau);
        contentValues.put(" hoTen",nguoiDung.hoTen);
        contentValues.put("soDienThoai",nguoiDung.soDienThoai);
        contentValues.put("thongKeMuaBan",nguoiDung.thongKeMuaBan);

        return sqLiteDatabase.insert("QuanLyNguoiDung",null,contentValues);
    }

    public List<NguoiDung>getAllNguoiDung(){
        List<NguoiDung>nguoiDungList = new ArrayList<>();

        String truyVan = "SELECT * FROM quan_ly_nguoi_dung";
        Cursor cursor =mySQLite.getWritableDatabase().rawQuery(truyVan,null);
        if(cursor.getCount() > 0){
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false){
                String maTaiKhoan = cursor.getString(cursor.getColumnIndex("maTaiKhoan"));
                String tenTaiKhoan = cursor.getString(cursor.getColumnIndex("tenTaiKhoan"));
                String matKhau = cursor.getString(cursor.getColumnIndex("matKhau"));
                String hoTen = cursor.getString(cursor.getColumnIndex("hoTen"));
                String soDienThoai = cursor.getString(cursor.getColumnIndex("soDienThoai"));
                String thongKeMuaBan = cursor.getString(cursor.getColumnIndex("thongKeMuaBan"));

                NguoiDung nguoiDung = new NguoiDung();
                nguoiDung.maTaiKhoan = maTaiKhoan;
                nguoiDung.tenTaiKhoan = tenTaiKhoan;
                nguoiDung.matKhau = matKhau;
                nguoiDung.hoTen = hoTen;
                nguoiDung.soDienThoai = soDienThoai;
                nguoiDung.thongKeMuaBan = thongKeMuaBan;

                nguoiDungList.add(nguoiDung);

                cursor.moveToNext();
            }
            cursor.close();
        }
        return nguoiDungList;
    }

    public int suaNguoiDung(NguoiDung nguoiDung){
        SQLiteDatabase sqLiteDatabase =mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("maTaiKhoan",nguoiDung.maTaiKhoan);
        contentValues.put("tenTaiKhoan",nguoiDung.tenTaiKhoan);
        contentValues.put("matKhau",nguoiDung.matKhau);
        contentValues.put(" hoTen",nguoiDung.hoTen);
        contentValues.put("soDienThoai",nguoiDung.soDienThoai);
        contentValues.put("thongKeMuaBan",nguoiDung.thongKeMuaBan);

        return sqLiteDatabase.update("QuanLyNguoiDung",contentValues,"maTaiKhoan=?",new String[]{nguoiDung.maTaiKhoan});
    }
}
