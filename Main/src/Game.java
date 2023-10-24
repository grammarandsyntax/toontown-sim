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
        //list?
        Random rand = new Random();
        Cog c = new Cog("Flunky", rand.nextInt(1,13)); //generate level between 1 and 12
        Toon p = new Toon((int)((c.getLevel() + 0.3) * (c.getLevel() + 0.2)));
        // calculations all goo
        }
    }
