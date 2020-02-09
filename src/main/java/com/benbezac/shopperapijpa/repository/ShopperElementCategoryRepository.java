package com.benbezac.shopperapijpa.repository;

import com.benbezac.shopperapijpa.model.ShopperElementCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ShopperElementCategoryRepository extends CrudRepository<ShopperElementCategory, Integer> {
}
