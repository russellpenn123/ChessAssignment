import sheffield.*;

public class TextDisplay implements Display{

  public displayBoard(Pieces pieces){
    EasyWriter writer = new EasyWriter();
    boolean piecePrinted;

    writer.println(" |ABCDEFGH");
    writer.println("----------");
    for (int x = 0; x <= 7; x++){
      writer.print(x);

      for (int y = 0; y <= 7; y++){
        piecePrinted = false;

        for (Piece piece : pieces){
          if (piece.getX() == x && piece.getY() == y){
            writer.print(piece.getChar());
            piecePrinted = true;
          }
        }
        if (!piecePrinted){
          writer.print('-');
        }

      }
      writer.println();
    }
  }
}
