import java.util.Scanner;

public class App47 {
    public static void main(String[] agrs ) throws Exception {
        int songuyen,tong = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap so nguyen: ");
            songuyen = scanner.nextInt();
            tong += songuyen;
        }while(tong <100);
        System.out.println("Tong cac so vua nhap la: " + tong);
        scanner.close();
    }
    
}
