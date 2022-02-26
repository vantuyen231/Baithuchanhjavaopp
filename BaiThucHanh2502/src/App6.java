import java.util.Scanner;
public class App6 {
    public static void main(String[] agr) throws Exception{
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        so = (int)scanner.nextInt();
        System.out.print("Day la nhung so hoan thien: ");
        for(int i=1;i<so;i++){
            int tong=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    tong +=j;
                }
            }
            if(tong==i){
                System.out.print("" + i +",");
            }
        }
        scanner.close();
    }
    
}
