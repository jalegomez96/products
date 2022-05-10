package com.co.ias.products.infraestructure.adapters.out;

import java.util.List;

import com.co.ias.products.products.application.domain.Product;
import com.co.ias.products.products.application.domain.ProductId;
import com.co.ias.products.products.application.ports.out.ProductRepository;
import com.co.ias.products.shared.domain.PageQuery;

import org.springframework.stereotype.Repository;

@Repository
public class MongoDBProductRepository implements ProductRepository {

    @Override
    public Integer store(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product get(ProductId productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Product product) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(ProductId productId) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Product> getProducts(PageQuery pageQuery) {
        // TODO Auto-generated method stub
        return null;
    }

}
