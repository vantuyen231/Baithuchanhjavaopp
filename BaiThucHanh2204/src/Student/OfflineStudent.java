package Student;

import java.util.Scanner;

public class OfflineStudent extends Student {
    protected int MSV;

    Scanner scanner = new Scanner(System.in);
    public void nhapMSV(){
        System.out.print("Nhap ma sinh vien:");
        MSV = scanner.nextInt();
    }

    public String kieuStudent(){
        return "OfflineStudent";
    }
    @Override
    public void inThongTin(){
        System.out.println("OfflineStudent");
        System.out.println("Ma sinh vien"+MSV);
    }
    
}
