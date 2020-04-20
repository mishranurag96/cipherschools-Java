package javaapplication4;

import java.util.Scanner;


class JavaApplication4 {

    public static void main(String[] args) {
        
        String re_run;
        
        String[] choiceStack = {"rock","paper","scissors"};
        
        int randomNum =(int) (3*Math.random());
        
        String computerChoice = choiceStack[randomNum];
        
        
        System.out.println("Welcome to the game made by CipherSchools");
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Type in rock or paper or scissors");
        
        String userChoice = obj.nextLine();
        
        if(computerChoice.equals(userChoice)){
            System.out.println("Tie!");
        }
        
        else if(userChoice.equals("paper") && computerChoice.equals("rock")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("rock") && computerChoice.equals("scissors")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("rock")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("rock") && computerChoice.equals("paper")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("paper") && computerChoice.equals("scissors")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You win!");
        }
        
        else{
            System.out.println("Please provide a valid input and tell me when you didn't had a mood of playing why did you come here");
            
        }
    }
    
}

