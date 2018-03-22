// package assignment2018;
import sheffield.*;

public HumanPlayer extends Player{

  public boolean makeMove(){
    Board board = new Board
    EasyReader reader = new EasyReader();
    EasyWriter writer = new EasyWriter();


    writer.println(" ------- Player " + name + "'s turn ------- ");
    int[] coords;
    boolean validMove = false;

    do {
      writer.println("Enter the coordinates for the piece to move FROM");
      coords = getInput();
      if (!withinBoard(coords[0], coords[1]) || !spaceOccupied(coords[0], coords[1])){
        writer.println("That space you selected is not a piece or is outside the range of the board");
        continue;
      }


      writer.println("Enter the coordinates for the piece to move TO");
      coords = getInput();
      if (!withinBoard(coords[0], coords[1])){
        writer.println("The space you are moving to is out of range of the board, please retry your turn");
        continue;
      }

    Piece currentPiece = board.getPiece(startX, startY);
    Move playerMove = new Move(currentPiece, startX, startY, endX, endY);
    ArrayList<Move> validMoves = currentPiece.availableMoves();

    for (Move tryMove : validMoves){
      if (tryMove.isEqual(playerMove)){
        validMove = true;
        break;
      }
    }

    if (validMove){
      currentPiece.setPosition(endX, endY);
      board.deletePiece(startX, startY);
      board.insertPiece(currentPiece, endX, endY);
      break;
    }

    else{
      writer.println("That is not a valid move for that piece, please retry your turn");
      continue;
    }

  } while (true);

}
  public int[] getInput(){
    EasyWriter writer = new EasyWriter();
    int[] input = new int[2];
    writer.print("X > ");
    Char input = reader.readChar();
    writer.println();
    input[0] = board.letterToGrid(input);
    writer.print("Y > ");
    input[1] = reader.readInt();
  }
  
  public boolean hasKing(){
    for (Piece currentPiece : pieces){
      if (currentPiece.pieceValue == 6){
        return true;
      }
    }
    return false;
  }
}
