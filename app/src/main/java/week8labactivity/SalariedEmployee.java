package week8labactivity;

// SalariedEmployee.java
public class SalariedEmployee extends Employee {
    private final double weeklySalary;

    public SalariedEmployee(String name, String id, double salary) {
        super(name, id);
        this.weeklySalary = salary;
    }

    public SalariedEmployee(double weeklySalary, String name, String employeeId) {
        super(name, employeeId);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
}