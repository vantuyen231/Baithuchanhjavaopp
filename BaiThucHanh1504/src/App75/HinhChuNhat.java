package App75;

import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    
    //constructor
    public HinhChuNhat(){
        super();
    }
    public float dai;
    public float rong;


    public void nhapChieuDai(){
        System.out.println("Chieu dai = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }

    public void nhapChieuRong(){
        System.out.println("Chieu rong = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }
    
    public void tinhChuVi(){
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}
