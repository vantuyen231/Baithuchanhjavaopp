package App71;

public class ToaDo{
    private int x;
    private int y;

    //getter cua thuoc tinh x
    public int getX(){
        return x;
    }

    //setter cua thuoc tinh x
    public void setX(int x){
        this.x = x;
    }

    //getter cua thuoc tinh y
    public int getY(){
        return y;
    }

    //setter cua thuoc tinh y
    public void setY(int y){
        this.y = y;
    }
}

class HinhTron {
    private final float PI = 3.14f;
    private float banKinh;

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh){
        this.banKinh = banKinh;
    }

    public float tinhChuVi(){
        return 2* PI + banKinh;
    }

    public float tinhDienTich(){
        return PI * banKinh * banKinh;
    }
}
