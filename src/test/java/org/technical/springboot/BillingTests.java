package org.technical.springboot;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.technical.springboot.models.Affiliate;
import org.technical.springboot.models.Customer;
import org.technical.springboot.models.Employee;
import org.technical.springboot.models.Product;
import org.technical.springboot.models.ProductType;
import org.technical.springboot.models.User;

@SpringBootTest
public class BillingTests {
    

    @Test
    public void calculate_discount_employee(){

        RetailStore retailStore = new RetailStore();
        Employee employee = new Employee(1, "Moffat");
        ProductType productType = new ProductType("Electronics");
        Product product = new Product(1, "Laptop", 10, productType);

        double totalNetPayable = retailStore.calculateNetAmountPayable(employee, product, 100);
        assertTrue((totalNetPayable == 98.0));

    }

    @Test
    public void calculate_discount_for_employee(){

        RetailStore retailStore = new RetailStore();
        Employee employee = new Employee(1, "Moffat");
        ProductType productType = new ProductType("Electronics");
        Product product = new Product(1, "Laptop", 10, productType);

        double totalNetPayable = retailStore.calculateNetAmountPayable(employee, product, 100);
        assertFalse((totalNetPayable == 0));

    }

    @Test
    public void calculate_discount_for_affiliate(){

        RetailStore retailStore = new RetailStore();
        User affiliate = new Affiliate( "Moffat");
        ProductType productType = new ProductType("Electronics");
        Product product = new Product(1, "Laptop", 10, productType);

        double totalNetPayable = retailStore.calculateNetAmountPayable(affiliate, product, 100);
        assertTrue((totalNetPayable == 96));

    }

    @Test
    public void calculate_discount_for_customer(){

        RetailStore retailStore = new RetailStore();
        User customer = new Customer(1, "Moffat");
        ProductType productType = new ProductType("Electronics");
        Product product = new Product(1, "Laptop", 10, productType);

        double totalNetPayable = retailStore.calculateNetAmountPayable(customer, product, 100);
        assertTrue((totalNetPayable == 95.5));
    }

}
