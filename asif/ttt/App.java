
/*
 This is a Terminal Based Tic_Tac_Toe_ai game
 




*/



package asif.ttt;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while(true) 
        { 
            Game.main(null);
            System.out.print("Do you want to play again? (yes/no): ");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("no")) 
            {
                System.out.println("Thanks for playing!!!!!");
                break;
            }
            System.out.println("\nStarting new game...\n");
        }
    }
}