package Lab_4_Polymorphism.DTO;

public abstract class Organization {
    protected int size;

    public Organization() {
        this.size = 0;
    }

    public Organization(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void communicateByTool();

    @Override
    public String toString() {
        return "(the Organization's size is " + size + ")";
    }
}
