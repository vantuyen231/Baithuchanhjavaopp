
import Person.Person;
import Phuongtrinhbachai.PhuongTrinhBacHai;
import Sinhvien.SinhVien;
public class App1603 {
    public static void main(String[] args) throws Exception {
        Person ps = new Person();
        PhuongTrinhBacHai PTBH =  new PhuongTrinhBacHai();
        SinhVien SV = new SinhVien();

        //Peron
        ps.Nhapthongtin();
        System.out.println("Day la thong tin nguoi vua nhap");
        ps.Inthongtin();
        System.out.println("\n\n");

        //Sinhvien
        SV.Nhapsinhvien();
        System.out.println("Day la thong tin sinh vien vua nhap");
        SV.Insinhvien();
        System.out.println("\n\n");

        //Phuong trinh bac hai
        PTBH.Nhapsonguyen();
        System.out.println("Ket qua cua phuong trinh bac hai");
        PTBH.Tinh();
    }
}
