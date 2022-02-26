import java.util.Scanner;

public class App8 {
    public static void main(String[] agr) throws Exception{
        int so=1, max=0;
        Scanner scanner = new Scanner(System.in);
        while(so!=0){
            System.out.print("Nhap so nguyen: ");
            so = (int)scanner.nextInt();
            if(so%5==0){
                if(max<so){
                    max=so;
                }
            }  
        }
        System.out.print("So lon nhat chia het cho 5 la:" + max + ",");
        scanner.close();
    }
    
}
