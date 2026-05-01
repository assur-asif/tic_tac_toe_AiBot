package asif.ttt;

public class Board 
{
    private char[][] board;

    public Board() 
    {    
        board = new char[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                board[i][j] = ' ';
    }
   public static void sleep() 
   {
    try {
        Thread.sleep(50);
    } catch (Exception e) {}
   }
    public void printBoard() 
    {
        int count=1;
        System.out.println();
        sleep();
        for(int i=0;i<3;i++) 
        {   sleep();
            for(int j=0;j<3;j++) 
            {
                if(board[i][j]==' ')
                {
                    System.out.print(count);
                   sleep();
                  }
                
                else     
                System.out.print(board[i][j]);
                 sleep();
                if(j<2) System.out.print(" | ");
                count++;
            }   
            System.out.println();
            sleep();
            if(i<2) System.out.println("---------");

        }
        sleep();
        System.out.println();
    }

    public boolean isWinner(char p) {
        for(int i=0;i<3;i++) {
            if((board[i][0]==p && board[i][1]==p && board[i][2]==p) ||
               (board[0][i]==p && board[1][i]==p && board[2][i]==p))
                return true;
        }
        return (board[0][0]==p && board[1][1]==p && board[2][2]==p) ||
               (board[0][2]==p && board[1][1]==p && board[2][0]==p);
    }
    public boolean isDraw() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[i][j]==' ') return false;
        return true;
    }

    public boolean isEmpty(int r, int c) {
        return board[r][c] ==' ';
    }

    public void makeMove(int r, int c, char p) {
        board[r][c] = p;
    }

    public void undoMove(int r, int c) {
        board[r][c] =' ';
    }

    public char[][] getBoard() {
        return board;
    }
}