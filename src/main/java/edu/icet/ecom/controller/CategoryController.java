package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Category;
import edu.icet.ecom.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@CrossOrigin
public class CategoryController {

    final CategoryService service;

    @PostMapping("/add")
    public void addCategory(@RequestBody Category category){
        service.addCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategoty(@PathVariable String id){
        service.deleteCategoty(id);
    }
}
