public class driverE {
  public static void main(String[] args) {
  key1 p1 = new key1();
  boolean game;
  if (game = p1.startgamemethod()) {
    p1.difficultymethod();
    if (p1.puzzle1method()) {
      if (p1.puzzle2method() && game) {
        if (p1.puzzle3method() && game) {
          if (p1.puzzle4method() && game) {
            System.out.println("Congratulations! ");
          }
        }
      }
    }
  }
  }
}
