package main;
import App72.SinhVien;
public class App72 {
    public static void main(String[] args){
        //khởi tạo các đối tượng sinhVien
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();

        //set thông tin vào cho các sinh viên
        sinhVien1.setTen("");//tên khong có
        sinhVien1.setTuoi(23);

        sinhVien2.setTen("Peter");
        sinhVien2.setTuoi(17);

        //in thong tin các sinh viên
        System.out.println("Sinh vien 1 co ten: "+ sinhVien1.getTen() +", tuoi: "+ sinhVien1.getTuoi());
        System.out.println("Sinh vien 2 co ten: "+ sinhVien2.getTen() +", tuoi: "+ sinhVien2.getTuoi());

    }
}
