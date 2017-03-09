public class driver {
  public static void main(String[] args) {
  key1 p1 = new key1();
  boolean game;
  if (game = p1.startgamemethod()) {
    p1.difficultymethod();
    if (p1.puzzle1method() && p1.lives > 0) {
      if (p1.puzzle2method() && p1.lives > 0) {
        if (p1.puzzle3method() && p1.lives > 0) {
          if (p1.puzzle4method() && p1.lives > 0) {
            System.out.println("Congratulations! ");
          }
        }
      }
    }
  }
  }
}
