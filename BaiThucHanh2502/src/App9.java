import java.util.Scanner;

public class App9 {
    public static void main(String[] agr) throws Exception{
        int so, dao=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        so = (int)scanner.nextInt();
        while(so!=0){
            dao = dao*10+so%10;
            so/=10;
        }
        System.out.print("So dao cua so nguyen la:"+dao);
        scanner.close();
    }
}
