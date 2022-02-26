import java.util.Scanner;

public class App11 {
    public static void main(String[] agr) throws Exception{
        int tongso=200000,soluong=0,si,sj;
        Scanner scanner = new Scanner(System.in);
        for(int i= tongso/10000;i>=0;i--){
            si = tongso - i * 10000;
            for(int j=si/20000;j>=0;j--){
                sj = si - j*20000;
                for(int k=sj/50000;k>=0;k--){
                    if(i*10000 + j*20000 + k*50000 == 200000){
                        System.out.println(i+" to 10000,"+j+" to 20000,"+k+" to 50000");
                        soluong++;
                    }
                }
            }
        }
        System.out.print("Co "+soluong+" phuong an");
        scanner.close();
    }
}
