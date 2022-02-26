import java.util.Scanner;

public class App7 {
    public static void main(String[] agr) throws Exception{
        int so=1, max=0;
        Scanner scanner = new Scanner(System.in);
        while(so !=0){
            System.out.print("Nhap so nguyen:");
            so = (int)scanner.nextInt();
            System.out.println(so);
            if(max<so){
                max=so;
            }
        }
        System.out.println("So lon nhat la: "+ max);
        scanner.close();
    }
}
