package com.linecomparison;
import java.util.Scanner;
/*Program to find length of a line between two cartesian coordinates*/
public class LineComparison {
    /*Using a method to calculate the length of a line*/
    public double lengthCalculate(double x1,double y1, double x2, double y2){
        double length = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        return Math.sqrt(length);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LineComparison length = new LineComparison();
        double x1, y1, x2, y2;
        System.out.println("Enter x and y coordinates of the first point: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter x and y coordinates of the second point: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.printf("The length of the line is %.3f", length.lengthCalculate(x1,y1,x2,y2));
    }
}
