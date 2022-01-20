package homework;

public class homework3 {
    public static void main(String[] args) {

//Exercise 1 "Print value 10"

        int number = 10;
        for (int i = 10; i <= 10; i++) {
            System.out.println("Integer value is 10");
        }

//Exercise 2 "After entering value print discount"
/*
18-21 discount 10%
22-64 discount 15%
65 and more discount 20%
 */
        int k = 65;
        if (k >= 18 && k <= 21) {
            System.out.println("Congratulation your discount is 10%");
        } else if (k >= 22 && k <= 64) {
            System.out.println("Congratulation your discount is 15%");
        } else if (k >= 65 && k <= 100) {
            System.out.println("Congratulation your discount is 20%");
        } else {
            System.out.println("Sorry, you can't get a discount because your age restriction ");
        }

//Exercise 3   "Create String array with 10 animals names"

        String[] animals = {"dog", "cat", "elephant", "giraffe", "parrot", "tiger", "lion", "monkey", "fish", "rabbit"};
        for (int i = 3; i <= 3; i++) {
            System.out.println(animals[i]);
        }

//Exercise 4 "Create String array with even numbers"
        int[] evenNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < evenNumbers.length; i += 2) {
            System.out.println(evenNumbers[i]);
        }
//Exercise 5
        String transport = "car";

        switch (transport) {
            case "car":
                System.out.println("It is your private transport");
                break;
            case "bus": {
                System.out.println("It is public transport" + transport);
            }
            break;
            case "taxi": {
                System.out.println("It is public transport" + transport);
            }
            break;
            case "train": {
                System.out.println("It is public transport" + transport);
            }
            break;
            default:
                System.out.println("Sorry" + " " + transport + " " + "it is not a transport");
        }

//Exercise 6 "Print numbers from 1 do 100

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

//Exercise 7 "Print numbers from 50 do 1
        int numbersDown = 50;
        while (numbersDown >= 1) {
            System.out.print(numbersDown + " ");
            numbersDown--;
        }
        System.out.println("");

//Exercise 8 "multiplication table from 1 to 10"
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++)
                System.out.println(i + " * " + i * a);
            System.out.println();
        }


    }

}
