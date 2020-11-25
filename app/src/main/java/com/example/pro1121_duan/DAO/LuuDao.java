package com.example.pro1121_duan.DAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.pro1121_duan.Model.Luu;
import com.example.pro1121_duan.SQLite.MySQLite;

import java.util.ArrayList;
import java.util.List;

public class LuuDao {
    private MySQLite mySQLite;

    public LuuDao(MySQLite mySQLite) {
        this.mySQLite = mySQLite;
    }

    public boolean insert(Luu luu){
        SQLiteDatabase sqLiteDatabase = mySQLite.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put("TieuDe", luu.TieuDe);

        contentValues.put("LoaiPhong", luu.LoaiPhong);

        contentValues.put("TenDiaDiem", luu.TenDiaDiem);


        contentValues.put("DienTich", luu.DienTich);
        contentValues.put("PhongNgu", luu.PhongNgu);
        contentValues.put("VeSinh", luu.VeSinh);
        contentValues.put("Gia", luu.Gia);



        long kq = sqLiteDatabase.insert("LuuTin", null, contentValues);
        if (kq > 0) return true;
        else return false;
    }
    public boolean delete(String tieude){
        long kq = mySQLite.getWritableDatabase().delete("LuuTin", "TieuDe = ?", new String[]{tieude});
        if (kq > 0) return true;
        else return false;
    }

    public List<Luu> getAll(){
        List<Luu> luuList = new ArrayList<>();
        String select = "SELECT * FROM LuuTin";
        Cursor cursor = mySQLite.getWritableDatabase().rawQuery(select, null);

        if (cursor.getCount() > 0){
            cursor.moveToFirst();
            while (cursor.isAfterLast() == false){
                Luu dangTin = new Luu();


                dangTin.TieuDe = cursor.getString(cursor.getColumnIndex("TieuDe"));

                dangTin.LoaiPhong = cursor.getString(cursor.getColumnIndex("LoaiPhong"));

                dangTin.TenDiaDiem = cursor.getString(cursor.getColumnIndex("TenDiaDiem"));
                dangTin.DienTich = cursor.getString(cursor.getColumnIndex("DienTich"));
                dangTin.PhongNgu = cursor.getInt(cursor.getColumnIndex("PhongNgu"));
                dangTin.VeSinh = cursor.getInt(cursor.getColumnIndex("VeSinh"));
                dangTin.Gia = cursor.getString(cursor.getColumnIndex("Gia"));

                luuList.add(dangTin);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return luuList;
    }
}
