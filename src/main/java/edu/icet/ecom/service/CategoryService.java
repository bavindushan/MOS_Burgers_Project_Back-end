package edu.icet.ecom.service;

import edu.icet.ecom.dto.Category;

public interface CategoryService {
    void addCategory(Category category);

    void deleteCategoty(String id);
}
