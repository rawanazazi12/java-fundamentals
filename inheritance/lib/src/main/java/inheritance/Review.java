package inheritance;

public class Review {
    String body;
    String author;
    double numOfStars;

    public Review(String body, String author, double numOfStars) {
        this.body = body;
        this.author = author;
        if(numOfStars<0){
            this.numOfStars=0;
        }else if(numOfStars>5){
            this.numOfStars=5;
        }else {
            this.numOfStars = numOfStars;
        }
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
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + numOfStars +
                '}';
    }
}
