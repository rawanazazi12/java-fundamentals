# lab06 - Inheritance and Interfaces

## Overview  

In today’s lab, I created classes and interfaces to represent reviews of restaurants.

## Methods 

1. Restaurant Class 
   * Constructor : String name , double numOfStars, String price
   * getReviews(): The Type of this method is LinkedList<Review> and it is for store the all reviews in the list.
   * getName(): This method purpose is to get the name of the restaurant and return a String type.
   * getNumOfStars(): This method purpose is to get the stars of the restaurant and return a double type.
   * getPrice(): This method purpose is to get the price category and return a String type.
   * addReview(Review review): This method is the Override method from the RestaurantInterface, and it accepts a Review variable type. Its purpose to add the review in the list of reviews. Also inside this method calling the updateStars().
   * updateStars(): The purpose of this method is to update the rate of the restaurant (depend on the stars from reviews) by calculating the average of stars.
   * toString(): To print the restaurant data like this statement: Restaurant{name='fourGuys', numberOfStars=3.5, price=$}


2. Review Class 
   * Constructor : String body, String author, double numOfStars
   * getStars(): This method purpose is to return the stars from the review which person was choosing.
   * getAuthor(): This method is the Override method from the ReviewInterface, and its purposeThis method purpose is to return the person name.
   * getBody(): This method purpose is to return the text of the review.
   * toString(): To print the Review data like this statement: Review{body='Best burger ever', author='Rawan Alazazi', stars=5}

