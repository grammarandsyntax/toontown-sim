import java.util.Scanner;
import java.util.Random;

public class Game {
  static void Wait(int milliseconds)
  {
    try {
      Thread.sleep(milliseconds);
    } catch(InterruptedException e){
      Thread.currentThread().interrupt();
    }
  }
  public Game(){
    setup();
  }
  
  public void setup() {
    
    Random rand = new Random();
    int cogLevel = rand.nextInt(1,13);
    // First, generate level. Base cog (name) off of level. Call object in generation or create one after both variables are found?
    String[] cogNames = {"Flunky","Bottom Feeder","Short Change","Cold Caller","Pencil Pusher","Bloodsucker","Penny Pincher","Telemarketer","Yesman","Double Talker","Tightwad","Name Dropper","Micromanager","Ambulance Chaser","Bean Counter","Glad Hander","Downsizer","Back Stabber","Number Cruncher","Mover & Shaker","Head Hunter","Spin Doctor","Money Bags","Two-Face","Corporate Raider","Legal Eagle","Loan Shark","Mingler","The Big Cheese","Big Wig","Robber Baron","Mr. Hollywood"};
    // length = 32, 0-31
    // 1: 0-3 2: 0-7 3: 0-11 4: 0-15 5: 0-19 6: 4-23 7: 8-27 9: 12-31 10: 20-31 11: 24-31 12: 
    String chosenCogName = cogNames[rand.nextInt]
    
    Cog c = new Cog(cogLevel); // we'll think about it
    Toon p = new Toon((int)((c.getLevel() + 0.3) * (c.getLevel() + 0.2)));
    // calculations all goo
    
    
    
  }
}
