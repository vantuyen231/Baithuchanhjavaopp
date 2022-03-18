package Sinhvien;

import java.util.Scanner;

public class SinhVien {
    Scanner scanner = new Scanner(System.in);
    String MSV;
    String HoTen;
    Boolean GioiTinh;
    String NgaySinh;
    
    public void Nhapsinhvien(){
        
        System.out.println("Nhap thong tin sinh vien");
        System.out.println("Nhap ma sinh vien: ");
        MSV = scanner.nextLine();
        System.out.println("Nhap ho ten sinh vien:");
        HoTen = scanner.nextLine();
        System.out.println("Gioi tinh:");
        GioiTinh = scanner.hasNext();
        System.out.println("Nhap ngay sinh:");
        NgaySinh = scanner.nextLine();
        
    }

    public void Insinhvien(){
        System.out.println("Ma sinh vien: "+MSV);
        System.out.println("Ho ten sinh vien: "+HoTen);
        System.out.println("Ma sinh vien: "+GioiTinh);
        System.out.println("Ma sinh vien: "+NgaySinh);
    }
}
