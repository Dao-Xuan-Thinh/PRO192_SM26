package Slot_6;

public class Truongphong extends Nhanvien{
    public double trachNhiem;
    public Truongphong(String hoTen, double luong, double trachNhiem){
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println(">> Trach nhiem: " + this.trachNhiem);
    }
}
