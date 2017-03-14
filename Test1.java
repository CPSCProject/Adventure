public class Test1 {
  public static void main(String[] args) {
    key1 p1 = new key1();
    boolean rboolean, uboolean, eboolean, key1;
    p1.startgamemethod();
    p1.difficultymethod();
    rboolean = p1.puzzle1method();
    uboolean = p1.puzzle2method();
    eboolean = p1.puzzle3method();
    key1 = p1.key1control(eboolean, uboolean, rboolean);
  }
}
