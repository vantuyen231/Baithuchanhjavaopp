import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) throws Exception{
        //khai báo 1 ArrayList có tên là arrListString
        //có kiểu là String
        ArrayList<Integer> arrListInteger = new ArrayList<>();

        //thêm các phần tử sử dụng phương thức add()
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);

        //duyệt theo kích thước của arrListInteger
        //sử dụng vòng lập for duyệt theo đối tượng 
        //trong đó kiểu dữ liệu của biến number
        //phải trùng với kiểu dữ liệu của arrListInteger
        System.out.printf("Cac phan tu co trong arrListInteger là: ");
        for(int number : arrListInteger)
        {
            System.out.print(number + "\t");
        }
    }
}
