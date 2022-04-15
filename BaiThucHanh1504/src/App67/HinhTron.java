package App67;
public class App {

    public class HinhTron{

        public void xuatThongTin(){
         System.out.println("Day la Hinh tron");
        }
    }

    public class HinhTru extends HinhTron {

        @Override
        public void xuatThongTin(){
            System.out.println("Day la Hinh tru");
        }
    }
}

