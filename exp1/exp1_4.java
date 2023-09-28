package exp1;
import java.util.*;

public class exp1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks: ");
        int n = sc.nextInt();
        if(n>80){
            System.out.println("A");
        }else if(n<=80 && n>=70){
            System.out.println("B");
        }else if(n<=70 && n>=60 ){
            System.out.println("C");
        }else if(n<=60 && n>=50 ){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        sc.close();   
    }   
}
