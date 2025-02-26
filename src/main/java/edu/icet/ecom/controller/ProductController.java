package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {

    final ProductService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return service.getAll();
    }

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/delete/{itemCode}")
    public void deleteProduct(@PathVariable String itemCode){
        service.deleteProduct(itemCode);
    }
}
