package com.linecomparison;
import java.util.Scanner;
/*Using OOPS concept to compare two lines*/
public class LineComparison {
    /*Creating a method*/
    public static void isEqual(double line1, double line2){                   //Checking equality of two lines
        if(line1 == line2){
            System.out.println("Therefore the two lines are equal");
        }
        else{
            System.out.println("Therefore the two lines are not equal");
        }
    }
    public static void compareLines(double line1, double line2){             //Comparing the length of two lines
        if(line1 > line2){
            System.out.println("The first line is greater than the second line.");
        }
        else if(line1 < line2){
            System.out.println("The second line is greater than the first line.");
        }
        else {
            System.out.println("Both the lines are equal");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3, x4, y4;
        System.out.println("---------Considering the first line-----------");
        System.out.println("Enter x and y coordinates of the first point: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter x and y coordinates of the second point: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.println("\n----------Considering the second line----------");
        System.out.println("Enter x and y coordinates of the third point: ");
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        System.out.println("Enter x and y coordinates of the fourth point: ");
        x4 = input.nextDouble();
        y4 = input.nextDouble();
        double firstLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.printf("\nThe length of first line is %.3f", firstLine);
        double secondLine = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
        System.out.printf("\nThe length of second line is %.3f", secondLine);
        System.out.println("\n");
        isEqual(firstLine,secondLine);                                               //Calling the method isEqual
        compareLines(firstLine,secondLine);                                          //Calling the method compareLines
    }
}