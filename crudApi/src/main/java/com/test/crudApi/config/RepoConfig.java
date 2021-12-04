package com.test.crudApi.config;

import com.test.crudApi.model.entities.Category;
import com.test.crudApi.model.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@Configuration
public class RepoConfig {

    public RepoConfig(RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.exposeIdsFor(Category.class, Product.class);
    }

}
