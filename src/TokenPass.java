public class TokenPass
{
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount)
    {
        this.board = new int[playerCount];
        this.currentPlayer = (int)(Math.random() * playerCount);
        for (int i = 0; i < playerCount; i++)
        {
            board[i] = (int)( 1 + Math.random() * 10);
        }
    }
    public void distributeCurrentPlayerTokens()
    {

    }
}
