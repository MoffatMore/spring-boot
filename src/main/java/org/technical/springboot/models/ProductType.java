package org.technical.springboot.models;

public class ProductType {
    private String name;

    public ProductType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String toString(){
        return name;
    }
}
