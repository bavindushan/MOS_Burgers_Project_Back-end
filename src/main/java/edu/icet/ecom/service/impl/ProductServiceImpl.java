package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Admin;
import edu.icet.ecom.dto.Product;
import edu.icet.ecom.entity.AdminEntity;
import edu.icet.ecom.entity.ProductEntity;
import edu.icet.ecom.repository.ProductRepository;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository repository;
    final ModelMapper mapper;

    @Override
    public void addProduct(Product product) {
        product.setItemCode(generateId(product.getCategoryId()));
        repository.save(mapper.map(product, ProductEntity.class));
    }

    @Override
    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        List<ProductEntity> all = repository.findAll();

        all.forEach(productEntity -> list.add(mapper.map(productEntity, Product.class)));
        return list;
    }

    @Override
    public void updateProduct(Product product) {
        repository.save(mapper.map(product, ProductEntity.class));
    }

    @Override
    public void deleteProduct(String itemCode) {
        repository.deleteById(itemCode);
    }

    @Override
    public Product searchById(String itemCode) {
        return mapper.map(repository.findById(itemCode), Product.class);

    }

    private String generateId(String categoryID){
        Optional<ProductEntity> lastProduct = repository.findTopByOrderByItemCodeDesc();

        if (lastProduct.isPresent()){
            String itemCode = lastProduct.get().getItemCode();
            int num = Integer.parseInt(itemCode.substring(1))+1;
            return String.format("%s%03d", categoryID, num);

        }else return categoryID+"001";
    }
}
