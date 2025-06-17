package com.pluralsight.NorthwindTradersSpringBoot.DAO.Implements;

import com.pluralsight.NorthwindTradersSpringBoot.DAO.Interfaces.IProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDAO implements IProductDAO {
    private List<Product> products;

    public SimpleProductDAO() {
        this.products = new ArrayList<>();
    }

    @Override
    public Product add(Product product) {
        int maxId = 0;
        for (Product p : products) {
            if (p.getProductId() > maxId){
                maxId = p.getProductId();
            }
        }
        product.setProductId(maxId + 1);
        products.add(product);
        return null;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
