import java.util.Arrays;
import java.util.Scanner;

public class H7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        // Opdracht 7.1
//        System.out.println("\nOpdracht 7.1");
//
//        int counter = 0;
//        int getal;
//
//        for (int i = 0; i < 100; i++) {
//            getal = (int) (Math.random() * 6 + 1);
//            System.out.print(getal + " ");
//            counter++;
//            if (counter % 10 == 0) {
//                System.out.println();
//            }
//        }
////        // Opdracht 7.2
//        System.out.println("\nOpdracht 7.2");
//
//        int int1, int2, int3, int4, int5, int6, int7, int8, int9;
//
//        System.out.println("Geef me negen integers");
//        int[] input = new int[9];
//        for (int i = 0; i < 9; i++) {
//            input[i] = scanner.nextInt();
//        }
//        for (int i = 8; i >= 0; i--) {
//            System.out.print(input[i] + " ");
//        }

//        // Opdracht 7.3 - Mijn eigen versie maar ik loop vast.
//        System.out.println("\nOpdracht 7.3");
//        System.out.println("Geef me tien doubles, dan bereken ik het gemiddelde & welke cijfers bovengemideld zijn");
//        double sommetje = 0;
//        double[] putin = new double[10];
//        for (int i = 0; i < 10; i++) {
//            putin[i] = scanner.nextDouble();
//            sommetje = sommetje + putin[i];
//        }
//        // Gemiddelde berekenen
//        double gemiddelde = sommetje / putin.length;
//        System.out.println("Het gemiddelde = " + gemiddelde);
//
//        //
//        int rellet = 1;
//        int teller = 0;
//        if (putin[rellet] >= gemiddelde) {
//            teller++;
//            System.out.println(teller + "TESTESTEST");
//        };
//        System.out.println("Van de " + putin.length + " getallen waren er " + teller + " boven het gemiddelde");
//        System.out.println("teller is" + teller);
//        System.out.println("Het sommetje is" + sommetje);
//        System.out.println("Het gemiddelde is" + gemiddelde);
//        System.out.println("De array string is" + Arrays.toString(putin));
        // Is het zo dat teller niet verandert omdat de putin alleen beschikbaar is van regel 42 tot 45?

        // Opdracht 7.3
        System.out.println("Opdracht 7.3");
        int teller = 0;

        System.out.println("Geef mij tien doubles. Dan bereken ik het gemiddelde & vertel ik jou de bovengemiddelde cijfers");
        double[] userInput = new double[10];
        // De double-array met daarin de cijfers via scanner
        for (int i = 0; i < 10; i++) {
            userInput[i] = scanner.nextDouble();
        }
        // Het gemiddelde berekenen
        double optelsom = 0;
        //zo vraag je hem aan: for ((getal-type->) double (noemen we even->) waarde : (uit de array ->) userInput)
        for (double waarde : userInput){
            optelsom += waarde;
        }
           double gemiddelde = optelsom / 10;
        //tussentijds even checken of het klopte.
        //System.out.println("Het gemiddelde is: " + gemiddelde);

        for (double waarde : userInput){
            if (waarde > gemiddelde) {
                teller++;
            }
        }
        System.out.println("Het gemiddelde van de cijfers is: " + gemiddelde + ". Het aantal bovengemiddelde cijfers zijn: " + teller);
    }
}
