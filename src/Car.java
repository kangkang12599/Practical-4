public class Car {
    private String PlateNumber;
    private String Color;
    private int year;
    private CarType type;

    public Car(String PlateNumber, String Color, int year, CarType type) {
        this.PlateNumber = PlateNumber;
        this.Color = Color;
        this.year = year;
        this.type = type;
    }
    
    public String toString() {
        return String.format("%-15s%-15s%-15d%s",PlateNumber, Color, year, type.toString());
    }
}
