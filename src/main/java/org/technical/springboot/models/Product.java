package org.technical.springboot.models;

public class Product {
    
    private int id;
    private String name;
    private double price;
    private ProductType productType;

    public Product(int id, String name, double price, ProductType productType){
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setProductType(ProductType productType){
        this.productType=productType;
    }
}
