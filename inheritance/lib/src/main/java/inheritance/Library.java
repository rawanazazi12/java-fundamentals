/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {
        System.out.println("hello rawan");
        // New Restaurant
        Restaurant fourGuys =new Restaurant("fourGuys",3.5,"$");
        System.out.println(fourGuys);
       // Add Reviews
        Review rev1=new Review("best burger ever","Rawan Alazazi",5);
        Review rev2=new Review("nice service and delicious food","Liam Hardy",10);
        Review rev3=new Review("I like this restaurant, but their prices are very high","Sara Tomas",3.5);
        Review rev4=new Review("well, it's not that bad","John Smith",2.5);

        //Print Reviews
        fourGuys.addReview(rev1);
        fourGuys.addReview(rev2);
        fourGuys.addReview(rev3);
        fourGuys.addReview(rev4);
        System.out.println(fourGuys.getReviews());
        // Restaurant star rating updated
         System.out.println(fourGuys);
    }


}