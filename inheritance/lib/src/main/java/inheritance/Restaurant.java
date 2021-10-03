package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Restaurant  extends Review{
   private String name;
   private double numOfStars;
   private String price;
   private LinkedList<Review> reviews = new LinkedList<>();

   public Restaurant (String name, double numOfStars, String price) {
       super("","",0);
       this.name = name;
        if(numOfStars<0){
            this.numOfStars=0;
        }else if(numOfStars>5){
            this.numOfStars=5;
        }else {
            this.numOfStars = numOfStars;
        }
        this.price = price;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
        updateNumOfStars();
    }

    public void updateNumOfStars() {
           double current = 0;
           for (int i=0; i < getReviews().size(); i++) {
               current += getReviews().get(i).getNumOfStars();
           }
           current = current/(getReviews().size());
           current = Math.round(current);
           this.numOfStars = current;

       }


    public double getNumOfStars() {
        return numOfStars;
    }

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", price='" + price + '\'' +
                '}';
    }


}
