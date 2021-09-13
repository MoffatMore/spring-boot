package org.technical.springboot;

import org.technical.springboot.models.Affiliate;
import org.technical.springboot.models.Customer;
import org.technical.springboot.models.Employee;
import org.technical.springboot.models.Product;
import org.technical.springboot.models.ProductType;
import org.technical.springboot.models.User;

public class RetailStore implements RetailStoreInterface{

    @Override
    public double calculateNetAmountPayable(User user, Product product, double bill) {

        if(bill < 0)
            return 0;

        double discount = 0;

        //calculate the bill without discount
        double totalPayableAmount = bill - product.getPrice();

        //instantiate product type of grocery to exclude on percentage based discount
        ProductType productType = new ProductType("grocery");

        /** 
         * check the product type if it is grocery or not
         * if it is not a grocery then calculate the percentage based discount
        **/

        if(product.getProductType().getName() != productType.getName()){

            if(user instanceof Employee){
                discount = 0.3 * product.getPrice();
                totalPayableAmount += discount;

            }else if(user instanceof Affiliate){
                discount = 0.1 * product.getPrice();
                totalPayableAmount += discount;
    
            }else if(user instanceof Customer){
                Customer customer = (Customer) user;
                if(customer.getNumOfYears() >= 2){
                    discount = 0.05 * product.getPrice();
                    totalPayableAmount += discount;
                }
                
            }
        }


        /**
         * calculate discount based on the number of $100 in a bill
         */
        int numOfHundredsDollars = (int) bill/100;
        discount = numOfHundredsDollars*5;
        totalPayableAmount += discount;
        
        return totalPayableAmount;
    }
    
}
