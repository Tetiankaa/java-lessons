package lesson2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

//        Product product = new Product("pensil",0.89);

        Laptop laptop = new Laptop();
        laptop.setName("Dell");
        laptop.setPrice(2500);
        laptop.setCpuModel("Intel core i7");

        Notebook notebook = new Notebook();
        notebook.setName("notebook");
        notebook.setPrice(5.2);
        notebook.setNumberOfSheets(60);

//        products.add(product);
        products.add(laptop);
        products.add(notebook);


        System.out.println(products);

        // composition
        laptop.addReview("excellent",10);
        System.out.println(laptop.getReviews());

        // aggregation
        Order order = new Order();
        order.addProduct(notebook);
        System.out.println(order.getProducts());

        //enum

        OrderStatus[] orderStatuses = OrderStatus.values();
        for (OrderStatus orderStatus : orderStatuses){
            System.out.println(orderStatus);
        }

        OrderStatus active = OrderStatus.valueOf("ACTIVE");
        System.out.println(active);

        OrderStatus deliveredPosition = OrderStatus.DELIVERED;
        System.out.println(deliveredPosition.ordinal());

        //*****
        order.setStatus(OrderStatus.ACTIVE);

        orders.add(order);
        System.out.println(getActiveOrders());

        order.getStatus().printMessageForUser();

        // singleton

        SingletonEnum.INSTANCE.print();
        Singleton.getInstance().print();
    }
    private static ArrayList<Order> orders = new ArrayList<>();

    public static Order getOrderStatus(OrderStatus status){
        for (Order order : orders){
            if (order.getStatus().equals(status)){
                return order;
            }
        }
        return null;
    }

    public static Order getActiveOrders(){
        return getOrderStatus(OrderStatus.ACTIVE);
    }
}
