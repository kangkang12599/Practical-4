public class Registration {
    private int regNo;
    private Owner owner;
    private Car car;
    private static int count = 1001;

    
    public Registration(Owner owner, Car car) {
        this.owner = owner;
        this.car = car;
        this.regNo = count;
        count++;
    }

    public static int getCount() {
        return count;
    }
    
    public String toString() {
        return String.format("%-15s%s%s", regNo, owner.toString(), car.toString());
    }
}
