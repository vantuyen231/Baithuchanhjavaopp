import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        //khai bao cac bien 
        double a1, b1, c1;
        double a2, b2, c2;
        double x,y, matranD, matranDx, matranDy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap PT1");
        System.out.println("Nhap vao he so a1: ");
        a1 = sc.nextDouble();
        System.out.println("Nhap vao he so b1: ");
        b1 = sc.nextDouble();
        System.out.println("Nhap vao he so c1: ");
        c1 = sc.nextDouble();
        System.out.println("Nhap PT2");
        System.out.println("Nhap vao he so a2: ");
        a2 = sc.nextDouble();
        System.out.println("Nhap vao he so b2: ");
        b2 = sc.nextDouble();
        System.out.println("Nhap vao he so c2: ");
        c2 = sc.nextDouble();
        matranD = a1*b2-a2*b1;
        matranDx = c1*b2-c2*b1;
        matranDy = a1*c2-a2*c1;
        if(matranD == 0){
            if(matranDx + matranDy == 0)
            System.out.println("He phuong trinh vo so nghiem");
            else
            System.out.println("He phuong trinh vo nghiem");
        }
        else{
            x = matranDx/matranD;
            y = matranDy/matranD;
            System.out.println("He phuong trinh co nghiem la:" +"x=" + x + "va y =" +y);
        }
    }
}