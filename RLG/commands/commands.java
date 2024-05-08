package commands;

import java.io.IOException;

public class commands {

    public static void exit() {
        String os = System.getProperty("os.name").toLowerCase();
        int x = 0;

        try {
            if (os.contains("win")) {
                // Use taskkill to close the "Terminal Preview" program
                new ProcessBuilder("cmd", "/c", "taskkill /f /im WindowsTerminalPreview.exe").inheritIO().start().waitFor();

                x = 1;
            } 
            if (x == 1) {
                // Use taskkill to close the "cmd" program
                new ProcessBuilder("cmd", "/c", "taskkill /f /im cmd.exe").inheritIO().start().waitFor();

                x = 2;
            }
            if (x == 2) {
                // Last resort if all else fails 😭
                commands.cls();
                System.exit(0);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println(e);
        }
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error while trying to clear the screen: " + e.getMessage());
        }
    }
}
