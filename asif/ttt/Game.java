package asif.ttt;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        AI ai = new AI();

        char human = 'X';
        char computer = 'O';
        char currentPlayer = human;

        Intro.showIntro();
        Intro.start();
        boolean firstMove = true;
        while(true) 
        {
            board.printBoard();
            if(currentPlayer == human) 
            {
                
                if(firstMove) 
                {
                    System.out.print("Enter Your Move (1-9): ");
                    firstMove = false;
                } 
                else 
                System.out.print("Enter Your Next Move (1-9): ");
              
               
                int pos=sc.nextInt();
                int r = (pos-1)/3;
                int c = (pos-1)%3;

                if(pos<1 || pos>9 || !board.isEmpty(r,c)) {
                    System.out.println();
                    System.out.println("Invalid move! Try again.");
                    continue;
                }
                board.makeMove(r,c,human);
                System.out.println("You Choose Position: "+pos);
            }
            else
            {
                System.out.println("!!!Computer move!!!");
                try {Thread.sleep(600);}catch(Exception e){}
                 System.out.print("Computer is thinking");
                 for(int i=0;i<4;i++) 
                 {
                   try { Thread.sleep(500); } catch(Exception e) {}
                   System.out.print(".");
                 }
                  System.out.println();
                int[] move = ai.findBestMove(board);
                int pos = move[0]*3 + move[1] + 1;
                try { Thread.sleep(600); } catch(Exception e) {}
                System.out.println("Computer Choose Position: " + pos);
                board.makeMove(move[0], move[1], computer);
                try { Thread.sleep(700); } catch(Exception e) {}
            }
            if(board.isWinner(currentPlayer)) {
                board.printBoard();
                try { Thread.sleep(600); } catch(Exception e) {}
                System.out.println((currentPlayer==human) ? "You win!" : "Computer wins!!!!");
                break;
            }

            if(board.isDraw()) {
                board.printBoard();
                try { Thread.sleep(600); } catch(Exception e) {}
                System.out.println("Draw!");
                break;
            }
            currentPlayer = (currentPlayer==human) ? computer : human;
        }
        
    }
}