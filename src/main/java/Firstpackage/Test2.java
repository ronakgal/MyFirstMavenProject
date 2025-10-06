package Firstpackage;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First number");
        int num = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a Second number ");
        int num1 = sc1.nextInt();

       int addNum = num + num1;


        System.out.println("The addition of " +num+ " and " +num1+ " is "+addNum);

    }
}
