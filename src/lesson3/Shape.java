package lesson3;

import lombok.Data;


public interface Shape {

     double getArea();

     default void print(){
          System.out.println("Helloo");
     }
}
