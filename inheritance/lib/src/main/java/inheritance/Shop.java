package inheritance;

import java.util.ArrayList;

public class Shop implements AddReview {
    private final String name;
    private final String description;
    private int numOfDollarSigns;
    private double numOfStars;

    private ArrayList <Review> shopReviews= new ArrayList<>();

    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceCategory() {
        return numOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSigns='" + numOfDollarSigns + '\'' +
                '}';
    }

    public double getNumOfDollarSigns() {
        return numOfDollarSigns;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public ArrayList<Review> getShopReviews() {
        return shopReviews;
    }

    @Override
    public void addReview(Review review) {
      this.numOfStars=((this.numOfStars * shopReviews.size()) + review.getNumOfStars()) / (shopReviews.size()+1);
      this.shopReviews.add(review);
    }
}
