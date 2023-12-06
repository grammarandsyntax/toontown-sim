import java.util.Scanner;
public class Game {
  static void wait(int milliseconds){
    try {
      Thread.sleep(milliseconds);
    } catch(InterruptedException e){
      Thread.currentThread().interrupt();
    }
  }
  //construct or
  public Game(Toon p){
    setup(p);
    intro();

    p.addOneGameplay();
    pressEnterKeyToContinue();
    Menu m = new Menu(p); //ending
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
    wait(3000);
  }
  public void pressEnterKeyToContinue() { // https://stackoverflow.com/a/60551956
    System.out.println("Press Enter key to return to menu...");
    Scanner s = new Scanner(System.in);
    s.nextLine();
  }
  public void gagShop(Toon p){

  }
}
