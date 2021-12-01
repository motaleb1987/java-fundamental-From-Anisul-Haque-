package testDemo;

import java.util.Scanner;

public class SeriesNumber {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Start Number: ");
        n=input.nextInt();
        for(int i=1; i<=n; i=i+2) {
                sum=sum+i;
                System.out.print(i+"  ");

        }
        System.out.println();
        System.out.println(sum);






    }
}
