/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();

    }
    // Restaurant Tests
    @Test
    public void constructorTestRes(){
        Restaurant test = new Restaurant("fourGuys", 3.5 ,"$");
        String expectedName = "fourGuys";
        assertEquals(expectedName,test.getName());
        assertEquals(3.5,test.getNumOfStars());
        assertEquals("$",test.getPrice());
    }
    @Test
    public void toStringMethodTestRes() {
        Restaurant test = new Restaurant("fourGuys", 3.5 ,"$");
        assertEquals("Restaurant{name='fourGuys', numOfStars=3.5, price='$'}",String.valueOf(test));

    }
    @Test
    public void addReviewsTest(){
        Restaurant test = new Restaurant("fourGuys", 3.5 ,"$");
        Review test1 = new Review("best burger ever","Rawan Alazazi",5);
        Review test2 = new Review("nice service and delicious food","Liam Hardy",10);
        test.addReview(test1);
        test.addReview(test2);
        assertEquals(2, test.getReviews().size(),"return true if add review");
    }

    // Review Tests

    @Test
    public void constructorTestRev(){
        Review test = new Review("best burger ever", "Rawan Alazazi",5);
        assertEquals("best burger ever",test.getBody());
        assertEquals("Rawan Alazazi",test.getAuthor());
        assertEquals(5,test.getNumOfStars());

    }
    @Test
    public void testRev(){
        Review test = new Review("I like this restaurant, but their prices are very high","Sara Tomas",3.5);
        assertEquals("Review{body='I like this restaurant, but their prices are very high', author='Sara Tomas', numOfStars=3.5}",String.valueOf(test));    }

    // Shop Tests

    @Test
    public void shopConstructorTest(){
        Shop test = new Shop("zara", "clothing shop",3);
        String expectedShopName = "zara";
        assertEquals(expectedShopName,test.getName());
        assertEquals("clothing shop",test.getDescription());
        assertEquals(3,test.getNumOfDollarSigns());

    }
    @Test
    public void toStringShopMethodTest() {
        Shop test = new Shop("zara","clothing shop",3);
        assertEquals("Shop{name='zara', description='clothing shop', numOfDollarSigns='3'}",String.valueOf(test));

    }
    @Test
    public void addShopReviewTest() {
        Review test = new Review("I like zara's outfits","Rawan Alazazi",4);
        assertEquals("Review{body='I like zara's outfits', author='Rawan Alazazi', numOfStars=4.0}",String.valueOf(test));
    }

    // Theater Tests
    @Test
    public void theaterConstructorTest() {
        ArrayList<String> moviesList=new ArrayList<>();
        Theater test= new Theater("amman theater",  moviesList );
        assertEquals("amman theater",test.getName());
        assertEquals(moviesList,test.getMoviesList());
    }

    @Test
    public void toStringTheaterTest() {
        ArrayList<String> moviesList=new ArrayList<>();
        Theater test = new Theater("amman theater", moviesList);
        assertEquals("Theater{name='amman theater', moviesList=[]}",String.valueOf(test));

    }

    @Test
    public void addTheaterReviewTest() {
        Review test = new Review("nice theater","Rawan Alazazi",4);
        assertEquals("Review{body='nice theater', author='Rawan Alazazi', numOfStars=4.0}",String.valueOf(test));
    }

    @Test
    public void addAndRemoveMovieTest(){
        ArrayList<String> moviesList=new ArrayList<>();
        Theater test= new Theater("amman theater",  moviesList );
        test.addMovie("Fractured");
        test.addMovie("Escape Room");
        assertEquals( 2, test.getMoviesList().size());
        test.removeMovie("Fractured");
        assertEquals( 1, test.getMoviesList().size());
    }

    @Test
    public void addMovieReviewTest() {
        Review test = new Review("Interesting movie","Rawan",5,"Hush");
        assertEquals("Review{body='Interesting movie', author='Rawan', numOfStars=5.0, movieName='Hush'}",String.valueOf(test));
    }


}


