public class CarType {
    private String make;
    private String model;
    private double capacity;

    public CarType(String make, String model, double capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    public String toString() {
        return String.format("%-15s%-15s%-15s",make, model, capacity);
    }
    
    
    
    
}
