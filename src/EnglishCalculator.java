/*
Ashton Rischer
10/29/19
This is a program that will take number inputs and an operator from the user and it will output them in english as words

 */
import java.util.*;

public class EnglishCalculator {

    public static void main(String[] args) {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 9");
        int num1 = input.nextInt();
        System.out.println("Enter a number between 0 and 9");
        int num2 = input.nextInt();
        System.out.println("Enter a operator to apply to your numbers");
        String Operation = input.next();
        char operator = Operation.charAt(0);

        if (num1 > 9 || num2 > 9 || num1 < 0 || num2 < 0) {
            System.out.print("Sorry these numbers are invalid");
        } else {
            String one = Numbers(num1);
            String two = Numbers(num2);

            switch(operator)
            {
                case '+':
                     result = num1+num2;
                    System.out.print(one + " plus" + two + " is "+ result);
                    break;
                case '-':
                     result = num1-num2;
                    System.out.print(one + " minus" + two + " is "+ result);
                    break;
                case '*':
                     result = num1*num2;
                    System.out.print(one + " multiplied by" + two + " is "+ result);
                    break;
                case '/':
                    if (num2 == 0){
                        System.out.print("Sorry you cant divide by 0");
                    }
                    else {
                         result = num1/num2;
                        System.out.print(one + " divided by" + two + " is "+ result);
                    }
                        break;
                case '^':
                     result = (int) Math.pow(num1,num2);
                    System.out.print(one + " to the power of" + two + " is "+ result);
                    break;
                default: System.out.print("Sorry you did not give a valid operator");
            }

        }

    }

    private static String Numbers(int number) {
        switch (number) {
            case 0:
                return "zero";

            case 1:
                return "one";

            case 2:
                return "two";

            case 3:
                return "three";

            case 4:
                return "four";

            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return " nine";
            default:
                return"";


        }


    }

}

