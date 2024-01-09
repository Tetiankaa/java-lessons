package lesson2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    protected String name;
    protected double price;
    protected ArrayList<Review> reviews;

    public void printInfo(){
        System.out.println("Product name:" + name + ", price: " + price);
    }

    // composition
    public void addReview(String text, int rating){
        Review review = new Review();
        review.setText(text);
        review.setRating(rating);

        if (reviews == null){
            reviews = new ArrayList<>();
        }
        reviews.add(review);
    }
}
