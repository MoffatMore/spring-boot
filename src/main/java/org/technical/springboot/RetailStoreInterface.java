package org.technical.springboot;

import org.technical.springboot.models.Product;
import org.technical.springboot.models.User;

public interface RetailStoreInterface {
    public double calculateNetAmountPayable(User user, Product product, double bill);
}
