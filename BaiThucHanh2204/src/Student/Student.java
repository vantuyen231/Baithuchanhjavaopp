package Student;

import java.util.Scanner;

import Person.Person;


public class Student extends Person{
    protected String Lop;

    Scanner scanner = new Scanner(System.in);
    public void nhapStudnet(){
        System.out.print("Nhap lop:");
        Lop=scanner.nextLine();
    }
    
    protected String kieuStudent(){
       return "";
    }

    public void inThongTin(){
        inPerson();
        System.out.println("Kieu sinh vien" + kieuStudent());
    }
}
