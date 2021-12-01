package testDemo;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // Large number find out using ternary operator
        int a, b,large;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        a=input.nextInt();
        System.out.print("Enter your second number: ");
        b=input.nextInt();

        large=(a > b) ? a : b;
        System.out.println("Large number is: "+large);
    }
}
