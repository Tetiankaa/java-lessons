package lesson1;

public class ProductDemo {
    public static void main(String[] args) {
        // without lombok
//        Product product1 = new Product("notebook",5000);
//        System.out.println("Name: "+product1.getName() + "; price: " + product1.getPrice());
//
//        product1.setPrice(2000);
//        System.out.println("Name: "+product1.getName() + "; price: " + product1.getPrice());

        // with lombok
        Product product2 = new Product("phone",1500,"some description here");
        System.out.println(product2.getName() + " " + product2.getPrice() + " " + product2.getDescription());

    }
}
