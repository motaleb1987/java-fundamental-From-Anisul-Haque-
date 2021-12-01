package testDemo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num, count=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=input.nextInt();

        for (int i = 2; i < num; i++) {
            if(num%2==0){
                count++;
            }
        }
        if (count==0){
            System.out.println(num+" Number is prime !!!");
        }else{
            System.out.println(num+" Number Not prime !!!");
        }

    }
}
