/* This is program that will calculate a monthly mortgage payment
*/

import java.util.*;
import java.text.*;
public class mortgage {

    public static void main (String[]args){
        Scanner rate = new Scanner(System.in);
        System.out.println("Enter your mortgages annual interest rate as a decimal number <"); //This part of the code will ask the user to input their annual mortgage interest rate as a decimal number, and store that value as a percentage
        double interestRate;

        interestRate = rate.nextDouble();

        int mortgageYears;
         System.out.print("Enter the number of years your mortgage will be held for <"); // This part will ask the user the number of years that their mortgage will be held for, and store that value as an int
         Scanner mortgage = new Scanner(System.in);

         mortgageYears = mortgage.nextInt();

         System.out.print("Enter the amount of money borrowed from the bank for this mortgage");//This part will ask the user how much money they borrowed from the bank to pay their mortgage, and will store it as an int
        int borrowedmoney;
        Scanner borrow = new Scanner(System.in);
        borrowedmoney = borrow.nextInt();

        double monthlypayment;
        double mIR;
        mIR = interestRate/12;
        int nOY;
        nOY = mortgageYears;
        double M;
        M = borrowedmoney;
        monthlypayment = (mIR * M)/(1-(1+ mIR)* Math.pow(((mIR * M)/(1-(1+ mIR))),12*nOY));//This part will calculate the users monthly payment with the formula (mIR * M)/(1-(1+ mIR)* Math.pow(((mIR * M)/(1-(1+ mIR))),12*nOY))

        double totalpayment;//This part will calculate how much money the user has paid on their mortgage and store that as a variable
        totalpayment = monthlypayment*12*mortgageYears;

        double overpayment;
        overpayment = totalpayment + borrowedmoney;// This part will calculate the users overpayment on their mortgage
        System.out.println("Your annual interest rate is " + interestRate*100 + " %");//This part will begin outputting the users annual interest rate, their mortgage amount, their monthly payment,
        // their total mortgage payment over the amount of years their mortgage was held for, the overpayment that they paid on their mortgage, and the percentage of overpayment
        System.out.println("Your mortgage amount is $" + borrowedmoney);
        System.out.println("Your monthly payment is $ " + Math.round((monthlypayment*100.00)/100.00));
        System.out.println("Your total mortgage payment over " + mortgageYears + " years is " + Math.round(totalpayment)*100.0/100.0);
        System.out.println("Your overpayment is " + Math.round(overpayment)*100.0/100.0);
        System.out.println("Your overpayment as a percentage of the mortgage amount is " + Math.round(overpayment/borrowedmoney*100.0)/100.0 + "%");



    }












}
