package testDemo;

import java.util.Scanner;

public class SeriesNum2 {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Start Number: ");
        n=input.nextInt();
        for(int i=1; i<=n; i=i+1) {
            sum=sum+(i*i);
            System.out.print(i+"x"+i+" ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
