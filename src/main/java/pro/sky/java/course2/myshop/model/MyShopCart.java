package pro.sky.java.course2.myshop.model;


import java.util.*;

public class MyShopCart {

    private List<Integer> productsId; //список id продуктов


    public MyShopCart() {
    }

    public List<Integer> getProductsId() {
        return productsId;
    }

    public void setProductsId(List<Integer> productsId) {
        this.productsId = productsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyShopCart)) return false;
        MyShopCart that = (MyShopCart) o;
        return getProductsId().equals(that.getProductsId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductsId());
    }
}
