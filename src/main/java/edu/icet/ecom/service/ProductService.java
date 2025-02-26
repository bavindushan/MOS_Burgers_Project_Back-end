package edu.icet.ecom.service;

import edu.icet.ecom.dto.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    List<Product> getAll();

    void updateProduct(Product product);

    void deleteProduct(String itemCode);
}
