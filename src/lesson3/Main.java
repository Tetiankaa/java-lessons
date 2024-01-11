package lesson3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"red");
        Shape rectangle = new Rectangle(2,2);

        printShapeSquare(circle);
        printShapeSquare(rectangle);

        circle.print();
        rectangle.print();

       String color =  circle.getColor();
        System.out.println(color);

        circle.printMsg();

        Shape square = new Square(2.0);
        printShapeSquare(square);

    // Anonymous class
        Operation remove = new Operation() {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        };
        System.out.println(remove.apply(10,5));

        Operation add = Integer::sum;
        System.out.println(add.apply(10,5));

        Function<String, Integer> calcLength = String::length;

        BiFunction<Integer,Integer,Integer> multiply = (a,b)-> a * b;
        System.out.println(multiply.apply(10,10));
    }
    private static void printShapeSquare(Shape shape){
        System.out.println(shape.getArea());
    }
}
