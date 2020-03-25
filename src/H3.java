import java.util.Arrays;
import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Opdracht 3.1
        System.out.println("Opdracht 3.1");

        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println("Wat is " + random1 + " + " + random2 + "?");

        // uIO1 = userInputOpdracht1
        int uIO1 = scanner.nextInt();
        int uitwerking = random1 + random2;

        if (uitwerking == uIO1){
            System.out.println("Dat klopt!");
        } else {
            System.out.println("Dat klopt..... niet.");
        }

        //Opdracht 3.2
        System.out.println("\nOpdracht 3.2");
        //Math.random geeft double; maskeer het met een (int) ervoor
        int random21 = (int) (Math.random() * 10 + 1);
        int random22 = (int) (Math.random() * 10 + 1);
        int random23 = (int) (Math.random() * 10 + 1);

        System.out.println("Hoeveel is: " + random21 + " x " + random22 +  " x " + random23);
        double uIO2 = scanner.nextInt();
        double uitwerking32 = random21 * random22 * random23;

        if (uIO2 == uitwerking32) {
            System.out.println("Helemaal goed!");
        } else {
            System.out.println("Helemaal fout!");
        }
        // Opdracht 3.3
        System.out.println("\nOpdracht 3.3");
        // Genereer een random cijfer
        int random31 = (int) (Math.random() * 12 + 1);


        switch (random31){
            case 1:
                System.out.println("Het random getal is " + random31 + " en de maand is januari");
                break;
            case 2:
                System.out.println("Het random getal is " + random31 + " en de maand is februari");
                break;
            case 3:
                System.out.println("Het random getal is " + random31 + " en de maand is maart");
                break;
            case 4:
                System.out.println("Het random getal is " + random31 + " en de maand is april");
                break;
            case 5:
                System.out.println("Het random getal is " + random31 + " en de maand is mei");
                break;
            case 6:
                System.out.println("Het random getal is " + random31 + " en de maand is juni");
                break;
            case 7:
                System.out.println("Het random getal is " + random31 + " en de maand is juli");
                break;
            case 8:
                System.out.println("Het random getal is " + random31 + " en de maand is augustus");
                break;
            case 9:
                System.out.println("Het random getal is " + random31 + " en de maand is september");
                break;
            case 10:
                System.out.println("Het random getal is " + random31 + " en de maand is oktober");
                break;
            case 11:
                System.out.println("Het random getal is " + random31 + " en de maand is november");
                break;
            case 12:
                System.out.println("Het random getal is " + random31 + " en de maand is december");
                break;
        }

        // Opdracht 3.4
        // Deel 1 - weekdag berekenen
        System.out.println("\nOpdracht 3.4");
        System.out.println("Welke dag is het vandaag? (1 = maandag / 2 = di / etc");
        int weekdag = scanner.nextInt();
        // Deel 2 - hoeveel dagen verder berekenen
        System.out.println("Hoeveel dagen in de toekomst wil je berekenen?");
        int hoeVer = scanner.nextInt();


        // If statement; als weekdag + dagenvooruit boven de 7 komt weer modulo 7.
        int product = weekdag + hoeVer;
        if (product > 7){
            product = product % 7;
        }
        // Deel 3 -
        String[] weekdagen = {"onbekend", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};
        System.out.println("Het is vandaag " + weekdagen[weekdag] + " over " + hoeVer + " dagen is het " + weekdagen[product]);

        //Opdracht 3.5
        System.out.println("\nOpdracht 3.5");

        System.out.println("Wat is uw gewicht in KG?");
        double userKG = scanner.nextDouble();
        //System.out.println(userKG);

        System.out.println("Wat is uw lengte in meters?");
        double userLength = scanner.nextDouble();

        double berekBMI = userKG / (userLength * userLength);
        berekBMI = Math.round(berekBMI * 100.0) / 100.0;
        System.out.println(berekBMI);

        if (berekBMI < 18.5){
            System.out.println("Ondergewicht");
        } else if (berekBMI < 25.0) {
            System.out.println("Normaal gewicht");
        } else if (berekBMI < 30.0) {
            System.out.println("Overgewicht");
        } else if (berekBMI >= 30.0){
            System.out.println("Zwaar overgewicht");
        } else {
            System.out.println("Error, neem contact op met Machbi");
        }

        // Opdracht 3.6
        System.out.println("\nOpdracht 3.6");

        System.out.println("Vul uw drie getallen in: ");
        int getal1 = scanner.nextInt();
        int getal2 = scanner.nextInt();
        int getal3 = scanner.nextInt();
        int[] getallen = {getal1, getal2, getal3};
        Arrays.sort(getallen);
        System.out.println(getallen[0] + " " + getallen[1] + " " + getallen[2]);


    }

}
