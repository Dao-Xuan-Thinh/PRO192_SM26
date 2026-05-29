class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar() {
        this.serialNumber = "null";
        this.price = 0;
        this.builder = "null";
        this.model = "null";
        this.backWood = "null";
        this.topWood = "null";
    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber != null && !serialNumber.trim().isEmpty()) {
            this.serialNumber = serialNumber;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) { 
            this.price = price;
        }
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        if (builder != null && !builder.trim().isEmpty()) {
            this.builder = builder;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        }
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        if (backWood != null && !backWood.trim().isEmpty()) {
            this.backWood = backWood;
        }
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        if (topWood != null && !topWood.trim().isEmpty()) {
            this.topWood = topWood;
        }
    }

        public void output() {
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Builder: " + getBuilder());
        System.out.println("Model: " + getModel());
        System.out.println("BackWood: " + getBackWood());
        System.out.println("TopWood: " + getTopWood());
    }
}

public class Guitar_Main {
    public static void main(String[] args) {
        Guitar obj1 = new Guitar();
        Guitar obj2 = new Guitar("G123", 2000, "Sony", "Model123", "hardWood", "softWood"); 
        
        System.out.println("State of obj1:");
        obj1.output(); 
        
        System.out.println("State of obj2:"); 
        obj2.output();
        
        System.out.println("set price = 3000 of obj1"); 
        obj1.setPrice(3000);
        System.out.println("get price of obj1: " + obj1.getPrice());
    }
}