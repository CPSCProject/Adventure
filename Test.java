public class Test {
  public static void main(String[] args) {
    Key1autotest p1 = new Key1autotest(true, 2);
    boolean rboolean, uboolean, eboolean, key1;
    p1.startgamemethod("no");
    p1.startgamemethod("yes");
    p1.difficultymethod("easy");
    p1.difficultymethod("medium");
    p1.difficultymethod("hard");
    rboolean = p1.puzzle1method("mailbox", "wholesome", "inkstand");
    //test wrong answers: lives will become negative
    p1.puzzle1method("mailboxs", "wholesome", "inkstand");
    p1.puzzle1method("mailbox", "wholesomes", "inkstand");
    p1.puzzle1method("mailbox", "wholesome", "inkstands");
    uboolean = p1.puzzle2method("refunded", "observant", "flamingos");
    //test wrong answers: lives will become negative
    p1.puzzle2method("refundeds", "observant", "flamingos");
    p1.puzzle2method("refunded", "observants", "flamingos");
    p1.puzzle2method("refunded", "observant", "flamingoss");
    eboolean = p1.puzzle4method("german");
    //test wrong answer: lives will become negative
    p1.puzzle4method("germans");
    key1 = p1.key1control(eboolean, uboolean, rboolean);
    if (key1) {
      System.out.println("\nALL TESTS PASSED (8/8)");
    }
    else {
      System.out.println("\nNOT ALL TESTS PASSED");
    }
  }
}
