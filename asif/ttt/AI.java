package asif.ttt;

public class AI 
{
    private char ai = 'O';
    private char human = 'X';

    private int evaluate(Board b) 
    {
        if(b.isWinner(ai)) return 1;
        if(b.isWinner(human)) return -1;
        return 0;
    }

    public int minimax(Board b, boolean isMax) 
    {
        int score = evaluate(b);

        if(score != 0) return score;
        if(b.isDraw()) return 0;
        if(isMax) {
            int best = -1000;
            for(int i=0;i<3;i++) {
                for(int j=0;j<3;j++) {
                    if(b.isEmpty(i,j)) {
                        b.makeMove(i,j,ai);
                        best = Math.max(best, minimax(b,false));
                        b.undoMove(i,j);
                    }
                }
            }
            return best;
        } else {
            int best = 1000;
            for(int i=0;i<3;i++) {
                for(int j=0;j<3;j++) {
                    if(b.isEmpty(i,j)) {
                        b.makeMove(i,j,human);
                        best = Math.min(best, minimax(b,true));
                        b.undoMove(i,j);
                    }
                }
            }
            return best;
        }
    }

    public int[] findBestMove(Board b) {
        int bestVal = -1000;
        int[] move = new int[2];

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(b.isEmpty(i,j)) {
                    b.makeMove(i,j,ai);
                    int moveVal = minimax(b,false);

                    b.undoMove(i,j);

                    if(moveVal > bestVal) {
                        move[0] = i;
                        move[1] = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        return move;
    }
}