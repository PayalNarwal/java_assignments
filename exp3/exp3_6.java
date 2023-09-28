import java.util.*;

public class exp3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = sc.next();
        s=s.toLowerCase();
        switch(s)
        {
            case "a": case "e": case "i": case "o": case "u":
            System.out.println("vowel"); break;
            default:System.out.println("consonant");break;
        }
        sc.close();
    }
    
}
