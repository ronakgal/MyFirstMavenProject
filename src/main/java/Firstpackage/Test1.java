package Firstpackage;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt(); //num1 is 123

        int num = num1%10; //num is 3
        int tempno = num; // tempno is 3
        int num2 = num1/10;
        int a = num1/10;
        int b = a%10; // b is 2
        int c =num2/10;


        System.out.println("The Reverse number of "+num1+ " is "+tempno+""+b+""+c);

        }
}
