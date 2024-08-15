import java.util.*;
import java.util.Random;
public class guess {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int hidenum=r.nextInt(100)+1;
        int num=0;
        int Count=0;
        System.out.println("Welcome to the Guessing a number game");
        System.out.println("Here you have to guess a number between 1 to 100");
        System.out.println("score will be displayed last");
        while(true){
            System.out.print("Enter a number:");
         num=sc.nextInt();
         Count++;
         if (num>100){
            System.out.println("Enter the number between 1 to 100 only");
         }
         else if(num<hidenum){
            System.out.println("The answer is Higher than your answer");
         }
         else if(num>hidenum){
            System.out.println("The answer is Lower than your answer");
         }
         else if(num==hidenum){
            System.out.println("Congratulations you guessed the correct answer ");
            System.out.println("You won the game");
            break;
           
         }
         
        }
        
        if (Count==1){
            System.out.println("Your score is 100");
        }
        else if(Count>1 && Count<=3){
            System.out.println("Your score is 90");
        }
        else if(Count>3 && Count<=5){
            System.out.println("Your score is 80");
        }
        else if (Count>5 && Count<=10){
            System.out.println("Your score is 70");
        }
        else{
            System.out.println("Your score is 50");
        }
    

    }

}
