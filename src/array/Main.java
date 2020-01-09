/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 09/01/20
 *   Time: 7:09 PM
 */

package array;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        new Main().passwordExample();
    }

    public void passwordExample() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }

        console.printf("Testing password%n");
        char[] passwordArray = console.readPassword("Enter your secret password: ");
        console.printf("Password entered was: %s%n", new String(passwordArray));

    }
}
