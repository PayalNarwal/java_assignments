import java.util.*;

public class exp3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in degree Celsius: ");
        double a = sc.nextFloat();
        double b = ((9.0/5.0)*a)+32.0;
        // float b = ((9*a)/5)+32;
        System.out.print("Temperature in degree Fahrenheit is: ");
        System.out.println(b);
        sc.close();   
    }
    
}
