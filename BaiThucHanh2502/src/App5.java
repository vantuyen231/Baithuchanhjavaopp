import java.util.Scanner;

public class App5 {
    public static void main(String[] agr) throws Exception{
        int so, tong=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        so = (int)scanner.nextInt();
        for(int i=1;i<=so/2;i++){
            if(so%i==0){
                tong +=i;
            }
        }
        if(tong==so){
            System.out.println("Day la so hoan thien");
        }
        else{
            System.out.println("Day khong phai la so hoan thien");
        }
        scanner.close();
    }
}
