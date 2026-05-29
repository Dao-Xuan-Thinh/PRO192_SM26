// 1. Base Class: Nhanvien
class Nhanvien {
    protected String hoTen;
    protected double luong;
    
    public Nhanvien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    // Changed to package-private or protected if you want subclasses to access it,
    // but private works here since it's only called inside Nhanvien's xuat()
    private double thue() {
        return this.luong * 0.1;
    }

    public void xuat() {
        System.out.println(">> Ho va Ten: " + this.hoTen);
        System.out.println(">> Luong: " + this.luong);
        System.out.println(">> Thue thu nhap: " + this.thue());
    }
}

// 2. Subclass: Truongphong (Inherits from Nhanvien)
class Truongphong extends Nhanvien {
    public double trachNhiem;

    public Truongphong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong); // Calls the constructor of Nhanvien
        this.trachNhiem = trachNhiem;
    }

    @Override
    public void xuat() {
        super.xuat(); // Calls Nhanvien's xuat() method
        System.out.println(">> Trach nhiem: " + this.trachNhiem);
    }
}

// 3. Main Class matching the file structure
public class Main {
    public static void main(String[] args) {
        // Example of testing your classes:
        Nhanvien nv = new Nhanvien("Nguyen Van A", 1000);
        nv.xuat();
        
        System.out.println("-------------------------");
        
        Truongphong tp = new Truongphong("Tran Thi B", 2000, 500);
        tp.xuat();
    }
}