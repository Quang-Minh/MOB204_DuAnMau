package com.example.mob204_duanmau.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLite extends SQLiteOpenHelper {
    public MySQLite( Context context) {
        super(context, "mydata.sql", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sach = "CREATE TABLE Sach(maSach integer primary key,tenSach text,tenTacGia text" +
                ",nhaXuatBan text,giaNhap integer,giaBan integer,ngayNhap text,ngayBan text,theLoai text,soLuong integer)";
        String quan_ly_sach = "CREATE TABLE QuanLySach(maBARCODE integer primary key,tenSach text,tenTacGia text" +
                ",nhaXuatBan text,gia integer,theLoai text,soLuong integer,ngayNhap text)";
        String quan_ly_hoa_don = "CREATE TABLE QuanLyHoaDon(maHoaDon integer primary key,tenSach text," +
                "soLuongMua integer,ngayMua text,giaBan integer" +
                ",nguoiMua Text,soDienThoai numberic,diaChiGiaoHang text,thoiGianGiaoHang text)";
        String hoa_don_chi_tiet = "CREATE TABLE HoaDonChiTiet(maHoaDonChiTiet integer primary key,tenSach text," +
                "tenTacGia text,nhaXuatBan text,theLoaiSach text," +
                "soLuongMua text,ngayMua text,tenNguoiMua text,soDienThoai numberic,diaChiGiaoHang text,thoiGianGiaoHang text)";
        String quan_ly_nguoi_dung = "CREATE TABLE QuanLyNguoiDung(maTaiKhoan integer primary key," +
                "tenTaiKhoan text,matKhau text,hoTen text,soDienThoai text,thongKeMuaBan text)";

        db.execSQL(sach);
        db.execSQL(quan_ly_sach);
        db.execSQL(quan_ly_hoa_don);
        db.execSQL(hoa_don_chi_tiet);
        db.execSQL(quan_ly_nguoi_dung);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
