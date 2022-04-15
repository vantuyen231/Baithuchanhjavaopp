package App72;
public class SinhVien {
    private String ten;
    private String tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten){
        if(ten == null || ten.isEmpty()){
            //nếu biết ten chưa khơi tạo (mang giá trị null), hoặc biên ten có nội
            // thi hãy lưu với ten là "không biết"
            this.ten = "Khong biet";
        }else{
            this.ten = ten;
        }
    }
    public String getTuoi(){
        if(Integer.valueOf(tuoi) != -1){
            //tuoi hợp lệ
            return tuoi;
        }else{
            return "Tuoi khong hop le";
        }
    }

    public void setTuoi(int tuoi){
        //kiem tra tuoi co hop ly hay ko, nếu hợp lý thì lưu vào, nếu không sẽ
        if(tuoi >18){
            this.tuoi = String.valueOf(tuoi);
        }else{
            this.tuoi = String.valueOf(-1);
        }
    }
}
