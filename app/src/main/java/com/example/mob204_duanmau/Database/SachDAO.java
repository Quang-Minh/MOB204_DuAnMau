package com.example.mob204_duanmau.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.mob204_duanmau.Model.Sach;

public class SachDAO {
    private MySQLite mySQLite;

    public SachDAO(MySQLite mySQLite) {
        this.mySQLite = mySQLite;
    }

    public void xoaSach(String id) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        sqLiteDatabase.delete("Sach", "maSach=?", new String[]{id});
    }

    public long themSach(Sach sach) {
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("maSach", sach.maSach);
        contentValues.put("tenSach", sach.tenSach);
        contentValues.put("tenTacGia", sach.tenTacGia);
        contentValues.put("nhaXuatBan", sach.nhaXuatBan);
        contentValues.put("giaNhap", sach.giaNhap);
        contentValues.put("giaBan", sach.giaBan);
        contentValues.put("ngayNhap", sach.ngayNhap);
        contentValues.put("ngayBan", sach.ngayBan);
        contentValues.put("theLoai", sach.theLoai);
        contentValues.put("soLuong", sach.soLuong);
        return sqLiteDatabase.insert("Sach",null,contentValues);
    }
}
