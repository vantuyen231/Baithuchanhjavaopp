import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> songuyenList = new ArrayList<Integer>();
        int songuyen;

        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();
        int i;
        for( i=0; i<n; i++ )
        {
            System.out.print("Nhap so nguyen thu "+i+":");
            songuyen = scanner.nextInt();
            songuyenList.add(songuyen);
        }
        
        //Tìm số nguyên có giá trị lớn nhất
        int max = songuyenList.get(1);
        for( i=1; i<songuyenList.size();i++)
        {
            if(songuyenList.get(i).compareTo(max)>0)
            {
                max = songuyenList.get(i);
            }
        }      
        System.out.println("So nguyen lon nhat la "+max);

        //Nhập số nguyên, xóa khỏi mảng các phần tử có giá trị bẳng giá trị nhập vào
        int xoa;
        System.out.print("Nhap so nguyen muon xoa:");
        xoa = scanner.nextInt();
        for(i=0; i<songuyenList.size();i++)
            if(songuyenList.get(i).compareTo(xoa)==0)
            {
                songuyenList.remove(i);
            }
        System.out.println("So nguyen con lai" +songuyenList);
        
        //Sắp xếp dãy số và in dãy số ra màn hình  
        Collections.sort(songuyenList);
        System.out.println("Sau khi sap xep:" +songuyenList);
        
    }
}
