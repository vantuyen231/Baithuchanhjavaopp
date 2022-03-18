package Person;

import java.util.Scanner;

public class Person {
    Scanner scan = new Scanner(System.in);
    String PersonID;
    String PersonName;
    String GioiTinh;
    String Address;
    
    public void Nhapthongtin(){
        System.out.println("Nhap thong tin doi tuong:");
        System.out.println("Nhap ID doi tuong:");
        PersonID = scan.nextLine();
        System.out.println("Nhap ten doi tuong:");
        PersonName = scan.nextLine();
        System.out.println("Nhap gioi tinh:");
        GioiTinh = scan.nextLine();
        System.out.println("Nhap dia chi doi tuong:");
        Address = scan.nextLine();
        
    }
    public void Inthongtin(){
        System.out.println("ID: "+PersonID);
        System.out.println("Ten: "+PersonName);
        System.out.println("Gioi tinh: "+ GioiTinh);
        System.out.println("Dia chi: "+Address);

    }
    
}
