import java.util.Scanner;
public class Main { //aahhhhh
    static void Wait(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Cog flunky = new Cog("Flunky",1);
        Toon p = new Toon((int)((flunky.getLevel()+0.3)*(flunky.getLevel()+0.2)));

        System.out.println(p.getLaff());
    }

}