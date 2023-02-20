package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int it = 10;
        while (it > 0) {
            Scanner input = new Scanner(System.in);
            int marks = input.nextInt();

            if (marks >= 90 && marks <= 100) {
                System.out.println("A+");
            } else if (marks >= 80 && marks <= 89) {
                System.out.println("A");
            } else if (marks >= 70 && marks <= 79) {
                System.out.println("B+");
            } else if (marks >= 60 && marks <= 69) {
                System.out.println("B");
            } else if (marks >= 50 && marks <= 59) {
                System.out.println("C");
            } else if (marks >= 40 && marks <= 49) {
                System.out.println("D");
            } else if (marks >= 0 && marks <= 39) {
                System.out.println("F");
            } else {
                System.out.println("Invalid number");
            }
            it--;
        }

    }
}