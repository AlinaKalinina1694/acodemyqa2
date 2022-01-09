package classroom;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PrimitiveTypes {
    public static void main(String[] args) {

//  Floating point example

        float floatExample = 99999.99F;
        System.out.println(floatExample);
        System.out.println(99999.99F);

        double doubleExample = 2000000.9876D;
        System.out.println(doubleExample);
        System.out.println(2000000.9876D);

      // Integral example

      byte handCount = 2;
        System.out.println(handCount);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        short distanceBetweenKievAndRiga = 1811;
        System.out.println(distanceBetweenKievAndRiga);

        int populationOFLatvia = 1900000;
        System.out.println(populationOFLatvia);

        long currentWorldPopulation=790000000000L;
        System.out.println(currentWorldPopulation);

        char ch = 'a';
        System.out.println(ch);


        int[] arrayOfPeopleAges = {21,22,23,24};
        System.out.println(Arrays.toString(arrayOfPeopleAges));

        //String variables
        String myName="Alina";
        System.out.println(myName);

        String loremIpsum = "ijjuojjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
        System.out.println(loremIpsum);


        String mySurname="Kalinina";
        //String myNameAndUsername = myName +mySurname;
        String myNameAndUsername = myName +" "+mySurname;
        System.out.println(myNameAndUsername);







    }
}
