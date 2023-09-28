package exp8;

import java.io.*;

public class q4_conactenate {
    public static void main(String[] args) throws IOException {

        File f1 = new File("C:\\Users\\PAYAL\\Desktop\\java_assignments\\exp8\\file1.txt");
        FileInputStream fis1 = new FileInputStream(f1);
        byte b1[] = new byte[fis1.available()];
        int n1 = fis1.read(b1);
        System.out.println("The number of characters read from file 1 : " + n1);
        String s1 = new String(b1);
        System.out.println(s1);
        fis1.close();

        File f2 = new File("C:\\Users\\PAYAL\\Desktop\\java_assignments\\exp8\\file2.txt");
        FileInputStream fis2 = new FileInputStream(f2);
        byte b2[] = new byte[fis2.available()];
        int n2 = fis2.read(b2);
        System.out.println("The number of characters read from file 2 : " + n2);
        String s2 = new String(b2);
        System.out.println(s2);
        fis2.close();

        int l = s1.length() + s2.length();
        String s3 = s1+s2;
        System.out.println("Total characters read are : "+l);
        byte b3[] = new byte[l];

        for (int i = 0; i < s3.length(); i++) {
            b3[i] = (byte) s3.charAt(i);
        }

        File f3 = new File("C:\\Users\\PAYAL\\Desktop\\java_assignments\\exp8\\file3.txt");
        FileOutputStream fos = new FileOutputStream(f3);
        fos.write(b3);
        fos.close();
    }
}
