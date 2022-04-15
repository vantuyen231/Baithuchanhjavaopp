package main;

import model.NhanVienFullTime;
import model.NhanVienPartTime;
import util.Configs;

public class App79 {
    public static void main(String[] args){
        //công ty có 3 nhân viên toàn thời gian, trong đó có 1 sếp, sếp không làm thêm ngày nào
        NhanVienFullTime sep = new NhanVienFullTime("Trần Văn Sếp");

        sep.setLoaiChucvu(Configs.NHAN_VIEN_SEP);

        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyễn Văn Lính"); //không làm thêm ngày nào

        NhanVienFullTime linh2 = new NhanVienFullTime("Lê Thị Lính",3); //làm thêm 3 ngày

        //công ty đang thuê 1 nhân viên thời vụ
        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thị Thời Vụ",240);

        //tính lương cho nhân viên
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        //in thông tin nhân viên
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}
