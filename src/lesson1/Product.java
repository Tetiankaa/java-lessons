package lesson1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String name;
    private int price;
    private String description;

//    public Product(String name, int price){
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public int getPrice(){
//        return price;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setPrice(int price){
//        this.price = price;
//    }

}
