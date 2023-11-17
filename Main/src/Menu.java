import java.util.Arrays;
import java.util.Scanner;
public class Menu {
    final private String question = "Would you like to:\n  (1) Learn more about how to play\n  (2) Begin the game\nEnter choice: ";
    static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    static void clearScreen(){
        char c = '\n';
        int length = 40;
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        System.out.print(String.valueOf(chars));
    }
    public Menu(Toon p){
        if (!p.getAlreadyOpened()) {
            welcomeScreen(p);
            p.setAsOpened();
        }
        System.out.println(question);
        questionScreen(p);
    }
    static void choiceOne(){
        System.out.println("maybe write manual class\s");
    }
    public void welcomeScreen(Toon p) {
        String dashes = "------------------------------------------------------------------------------------";
        System.out.println("Welcome to...\n" + dashes + "\n ___                                    ___\n" +
                "(   )                                  (   )                                        \n" +
                " | |_       .--.     .--.    ___ .-.    | |_       .--.    ___  ___  ___  ___ .-.    \n" +
                "(   __)    /    \\   /    \\  (   )   \\  (   __)    /    \\  (   )(   )(   )(   )   \n" +
                " | |      |  .-. ; |  .-. ;  |  .-. .   | |      |  .-. ;  | |  | |  | |  |  .-. .  \n" +
                " | | ___  | |  | | | |  | |  | |  | |   | | ___  | |  | |  | |  | |  | |  | |  | |  \n" +
                " | |(   ) | |  | | | |  | |  | |  | |   | |(   ) | |  | |  | |  | |  | |  | |  | |  \n" +
                " | | | |  | |  | | | |  | |  | |  | |   | | | |  | |  | |  | |  | |  | |  | |  | |  \n" +
                " | ' | |  | '  | | | '  | |  | |  | |   | ' | |  | '  | |  | |  ; '  | |  | |  | |  \n" +
                " ' `-' ;  '  `-' / '  `-' /  | |  | |   ' `-' ;  '  `-' /  ' `-'   `-' '  | |  | |  \n" +
                "  `.__.    `.__.'   `.__.'  (___)(___)   `.__.    `.__.'    '.__.'.__.'  (___)(___) \n" +
                "                                                                                    \n" +
                "                                                                                    \n" +
                "                                                                                    \n" +
                "             .-.                                                                    \n" +
                "    .--.    ( __)  ___ .-. .-.              .--.             .-.                     \n" +
                "  /  _  \\   (''\") (   )   '   \\            ;  _  \\         /    \\ \n" +
                " . .' `. ;   | |   |  .-.  .-. ;          (___)` |        |  .-. | \n" +
                " | '   | |   | |   | |  | |  | |               ' '        | |  | | \n" +
                " _\\_`.(___)  | |   | |  | |  | |              / /         | |  | | \n" +
                "(   ). '.    | |   | |  | |  | |             / /          | |  | |  \n" +
                " | |  `\\ |   | |   | |  | |  | |            / /      .-.  | '  | |                         \n" +
                " ; '._,' '   | |   | |  | |  | |           / '____  (   ) '  `-' /                         \n" +
                "  '.___.'   (___) (___)(___)(___)         (_______)  `-'   `.__,' ");
        System.out.println("\n\"Are YOU Toon Enough?\"\n(Now with more doodles!)\n" + dashes + "\n");
        wait(2000);
        p.setAsOpened();
    }
    public void questionScreen(Toon p){
        Scanner s = new Scanner(System.in);
        int menuInput = s.nextInt();

        while (true){ //menu active
            //make neater later
            if (menuInput<1 || menuInput>2){    //invalid choice
                System.out.print("Please enter a valid choice: ");
                menuInput = s.nextInt();
            }else if (menuInput==1){    // choose manual
                choiceOne();
                System.out.print(question);
                menuInput = s.nextInt();
            }else{                          //start game
                clearScreen();
                Game g = new Game(p);
                break;
            }
        }

    }
}
