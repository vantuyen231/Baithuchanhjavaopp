import java.util.Scanner;

public class App30 {
    public static void main(String[] args) throws Exception {
        //thục hiện tính
        int n, du, tong =0;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen: ");
    //    n = scanner.nextInt();
        //điều kiện nhật > 0 
        
        do{
           n = scanner.nextInt();
           System.out.println("nhap lai: ");
        } 
        while (n<0);

        
        while (n>0){
            du = n % 10;
            n = n / 10;
            tong += du;
        }
        System.out.println("Tong chu so =" + tong);
        scanner.close();
    }
    
}
