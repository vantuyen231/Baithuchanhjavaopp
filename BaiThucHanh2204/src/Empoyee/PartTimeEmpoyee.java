package Empoyee;


public class PartTimeEmpoyee extends Empoyee {
    
    public String loaiEmpoyee(){
        return "PartTimeEmpoyee";
    }
    @Override
    public void inThongTin(){
        System.out.println("PartTimeEmpoyee");
    }
    
}
