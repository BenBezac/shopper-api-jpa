package com.benbezac.shopperapijpa.repository;

import com.benbezac.shopperapijpa.model.ShopperElement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource
public interface ShopperElementRepository extends CrudRepository<ShopperElement, Integer> {
}
