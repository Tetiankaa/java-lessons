package lesson3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle extends AbstractClass implements Shape, Color{
    private double r;
    private String color;

    @Override
    public double getArea() {
        return 3.14 * r *r /2;
    }


    @Override
    public void print() {
        System.out.println("Overridden default method from interface");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
   public void printMsg() {
        System.out.println("method from abstract class");
    }
}
