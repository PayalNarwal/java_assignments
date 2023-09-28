package exp8;
import java.io.*;

public class q1_copyData {
    public static void main(String[] args) throws IOException {

        File f1 = new File("C:\\Users\\PAYAL\\Desktop\\java_assignments\\exp8\\file1.txt");
        FileInputStream fis = new FileInputStream(f1);
        byte b1[] = new byte[fis.available()];
        int n1 = fis.read(b1);
        System.out.println("The number of charters read from file 1 : "+n1);
        String s = new String(b1);
        System.out.println("File Contents : ");
        System.out.println(s);
        fis.close();

        File f2 = new File("C:\\Users\\PAYAL\\Desktop\\java_assignments\\exp8\\file2.txt");
        FileOutputStream fos = new FileOutputStream(f2);
        fos.write(b1);
        fos.close();  
    }
}
