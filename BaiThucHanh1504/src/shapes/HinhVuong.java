package shapes;
import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {

    //Constructor
    public HinhVuong(){
        ten = "Hinh vuong";
    }
    
    public void nhapCanh(){
        System.out.println("Canh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}
