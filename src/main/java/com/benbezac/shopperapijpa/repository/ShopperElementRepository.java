package com.benbezac.shopperapijpa.repository;

import com.benbezac.shopperapijpa.model.ShopperElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource
public interface ShopperElementRepository extends JpaRepository<ShopperElement, Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE shopper_element SET checked = :state WHERE id = :id", nativeQuery = true)
    int checkUncheckShopperElement(@Param("id") Integer id, @Param("state") boolean state);
}
