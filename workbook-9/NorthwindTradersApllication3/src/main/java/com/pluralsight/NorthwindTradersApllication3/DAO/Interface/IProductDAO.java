package com.pluralsight.NorthwindTradersApllication3.DAO.Interface;

import com.pluralsight.NorthwindTradersApllication3.Model.Product;

import java.util.List;

public interface IProductDAO {
    Product add(Product product);
    List<Product> getAll();
}
