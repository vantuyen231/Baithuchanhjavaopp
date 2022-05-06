import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) throws Exception{
        //khai báo 1 ArrayList có tên là arrListString
        //có kiểu là String
        ArrayList<Float> arrListFloat = new ArrayList<>();

        //thêm các phần tử sử dụng phương thức add()
        //chữ f cho biết các skks thêm vào là số thực
        //nếy không có chữ này thì trình biên dịch sẽ hiểu đây là số double
        //và sẽ báo lỗi dữ liệu
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);

        //khai báo một Interator có kiểu Float
        Iterator<Float> iterator =  arrListFloat.iterator();

        System.out.println("Cac phan tu co trong arrListFloat là: ");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + "\t");
        }
    }
}

