// Program to input values Using Scanner and display on screen

import java.util.Scanner;

class TakingInput {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the total grant required to complete your research (in Rs.)");

        int grant = take.nextInt();
        System.out.println("Grant asked by you is Rs." + grant);
    }
}