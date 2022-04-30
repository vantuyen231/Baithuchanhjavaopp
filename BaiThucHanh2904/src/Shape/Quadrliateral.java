package Shape;

public class Quadrliateral extends Point {
    private float EdgeA;
    private float EdgeB;
    private float EdgeC;
    private float EdgeD;
    private float EdgeAC;
    private float EdgeBD;
    private int vuong;


    public void nhapQuadrliateral()
    {
        Point d1 = new Point();
        System.out.println("Nhap diem 1:");
        d1.nhapPoint();
        Point d2 = new Point();
        System.out.println("Nhap diem thu 2:");
        d2.nhapPoint();
        Point d3 = new Point();
        System.out.println("Nhap diem thu 3:");
        d3.nhapPoint();
        Point d4 = new Point();
        System.out.println("Nhap diem thu 4:");
        d4.nhapPoint();

        EdgeA = (float)Math.sqrt(Math.pow(d1.getHoanhDo()-d2.getHoanhDo(), 2)+Math.pow(d1.getTungDo()-d2.getTungDo(), 2));
        System.out.println("Canh "+d1.getTenDiem()+d2.getTenDiem()+": " + EdgeA);

        EdgeB = (float)Math.sqrt(Math.pow(d2.getHoanhDo()-d3.getHoanhDo(), 2)+Math.pow(d2.getTungDo()-d3.getTungDo(), 2));
        System.out.println("Canh "+d2.getTenDiem()+d3.getTenDiem()+": " + EdgeB);

        EdgeC = (float)Math.sqrt(Math.pow(d3.getHoanhDo()-d4.getHoanhDo(), 2)+Math.pow(d3.getTungDo()-d4.getTungDo(), 2));
        System.out.println("Canh "+d3.getTenDiem()+d4.getTenDiem()+": " + EdgeC);

        EdgeD = (float)Math.sqrt(Math.pow(d4.getHoanhDo()-d1.getHoanhDo(), 2)+Math.pow(d4.getTungDo()-d1.getTungDo(), 2));
        System.out.println("Canh "+d1.getTenDiem()+d4.getTenDiem()+": " + EdgeD);

        EdgeAC = (float)Math.sqrt(Math.pow(d1.getHoanhDo()-d3.getHoanhDo(), 2)+Math.pow(d1.getTungDo()-d3.getTungDo(), 2));
        System.out.println("Canh "+d1.getTenDiem()+d3.getTenDiem()+": " + EdgeAC);

        EdgeBD = (float)Math.sqrt(Math.pow(d2.getHoanhDo()-d4.getHoanhDo(), 2)+Math.pow(d2.getTungDo()-d4.getTungDo(), 2));
        System.out.println("Canh "+d2.getTenDiem()+d4.getTenDiem()+": " + EdgeBD);
    }
    
    
    public Boolean ktraQuadrliateral(){
        if(EdgeA + EdgeB == EdgeAC || EdgeB + EdgeC == EdgeBD || EdgeC + EdgeD == EdgeAC || EdgeA + EdgeD == EdgeBD)
            return false;
        else 
            return true;
    }

    public void ktraloaiQuadrliateral(){
        vuong = 0;
        if(ktraQuadrliateral() == true){
            //Ktra goc vuong
        if(Math.pow(EdgeA,2)+Math.pow(EdgeB, 2) == Math.pow(EdgeAC, 2))
        vuong++;
        if(Math.pow(EdgeB,2)+Math.pow(EdgeC, 2) == Math.pow(EdgeBD, 2))
        vuong++;
        if(Math.pow(EdgeC,2)+Math.pow(EdgeD, 2) == Math.pow(EdgeAC, 2))
        vuong++;
        if(Math.pow(EdgeA,2)+Math.pow(EdgeD, 2) == Math.pow(EdgeBD, 2))
        vuong++;

    
        if(EdgeA == EdgeB && EdgeC == EdgeD && EdgeB == EdgeC){
            if(vuong >= 1)
                System.out.print( "Hinh vuong.");
            else
                System.out.print( "Hinh thoi.");
        }if(EdgeA == EdgeC || EdgeB == EdgeD){
            if(vuong >= 1)
                System.out.print( "Hinh chu nhat.");
            else
                System.out.print( "Hinh binh hanh.");
        }else
            System.out.print( "Tu giac thuong");
        } else
            System.out.print( "Khong phai la tu giac");
    }

}
