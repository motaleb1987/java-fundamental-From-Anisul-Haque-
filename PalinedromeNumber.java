package com.company;

import java.util.Scanner;

public class PalinedromeNumber {
    public static void main(String[] args) {
        int temp,sum=0,num,r;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number: ");
        num=input.nextInt();
        temp=num;
        while (temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        //System.out.println(sum);
        if(sum==num){
            System.out.println(sum+" This Number is Palindrome");
        }else
            System.out.println(sum+" This Number is Not Palindrome");
    }
}
