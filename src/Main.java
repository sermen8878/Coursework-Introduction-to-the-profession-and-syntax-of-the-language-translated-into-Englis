public class Employee {
    private final int id;
    private final String fullName;
    private double salary;
    private int department;

    public Employee(int id, String fullName, double salary, int department) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    // Геттеры и сеттеры
    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public int getDepartment() { return department; }
    public void setDepartment(int department) { this.department = department; }
}