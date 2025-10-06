package Firstpackage;

public class ArithmeticJavClass {

    public static void main(String[] args) {

        int num = 541;
        int sum = 0;

        sum = sum + (num%10); //sum is 4
        num = num/10; //num is 5;

        sum = sum + (num%10);
        num = num/10;

        sum = sum + num;

        System.out.println(sum);
    }
}
