package com.benbezac.shopperapijpa.repository;

import com.benbezac.shopperapijpa.model.ShopperList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ShopperListRepository extends CrudRepository<ShopperList, Integer> {
}
