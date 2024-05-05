package com.fastcampus.boardserver.mapper;


import com.fastcampus.boardserver.dto.CategoryDTO;

public interface CategoryMapper {
    public int register(CategoryDTO categoryDTO);
    public void updateCategory(CategoryDTO categoryDTO);
    public void deleteCategory(int categoryID);
}
