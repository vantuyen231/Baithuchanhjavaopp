package Person;

import java.util.Scanner;

public class Person {
    private String Ten;
    private int Tuoi;
    
    Scanner scanner = new Scanner(System.in);

    public void nhapPerson(){
        
        System.out.println("Nhap ten");
        Ten = scanner.nextLine();

        System.out.println("Nhap ten");
        Tuoi = scanner.nextInt();
        scanner.nextLine();
    }
    


    public void inPerson(){
        System.out.println("Ten la: "+ Ten);
        System.out.println("Tuoi: "+Tuoi);
    }
}