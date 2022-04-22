package Customer;

import java.util.Scanner;

import Person.Person;

public class Customer extends Person{
    protected String Diachi;
    protected String SDT;
    protected String MaKH;
    protected String KieuKH;

    public Customer()
    {
        KieuKH = "Normal";
    }
    Scanner scanner = new Scanner(System.in);
    public void nhapttCustomer()
    {
        nhapPerson();
        System.out.print("Mã khách hàng: ");
        MaKH = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        Diachi = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        SDT = scanner.nextLine();
    }

    public void inCustomer()
    {
        inPerson();
        System.out.println("Loại khách hàng: " + KieuKH);
        System.out.println("Mã khách hàng: " + MaKH);
        System.out.println("Địa chỉ: " + Diachi);
        System.out.println("Số điện thoại: " + SDT);
    }

}
    

