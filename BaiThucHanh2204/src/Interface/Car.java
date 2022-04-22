package Interface;
interface Car {
    void Move();
    void Stop();
    void TurnLeft();
    void TurnRight();
    void Reverse();
}

class TaxiCar implements Car{
    public void Move(){
        System.out.print("Dang chay");
    }
    public void Stop(){
        System.out.print("Dang dung");
    }
    public void TurnLeft(){
        System.out.print("Re trai");
    }
    public void TurnRight(){
        System.out.print("Re phai");
    }
    public void Reverse(){
        System.out.print("Quay xe");
    }
} 