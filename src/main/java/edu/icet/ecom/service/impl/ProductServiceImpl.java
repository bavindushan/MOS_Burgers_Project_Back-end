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
    private String generateId(String categoryID){
        Optional<ProductEntity> lastProduct = repository.findTopByOrderByItemCodeDesc();

        if (lastProduct.isPresent()){
            String itemCode = lastProduct.get().getItemCode();
            int num = Integer.parseInt(itemCode.substring(1))+1;
            return String.format("%s%03d", categoryID, num);

        }else return categoryID+"001";
    }
}
