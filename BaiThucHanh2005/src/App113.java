import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class App113 {
    public static void main(String[] args){
        String traicay;
        int n;
        Scanner scanner = new Scanner(System.in);

        HashSet<String> hashTraiCay =  new HashSet<String>();
        System.out.println("Nhap so luong trai cay:");
        n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<n; i++)
        {
            System.out.println("Nhap loai trai cay thu "+i+":");
            traicay = scanner.nextLine();
            hashTraiCay.add(traicay);
        }
        // Hiển thị số phần tử có trong HashSet vừa tạo
        System.out.println("So trai cay vua nhap la: "+hashTraiCay.size());
        System.out.println("So trai cay co trong hashTraiCay la: "+hashTraiCay);
        
        System.out.print("Nhap ten trai cay can tim:");
        traicay = scanner.nextLine();
        for(int i=0; i<hashTraiCay.size(); i++)
        {
            if(hashTraiCay.contains(traicay))
            {
                System.out.println(traicay+" co trong hashTraiCay");
                break;
            }else{
                System.out.print("Khong tim thay" +traicay+ " trong hashTraiCay");
            }
        }
        

        // Xóa 1 loại trái cây trong HashSet
        String Xoatraicay;
        System.out.print("Nhap loai trai cay can xoa:");
        Xoatraicay = scanner.nextLine();

        if(hashTraiCay.contains(Xoatraicay))
        {
            hashTraiCay.remove(Xoatraicay);
            System.out.println("Xoa thanh cong");
            System.out.print("Cac loai trai cay con lai:");
            System.out.println(hashTraiCay);
        }else{
            System.out.println("Xoa khong thanh cong");
        }

        //Tạo list mới
        List<String> listTraiCay = new ArrayList<>(); 
        listTraiCay.add("Da ran");
        listTraiCay.add("Mang cut");
        listTraiCay.add("Coc");

        //Thêm các phần tử List vào trong HashSet
        hashTraiCay.addAll(listTraiCay);
        System.out.println("Cac phan tu duoc them vao HashSet la: ");
        Iterator<String> iterator = hashTraiCay.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next() +"\t");
        }

        //Xoa phần các phần tử trong List 
        hashTraiCay.removeAll(listTraiCay);
        System.out.println("Cac phan tu sau khi xoa:");
        System.out.println(hashTraiCay);

        scanner.close();
    }
}
