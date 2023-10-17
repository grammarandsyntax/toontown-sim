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
        Cog c = new Cog("Flunky", rand.nextInt(1,13));
        Toon p = new Toon((int)((c.getLevel() + 0.3) * (c.getLevel() + 0.2)));

        System.out.println("Laff "+p.getLaff());
        System.out.println("Level "+c.getLevel());
        System.out.println("Hp "+c.getHp());
    }
}
