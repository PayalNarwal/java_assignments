import java.util.*;

public class exp3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        float a = sc.nextFloat();
        if (a>0){
            System.out.println("Positive number");
        }else if(a<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Zero");
        }
        sc.close();
    }
    
}
