class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        this.employeeID = 0;
        this.name = "";
        this.salary = 0.0;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Amit", 45000);
        e1.display();

        System.out.println("Access using GET methods:");
        System.out.println("ID: " + e1.getEmployeeID());
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
    }
}