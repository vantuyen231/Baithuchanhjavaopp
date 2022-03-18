//import java.util.Scanner;

import Hinhtron.HinhTron;
import Hinhvuong.HinhVuong;
public class App {
    public static void main(String[] args) throws Exception {
        //Scanner scan = new Scanner(System.in);
        HinhTron ht = new HinhTron();
        HinhVuong hv = new HinhVuong();

        // hình tròn
        ht.Nhapbankinh();
        System.out.println("Ket qua hinh tron");
        ht.Tinhcv();
        ht.Incv();
        ht.Tinhdt();
        ht.Indt();
        
        System.out.print("\n\n");
        //hình vuông
        
        
        hv.Nhapcanh();
        System.out.println("Ket qua hinh vuong");
        hv.Tinhcv();
        hv.Incv();
        hv.Tinhdt();
        hv.Indt();
        //scan.close();
    }
}
