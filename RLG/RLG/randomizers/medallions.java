package randomizers;

import java.util.Random;

public class medallions {

    public static final String ANSI_PLAYER1 = "\u001B[38;5;111m";
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

    public static void Run() {
        Random rand = new Random();

        //Combat Medallions
        String SIPHON = ANSI_GREEN + "Siphon Medallion (Hades)" + ANSI_RESET;
        String COMBAT = ANSI_RED + "Combat Medallion (Ares)" + ANSI_RESET;
        //Movement Medallions
        String SPEED = ANSI_YELLOW + "Speed Medallion (Zeus)" + ANSI_RESET;
        String AGILITY = ANSI_GREEN + "Agility Medallion (Cerberus)" + ANSI_RESET;

        String P1CM = "";
        String P2CM = "";

        String P1MM = "";
        String P2MM = "";

        int CombatMedallion = rand.nextInt(2) + 1;
        if (CombatMedallion == 1) {
            
            P1CM = SIPHON;
            P2CM = COMBAT;
            
        }
        else if (CombatMedallion == 2){ 
            
            P1CM = COMBAT;
            P2CM = SIPHON;
        }

        int MovementMedallion = rand.nextInt(2) + 1;
        if (MovementMedallion == 1) {
            
            P1MM = SPEED;
            P2MM = AGILITY;
        }
        else if (MovementMedallion == 2) {
            
            P1MM = AGILITY;
            P2MM = SPEED;
        }

        System.out.println(ANSI_PLAYER1 + "Player 1 " + ANSI_RESET + "Medallions:");
        System.out.println("Combat Medallion: " + P1CM);
        System.out.println("Movement Medallion: " + P1CM);
        System.out.println();
        System.out.println(ANSI_PLAYER2 + "Player 2 " + ANSI_RESET + "Medallions:");
        System.out.println("Combat Medallion: " + P2CM);
        System.out.println("Movement Medallion: " + P2CM);
    }
}
