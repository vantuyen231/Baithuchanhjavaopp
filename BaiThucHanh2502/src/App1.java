import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        int sothunhat,sothuhai;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap so thu nhat");
            sothunhat = (int)scanner.nextInt();
        }while( sothunhat < 0);
        do{
            System.out.println("Nhap so thu hai: ");
            sothuhai = (int)scanner.nextInt();
        }while(sothuhai < 0);
        while(sothunhat != sothuhai){
            if(sothunhat > sothuhai)
                sothunhat = sothunhat - sothuhai;
            else
                sothuhai = sothuhai - sothunhat;
        }
        System.out.println("Uoc chung lon nhat la:"+ sothuhai);
    scanner.close();

    }
    
}
