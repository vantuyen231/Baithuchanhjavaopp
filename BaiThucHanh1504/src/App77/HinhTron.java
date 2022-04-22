package App77;

public class HinhTron extends HinhHoc{
    protected float banKinh;
    private Scanner scanner;
    
    //constructor
    public HinhTron(){
        super();
        scanner = new Scanner(System.in);
    }

    public void nhapBanKinh(){
        //nhap dơn vị tính là cemtimet hay inch
        System.out.println("Ban dung don vi tinh nao:");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 - Inch");

        //sau do nhap ban kinh
        System.out.println("Hay nhap vao ban kinh Hinh tron: ");
        banKinh = scanner.nextFloat();
    }

    public void inThongTin(){
        if(Configs1.donvi == Configs1.DON_VI_CM){
            System.out.println("Hinh tron co ban kinh "+ banKinh + " cm");
            System.out.println("Tuong duong "+ Configs1.ChuyenCemtimeSangInch(banKinh) + " inch");
        }else{
            System.out.println("Hinh tron co ban kinh "+ banKinh + " inch");
            System.out.println("Tuong duong "+ Configs1.ChuyenInchSangCemtimet(banKinh) + " cm");
        }
    }
}
