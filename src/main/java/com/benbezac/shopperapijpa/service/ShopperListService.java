package com.benbezac.shopperapijpa.service;

import com.benbezac.shopperapijpa.model.ShopperList;
import com.benbezac.shopperapijpa.repository.ShopperListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopperListService {

    @Autowired
    private ShopperListRepository repository;

    public List<ShopperList> findAll() {

        Iterable<ShopperList> it = repository.findAll();

        var shopperLists = new ArrayList<ShopperList>();
        it.forEach(e -> shopperLists.add(e));

        return shopperLists;
    }

    public Long count() {

        return repository.count();
    }
}
