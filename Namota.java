package testDemo;

import java.util.Scanner;

public class Namota {
    public static void main(String[] args) {
        int n, sum=0;
        System.out.print("Enter your number: ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();

        for(int i=1; i<=10; i++) {
           sum=n*i;
            System.out.println(n+" x "+i+"="+sum);

        }

    }
}
