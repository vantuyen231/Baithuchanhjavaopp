package Phuongtrinhbachai;


import java.util.Scanner;
public class PhuongTrinhBacHai {
    int a,b,c;
    Scanner scan = new Scanner(System.in);
    public void Nhapsonguyen(){
        
        System.out.println("Nhap so a:");
        a = scan.nextInt();
        System.out.println("Nhap so b:");
        b = scan.nextInt();
        System.out.println("Nhap so c:");
        c = scan.nextInt();
        
    }
    public void Tinh(){
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh co vo so nghiem");
                }
                else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else{
                System.out.println("Phuong trinh co mot nghiem: "+ (-c/b));
            }
        }
        else{
            double x1;
            double x2;
            double detal=b*b-4*a*c;
            if(detal>0){
                x1 =(-b+Math.sqrt(detal))/(2*a);
                x2 =(-b-Math.sqrt(detal))/(2*a);
                System.out.println("Phuong trinh co nghiem so 1 la: "+x1);
                System.out.println("Phuong trinh co nghiem so 2 la: "+x2);
            }
            else if(detal==0){
                System.out.println("Phuong trinh co nghiem kep: "+(-b/(2*a)));
            }
            else{
                System.out.println("Phuong trinh co nghiem");
            }
        }
    }
}
