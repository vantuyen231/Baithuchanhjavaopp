package shapes;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float bankinh;

    // Constructor
    public HinhTron() {
        ten = "Hinh Tron";
    }

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
