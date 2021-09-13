package org.technical.springboot.models;

public class Customer extends User {
    
    private int numOfYears;

    public Customer(int numOfYears, String name){
        super(name);
        this.numOfYears = numOfYears;
    }

    public Customer(String name){
        super(name);
        this.numOfYears = 0;
    }

    public int getNumOfYears(){
        return numOfYears;
    }

    public void setNumOfYears(int numOfYears){
        this.numOfYears = numOfYears;
    }
}
