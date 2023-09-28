package exp1;

import java.util.*;

public class exp1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("enter first no. becomes: ");
        System.out.println(a);
        System.out.print("enter second no. becomes: ");
        System.out.println(b);
        sc.close();
    }
}
