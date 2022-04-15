package model;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamViec; //tong so ngay lam viec cua nhan vien
    private int loaiChucVu;

    public NhanVienFullTime(String ten){
        this.ten = ten;
    }

    public NhanVienFullTime(String ten, int gioLamViec){
        this.ten = ten;
        this.ngayLamViec = gioLamViec;
    }
    
    public void setLoaiChucvu(int loaiChucVu){
        this.loaiChucVu = loaiChucVu;
    }
        
    @Override
    public String loaiNhanVien(){
        return "Nhan vien toan thoi gian";
    }
    
    public void tinhLuong(){
        luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP *ngayLamViec;
        luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH *ngayLamViec;

    }
}
