package assignment2018;

// ===================== Initialises =====================

// Constucts a new Board
// A collection of Pieces
// 2 Players

// ===================== What it should do =====================

// Request a move from each player in turn, which should be supplied as to and from co-ordinates
// Checks whether move is valid, if it is then it will do the move
// If not then the user is asked to repeat the input
// Display the updated state of the game
// If the king has been taken then the winner is declared


public class Chess{
  public static void main(String[] args){
      Board board = new Board();
      Pieces whitePieces = new Pieces(board, PieceCode.WHITE);
      Pieces blackPieces = new Pieces(board, PieceCode.BLACK);
      
      // How do you create a player without having a player in the first place?
      HumanPlayer player1 = new Player("Russell", whitePieces, board, player2);
      HumanPlayer player2 = new Player("Opponenet", blackPieces, board, player1);
      
      String winner;
      while (true){
        player1.makeMove();
        if (!player2.hasKing()){
            winner = player1.getName();
            break;
        }
        
        player2.makeMove();
        if (!player1.hasKing()){
          winner = player2.getName();
          break;
        }
      }
      
      System.out.println("The king has been taken! The winner is " + winner + ", congratulations!");

  }
}
