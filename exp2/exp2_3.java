package exp2;
import java.util.*;

public class exp2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in rupees : ");   
        int rupees = sc.nextInt();
        int paisa = rupees * 100;
        System.out.println("The amount in paisa is : "+paisa);
        sc.close();
    }  
}
