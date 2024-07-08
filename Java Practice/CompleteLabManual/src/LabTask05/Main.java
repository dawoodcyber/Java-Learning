package LabTask05;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        double userGuess, randNum =  Math.floor((Math.random() * 5+1));
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing game!");
        System.out.println("Guess any number between 1-5");
        do{
            System.out.println("Enter your guess: ");
            userGuess = scan.nextDouble();
            if(userGuess < randNum)
                System.out.println("Guess is too low");
            if(userGuess > randNum)
                System.out.println("Guess is too high");
        }while( userGuess != randNum);
        if(userGuess == randNum)
            System.out.println("COngrats you won the game!");
    }
}
