package Lab_4_Polymorphism.DTO;

public class Colony extends Organization{
    protected String place;

    public Colony() {
        this.place = "null";
    }

    public Colony(int size, String place){
        super(size);
        this.place = place;
    }

    @Override
    public void communicateByTool(){
        System.out.println("This colony communicate by sound");
    }

    public void grow(){
        System.out.println("an annual cycle of growth that begins in spring");
    }

    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString(){
        return "The colony size is "+ size +", the colony place is " + place;
    }
}
