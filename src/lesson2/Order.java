package lesson2;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Order{
    private int id;
    private ArrayList<Product> products;
    private OrderStatus status;

    // aggregation
    public void addProduct(Product product){
        if (products == null){
            products = new ArrayList<>();
        }
        products.add(product);
    }
}
