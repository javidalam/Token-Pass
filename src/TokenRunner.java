public class TokenRunner
{
    public static void main(String[] args)
    {
        TokenPass game1 = new TokenPass(6);

        //Repeats until one player has 0 tokens
        //gameOver returns the number of the winning player
        while(game1.gameOver() < 0) {
            //printBoard prints the players and their tokens
            game1.printBoard();
            game1.distributeCurrentPlayerTokens();
            //advances currentPlayer to the next player
            game1.nextPlayer();
        }
        game1.printBoard();
        System.out.println("Game Winner: Player " + game1.gameOver());
    }
}

