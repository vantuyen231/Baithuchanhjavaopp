package App75;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    //constructor
    public HinhTron(){
        super();
    }
    public float bankinh;

    public void nhapBanKinh(){
        System.out.println("Ban kinh = ");
        Scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = 2 * PI * bankinh;
    }

    public void tinhDienTich(){
        dienTich = PI * bankinh * bankinh;
    }
}
