package classroom;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("What is your name?");
        String name;
        name = terminal.next();
        System.out.println("Your name is: "+name);
    }
}
