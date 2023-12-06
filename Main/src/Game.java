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
    Cog c = new Cog(); // needs to be created in constructor
    setup(p,c);
    intro();
    gagShop(p,c);

    //end
    p.addOneGameplay();
    pressEnterKeyToContinue();
    Menu m = new Menu(p); //ending
  }
  
  public void setup(Toon t, Cog cog) {
    //for testing, remove when done
    System.out.println(cog.getLevel());
    System.out.println(cog.getName());
    System.out.println(cog.getHp());
    //toon testing
    t.setLaff((int)((cog.getLevel() + 0.3) * (cog.getLevel() + 0.2)));
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
  public void gagShop(Toon p, Cog c){
    p.setJellybeans(p.getLaff()*4); // work out jellybean calculation
    System.out.println(p.getJellybeans());
  }
}
