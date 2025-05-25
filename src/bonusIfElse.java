import java.util.Scanner;

public class bonusIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Opdracht 1: Even/Odd Checker
        System.out.println("Voer een getal in:");
        int number = scanner.nextInt();
        evenOrOdd(number);

//        Opdracht 2: Grader
        System.out.println("Voer het cijfer in:");
        int grade = scanner.nextInt();
        gradeToValue(grade);

//        Opdracht 3: Grootste van Twee Getallen
        System.out.println("Voer het eerste getal in: ");
        int number1 = scanner.nextInt();
        System.out.println("Voer het tweede getal in: ");
        int number2 = scanner.nextInt();
        largestOfTheTwo(number1, number2);

//        Opdracht 4: Positief/Negatief/Zero Checker
        System.out.println("Voer een getal in: ");
        number = scanner.nextInt();
        positiveOrNegativeOrZero(number);

//        Opdracht 5: Leeftijdsclassificatie
        System.out.println("Voer de leeftijd in:");
        number = scanner.nextInt();
        age(number);

//          Opdracht 6: Tekstlengte Checker
        System.out.println("Voer de tekst in: ");
        scanner.nextLine();
//         Ik vond deze methode om ervoor te zorgen dat de input voor mijn String text niet wordt overgeslagen.
        String text = scanner.nextLine();
        textLength(text);

//        Opdracht 7: Jaar Checker
        System.out.println("Geef het jaartal in:");
        int year = scanner.nextInt();
        leapYear(year);

//          Opdracht 8: Grootste van Drie Getallen
        System.out.println("Voer getal 1 in:");
        number1 = scanner.nextInt();
        System.out.println("Voer getal 2 in:");
        number2 = scanner.nextInt();
        System.out.println("Voer getal 3 in:");
        int number3 = scanner.nextInt();
        largestOfThree(number1, number2, number3);

//        Opdracht 9: Driehoekstype
        System.out.println("Voer de lengte van de eerste zijde van de driehoek in:");
        int length1 = scanner.nextInt();
        System.out.println("Voer de lengte van de tweede zijde van de driehoek in:");
        int length2 = scanner.nextInt();
        System.out.println("Voer de lengte van de derde zijde van de driehoek in:");
        int length3 = scanner.nextInt();
        triangleShape(length1, length2, length3);

//        Opdracht 10: Calculator
        System.out.println("Voer het eerste getal in:");
        double nr1 = scanner.nextInt();
        System.out.println("Voer het tweede getal in:");
        double nr2 = scanner.nextInt();
        System.out.println("Wat wil je doen? Kies 1 voor optellen, 2 voor aftrekken, 3 voor vermenigvuldigen of 4 voor delen:");
        int operator = scanner.nextInt();
        calculator(nr1, nr2, operator);

    }

    public static void evenOrOdd (int number){
        if (number % 2 == 0){
            System.out.println("Het getal is even.");
        } else {
            System.out.println("Het getal is oneven.");
        }
    }

    public static void gradeToValue (int grade){
        switch (grade){
            case 1:
            case 2:
                System.out.println("De student heeft een F behaald :( .");
                break;
            case 3:
            case 4:
                System.out.println("De student heeft een D behaald :| .");
                break;
            case 5:
            case 6:
                System.out.println("De student heeft een C behaald :/ .");
                break;
            case 7:
            case 8:
                System.out.println("De student heeft een B behaald :) .");
                break;
            case 9:
            case 10:
                System.out.println("De student heeft een A behaald :D .");
                break;
            default:
                System.out.println("Dat is geen geldig cijfer!");
        }

    }

    public static void largestOfTheTwo (int number1, int number2){
        if (number1 > number2) {
            System.out.println("Getal 1 is het grootst.");
        } else if (number1 < number2) {
            System.out.println("Getal 2 is het grootst.");
        } else {
            System.out.println("De getallen zijn gelijk!");
        }

    }

    public static void positiveOrNegativeOrZero (int number){
        if (number > 0){
            System.out.println("Het getal is positief.");
        } else if (number < 0){
            System.out.println("Het getal is negatief.");
        } else {
            System.out.println("Het getal is nul.");
        }
    }

    public static void age (int number){
        if (number <= 10){
            System.out.println("Dit is een kind.");
        } else if (number < 18){
            System.out.println("Dit is een puber.");
        } else if (number < 65){
            System.out.println("Dit is een volwassene.");
        } else {
            System.out.println("Dit is een senior.");
        }
    }

    public static void textLength (String text){
        int stringLength = text.trim().length();
        if (stringLength < 10){
            System.out.println("Deze tekst is zoveel tekens: " + stringLength);
            System.out.println("Dit is een korte tekst.");
        } else if (stringLength > 20){
            System.out.println("Dit is een lange tekst.");
        } else {
            System.out.println("Dit is middellange tekst.");
        }
    }

    public static void leapYear (int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else
                    leap = false;

            } else
                leap = true;

        } else
            leap = false;

        if (leap){
            System.out.println(year + " is een schrikkeljaar.");
        } else {
            System.out.println(year + " is geen schrikkeljaar.");
        }
    }

    public static void largestOfThree (int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is het grootst.");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is het grootst.");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " is het grootst.");
        } else {
            System.out.println("Minimaal twee getallen zijn even groot!");
        }
    }

    public static void triangleShape (int length1, int length2, int length3){
        if (length1 == length2 && length1 == length3) {
            System.out.println("De driehoek is gelijkzijdig.");
        } else if (length1 == length2) {
            System.out.println("De driehoek is gelijkbenig.");
        } else {
            System.out.println("De driekhoek is ongelijkzijdig.");
        }
    }

    public static void calculator (double nr1, double nr2, int operator){
        double result = 0;
        double deling = 0;
        switch (operator){
            case 1:
                result = nr1 + nr2;
                System.out.println("De som van " + nr1 + " en " + nr2 + " = " + result);
                break;
            case 2:
                result = nr1 - nr2;
                System.out.println(nr1 + " min " + nr2 + " = " + result);
                break;
            case 3:
                result = nr1 * nr2;
                System.out.println(nr1 + " keer " + nr2 + " = " + result);
                break;
            case 4:
                if (nr2 == 0) {
                    System.out.println("Delen door 0 doenne me nie!");
                    break;
                } else
                    deling = nr1 / nr2;
                System.out.println(nr1 + " gedeeld door " + nr2 + " = " + deling);
                break;
            default:
                System.out.println("Geen geldige keuze!");
        }
    }

}



