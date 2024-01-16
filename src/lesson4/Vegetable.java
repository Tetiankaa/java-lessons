package lesson4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vegetable {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Vegetable vegetable = (Vegetable) o;
//        return id == vegetable.id && Objects.equals(name, vegetable.name);
        Vegetable vegetable = (Vegetable) o;
        return id == vegetable.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
