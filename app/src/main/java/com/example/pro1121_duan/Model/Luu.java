package com.example.pro1121_duan.Model;

public class Luu {

    public String TieuDe;

    public String LoaiPhong;

    public String TenDiaDiem;

    public String DienTich;
    public Integer PhongNgu;
    public Integer VeSinh;
    public String Gia;

    public Luu(String tieuDe, String loaiPhong, String tenDiaDiem, String dienTich, Integer phongNgu, Integer veSinh, String gia) {
        TieuDe = tieuDe;
        LoaiPhong = loaiPhong;
        TenDiaDiem = tenDiaDiem;
        DienTich = dienTich;
        PhongNgu = phongNgu;
        VeSinh = veSinh;
        Gia = gia;
    }

    public Luu() {
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        LoaiPhong = loaiPhong;
    }

    public String getTenDiaDiem() {
        return TenDiaDiem;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        TenDiaDiem = tenDiaDiem;
    }

    public String getDienTich() {
        return DienTich;
    }

    public void setDienTich(String dienTich) {
        DienTich = dienTich;
    }

    public Integer getPhongNgu() {
        return PhongNgu;
    }

    public void setPhongNgu(Integer phongNgu) {
        PhongNgu = phongNgu;
    }

    public Integer getVeSinh() {
        return VeSinh;
    }

    public void setVeSinh(Integer veSinh) {
        VeSinh = veSinh;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }
}
