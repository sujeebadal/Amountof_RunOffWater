package com.company;

import java.util.Scanner;

public class AmountofRunOffWater {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter length of roof in feet");
        int length_roof = Keyboard.nextInt();
        System.out.println("Enter width of roof in feet");
        int width_roof = Keyboard.nextInt();
        System.out.println("Enter number of inches of rainfall");
        int inches_rainfall = Keyboard.nextInt();

        //calculate cubic inches of water

        double cubic_in_water = (length_roof * 12) * (width_roof * 12) * inches_rainfall;

        //calculate the number of gallons of water

        double gallons_water = cubic_in_water / 231;

        //print cubic inches of water and gallons of water
        System.out.println("cubic_in_water = " + cubic_in_water);
        System.out.println("gallons_water = "+ gallons_water);

    }
}
