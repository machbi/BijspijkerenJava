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




//Einde van de code
    }
}
