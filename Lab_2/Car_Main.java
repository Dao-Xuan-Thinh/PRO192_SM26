class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean getConvertible() {
        return convertible;
    }

    public boolean getParkingBrake() {
        return parkingBrake;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        System.out.println("Colour: " + colour);
        System.out.println("Engine Power: " + enginePower);
        System.out.println("Convertible: " + convertible);
        System.out.println("Parking Brake: " + parkingBrake);
    }
}

public class Car_Main {
    public static void main(String[] args) { 
        System.out.println("-----------------------------------");
        
        Car c2 = new Car("red", 100, true, true); 
        c2.pressAcceleratorButton(); 
        c2.setColour("black");
        System.out.println("Colour of c2: " + c2.getColour()); 
        c2.output();
    }
}