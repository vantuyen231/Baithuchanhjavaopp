package model;

import util.Configs;
//nhan vien part time la nhan vien thoi vu
public class NhanVienPartTime extends NhanVien{
    private int gioLamViec; //tong so gio lam viec cua nhan vien

    public NhanVienPartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    
    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu";
    }

    public void tinhLuong(){
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO *gioLamViec;
    }
}
