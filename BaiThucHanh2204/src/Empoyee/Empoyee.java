package Empoyee;

import Person.Person;

public class Empoyee extends Person {

    protected String loaiEmpoyee(){
        return "";
    }
    
    public void inThongTin(){
        System.out.println("Loai nhan vien" + loaiEmpoyee());
    }
}