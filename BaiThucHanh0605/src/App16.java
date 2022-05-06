import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) throws Exception {
        //khai báo 1 ArrayLList có tên là arListString
        //có kiểu là String
        ArrayList<String> arrListString = new ArrayList<>();

        //Thêm các phần tử sử dụng phương thức add()
        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");

        //duyệt theo kích thước của arrListString
        //sử dụng vòng lập for thông thường
        //phương thức arrListString.size() sẽ trả về số phần tử của arrListString
        // và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        // sau đó hiển thị giá trị phần tử đó ra
        System.out.printf("Cac phan tu co trong arrListString là: ");
        for(int i= 0;i < arrListString.size(); i++ )
        {
            System.out.println(arrListString.get(i)+"\t");
            System.out.println(arrListString.remove(2));
            System.out.println(arrListString.set(2,"HTML")+"\t");
        }
    }
}
