package ictgradschool.industry.lab03.ex04;

import ictgradschool.Keyboard;

/**
 * Write a program that prompts the user to enter an amount and a number of decimal places.  The program should then
 * truncate the amount to the user-specified number of decimal places using String methods.
 *
 * <p>To truncate the amount to the user-specified number of decimal places, the String method indexOf() should be used
 * to find the position of the decimal point, and the method substring() should then be used to extract the amount to
 * the user-specified number of decimal places.  The program is to be written so that each task is in a separate method.
 * You need to write four methods, one method for each of the following tasks:</p>
 * <ul>
 *     <li>Printing the prompt and reading the amount from the user</li>
 *     <li>Printing the prompt and reading the number of decimal places from the user</li>
 *     <li>Truncating the amount to the user-specified number of DP's</li>
 *     <li>Printing the truncated amount</li>
 * </ul>
 */
public class ExerciseFour {

    private void start() {

        // TODO Use other methods you create to implement this program's functionality.
        String number = getNumberFromUser();
        int decimalPlace = Integer.parseInt(getDecimalPlaceFromUser());
        String specifiedNumber = getSpecifiedNumber(number,decimalPlace);
        printTruncatedAmount(specifiedNumber,decimalPlace);

    }

    // TODO Write a method which prompts the user and reads the amount to truncate from the Keyboard
    private String getNumberFromUser (){
        System.out.print("Please enter an amount: ");
        return Keyboard.readInput();
    }

    // TODO Write a method which prompts the user and reads the number of DP's from the Keyboard
    private String getDecimalPlaceFromUser (){
        System.out.print("Please enter the number of decimal place: ");
        return Keyboard.readInput();
    }

    // TODO Write a method which truncates the specified number to the specified number of DP's
    private String getSpecifiedNumber (String number,int decimalPlace){
        int decimalPoint = number.indexOf('.');
        String specifiedNumber = number.substring(0,decimalPoint+decimalPlace+1);
        return specifiedNumber;
    }

    // TODO Write a method which prints the truncated amount
    private void printTruncatedAmount (String specifiedNumber,int decimalPlace){
        System.out.println("Amount truncated to "+decimalPlace+" decimal places is: "+specifiedNumber);
    }
    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        ExerciseFour ex = new ExerciseFour();
        ex.start();
    }
}
