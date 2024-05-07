package commands;

import java.io.IOException;

public class commands {

    public static void exit() {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "taskkill /f /im WindowsTerminal.exe").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("cmd", "/c", "taskkill /f /im cmd.exe").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Error while trying to exit: " + e.getMessage());
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
