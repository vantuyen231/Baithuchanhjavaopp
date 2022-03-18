package Hinhtron;

import java.util.Scanner;
public class HinhTron {
    final float PI = 3.14f;
    float bankinh;
    float cv;
    float dt;
    Scanner scanner = new Scanner(System.in);
    public void Nhapbankinh(){
        System.out.println("Nhap ban kinh hinh tron:");
        
        bankinh = scanner.nextFloat();
        
    }
    public void Inbankinh(){
       System.out.println("Ban kinh hinh tron la: "+ bankinh);
    }
    public float Tinhcv(){
        cv=2*PI*bankinh;
        return cv;
    }
    public float Tinhdt(){
        dt=PI*bankinh*bankinh;
        return dt;
    }
    public void Incv(){
        System.out.println("Chu vi hinh tron la: " + cv);
    }
    public void Indt(){
        System.out.println("Dien tich hinh tron la: "+ dt);
    }
}
