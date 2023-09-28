package exp1;
import java.util.*;

public class exp1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number a: ");
        int a = sc.nextInt();
        System.out.print("enter second number b: ");
        int b = sc.nextInt();
        System.out.print("enter third number c: ");
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("a is maximum");
        }else if(b>a && b>c){
            System.out.println("b is maximum");
        }else{
            System.out.println("c is maximum");
        }
        sc.close();
    }
    
}
