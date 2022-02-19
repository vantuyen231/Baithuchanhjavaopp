import java.util.Scanner;

public class App35 {
    public static void main(String[] args ){
        int sothunhat,sothuhai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
        sothunhat = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        sothuhai = scanner.nextInt();
        int sonhonhat = sothunhat;
        if(sothunhat > sothuhai){
            sonhonhat = sothuhai;
        }
        System.out.println("So nho nhat trong hai so la " + sothunhat + " va " + sothuhai + " la " + sonhonhat);
        scanner.close();
    }
    
}
