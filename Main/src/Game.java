import java.util.Scanner;

public class Game {
  static void Wait(int milliseconds){
    try {
      Thread.sleep(milliseconds);
    } catch(InterruptedException e){
      Thread.currentThread().interrupt();
    }
  }
  
  //runner
  public Game(){
    setup();
  }
  
  public void setup() {

    Cog c = new Cog();
    
    //for testing, remove when done
    System.out.println(c.getLevel());
    System.out.println(c.getName());
    System.out.println(c.getHp());
  
    Toon p = new Toon((int)((c.getLevel() + 0.3) * (c.getLevel() + 0.2))); //calculations work, level calculation subject to change
    System.out.println(p.getLaff());
    
  }
}
