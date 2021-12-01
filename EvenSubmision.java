package testDemo;

import java.util.Scanner;

public class EvenSubmision {
    public static void main(String[] args) {
        // Even number submission
        int start, end, sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Start Number: ");
        start=input.nextInt();
        System.out.print("Enter End Number: ");
        end=input.nextInt();

            for(int i=start; i<=end; i++) {
                if(i%2 ==0){
                    sum=sum+i;
                    System.out.println(i);
                }
            }

        System.out.println("Submission number is :"+sum);
        }

}
