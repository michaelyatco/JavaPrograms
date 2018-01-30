package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
	    //Two operators '=' and '+' and two operands '1' and '2'
        System.out.println("1. " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println("2. " + previousResult);
        System.out.println("3. " + result);

        previousResult = result;

        result = result * 10;
        System.out.println("4. " + previousResult);
        System.out.println("5. " + result);

        previousResult = result;

        result = result /5;
        System.out.println("6. " + previousResult);
        System.out.println("7. " + result);

        previousResult = result;
        result = result % 2;
        System.out.println("8. 4 % 2 leaves remainder of " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("9. " + result);
        result++;
        System.out.println("10. " + result);
        result--;
        System.out.println("11. " + result);

        result += 2;
        System.out.println("12. " + result);

        result *= 10;
        System.out.println("13. " + result);

        result -= 10;
        System.out.println("14. " + result);

        result /= 10;
        System.out.println("15. " + result);

        boolean isAlien = false; //setting the value
        if (isAlien == true) //if evaulates to true
            System.out.println("It is not an alien!");

        int topScore = 90;
        if (topScore != 100)
            System.out.println("You don't have the high score!");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than top score and less than 100.");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true.");

        int newValue = 50;
        if(newValue == 50) //Dealing with a boolean
            System.out.println("This is correct.");

        boolean isCar = false;
        if(isCar = true) //You assigned the value. You need the evaluator '=='
            System.out.println("This is not supposed to happen.");

        isCar = true;
        boolean wasCar = isCar ? true : false; //ternary operator
        if(wasCar)
            System.out.print("wasCar is true");

        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println(myTotal);
        double theRemainder = myTotal % 40;
        System.out.println(theRemainder);
        if(theRemainder <= 20)
            System.out.println("Total was over the limit");
    }
}
