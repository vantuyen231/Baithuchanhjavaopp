package Shape;

import java.util.Scanner;

public class Point {
    private String tenDiem;
    private float hoanhDo;
    private float tungDo;

    Scanner scanner = new Scanner(System.in);

    public Point(){

    }

    public Point(String tenDiem, float hoanhDo, float tungDo)
    {
        this.tenDiem = tenDiem;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public String getTenDiem()
    {
        return tenDiem;
    }

    public void setTenDiem(String tenDiem)
    {
        this.tenDiem = tenDiem;
    }

    public float getHoanhDo()
    {
        return hoanhDo;
    }

    public void setHoanhDo(float hoanhDo)
    {
        this.hoanhDo = hoanhDo;
    }

    public float getTungDo()
    {
        return tungDo;
    }

    public void setTungDo(float tungDo)
    {
        this.tungDo = tungDo;
    }



   public void nhapPoint()
    {
        System.out.print("Nhap ten diem: ");
        tenDiem = scanner.nextLine();
        System.out.print("Nhap hoanh do: ");
        hoanhDo = scanner.nextFloat();
        System.out.print("Nhap tung do: ");
        tungDo = scanner.nextFloat();
    }

    public void inPoint()
    {
        System.out.println("TenDiem: "+tenDiem+"("+ hoanhDo +","+tungDo+")");
    }


}