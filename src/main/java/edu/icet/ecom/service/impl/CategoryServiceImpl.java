package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Category;
import edu.icet.ecom.entity.CategoryEntity;
import edu.icet.ecom.repository.CategoryRepository;
import edu.icet.ecom.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    final CategoryRepository repository;
    final ModelMapper mapper;

    @Override
    public void addCategory(Category category) {
        repository.save(mapper.map(category, CategoryEntity.class));
    }

    @Override
    public void deleteCategoty(String id) {
        repository.deleteById(id);
    }
}
