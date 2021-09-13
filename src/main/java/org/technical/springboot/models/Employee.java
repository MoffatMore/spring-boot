package org.technical.springboot.models;

public class Employee extends User{

    private int employeeId;

    public Employee(int employeeId, String name) {
        super(name);
        this.employeeId = employeeId;
    }
    
    public int getId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
}
