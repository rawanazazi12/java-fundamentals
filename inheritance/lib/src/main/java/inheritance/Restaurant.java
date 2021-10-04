package inheritance;

import java.util.ArrayList;

public class Restaurant implements AddReview {
   private String name;
   private double numOfStars;
   private String price;

   private ArrayList<Review> resReviews = new ArrayList<>();

   public Restaurant (String name, double numOfStars, String price) {
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

    public ArrayList<Review> getReviews() {
        return resReviews;
    }


    @Override
    public void addReview(Review review) {
       this.numOfStars= ((this.numOfStars * resReviews.size()) + review.getNumOfStars()) / (resReviews.size()+1);
        this.resReviews.add(review);

   }

//    public void updateNumOfStars() {
//           double current = 0;
//           for (int i=0; i < getReviews().size(); i++) {
//               current += getReviews().get(i).getNumOfStars();
//           }
//           current = current/(getReviews().size());
//           current = Math.round(current);
//           this.numOfStars = current;
//
//       }


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
