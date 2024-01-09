package lesson2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Review {
    private String text;
    private int rating;
}
