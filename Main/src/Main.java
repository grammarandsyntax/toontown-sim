import java.util.Scanner;
public class Main {
    static void Wait(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Cog flunky = new Cog("Flunky",1,2);
        Toon p = new Toon(flunky.getLevel());

        System.out.println("Test");
    }

}