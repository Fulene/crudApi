package com.test.crudApi.model.dao;

import com.test.crudApi.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
