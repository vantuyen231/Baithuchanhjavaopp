package Customer;

import java.util.Scanner;

import Person.Person;

public class VIPCustomer extends Person {
    protected String Diachi;
    protected String SDT;
    protected String MaKH;
    protected String KieuKH;

    public VIPCustomer()
    {
        KieuKH = "VIP";
    }
    Scanner scanner =new Scanner(System.in);
    public void nhapttVipCustomer()
    {
        nhapPerson();
        System.out.print("Mã khách hàng: ");
        MaKH = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        Diachi = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        SDT = scanner.nextLine();
    }

    public void inttVipCustomer()
    {
        inPerson();
        System.out.println("Loại khách hàng: " + KieuKH);
        System.out.println("Mã khách hàng: " + MaKH);
        System.out.println("Địa chỉ: " + Diachi);
        System.out.println("Số điện thoại: " + SDT);
    }
}
    

