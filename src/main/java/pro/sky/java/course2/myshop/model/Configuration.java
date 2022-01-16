package pro.sky.java.course2.myshop.model;

import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    @SessionScope
    public MyShopCart createMyShopCart() {
        return new MyShopCart();
    }
}
