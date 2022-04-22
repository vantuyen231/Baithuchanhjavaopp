package main;

import App71.ToaDo;
import App71.HinhTron;

public class App71 {
    
    public static void main(String[] args){
        //khoi tạo đối tượng hinhTron tu lớp HinhTron
        HinhTron hinhTron = new HinhTron();

        //set bán kính cho hinhTron thongo qua phương thức setter
        hinhTron.setBanKinh(10);

        //cán tính toán khác
        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.print("Chu vi hinh tron " + chuVi + ", va dien tich " + dienTich);
    }
}
