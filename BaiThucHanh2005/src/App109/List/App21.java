package App109.List;
import java.util.ArrayList;

public class App21 {
    public static void main(String[] args ) throws Exception{
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");

        System.out.println(colors.get(1));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
