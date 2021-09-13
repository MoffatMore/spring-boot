package org.technical.springboot.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.technical.springboot.RetailStore;
import org.technical.springboot.models.Customer;
import org.technical.springboot.models.Product;
import org.technical.springboot.models.ProductType;
import org.technical.springboot.models.User;

@RestController
public class BillingController {
    @GetMapping("/calculateBill")
	public double calculateBill(@RequestParam(value = "bill") double bill) {

        RetailStore retailStore = new RetailStore();
        User customer = new Customer(2, "Moffat");
        ProductType productType = new ProductType("Electronics");
        Product product = new Product(1, "Laptop", 10, productType);

        double totalNetPayable = retailStore.calculateNetAmountPayable(customer, product, bill);
        System.out.print(totalNetPayable);
		return totalNetPayable;
	}

}
