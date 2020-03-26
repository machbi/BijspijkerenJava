import java.util.Arrays;
import java.util.Scanner;

public class H4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Opdracht 4.1
        char uI41;

        System.out.println("Opdracht 4.1");
        System.out.print("Van welk karakter wil je de ASCII waarde weten? ");

        uI41 = scanner.nextLine().charAt (0);
        int asciiValue = uI41;

        System.out.println("De ASCII waarde van het karakter " + uI41 + " is " + asciiValue + ".");

        //Opdracht 4.2
        System.out.println("\nOpdracht 4.2");
        System.out.println("Van welk karakter wil je weten of het een getal of letter is? ");

        //Recycle van 4.1, maar geef hem wel nieuwe waarde dmv scanner
        uI41 = scanner.nextLine().charAt (0);

        if (Character.isLetter(uI41)){
            System.out.print("De " + uI41 + " is een letter.");
        } else if (Character.isDigit(uI41)){
            System.out.print("De " + uI41 + " is een cijfer.");
        }
        else {
            System.out.println("Error, recommend course of action: ALT + F4");
        }

        // Opdracht 4.3
        System.out.println("\n\nOpdracht 4.3");
        System.out.println("Van welke letter wil je weten of het een klinker is?");

        uI41 = scanner.nextLine().toLowerCase().charAt(0);


        if (!Character.isLetter(uI41)){
            System.out.println("Dit is geen letter");
            System.exit(0);
        } else if (uI41 == 'a' || uI41 == 'e' || uI41 == 'o' || uI41 == 'u' || uI41 == 'i'){
            System.out.println("De letter " + uI41 + " is een klinker.");
        } else {
            System.out.println("De letter " + uI41 + " is een medeklinker.");
        }

        // Opdracht 4.4
        System.out.println("\nOpdracht 4.4");
        char userInput = scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'b' || userInput == 'c'){
            System.out.println("De " + userInput + " staat op de twee-knop");
        }

        // Opdracht 4.45 - Leukere versie
        System.out.println("\n Opdracht 4.45");
        Character [] tweeKnop = {'a', 'b', 'c' };
        char u1 = scanner.nextLine().toLowerCase().charAt(0);
        System.out.println("Gegeven waarde: " + u1);

        if (Arrays.asList(tweeKnop).contains(u1)){
            System.out.println("Testtest" + u1);
        }
        // etc etc etc


        //Opdracht 4.5
        System.out.println("\n Opdracht 4.5");

        int randomNumber = (int) (Math.random() * 26 + 97);
        char asciiChar = (char) randomNumber;
        System.out.println("Uw random letter is: " + asciiChar + ".");

        //Opdracht 4.6
        System.out.println("\n Opdracht 4.6");
        System.out.println("Typ een string!");
        String userString = scanner.nextLine();

        int length = userString.length();
        char firstChar = userString.charAt(0);
        char lastChar = userString.charAt(length - 1);

        System.out.println("Lengte: " + length + ", eerste karakter: " +firstChar+ " & laatste karakter: " +lastChar+".");

        // Opdracht 4.7
        System.out.println("\n Opdracht 4.7");
        System.out.println("Geef de drie landen aan:");

        String land1 = scanner.nextLine();
        String land2 = scanner.nextLine();
        String land3 = scanner.nextLine();

        String [] landen = {land1, land2, land3};
        Arrays.sort(landen);

        System.out.println(landen[0] + " " + landen[1] + " " + landen[2]);



//Einde van de code
    }
}
