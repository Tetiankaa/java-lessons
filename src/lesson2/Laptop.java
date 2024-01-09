package lesson2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Laptop extends Product{
    private String cpuModel;

    @Override
    public void printInfo() {
        System.out.println("Product name:" + name + ", price: " + price + ", cpuModel: " + cpuModel);
    }
}
