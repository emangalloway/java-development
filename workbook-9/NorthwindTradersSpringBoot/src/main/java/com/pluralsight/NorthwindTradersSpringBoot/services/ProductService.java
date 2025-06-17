package com.pluralsight.NorthwindTradersSpringBoot.services;

import com.pluralsight.NorthwindTradersSpringBoot.DAO.Interfaces.IProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private IProductDAO productDAO;

    @Autowired
    public ProductService(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public Product add(Product product) {
        return productDAO.add(product);
    }

    public List<Product> getAll() {
        return productDAO.getAll();
    }
}
