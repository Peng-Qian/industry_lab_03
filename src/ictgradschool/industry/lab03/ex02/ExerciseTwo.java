package ictgradschool.industry.lab03.ex02;

import ictgradschool.Keyboard;

/**
 * Write a program that prompts the user to enter a range – 2 integers representing a lower bound and an upper bound.
 * You should use Keyboard.readInput() for this. Then, convert these bounds from String to int using Integer.parseInt().
 * Your program should then use Math.random() to generate 3 random integers that lie between the range entered (inclusive),
 * and then use Math.min() to determine which of the random integers is the smallest.
 */
public class ExerciseTwo {

    /**
     * TODO Your code here. You may also write additional methods if you like.
     */
    private void start() {
        System.out.print("Lower bound?");
        int lowerBound = Integer.parseInt(getValueFromUser());

        System.out.print("Upper bound?");
        int upperBound = Integer.parseInt(getValueFromUser());

        int randNumber1 = getRandomNumber(lowerBound,upperBound);
        int randNumber2 = getRandomNumber(lowerBound,upperBound);
        int randNumber3 = getRandomNumber(lowerBound,upperBound);

        int minNumber = Math.min(Math.min(randNumber1,randNumber2),randNumber3);

        System.out.println("3 randomly generated numbers: " +randNumber1+", "+randNumber2+" and "+randNumber3);
        System.out.println("Smallest number is " + minNumber);
    }

    private int getRandomNumber(int lowerBound,int upperBound) {
        double R = Math.random();
        int randNumber = (int)((upperBound - lowerBound + 1) * R )+ lowerBound;
        return randNumber;
    }

    public String getValueFromUser(){
        return Keyboard.readInput();
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        ExerciseTwo ex = new ExerciseTwo();
        ex.start();

    }
}
