package exp8;

import java.io.*;

public class q2_blankSpaces {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\PAYAL\\Desktop\\java_assignments\\exp8\\file1.txt");
        FileInputStream fis = new FileInputStream(f1);
        byte b1[] = new byte[fis.available()];
        int n1 = fis.read(b1);
        System.out.println("The number of charters read from file 1 : "+n1);
        String s1 = new String(b1);
        byte b2[] = new byte[n1];
        int count = 0;
        String s2 = "";
        for (int i = 0, j = 0; i < n1; i++) {
            if(s1.charAt(i)==' '){
                count++;
            }else{
                b2[j]=(byte)s1.charAt(i);
                j++;
                s2 = s2+ s1.charAt(i);
            }      
        }
        System.out.println("The number of spaces are: "+count);
        System.out.println("--------Original content :-------");
        System.out.println(s1);
        System.out.println("---------Content after removing spaces :--------");
        System.out.println(s2);
        fis.close();
        File f2 = new File("C:\\Users\\PAYAL\\Desktop\\java_assignments\\exp8\\file3.txt");
        FileOutputStream fos = new FileOutputStream(f2);
        fos.write(b2);
        fos.close();  
    }
    
}
