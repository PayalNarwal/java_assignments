package exp9;

import java.util.*;

class exp9_2 {
    public static void main(String[] args) {
        System.out.println("Hi, main");
        double a;
        double b;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        while (temp == 0) {
            System.out.println("Hi, while");
            System.out.print("Enter a : ");
            a = sc.nextDouble();
            System.out.print("Enter b : ");
            b = sc.nextDouble();
            temp = 1;
            try {
                System.out.println("Hi, try");
                int d = (int)a/(int)b;
                System.out.println("Bye, try");
                System.out.println("a/b is : "+ d);
            } catch (ArithmeticException e) {
                System.out.println("Hi, catch");               
                System.out.println("Exception occurred");
                System.out.println("re enter value");
                temp = 0;
                System.out.println("Bye, catch");
            }  
            System.out.println("a to the power b is :"+Math.pow(a, b));
            System.out.println("Bye, while");
        }
        sc.close();
        System.out.println("Bye, main");
    }
}