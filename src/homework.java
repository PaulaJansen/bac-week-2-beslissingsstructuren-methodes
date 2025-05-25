import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        hello();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer een nummer in: ");
        int number = scanner.nextInt();
        postiveOrNegative(number);

        System.out.println("Voer een nummer in: ");
        number = scanner.nextInt();
        positiveOrZeroOrNegative(number);

        System.out.println("Wat is je favoriete cocktail?");
        String name = scanner.next();
        bartender(name);

        System.out.println("Voer een nummer in:");
        int input1 = scanner.nextInt();
        System.out.println("Voer nog een nummer in:");
        int input2 = scanner.nextInt();
        int result = sum(input1, input2);
        System.out.println("De som is " + result + ".");

    }

    public static void hello() {
        System.out.println("Hello, world!");
    }

    public static void postiveOrNegative(int number) {
        if (number >= 0){
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrZeroOrNegative(int number) {
        if (number > 0){
            System.out.println("This number is positive!");
        } else if (number < 0){
            System.out.println("This number is negative!");
        } else {
            System.out.println("This number is zero!");
        }
    }

    public static void bartender(String name){
        switch (name) {
            case "Magarita":
            case "magarita":
                System.out.println("Mijn favoriete drankje is een magarita.");
                break;
            case "Gin tonic":
            case "gin tonic":
            case "GT":
            case "gt":
                System.out.println("Mijn favoriete drankje is een gin tonic.");
                break;
            case "Espresso martini":
            case "espresso martini":
            case "Esma":
            case "esma":
                System.out.println("Mijn favoriete drankje is een espresso martini");
                break;
            case "Daiquiri":
            case "daiquiri":
                System.out.println("Mijn favoriete drankje is een daiquiri.");
                break;
            default:
                System.out.println("Joh, ik drink alles!");
        }

    }

    public static int sum(int input1, int input2){
        return input1 + input2;
    }

}

