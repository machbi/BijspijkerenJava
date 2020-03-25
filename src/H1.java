public class H1 {
    public static void main (String[] args){
        System.out.println("Opdracht 1.1");
        System.out.println("Java is Object Georiënteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript");


        System.out.println("\nOpdracht 1.2");
        for (int i = 1; i < 6 ; i++) {
            System.out.println("Java is great" + (i));
        }

        System.out.println("\nOpdracht 1.3");
        System.out.println("a \t a^2 \t a^3 \t a^4");
        System.out.println("1 \t 1 \t     1   \t 1");
        System.out.println("2 \t 4 \t     8   \t 16");
        System.out.println("3 \t 9 \t     27  \t 81");
        System.out.println("4 \t 16 \t 64  \t 256");

        System.out.println("\nOpdracht 1.4");
        System.out.println("Het antwoord is: " + (
                        ((7.5 * 6.5) - (4.5 * 3.5)) / (47.5 * 5.5)
                )
                // Mijn manier wijkt af van de andere omdat hij ze tussentijds ergens afrondt; het idee achter de code begrijp ik
        );
        System.out.println("\nOpdracht 1.5");
        System.out.println("Het antwoord op de som is: " + (1+2+3+4+5+6+7+8+9+10));

        System.out.println("\nOpdracht 1.6");
        double pi = (4 * (1 - 1.d /3 + 1.d /5 - 1.d /7 + 1.d /9 - 1.d /11 + 1.d /13));
        System.out.println("Het antwoord op de som is: " + pi);

        System.out.println("\nOpdracht 1.7");
        //Gegevens
        double straal = 6.5;
        double gegevenPi = 3.14159;
        double oppervlakte = straal * straal * gegevenPi;
        double omtrek = 2 * (straal * gegevenPi);

        //uitwerkingen
        System.out.println("Oppervlakte = " + oppervlakte);
        System.out.println("Omtrek = " + omtrek);


        System.out.println("\nOpdracht 1.8");
        //Gegevens
        double lengte = 5.3;
        double breedte = 8.6;
//            double oppervlakte18 = lengte * breedte;
//            double omtrek = 2 * (lengte + breedte);

        //souts
        System.out.println("De oppervlakte = " + (lengte * breedte));
        System.out.println("De omtrek = " + (2 * (lengte + breedte)));
    }
}


