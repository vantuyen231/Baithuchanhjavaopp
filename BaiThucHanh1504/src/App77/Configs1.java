package App77;

public class Configs1 {
    //Cấu hình số lượng hình học
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;

    //các cấu hình khác
    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f;//1 inch = 2.54 cm
    public static final int DON_VI_CM = 1;//đánh dấu ứng dụng đang dùng đơn
    public static final int DON_VI_INC = 2;//đánh dấu ứng dụng đang dùng đơn
    public static int donvi = DON_VI_CM;//co cho biet dang dung don vi gi

    //Phương thức static giúp chuyển đổi 
    public static float ChuyenCemtimeSangInch(float cm){
        float inch = cm / INCH_CM;
        return inch;
    }

    //Phương thức static giúp chuyển đổi inch sang cemtimet
    public static float ChuyenInchSangCemtimet(float inch){
        float cm = inch * INCH_CM;
        return cm;
    }


}
