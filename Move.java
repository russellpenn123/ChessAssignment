// package assignment2018;

public class Move{

  Piece piece;
  int fromX;
  int fromY;
  int toX;
  int toY;
  boolean occupied;

  public Move(Piece inputPiece, int fX, int fY, int tX, int tY){
    piece = inputPiece;
    fromX = fx;
    fromY = fY;
    toX = tX;
    toY = tY;
    occupied = false;
  }

  public int getfromX(){
    return fromX;
  }

  public int getFromY(){
    return fromY;
  }

  public int getToX(){
    return toX;
  }

  public int getToY(){
    return toY;
  }

  public boolean isEqual(Move inputMove){
    if (inputMove.piece == this.piece && inputMove.toX == this.toX && inputMove.toY == this.toY){
      return true;
    }
    return false;
  }
}
