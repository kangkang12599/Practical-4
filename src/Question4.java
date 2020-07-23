import java.util.Scanner;

public class Question4 {
    public static void main (String[] args){
        
        
        CarType []carType = {new CarType("Toyota", "Vios", 1.5),
                             new CarType("Nissan", "Teana", 2.0),
                             new CarType("Honda", "City", 1.6)};
        
        Registration []reg = new Registration[6];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < reg.length; i++){
            System.out.printf("Registraion No.\t\t: %d\n", Registration.getCount());
            System.out.print("Owner name\t\t: ");
            String name = scan.nextLine();
            System.out.print("Owner IC NO.\t\t: ");
            String icNumber = scan.nextLine();
            Owner owner = new Owner(name, icNumber);
            System.out.print("Car Plate NO.\t\t: ");
            String plateNumber = scan.nextLine();
            System.out.print("Car Color\t\t: ");
            String color = scan.nextLine();
            System.out.print("Manufactured Year\t: ");
            int year = scan.nextInt();
            System.out.printf("\n%-5s%-15s%-15s%-15s\n", "No", "Make", "Model", "Capatity");
            System.out.printf("==============================================================\n");
            for(int j = 0; j < carType.length; j++){
               System.out.printf("%-5d%s\n",j+1,carType[j].toString());
            }
            System.out.print("\nSelect your car type\t: ");
            int selection = scan.nextInt();
            Car car = new Car(plateNumber, color, year,carType[selection-1]);
            reg[i] = new Registration(owner, car);
            System.out.println();
            scan.nextLine();
            displayList(reg);
        }
    }
    
    public static void displayList(Registration reg[]){
        System.out.printf("%-15s%-20s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Reg No.", "Name", "IC No.", "Plate No.", "Color", "Year", "Make", "Model", "Capacity");
        for(int i = 0; i < reg.length; i++){
            System.out.println(reg[i].toString());
            System.out.println();
        }
        
    }
}
