import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        // Opdracht 5.1
//        System.out.println("Opdracht 5.1");
//        boolean doorgaan = true;
//        while (doorgaan) {
//            System.out.println("Wat is je toetscijfer?");
//            double cijfer = scanner.nextDouble();
//            if (cijfer == -1) {
//                doorgaan = false;
//            } else if (cijfer >= 5.5) {
//                System.out.println("Je hebt een voldoende gehaald");
//            } else {
//                System.out.println("Je hebt een onvoldoende gehaald");
//            }
//        }

//        //Opdracht 5.2
//        System.out.println("Opdracht 5.2");
//
//        int aantalGoed = 0;
//        for (int i = 0; i < 10;  i++) {
//            int getal1 = (int) (Math.random() * 10 + 1);
//            int getal2 = (int) (Math.random() * 10 + 1);
//            int optelsom = getal1 + getal2;
//
//            System.out.println("Wat is " + getal1 + " + " + getal2 + "?");
//            int userInput = scanner.nextInt();
//
//            if (userInput == optelsom) {
//                System.out.println("Klopt!");
//                aantalGoed++;
//            } else {
//                System.out.println("Helaas, het goede antwoord is: " + optelsom);
//            }
//        }
//        System.out.println("U had " + aantalGoed + " van de 10 sommen goed");

            //Opdracht 5.3
        System.out.println("\nOpdracht 5.3");

        for (int i = 1; i < 11; i++) {
            System.out.println("7 x "+  i + " = " + (7*i));
        }

            //Oopdracht 5.4
//
//        int laagsteCijfer = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Voer een getal in: ");
//            int number = scanner.nextInt();
//            if ( i == 0) {
//                laagsteCijfer = number;
//            } else if (number < laagsteCijfer) {
//                laagsteCijfer = number;
//                System.out.println("Voer uw volgende getal in.");
//            } else if (number > laagsteCijfer){
//                System.out.println("Voer uw volgende getal in.");
//            }
//        }
//        System.out.println("Het laagst ingevoerde cijfer is: " + laagsteCijfer);

//            //Opdracht 5.5
//        System.out.println("\nOpdracht 5.5");
//        String leerling = "onbekend";
//        String naam = "dubbel";
//        double hoogsteCijfer = 0;
//        double behaaldeCijfer;
//
//        for (int i = 1; i < 6; i++) {
//            System.out.println("Hoe heet de " + i + "e student?");
//           naam =  scanner.nextLine();
//            System.out.println("Wat was het cijfer van " + naam + "?");
//            behaaldeCijfer = scanner.nextDouble();
//            scanner.nextLine();
//            if (i == 0) {
//                hoogsteCijfer = behaaldeCijfer;
//                leerling = naam;
//            } else {
//                if (behaaldeCijfer > hoogsteCijfer) {
//                    hoogsteCijfer = behaaldeCijfer;
//                    leerling = naam;
//                }
//            }
//        }
//        System.out.println("Het hoogste cijfer is een " + hoogsteCijfer + " en is behaald door " + leerling + ".");

        // Opdracht 5.6
        System.out.println("\nOpdracht 5.6");

        for (int i = 0; i < 100; i++) {
            if ( i % 5 == 0){
                System.out.println(i + " is deelbaar door 5.");
                i++;
            }
        }

        // Opdracht 5.7
        System.out.println("\n Opdracht 5.7");

        boolean doorgaan = true;
        int getal = 0;
        int uitslag;

        while (doorgaan) {

            uitslag = getal * getal;
            System.out.println("Het kwadraat van " + getal + " is " + uitslag);
            getal++;

            if (uitslag > 1000) {
                doorgaan = false;
                System.out.println("einde test");
            }
        }


//             Einde PSVM
         }
}
