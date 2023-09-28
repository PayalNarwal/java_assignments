package exp4;

import java.util.*;

public class exp4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter dd: "));
        int dd = sc.nextInt();
        System.out.print("Enter mm: ");
        int mm = sc.nextInt();
        System.out.print("Enter yyyy: ");
        int yyyy = sc.nextInt();

        int nextdd = dd+1;
        int prevdd = dd-1;
        int nextmm = mm;
        int prevmm = mm;
        int nextyyyy = yyyy;
        int prevyyyy = yyyy;
        
        switch(mm){
            case 1: switch(dd){
                case 01: prevdd =31; prevmm=12; prevyyyy = yyyy-1; break;
                case 31: nextdd = 01; nextmm = mm+1; break;
            }break;
            case 2: switch(dd){
                case 01: prevdd =31; prevmm=mm-1; break;
                case 28: if(yyyy %4 !=0){
                    nextdd = 01; nextmm = mm+1;
                }break;
                case 29: nextdd = 01; nextmm=mm+1; break;
            }break;
            case 3: switch(dd){
                case 1: if (yyyy%4 == 0){
                    prevdd = 29 ; prevmm = mm-1;
                }else{
                    prevdd = 28 ; prevmm = mm-1;
                }break;
                case 31: nextdd = 1; nextmm = mm+1; break;
            }break;
            case 4: switch(dd){
                case 1: prevdd = 31; prevmm= mm-1; break;
                case 30: nextdd = 1; nextmm= mm+1; break;
            }break;
            case 5: switch(dd){
                case 1: prevdd = 30; prevmm= mm-1; break;
                case 31: nextdd = 1; nextmm= mm+1; break;
            }break;
            case 6: switch(dd){
                case 1: prevdd = 31; prevmm= mm-1; break;
                case 30: nextdd = 1; nextmm= mm+1; break;
            }break;
            case 7: switch(dd){
                case 1: prevdd = 31; prevmm= mm-1; break;
                case 30: nextdd = 1; nextmm= mm+1; break;
            }break;
            case 8: switch(dd){
                case 1: prevdd = 30; prevmm= mm-1; break;
                case 31: nextdd = 1; nextmm= mm+1; break;
            }break;
            case 9: switch(dd){
                case 1: prevdd = 31; prevmm= mm-1; break;
                case 30: nextdd = 1; nextmm= mm+1; break;
            }break;
            case 10: switch(dd){
                case 1: prevdd = 30; prevmm= mm-1; break;
                case 31: nextdd = 1; nextmm= mm+1; break;
            }break;
            case 11: switch(dd){
                case 1: prevdd = 31; prevmm= mm-1; break;
                case 30: nextdd = 1; nextmm= mm+1; break;
            }break;
            case 12: switch(dd){
                case 1: prevdd = 30; prevmm= mm-1; break;
                case 31: nextdd = 1; nextmm= mm+1; nextyyyy = yyyy+1 ; break;
            }break;

        }
        System.out.println("Next Date : "+ nextdd +"/"+nextmm+"/"+nextyyyy);
        System.out.println("Previous Date : "+prevdd+"/"+prevmm+"/"+prevyyyy);

        sc.close();
    } 
}
