public class Test1 {
  public static void main(String[] args) {
    //Key1 p1 = new Key1();
    Key1text p1 = new Key1text();
    boolean rboolean, uboolean, eboolean, cboolean, key1;
    p1.startgamemethod();
    //p1.difficultymethod();
    rboolean = p1.puzzle1method();
    uboolean = p1.puzzle2method();
    cboolean = p1.puzzle3method();
    eboolean = p1.puzzle4method();
    key1 = p1.key1control(eboolean, cboolean, uboolean, rboolean);
  }
}
