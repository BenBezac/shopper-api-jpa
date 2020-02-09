package com.benbezac.shopperapijpa.controller;

import com.benbezac.shopperapijpa.model.ShopperElement;
import com.benbezac.shopperapijpa.service.ShopperElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/shopper/element")
public class ShopperElementController {
    @Autowired
    private ShopperElementService service;

    @PutMapping("/update/{id}/state/{state}")
    public int checkUncheckShopperElement(@PathVariable("id") Integer id, @PathVariable("state") boolean state) {
        return service.checkUncheckShopperElement(id, state);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteShopperElement(@PathVariable("id") Integer id) {
        service.deleteShopperElement(id);
    }
}
