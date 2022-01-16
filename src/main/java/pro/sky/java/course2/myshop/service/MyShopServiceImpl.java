package pro.sky.java.course2.myshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.java.course2.myshop.model.MyShopCart;

import java.util.*;

@Service
public class MyShopServiceImpl implements MyShopService {


    @Autowired
    private MyShopCart myShopCart;

    Map<List<Integer>,Integer> products = new HashMap<>();


    @Override
    public void addToMyShopCart(List<Integer> productsId, Integer quantity) {
        products.put(productsId, quantity);

    }

    @Override
    public Set<Map.Entry<List<Integer>, Integer>> getProducts() {
        return products.entrySet();
    }
}
