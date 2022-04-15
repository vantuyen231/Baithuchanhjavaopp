package shapes;

import java.util.Scanner;
public class HinhTru extends HinhTron {

    public float chieuCao;

    //Constructor
    public HinhTru(){
        ten = "Hinh tru";
    }

    public void nhapChieuCao(){
        nhapBanKinh();

        System.out.println("Chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }
    
    public void tinhThetich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
