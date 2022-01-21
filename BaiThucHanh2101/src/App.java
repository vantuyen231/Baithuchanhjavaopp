import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //khai bao cac bien
        double heSoA, heSoB, heSoC, delta;
        double x1,x2;
        //khai bao doi tuong Scanner de doc du lieu nguoi dung nhap vao
        Scanner sc = new Scanner(System.in);
        //dua ra thong bao cho nguoi nhap vao he so
        System.out.println("Nhap vao he so A: ");
        //doc gia tri nguoi dung nhap vao va gan vao he so
        heSoA = sc.nextDouble();
        System.out.println("Nhap vao he so B: ");
        heSoB = sc.nextDouble();
        System.out.println("Nhap vao he so C: ");
        heSoC = sc.nextDouble();
        delta = heSoB * heSoB - 4 * heSoA * heSoC;
        //neu delta > 0 phuong trinh co 2 nghiem phan biet
        if(delta > 0){
            x1 = (-heSoB + Math.sqrt(delta)) / (2*heSoA);
            x2 = (-heSoB - Math.sqrt(delta)) / (2*heSoA);
            System.out.println("Phưong trinh co 2 nghiem x1= " + x1 + " x2 = " + x2);
        }else if(delta == 0){
            x1 = (-heSoB/(2 * heSoA));
            System.out.println("Phuong trinh co nghiem kep x1=x2= " + x1);
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}

