package com.benbezac.shopperapijpa;

import com.benbezac.shopperapijpa.model.ShopperElement;
import com.benbezac.shopperapijpa.model.ShopperList;
import com.benbezac.shopperapijpa.repository.ShopperElementCategoryRepository;
import com.benbezac.shopperapijpa.repository.ShopperElementRepository;
import com.benbezac.shopperapijpa.repository.ShopperListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ShopperApiCommandLineRunner implements CommandLineRunner {
    @Autowired
    ShopperListRepository shopperListRepository;

    @Autowired
    ShopperElementRepository shopperElementRepository;

    @Autowired
    ShopperElementCategoryRepository shopperElementCategoryRepository;

    @Override
    @Transactional
    public void run(String... args) {
        // Create a couple of Book and BookCategory

        ShopperElement seWater = new ShopperElement("eau plate");
        ShopperElement seSparklingWater = new ShopperElement("eau gazeuse");
        ShopperElement seTomato = new ShopperElement("tomate");

//		ShopperElementCategory catBeverage = shopperElementCategoryRepository.save(new ShopperElementCategory("boisson", "Catégorie des Boissons", seWater, seSparklingWater));
//		ShopperElementCategory catFruitAndVegetable = shopperElementCategoryRepository.save(new ShopperElementCategory("fruits & légumes", "Catégorie des Fruits et Légumes", seTomato));

        ShopperList shopList1 = shopperListRepository.save(new ShopperList("List Test 1", "Liste de Test numéro 1", seWater, seTomato, seSparklingWater));
        ShopperList shopList2 = shopperListRepository.save(new ShopperList("List Test 2", "Liste de Test numéro  - Vide"));

//        seWater.setShopperList(shopList1);
//        seSparklingWater.setShopperList(shopList1);
//        seTomato.setShopperList(shopList1);

//		seWater.setShopperElementCategory(catBeverage);
//		seSparklingWater.setShopperElementCategory(catBeverage);
//		seTomato.setShopperElementCategory(catFruitAndVegetable);

        shopperElementRepository.save(seWater);
        shopperElementRepository.save(seSparklingWater);
        shopperElementRepository.save(seTomato);

    }
}
