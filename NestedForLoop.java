package testDemo;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
       int initial, last;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Initial number: ");
        initial=input.nextInt();

        System.out.print("Enter Last number: ");
        last=input.nextInt();

        for (int i = initial; i <=last; i++) {

            for(int j=1; j<=10; j++){
                System.out.println(i+"x"+j+"="+i*j);

            }
            System.out.println("\n \n");
        }



    }
}
