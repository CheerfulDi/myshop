package pro.sky.java.course2.myshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.myshop.service.MyShopService;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping(path= "/store/order")

public class MyShopController {


    private final MyShopService myShopService;

    public MyShopController(MyShopService myShopService) {
        this.myShopService = myShopService;
    }

    @GetMapping(path = "/add")
    public String add (@RequestParam List<Integer> productsId, Integer quantity) {
        myShopService.addToMyShopCart(productsId, quantity);
        return "Продукты " + productsId + " успешно добавлены в корзину.";
    }

    @GetMapping(path = "/get")
    public Set<Map.Entry<List<Integer>, Integer>> get() {
        return myShopService.getProducts();
    }
}
