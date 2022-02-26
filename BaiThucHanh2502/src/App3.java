import java.util.Scanner;

public class App3 {
    public static void main(String[] agr) throws Exception{
    int so, tong=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so nguyen: ");
    so = (int)scanner.nextInt();
    for(int i=1; i<=so; i++){
        if(so%i==0){
            tong++;
        }
    }
    if(tong==2){
        System.out.println(so +" la so nguyen to");
    }else{
        System.out.println(so + " khong la so nguyen to");
    }
    scanner.close();
    }
    
}
