package Shape;

public class Triangle extends Point {
    private double EdgeA;
    private double EdgeB;
    private double EdgeC;


    public void nhapTriangle()
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

        EdgeA = Math.sqrt(Math.pow((d1.getHoanhDo()-d2.getHoanhDo()),2)+Math.pow((d1.getTungDo()-d2.getTungDo()),2));
        System.out.println("canh "+d1.getTenDiem()+d2.getTenDiem()+" = " + EdgeA);
        EdgeB = Math.sqrt(Math.pow((d2.getHoanhDo()-d3.getHoanhDo()),2)+Math.pow((d2.getTungDo()-d3.getTungDo()),2));
        System.out.println("canh " +d2.getTenDiem() +d3.getTenDiem()+"= " + EdgeB);
        EdgeC = Math.sqrt(Math.pow((d1.getHoanhDo()-d3.getHoanhDo()),2)+Math.pow((d1.getTungDo()-d3.getTungDo()),2));
        System.out.println("canh "+d1.getTenDiem()+d3.getTenDiem()+" = " + EdgeC);
    }

    public void ktraTriangle()
    {
        if((EdgeA+EdgeB>EdgeC)&&(EdgeA+EdgeC>EdgeB)&&(EdgeB+EdgeC>EdgeA))
        {
            if((EdgeA*EdgeA==EdgeB*EdgeB+EdgeC*EdgeC)||(EdgeB*EdgeB==EdgeC*EdgeC+EdgeA*EdgeA)||(EdgeC*EdgeC==EdgeA*EdgeA+EdgeB*EdgeB))
                System.out.println("Tam giac vuong");
            if((EdgeA==EdgeB)&&(EdgeB==EdgeC))
                System.out.println("Tam giac deu");
            if((EdgeA==EdgeB)||(EdgeB==EdgeC)||(EdgeA==EdgeC))
                System.out.println("Tam giac can");
            else
                System.out.println("Tam giac nhon");
        }
        else
            System.out.println("Khong la tam giac");
        
    }
}
