package ictgradschool.industry.lab03.ex08;

import ictgradschool.Keyboard;

/*
 * Created by qpen546 on 13/03/2017.
 */
public class CalculateVolume {
    private void start() {

        int radius;

        System.out.println("\"Volume of a Sphere\"");

        System.out.print("Enter the radius: ");

        radius = (int)Double.parseDouble(Keyboard.readInput());

        double volume = 4.0 / 3.0 * Math.PI * Math.pow(radius,2);

        System.out.println("Volume: " + volume);

    }

    public static void main(String[] args){
        CalculateVolume p = new CalculateVolume();
        p.start();
    }
}
