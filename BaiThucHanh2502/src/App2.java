import java.util.Scanner;

public class App2 {
    public static void main(String[] agr) throws Exception{
        int canh1, canh2, canh3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Canh thu nhat:");
        canh1 = (int)scanner.nextInt();
        System.out.println("Canh thu hai: ");
        canh2 = (int)scanner.nextInt();
        System.out.println("Cach thu ba: ");
        canh3 = (int)scanner.nextInt();
        if((canh1==canh2) || (canh1==canh3) || (canh2==canh1))
        {
            if((canh1*canh1 + canh2*canh2 == canh3*canh3) || (canh2*canh2 + canh3*canh3 == canh1*canh1) || (canh3*canh3 + canh1*canh1 == canh2*canh2)){
                System.out.println("Day la tam giac vuong can");
            }
            else{
                System.out.println("day la tam giac can");
            }
        } 
        else if((canh1==canh2) && (canh1==canh3) && (canh2==canh3))
        {
            System.out.println("Day la tam giac deu");
        }
        else if((canh1*canh1 == canh2*canh2 + canh3*canh3) || (canh2*canh2 ==  canh1*canh1 + canh3*canh3) || (canh3*canh3 == canh1*canh1 + canh2*canh2))
        {
            System.out.println("Day la tam giac vuong");
        } 
        else
        {
            System.out.println("Day la tam giac thuong");
        }
    scanner.close();
    } 
    
}
