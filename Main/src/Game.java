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
  public Game(Toon p){
    setup(p);
    intro();
  }
  
  public void setup(Toon t) {
    Cog c = new Cog();
    //for testing, remove when done
    System.out.println(c.getLevel());
    System.out.println(c.getName());
    System.out.println(c.getHp());
    //toon testing
    t.setLaff((int)((c.getLevel() + 0.3) * (c.getLevel() + 0.2)));
    System.out.println(t.getLaff());
  }
  public void intro(){
    System.out.println("add story :3");
  }
  //add menu call with menu constructor test new parameter for EXIT
}
