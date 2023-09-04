package com.example.modelbe.dao;

import com.example.modelbe.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "productCategories", path = "productCategories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
