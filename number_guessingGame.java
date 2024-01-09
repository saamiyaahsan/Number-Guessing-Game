import java.util.Scanner;
import java.util.Random;

class Game{

     public int number;
     public int inputNumber;
     public int noOfGuesses = 0;

     public Game(){
         Random rand = new Random();   // rand object is created for Random() class
         this.number = rand.nextInt(100); // guessed the random number b/w 1 to 100
     }

     public void takeUserinput(){
         System.out.println("Guess the number");
         Scanner sc = new Scanner(System.in);
         inputNumber = sc.nextInt();  // input number to be taken as input from console
     }

     public boolean isCorrectNumber(){
         noOfGuesses++;

         if(inputNumber == number){
             System.out.printf("Congrats you have guessed the correct number! , the number is %d and is guessed in %d attempts",number,noOfGuesses);
             return true;
         }

         else if(inputNumber > number){
             System.out.println("You guessed , Too large :|");
         }

         else{
             System.out.println("Too low you guessed ;/");
         }

         return false;
     }
     public void setNoOfGuesses(int noOfGuesses){
         this.noOfGuesses = noOfGuesses;
     }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
}

public class cwh_43_exercise3 {
    public static void main(String[] args) {
        /*
           Create a class Game , which allows a user to play "Guess the Number"
           game once.
           Game should have following methods
           1. Constructor to generate the random number
           2. takeUserInput() to take a user input of number
           3. isCorrectNumber() to detect whether the number entered by the user is true
           4. getters and setters for noOfGuesses
           Use properties such as noOfGuesses(int), etc to get this task done!
        */

         Game g = new Game(); // g object of Game class has been created;
         boolean b = false;

         while(b != true){
             g.takeUserinput();
             b = g.isCorrectNumber();
         }
    }
}
