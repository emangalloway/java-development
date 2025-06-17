package com.pluralsight.NorthwindTradersApllication3.DAO.Impli;

import com.pluralsight.NorthwindTradersApllication3.DAO.Interface.IProductDAO;
import com.pluralsight.NorthwindTradersApllication3.Model.Product;

import java.util.ArrayList;
import java.util.List;

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
