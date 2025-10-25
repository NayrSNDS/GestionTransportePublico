package utp.ac.pa.sistema.utils;

import java.util.Scanner;

public class IOUtils {
    private static Scanner scanner = new Scanner(System.in);
    
    public static String readString(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }
    
    public static int readInt(String message) {
        System.out.print(message + ": ");
        return Integer.parseInt(scanner.nextLine());
    }
    
    public static void showMessage(String message) {
        System.out.println("📢 " + message);
    }
    
    public static void showError(String error) {
        System.out.println("❌ Error: " + error);
    }
}
