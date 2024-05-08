package loadout;

import java.util.Scanner;
import commands.commands;
import randomizers.rlg;
import randomizers.comborlg;

@SuppressWarnings("resource")

public class LoadoutRandomizer {

    public static final String ANSI_FORTNITE = "\u001B[38;5;123m";

    public static final String ANSI_PLAYER2 = "\u001B[38;5;219m";

    public static final String ANSI_RED = "\u001B[38;5;52m";
    public static final String ANSI_BRIGHTRED = "\u001B[38;5;9m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[38;5;39m";
    public static final String ANSI_LIGHTBLUE = "\u001B[38;5;75m";
    public static final String ANSI_CHUGBLUE = "\u001B[38;5;50m";
    public static final String ANSI_YELLOW = "\u001B[38;5;11m";
    public static final String ANSI_GREEN = "\u001B[38;5;36m";
    public static final String ANSI_NEONGREEN = "\u001B[38;5;46m";
    public static final String ANSI_MINT = "\u001B[38;5;121m";
    public static final String ANSI_PINK = "\u001b[38;5;213m";
    public static final String ANSI_PURPLE = "\u001b[38;5;57m";
    public static final String ANSI_BLACK = "\u001b[38;5;16m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        commands.cls();
        Scanner scan = new Scanner(System.in);
        int menuChoice = 1;

        while (menuChoice != 0) {
            System.out.println(ANSI_FORTNITE + "Fort" + ANSI_RESET + "nite Random Loadout Generator " + ANSI_PINK + ":3" + ANSI_RESET);
            System.out.println("------------------------------------");
            System.out.println(ANSI_BRIGHTRED + "EXIT" + ANSI_RESET + ", to exit program");
            System.out.print("Do want a " + ANSI_PLAYER2 + "duo" + ANSI_RESET + " loadout? (" + ANSI_NEONGREEN + "Y" + ANSI_RESET + "/" + ANSI_BRIGHTRED + "N" + ANSI_RESET + "): ");
            String alpha = scan.nextLine();
            alpha = alpha.toUpperCase();

            if (alpha.equals("Y")) {
                commands.cls();
                comborlg.Run(); // Run the combined loadout generator
            }
            else if (alpha.equals("N")) {
                commands.cls();
                rlg.Run(); // Run the regular loadout generator
            }
            else if (alpha.equals("EXIT")) {
                commands.cls();
                System.out.println("Exiting...");
                try {
                    Thread.sleep(2200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                commands.exit();
            }
            else {
                System.out.println("Wrong Input Restarting...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                commands.cls();
            }
        }
    }
}
