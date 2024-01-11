package lesson3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle implements Shape{
    private double a;
    private double b;

    @Override
    public double getArea() {
        return a*b;
    }
}


