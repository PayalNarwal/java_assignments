package exp2;
import java.util.*;

public class exp2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float ans = (a-(b*c))/(b-c);
        System.out.println("The answer is : "+ans);
        sc.close();
    }  
}

