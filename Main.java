import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
       Random rand = new Random();
       Scanner scan = new Scanner (System.in);

       int x = rand.nextInt(100);
       int guess;
       System.out.println("Enter your first guess:");
       guess = scan.nextInt();
       int count=0;// count the number of times the user guesses

       while(guess!=x){
        //if x less than, greater than or equal to
        if(x<guess) {
           System.out.println("too high");
           guess = scan.nextInt();
        } else if (x>guess) {
              System.out.println("too low");
              guess = scan.nextInt();
        } 
        
       if (x==guess){
              System.out.println("you're correct"); 
        }
    //how well did you do?
    
    }
    }
}