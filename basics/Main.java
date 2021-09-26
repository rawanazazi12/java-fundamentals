import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main{

    public static void main(String[] args) {
        System.out.println("Hello,World!");
        int dogCount=1;
        System.out.println("I own " + dogCount + " " + pluralize(dogCount, "dog") + ".");
        int catCount=2;
        System.out.println("I own " + catCount + " " + pluralize(catCount,"cat") + ".");
        int turtleCount=0;
        System.out.println("I own " + turtleCount + " " + pluralize(turtleCount,"turtle") + ".");
        flipNHeads(2);
        clock();
    }
    public static String pluralize(int count, String unit) {
        if (count == 0 || count > 1) {

            unit = unit + "s";
        }

        return unit;
    }

    public static void flipNHeads(int n){
        int flipsN = 0 ;
        int headsN = 0 ;

        while (headsN != n ) {
            double randomNum = Math.random() ;
            if (randomNum<0.5) {
                System.out.println("tails");
                flipsN+=1;
                headsN=0;
            }
            else {
                System.out.println("heads");
                flipsN+=1;
                headsN+=1;
            }
//            System.out.println(randomNum);
        }

        System.out.println("It took "+ flipsN + " flips to flip " + n + " heads in a row.");
    }
  public static void clock () {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
            while (true) {
                now = LocalDateTime.now();
                if (second != now.getSecond()) {
                    clock();
                }
            }
        }
}

