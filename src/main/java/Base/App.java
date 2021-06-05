/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;


import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String length = getDimension("length");
        String width = getDimension("width");
        double lengthNum = stringToDouble(length);
        double widthNum = stringToDouble(width);
        double areaNum = calcArea(lengthNum, widthNum);
        int numGallons = calcNumGallons(areaNum);
        printOutput(areaNum, numGallons);
    }
    public static String getDimension(String dimension)
    {
        System.out.printf( "What is the %s of the room in feet ", dimension);
        return in.nextLine();
    }

    public static double stringToDouble(String number)
    {
        return Double.parseDouble(number);
    }

    public static double calcArea(double length, double width)
    {
        return length * width;
    }

    public static int calcNumGallons(double area)
    {
        double gallons = 0;
        gallons = area / 350;
        if (area % 350 != 0)
        {
            gallons += 1;
        }
        return (int)gallons;
    }

    public static void printOutput (double area, int numGallons)
    {
        System.out.printf( "You will need to purchase %d gallons of paint to cover %.0f square feet.", numGallons, area );
    }
}