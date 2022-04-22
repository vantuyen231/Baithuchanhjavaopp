package Empoyee;


public class FullTimeEmpoyee extends Empoyee {
    
    public String loaiEmpoyee(){
        return "FullTimeEmpoyee";
    }
    @Override
    public void inThongTin(){
        System.out.println("FullTimeEmpoyee");
    }
}