package App109.List;
import java.util.ArrayList;
import java.util.ListIterator;


public class App19 {
    public static void main(String[] args){
        //khai báo 1 ArrayList có tên là arrListChar
        //có kiểu là Character
        ArrayList<Character> arrListChar = new ArrayList<>();


        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');

        //khai báo một Interator có kiểu Character
        ListIterator<Character> listIterator =  arrListChar.listIterator();

        System.out.println("Cac phan tu co trong arrListFloat là: ");
        while(listIterator.hasNext())
        {
            System.out.print(listIterator.next() + "\t");
        }
    }
}