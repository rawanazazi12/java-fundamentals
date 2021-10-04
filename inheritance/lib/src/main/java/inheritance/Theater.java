package inheritance;

import java.util.ArrayList;

public class Theater implements AddReview {
    private double numOfStars;
    private String name;
    private ArrayList <String> moviesList;
    private ArrayList<Review> reviews=new ArrayList<>();
    private ArrayList<Review> movieReviews=new ArrayList<>();

    public Theater(String name, ArrayList<String> moviesList) {
        this.name = name;
        this.moviesList = moviesList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getMoviesList() {
        return moviesList;
    }


    public void addMovie(String movieName){
        moviesList.add(movieName);
    }

    public void removeMovie(String movieName){
        moviesList.remove(movieName);
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public void addReview(Review review) {
        this.numOfStars=((this.numOfStars * reviews.size()) + review.getNumOfStars()) / (reviews.size()+1);
        this.reviews.add(review);
    }

    public ArrayList<Review> getMovieReviews() {
        return movieReviews;
    }

    public void addReview(String movieName, String body,double numOfStars, String author){
        if(this.moviesList.contains(movieName)){
                Review review=new Review(body,author,numOfStars,movieName);
               this.numOfStars=((this.numOfStars * movieReviews.size()) + review.getNumOfStars()) / (movieReviews.size()+1);
               this.movieReviews.add(review);
            }else {
            System.out.println("The movie isn't exist!");
            }
        }


    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", moviesList=" + moviesList +
                '}';
    }


}
