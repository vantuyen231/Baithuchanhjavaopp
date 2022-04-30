package main;

import Customer.Customer;
import Customer.VIPCustomer;
import Empoyee.Empoyee;
import Empoyee.FullTimeEmpoyee;
import Empoyee.PartTimeEmpoyee;
import Student.Student;
import Student.OfflineStudent;
import Student.OnlineStudent;

public class main1 {
    public static void main(String[] args){
        
        Empoyee epy = new Empoyee();
        epy.nhapPerson();
        epy.inPerson();

        FullTimeEmpoyee fte = new FullTimeEmpoyee();
        fte.loaiEmpoyee();
        fte.inThongTin();

        PartTimeEmpoyee pte = new PartTimeEmpoyee();
        pte.loaiEmpoyee();
        pte.inThongTin();

        Student std = new Student();
        std.nhapPerson();
        std.inPerson();

        OfflineStudent ols = new OfflineStudent();
        ols.nhapMSV();
        ols.kieuStudent();
        ols.inThongTin();

        OnlineStudent onls = new OnlineStudent();
        onls.nhapMSV();
        onls.kieuStudent();
        onls.inThongTin();

        Customer ct = new Customer();
        ct.nhapttCustomer();
        ct.inCustomer();

        VIPCustomer vct = new VIPCustomer();
        vct.nhapttVipCustomer();
        vct.inttVipCustomer();

    }
}
