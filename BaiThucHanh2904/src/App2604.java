
import Shape.Point;
import Shape.Triangle;
import Shape.Quadrliateral;

public class App2604 {
    public static void main(String[] args) throws Exception {
       
/*        System.out.println("Nhap 1 diem");
        Point TenDiem = new Point();
        TenDiem.nhapPoint(); 
        TenDiem.inPoint(); 

        System.out.println("Nhap diem cua tam giac");
        Triangle TamGiac = new Triangle();
        TamGiac.nhapTriangle();
        TamGiac.ktraTriangle();
*/
        System.out.println("Nhap diem cua tu giac");
        Quadrliateral TuGiac = new Quadrliateral();
        TuGiac.nhapQuadrliateral();
        TuGiac.ktraQuadrliateral();
        TuGiac.ktraloaiQuadrliateral();
    }
}
