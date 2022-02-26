import java.util.Scanner;

public class App4 {
    public static void main(String[] agr) throws Exception {
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        so = (int)scanner.nextInt();
        System.out.print("Cac so nguyen to nho hon "+ so + " la:");
        for(int i=1;i<so;i++){
            int tong=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    tong++;
                }
            }
            if( tong==2 ){
                System.out.print(" " + i+",");
            }
        }
        scanner.close();
    }
}
