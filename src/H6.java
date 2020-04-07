import java.util.Scanner;

public class H6 {



        // HOOFSTUK 6
    public static void main(String[] args) {
        // Begin PSVM
        Scanner scanner = new Scanner(System.in);

        // Opdracht 6.1
        System.out.println("\nOpdracht 6.1");
        String userInput;
        printZinnetje();

        //Opdracht 6.2
        System.out.println("\nOpdracht 6.2");
        System.out.println("Welk zinnetje wilt u printen? ");
        userInput = scanner.nextLine();
        printZinnetje(userInput);

        //Opdracht 6.3
        System.out.println("\nOpdracht 6.3");
        int uIG1 = ((int) (Math.random() * 10 + 1) * 100/100);
        int uIG2 = ((int) (Math.random() * 10 + 1) * 100/100);
        System.out.println("De som van " + uIG1 + " x " + uIG2 + " = " + berekenProduct(uIG1, uIG2));

        // Opdracht 6.4
        System.out.println("\nOpdracht 6.4");
        System.out.println("We gaan twee getallen vermenigvuldigen");
        System.out.println("Wat is het eerste getal?");
        int getal1 = scanner.nextInt();
        System.out.println("Wat is het tweede getal?");
        int getal2 = scanner.nextInt();
        System.out.println("De uitkomst van " + getal1 + " x " + getal2 + " = " + sommetje(getal1, getal2));

        // Opdracht 6.5
        System.out.println("\nOpdracht 6.5");
        System.out.println("Van welk getal wil je de weekdag weten? ");
        int getal = scanner.nextInt();
        String weekdag = bepaalDag(getal);
        System.out.println("Bij nummer " + getal + " hoort de dag: " + weekdag);

        // Opdracht 6.6
        System.out.println("\nOpdracht 6.6");
        System.out.println("Van welk cijfer wil je weten of het een even getal is?");
        int inputGetal = scanner.nextInt();
        boolean isEven = isEvenGetal(inputGetal);
        if (isEven) {
            System.out.println("Het cijfer " + inputGetal + " is een even getal");
        } else {
            System.out.println("Het cijfer " + inputGetal + " is een oneven getal");
        }
        // Einde PSVM
}

// start van de methodes

        // Methode 6.1
        public static void printZinnetje () {
            System.out.println("Hello World");
        }
        // Methode 6.2
        public static void printZinnetje (String zinnetje){
        System.out.println(zinnetje);
    }
        // Methode 6.3
        public static int berekenProduct (int uIG1, int uIG2) {
            int eindProduct = uIG1 * uIG2;
            return eindProduct;
        }
        // Methode 6.4
        public static int sommetje (int getal1, int getal2){
        return getal1 * getal2;
    }
        // Methode 6.5
        public static String bepaalDag (int getal) {
            switch (getal) {
                case 1: return "maandag";
                case 2: return "dinsdag";
                case 3: return "woensdag";
                case 4: return "donderdag";
                case 5: return "vrijdag";
                case 6: return "zaterdag";
                case 7: return "zondag";
                default:return "onbekend!";
            }
    }
    // Methode 6.6
    public static boolean isEvenGetal(int inputGetal) {
        if (inputGetal % 2 == 0) {
        return true;
        } else { return false;}
    }

    }
