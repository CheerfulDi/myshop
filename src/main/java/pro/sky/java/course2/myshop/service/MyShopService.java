package pro.sky.java.course2.myshop.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MyShopService {

    void addToMyShopCart(List<Integer> productsId, Integer quantity);
    Set<Map.Entry<List<Integer>, Integer>> getProducts();

}
