import java.util.Scanner;

public class h2 {
        public static void main (String[] args){

            Scanner scanner = new Scanner(System.in);

            // 2.1
            System.out.println("Opdracht 2.1");
            System.out.println("Typ het aantal mijlen: ");
            double mijlen = scanner.nextDouble();
            double kilometers = 1.6 * mijlen;
            // Met double gaat ie te ver door achter de komma, dit verhelp je door er een integer van te maken.

            // Het volgende eigenlijk altijd toepassen wanneer met  doubles rekent
            int tussenstap = (int) (kilometers * 10);
            kilometers = tussenstap / 10.0;
            System.out.println("Uw opgegeven aantal mijlen staat gelijk aan: " + kilometers + " km!");

            // 2.2
            System.out.println("Opdracht 2.2");
            // Stap 1; de jaren
            System.out.println("Hoeveel jaar oud bent u?");
            int jaren = scanner.nextInt();
            // Stap 2; de maanden
            System.out.println("Hoeveel maanden komen daar nog bij?");
            int maanden = scanner.nextInt();
            int totaalMinuten = jaren * 365 * 24 * 60 + maanden * 30 * 24 * 60;

            System.out.println("Dan ben je nu ongeveer " + totaalMinuten + " minuten oud.");

            // Opdracht 2.3
            // Waarom is het zo dat als ik bij rentepercentage 1komma2 invul ipv 1punt2 hij flipt?
            System.out.println("\nOpdracht 2.3");
            System.out.println("Typ het startbedrag: ");
            double startbedrag = scanner.nextDouble();

            System.out.println("Typ het rentepercentage: ");
            double rente = scanner.nextDouble();

            double renteBedrag = rente / 100 * startbedrag;

            double totaal = startbedrag + renteBedrag;
            System.out.println("Het rentepercentage is: " + renteBedrag + "%. Het totaal bedrag is: " + totaal + ".");

            //Opdracht 2.4
            System.out.println("\nOpdracht 2.4");

            System.out.println("Typ een getal tussen 10 en 100: ");

            // Vraag de gebruiker een integer getal in te vullen
            int userInput = scanner.nextInt();

            // Gebruik de userInput, en sout het met " gebabbel " + userInput -1 etc "gebabbel";
            System.out.println("De vijf getallen zijn: " + (userInput - 2) + " - " + (userInput - 1) + " - " + userInput +
                    " - " + (userInput + 1) + " - " + (userInput + 2));

            //Opdracht 2.5
            System.out.println("\nOpdracht 2.5");
            System.out.println("Typ een getal tussen 0 en 1000");

            int uInput = scanner.nextInt();
            int getal3 = uInput % 10;
            uInput = uInput / 10;

            int getal2 = uInput % 10;
            uInput = uInput / 10;

            int getal1 = uInput ;

            int product = getal1 * getal2 * getal3;
            System.out.println("De vermenigvuldiging van de cijfers luidt: " + getal1 + " x " + getal2 + " x " + getal3 + " = " + product);
            // Als ik om een int vraag (bijv getal#) en ik deel zodanig dat ik op een double uitkom - waarom flipt ie dan niet?
        }
    }


