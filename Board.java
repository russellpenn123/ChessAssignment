public class Board{

  Piece[][] board;

  public Board(){
    board = new Piece[8][8];
  }

  public boolean spaceOccupied(int inX, int inY){
    return board[inX][inY] != null;
  }

  public boolean withinBoard(int inX, int inY){
    return ((inX <= 7 && inX >=0) && (inY <= 7 && inY >= 0));
  }

  private char gridToLetter(int coord){
    switch (coord){
      case 0: return 'A';
      case 1: return 'B';
      case 2: return 'C';
      case 3: return 'D';
      case 4: return 'E';
      case 5: return 'F';
      case 6: return 'G';
      case 7: return 'H';

      default:
        System.out.println("Invalid entry to convert to letter");
        return null;
    }
  }

  public void insertPiece(Piece inputPiece, int inX, int inY){
    if (!spaceOccupied(inX, inY) && withinBoard(inX, inY)){
      board[inX][inY] == inputPiece;
    }
    else(
    System.out.println("This spot is already taken or outside the board");
    )
  }

  public void deletePiece(int inX, int inY){
    if (withinBoard(inX, inY)){
      board[inX][inY] == null;
  }

  }
}
