package com.example.personalprojecttemplate.domain.category;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.personalprojecttemplate.domain.category.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}