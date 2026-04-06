package week8labactivity;

// Employee.java
public abstract class Employee implements Payable {
    private final String name;
    public Employee(String name, String employeeId) {
        this.name = name;
    }

    public String getName() { return name; }
    
    // Note: We don't implement getPaymentAmount() here because 
    // Employee is abstract. Subclasses will handle it!
}