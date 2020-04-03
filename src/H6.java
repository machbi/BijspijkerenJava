import java.util.Scanner;

public class H6 {



    //Opdracht 6.1
    public static void main(String[] args) {
        // Begin PSVM
        Scanner scanner = new Scanner(System.in);
        String userInput;
        printZinnetje();

    //Opdracht 6.2
    System.out.println("Welk zinnetje wilt u printen? ");
        userInput = scanner.nextLine();
        printZinnetje(userInput);
        // Einde PSVM
}

        public static void printZinnetje () {
            System.out.println("Hello World");
        }

        public static void printZinnetje (String zinnetje){
            System.out.println(zinnetje);
        }
    }
