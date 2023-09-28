import java.util.*;

public class exp3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number : ");
        int n = sc.nextInt();
        switch(n){
            case 1 : System.out.println("January\n31 days"); break;
            case 2 : System.out.println("Febuary\n28 or 29 days"); break;
            case 3 : System.out.println("March\n31 days"); break;
            case 4 : System.out.println("April\n30 days"); break;
            case 5 : System.out.println("May\n31 days"); break;
            case 6 : System.out.println("June\n30 days"); break;
            case 7 : System.out.println("July\n31 days"); break;
            case 8 : System.out.println("August\n31 days"); break;
            case 9 : System.out.println("September\n30 days"); break;
            case 10 : System.out.println("October\n31 days"); break;
            case 11: System.out.println("November\n30 days"); break;
            case 12: System.out.println("December\n31 days"); break;
        }
        sc.close();      
    }
    
}
