package com.pluralsight.NorthwindTradersApllication3.Service;

import com.pluralsight.NorthwindTradersApllication3.DAO.Interface.IProductDAO;
import com.pluralsight.NorthwindTradersApllication3.Model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
private IProductDAO iProductDAO;

    public Product add(Product product) {
        return iProductDAO.add(product);
    }

    public List<Product> getAll() {
        return iProductDAO.getAll();
    }
}
