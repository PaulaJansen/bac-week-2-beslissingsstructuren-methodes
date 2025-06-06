import java.util.Arrays;

public class bonusLoops {
    public static void main (String[] args){

//        Opdracht 1
        int sum = 0;
        for (int i = 2; i < 100; i += 2){
            sum += i;
            System.out.println(i + "+");
        }
        sum += 100;
        System.out.println(100 + " is " + sum);

//        Opdracht 2
        for (int i = 1; i < 1000; i *= 2){
            System.out.println(i + " x ");
        }

//        Opdracht 3
        int[] numbers = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        int wantedValue = 45;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == wantedValue) {
                found = true;
                break;
            }
        }
        System.out.println(wantedValue + " is " + found + ".");

//        Opdracht 4
        int[] array = {12, 5, 7, 2, 18, 3, 9, 12};

        for (int i = 0; i < array.length; i++){
            sum += array[i];
            System.out.println(array[i] + "+");
        }
        System.out.println("De som van de elementen = " + sum);

//        Opdracht 5
        String[] elements = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
        System.out.println("Opdracht 5: [");

        for (String s: elements){
            if(!s.isEmpty()){
                System.out.println(s + " ");
            } else {
                break;
            }
        }
        System.out.println("]\n");

//        Opdracht 6
//        boolean prime = true;
        for (int i = 2; i <100; i++){
            if(i % i == 0){
                System.out.println(i + " ");
            } else {
            }
        }

    }



}
