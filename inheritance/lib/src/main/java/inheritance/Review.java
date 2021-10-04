package inheritance;

public class Review {
    String body;
    String author;
    double numOfStars;
    String movieName;

    public Review(String body, String author, double numOfStars) {
        this.body = body;
        this.author = author;
        if (numOfStars < 0) {
            this.numOfStars = 0;
        } else if (numOfStars > 5) {
            this.numOfStars = 5;
        } else {
            this.numOfStars = numOfStars;
        }
    }

    // new constructor to handle movie reviews
    public Review(String body, String author, double numOfStars, String movieName) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
        this.movieName = movieName;
    }

    public String getBody() {
        return this.body;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getNumOfStars() {
        return this.numOfStars;
    }

    @Override
    public String toString() {
        if (this.movieName == null) {
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", numOfStars=" + numOfStars +
                    '}';
        } else{  return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + numOfStars + ", movieName='" + movieName + '\''+
                '}';

        }
    }
}
