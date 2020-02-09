package com.benbezac.shopperapijpa.service;

import com.benbezac.shopperapijpa.model.ShopperElement;
import com.benbezac.shopperapijpa.repository.ShopperElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopperElementService {

    @Autowired
    private ShopperElementRepository repository;

    public int checkUncheckShopperElement(Integer id, boolean state) {

        return repository.checkUncheckShopperElement(id, state);
    }

    public void deleteShopperElement(Integer id) {
        repository.findById(id).ifPresent(se -> repository.delete(se));
    }
}
