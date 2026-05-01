package asif.ttt;

import java.util.Scanner;

public class Intro {

    public static void showIntro() {
        System.out.println("\n");
        System.out.println("████████╗██╗ ██████╗      ████████╗ █████╗  ██████╗      ████████╗ ██████╗ ███████╗");
        System.out.println("╚══██╔══╝██║██╔════╝      ╚══██╔══╝██╔══██╗██╔════╝      ╚══██╔══╝██╔═══██╗██╔════╝");
        System.out.println("   ██║   ██║██║  ███╗        ██║   ███████║██║             ██║   ██║   ██║█████╗  ");
        System.out.println("   ██║   ██║██║   ██║        ██║   ██╔══██║██║             ██║   ██║   ██║██╔══╝  ");
        System.out.println("   ██║   ██║╚██████╔╝        ██║   ██║  ██║╚██████╔╝        ██║   ╚██████╔╝███████╗");
        System.out.println("   ╚═╝   ╚═╝ ╚═════╝         ╚═╝   ╚═╝  ╚═╝ ╚═════╝         ╚═╝    ╚═════╝ ╚══════╝");

    }
    public static void sleep() 
    {
    try {Thread.sleep(300);} catch(Exception e){}
    }
    public static void start() 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println();
       System.out.print("Enter Your Name: ");
       String name = sc.nextLine();
       sleep();
       System.out.println();
       sleep();
       System.out.println("            WELCOME "+name.toUpperCase()+"        ");
       System.out.println();
       sleep();
       System.out.println("THIS IS A TERMINAL BASED TIC_TAC_TOE-AI BATTLE GAME");
       sleep(); 
       System.out.println();
       sleep();
       System.out.println("--------------------------------------------------");
       sleep();
       System.out.println("        " + name.toUpperCase() + "(X)  VS  COMPUTER (O)         ");
       sleep();
       System.out.println("--------------------------------------------------");
       sleep();
       System.out.println("Choose positions from 1 - 9 to play......");
       sleep();
       System.out.println();
    }
}