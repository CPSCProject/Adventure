
public class KitchenDriver{



public static void main(String[] args){



  Kitchen n = new Kitchen();
  boolean game1 = n.startGame();
  while(game1){
    int count = 600;
  n.difficultyKitchen(count);
  boolean key2 = n.KitchenExplore();
  game1 = false;
}
}
}
