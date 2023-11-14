import java.util.Scanner;
public class Menu {
    String question = "Would you like to:\n  (1) Learn more about how to play\n  (2) Begin the game\nEnter choice: ";
    static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    public Menu(){
        welcomeScreen();
    }
    static void choiceOne(){
        System.out.println("maybe write manual class\s");
    }
    public void welcomeScreen(){
        String dashes = "------------------------------------------------------------------------------------";
        System.out.println("Welcome to...\n"+dashes+"\n ___                                    ___\n" +
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
        System.out.println("\n\"Are YOU Toon Enough?\"\n(Now with more doodles!)\n"+dashes+"\n");
        wait(2000);
        System.out.println("Write later \n"+question);
        Scanner s = new Scanner(System.in);
        int menuInput = s.nextInt();

        while (true){ //menu active
            if (menuInput<1 || menuInput>2){ //make neater later
                System.out.print("Please enter a valid choice: ");
                menuInput = s.nextInt();
            }else if (menuInput==1){
                choiceOne();
                System.out.print(question);
                menuInput = s.nextInt();
            }else{
                Game g = new Game();
                break;
            }
        }
    }
}
