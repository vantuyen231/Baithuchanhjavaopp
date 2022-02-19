import java.util.Scanner;

public class App40 {
    public static void main(String[] agrs) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int ngay = scanner.nextInt();
        switch (ngay) {
            case 2:System.out.println("Thu hai");
                break;
            case 3:System.out.println("Thu ba");
                break;
            case 4:System.out.println("Thu tu");
                break;
            case 5:System.out.println("Thu nam");
                break;
            case 6:System.out.println("Thu sau");
                break;
            case 7:System.out.println("Thu bay");
                break;
            case 8:System.out.println("Chu nhat");
                break;
            default:System .out.println("Khong co ngay nay trong tuan");
                break;
        }
        scanner.close();
    }
    
}
