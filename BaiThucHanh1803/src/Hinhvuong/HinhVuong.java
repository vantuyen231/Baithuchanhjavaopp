package Hinhvuong;

import java.util.Scanner;
public class HinhVuong {
    float canh;
    float cv;
    float dt;
    Scanner scanner = new Scanner(System.in);
    public void Nhapcanh(){
        System.out.println("Nhap canh cua hinh vuong:");
        
        canh = scanner.nextFloat();
        
    }
    public float Tinhcv(){
        cv = canh * 4;
        return cv;
    }
    public float Tinhdt(){
        dt = canh * canh;
        return dt;
    }
    public void Incv(){
        System.out.println("Chu vi hinh vuong la: "+cv);
    }
    public void Indt(){
        System.out.println("Dien tich hinh vuong la: "+dt);
    }
    
}
