import java.util.Scanner;

public class App10 {
    public static void main(String[] agr) throws Exception{
        int so, chuso=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap so nguyen duong: ");
            so = (int)scanner.nextInt();

        }while(so<0);
        while(so>0){
            so/=10;
            chuso++;
        }
        System.out.println("So co " + chuso + " chu so");
        scanner.close();
    }
    
}
