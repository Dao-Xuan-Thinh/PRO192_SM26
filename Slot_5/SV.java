package Slot_5;

public class SV {
    private String name;
    private double score;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setScore(double score){
        if (score < 0 || score > 10){
            System.out.println("Diem khong hop lo");
        }

        else{
            this.score = score;
        }
    }

    public Double getScore(){
        return this.score;
    }
}

