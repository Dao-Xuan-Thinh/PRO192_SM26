class NhanVien{
    protected String name;
    protected double wage;

    public NhanVien(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    private double tax(){
        return this.wage * 0.1;
    }

    public void output(){
        System.out.println(">> Ho va Ten: " + this.name);
        System.out.println(">> Luong: " + this.wage);
        System.out.println(">> Thue thu nhap: " + this.tax());
    }
}

class Truongphong extends NhanVien{
    public double trachNhiem;
    public Truongphong(String name, double wage, double trachNhiem){
        super(name, wage);
        this.trachNhiem = trachNhiem;
    }
    @Override
    public void output(){
        super.output();
        System.out.println(">> Trach nhiem: " +trachNhiem);
    }
    public double income(){
        return wage + trachNhiem;
    }
}

class Laocong extends NhanVien{
    protected double hourwage;
    protected int hours;
    public Laocong(String name, double wage, double hourwage, int hours){
        super(name, wage);
        this.hourwage = hourwage;
        this.hours=hours;
    }
    public double income(){
        return hourwage*hours;
    }
}

public class main {
    public static void main(String[] args) {
        Truongphong tp = new Truongphong("Nguyen Van A", 1500, 300);
        tp.output();
        System.out.println(">> Tong thu nhap: " + tp.income());        
    }    
}
