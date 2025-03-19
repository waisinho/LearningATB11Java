package Challenges;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        double sideOne;
        double sideTwo;
        double sideThree;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for the First side of the Triangle");
        sideOne = scanner.nextDouble();
        System.out.println("Please enter a number for the Second Side of the Triangle");
        sideTwo = scanner.nextDouble();
        System.out.println("Please enter a number for the Third Side of the Triangle");
        sideThree = scanner.nextDouble();

// Check if the input values can form a valid triangle
        if (sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println("It is an Equilateral Triangle.");
        } else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
            System.out.println("It is an Isosceles Triangle.");
        } else {
            System.out.println("It is a Scalene Triangle.");
        }
    }
}
