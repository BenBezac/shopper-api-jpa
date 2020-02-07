package com.benbezac.shopperapijpa.controller;

import com.benbezac.shopperapijpa.model.ShopperList;
import com.benbezac.shopperapijpa.service.ShopperListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/shopper/list")
public class ShopperListController {
    @Autowired
    private ShopperListService service;

    @GetMapping("/all")
    public List<ShopperList> getAll() {
        return service.findAll();
    }
}
