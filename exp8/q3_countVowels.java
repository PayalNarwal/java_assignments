package exp8;
import java.io.*;
public class q3_countVowels {
    public static void main(String[] args) throws IOException {

        File f1 = new File("C:\\Users\\PAYAL\\Desktop\\java_assignments\\exp8\\file1.txt");
        FileInputStream fis = new FileInputStream(f1);
        byte b1[] = new byte[fis.available()];
        int n1 = fis.read(b1);
        System.out.println("Total number of characters read from file 1 : "+n1);
        String s = new String(b1);
        System.out.println("File Contents : ");
        System.out.println(s);
        int count =0;
        for (int i = 0; i < n1; i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("The number of vowels in the file are : "+count);
        fis.close();
    }
}
