import java.util.Scanner;

class SV {
    protected String name;
    protected String major;

    public SV(String name, String major){
        this.name = name;
        this.major = major;
    }

    public void output(){
        System.out.println(">> Ho va Ten: " +name);
        System.out.println(">> Chuyen nganh: " +major);

    }
}

class svIT extends SV{
    protected double java_score;
    protected double css_score;
    protected double html_score;
    protected String cScore;

    public svIT(String name, String major, double java_score, double css_score, double html_score){
        super(name, major);
        this.java_score = java_score;
        this.css_score = css_score;
        this.html_score = html_score;
    }

    public String getScore(){
        double temp = (java_score*2 + css_score + html_score)/4;
        if (temp > 5 && temp <= 10){
            cScore = "S";
        }

        else if (temp <= 5 && temp > 0){
            cScore = "F";
        }

        return cScore;
    }

    @Override
    public void output(){
        super.output();
    }
}

class svBIZ extends SV{
    protected double market_score;
    protected double sales_score;
    protected String cScore;

    public svBIZ(String name, String major, double market_score, double sales_score){
        super(name, major);
        this.market_score = market_score;
        this.sales_score = sales_score;
    }

    public String getScore(){
        double temp = 2*market_score + sales_score;
        if (temp > 5 && temp <= 10){
            cScore = "S";
        }

        else if (temp <= 5 && temp > 0){
            cScore = "F";
        }

        return cScore;
    }

    @Override
    public void output(){
        super.output();
    }
}

public class SucVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(">> Ho va Ten: ");
        String name = sc.nextLine();
        System.out.printf(">> Chuyen nganh (IT/BIZ): ");
        String major = sc.nextLine();
        double[] a = new double[3];

        if ("IT".equalsIgnoreCase(major)){
            for(int i = 0; i < 3; i++){
                System.out.printf(">> Nhap diem %d: ", i);
                a[i] = sc.nextDouble();
            }
            svIT ngu = new svIT(name, major, a[0], a[1], a[2]);
            ngu.output();
            System.out.println(">> Diem " + ngu.getScore());    
        }
        
        else if ("BIZ".equalsIgnoreCase(major)){
            for(int i = 0; i < 2; i++){
                System.out.printf(">> Nhap diem %d: ", i);
                a[i] = sc.nextDouble();
            }
            svBIZ ngu = new svBIZ(name, major, a[0], a[1]);
            ngu.output();
            System.out.println(">> Diem " + ngu.getScore());
        }
        
        else{
            System.out.printf("ERROR");
        }
    }    
}
