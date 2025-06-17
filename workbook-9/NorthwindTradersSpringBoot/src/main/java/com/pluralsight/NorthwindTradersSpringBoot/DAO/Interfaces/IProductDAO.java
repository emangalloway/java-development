package com.pluralsight.NorthwindTradersSpringBoot.DAO.Interfaces;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public interface IProductDAO {
    Product add(Product product);
    List<Product> getAll();

}
