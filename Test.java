import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Test{
  public static void main(String[] args){

System.out.println("     ");
System.out.println("     ");
System.out.println("ROOM: KITCHEN");
System.out.println("     ");




KitchenTest r_testa = new KitchenTest(true,300);
r_testa.startGame("yes");
r_testa.difficultyKitchen("medium");
boolean key2determinant1 = r_testa.KitchenExplore("2", "1" ,"345");
System.out.println(key2determinant1);

System.out.println("--------------------------------------------");
System.out.println(" ");


KitchenTest r_testb = new KitchenTest(true,300);
r_testb.startGame("yes");
r_testb.difficultyKitchen("medium");
boolean key2determinant2 = r_testb.KitchenExplore("2", "1" ,"355");
System.out.println(key2determinant2);

System.out.println("--------------------------------------------");
System.out.println(" ");


KitchenTest r_testc = new KitchenTest(false,500);
r_testc.startGame("no");
r_testc.difficultyKitchen("hard");
boolean key2determinant3 = r_testc.KitchenExplore("2", "1" ,"355");
System.out.println(key2determinant3);


}
}
