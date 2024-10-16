package org.example;


/*Write a function called printInvertedTablesNumber that accepts three parameters
of type int (start, end, number). Then the function goes from end number to the
 start number and prints the multiplication table of the
 numbers provided. If you call this function with following parameters the output
 will be as follows printInvertedTablesNumber(1,10, 3);
 */
import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        drawStarsPyramid(5);
        input.close(); // Close the scanner
    }

    public static void drawStarsPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println(); // Move to the next line after printing stars
        }
    }
}


