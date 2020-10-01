import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //first();
        //second();
        //third();
        fourth();
        }

    public static void first() {
        String str = "321456987";
        int currentNumberValue = 0;
        for (int n = 0; n < str.length();n++){

            currentNumberValue = Integer.parseInt(str.substring(n,n+1));
            for (int i = 0; i < currentNumberValue;i++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    public static void second() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a number between 0 - 8");
        String ast = "*";


        int height = in.nextInt();
        String spaces = "";

        for (int m = 0; m < height; m++){
             spaces = spaces + " ";
        }


        for (int n = 0;n < height; n++){

            System.out.println(spaces + ast);
            ast = ast + "**";

            spaces = spaces.substring(0,spaces.length()-1);


        }
    }

    public static void third() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100");

        Random rand = new Random();

        int randomNumber = rand.nextInt(100);
        int userInput = in.nextInt();
        boolean done = false;


        while(!done){

            if (userInput < randomNumber){
                System.out.println("You guessed a lower number, try again");
                userInput = in.nextInt();
            }
            else if(userInput > randomNumber){
                System.out.println("You guessed a higher number, try again");
                userInput = in.nextInt();
            }
            else if (userInput == randomNumber){
                System.out.println("You guessed the correct number! Congratulations");
                done = true;
            }
        }

    }

    public static void fourth() {
        String values = "3214569871";
        int number1ToAdd = 0;
        int number2ToAdd = 0;
        int currentIndex = 0;
        for (int i = 0; i < values.length()/2; i++) {

            number1ToAdd = Integer.parseInt(values.substring(currentIndex, currentIndex+1));
            number2ToAdd = Integer.parseInt(values.substring(currentIndex+1, currentIndex+2));


            System.out.println("The result of "+ number1ToAdd + " + " + number2ToAdd + " = "+ (number1ToAdd + number2ToAdd));
            currentIndex = currentIndex + 2;
        }

    }


}
