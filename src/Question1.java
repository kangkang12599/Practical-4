public class Question1 {
    public static void main(String[] args){
        Employee emp1 = new Employee("Xiao Ming", 5000.00);
        Employee emp2 = new Employee("Xiao Hua");
        
        System.out.println("Employee Name   : " + emp1.getName());
        System.out.println("Employee Salary : " + emp1.getSalary() + "\n");
        
        System.out.println("===================");
        System.out.println("After salary raised");
        System.out.println("===================\n");       
        emp1.raiseSalary(8.0);
        System.out.println("Employee Name   : " + emp1.getName());
        System.out.println("Employee Salary : " + emp1.getSalary() + "\n");
        
        emp2.setSalary(3000.00);
        
        System.out.println("===========================");
        System.out.println("Employee with Higher Salary");
        System.out.println("===========================\n");
        if(emp1.getSalary()>emp2.getSalary()){
            System.out.println("Employee Name   : " + emp1.getName());
            System.out.println("Employee Salary : " + emp1.getSalary() + "\n");
        }
        else{
            System.out.println("Employee Name   : " + emp2.getName());
            System.out.println("Employee Salary : " + emp2.getSalary() + "\n");
        }
        
        System.out.println("=============================");
        System.out.println("Total Salary of the employees");
        System.out.println("=============================\n");
        System.out.println("Total Salary : " + emp1.getSalary() + " + " + emp2.getSalary() + " = " + (emp1.getSalary() + emp2.getSalary()));  
    }
}