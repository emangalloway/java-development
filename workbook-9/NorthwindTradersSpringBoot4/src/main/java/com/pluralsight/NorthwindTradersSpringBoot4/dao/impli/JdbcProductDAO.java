package com.pluralsight.NorthwindTradersSpringBoot4.dao.impli;

import com.pluralsight.NorthwindTradersSpringBoot4.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersSpringBoot4.models.Product;

import java.util.List;

public class JdbcProductDAO implements IProductDao {
    @Override
    public Product insert(Product product) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product getById(int productId) {
        return null;
    }

    @Override
    public void update(int productId, Product product) {

    }

    @Override
    public void delete(int productId) {

    }
}
