import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args){
        List<Integer> tbList = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        float tb = 0f;
        
        int nguyenduong;
        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();
        
        for(int i=0; i<n; i++)
        {
            System.out.print("Nhap so nguyen thu "+i+":");
            nguyenduong = scanner.nextInt();
            tbList.add(nguyenduong);
        }
        int dem=0;
        for(int i=0; i<tbList.size(); i++)
        {
            if(tbList.get(i)%2==0)
            {
                tong +=tbList.get(i);
                dem++;
            }
        }
        tb = (float)tong/dem;
        System.out.print("Trung binh cong la: "+tb);
        scanner.close();
    }
    
}
