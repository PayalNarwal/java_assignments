package exp4;
import java.util.*;

public class exp4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of row of first matrix: ");
        int m1 = sc.nextInt();
        System.out.print("Enter no. of column of first matrix: ");
        int n1 = sc.nextInt();
        System.out.print("Enter no. of row of second matrix: ");
        int m2 = sc.nextInt();
        System.out.print("Enter no. of column of second matrix: ");
        int n2 = sc.nextInt();

        int a[][] = new int[m1][n1];    // first matrix A
        int b[][] = new int[m2][n2];    // second matrix B

        int c[][] = new int[m1][n2];    // matrix after adding A and B
        int d[][] = new int[m2][n2];    // matrix after multiplying A and B

        System.out.println("enter the elements of the first matrix: ");
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the elements of the second matrix: ");
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe first matrix is: ");
            for(int i=0; i<m1; i++){
                for(int j=0; j<n2; j++){
                    System.out.print(a[i][j]+ " ");
                }
                System.out.println();
            }
        System.out.println();

        System.out.println("The second matrix is: ");
            for(int i=0; i<m1; i++){
                for(int j=0; j<n2; j++){
                    System.out.print(b[i][j]+ " ");
                }
                System.out.println();
            }
        System.out.println();

        if(n1!=n2 && m1!=m2){
            System.out.println("matrix addition not possible");
        } else {
            for(int i=0; i<m1; i++){
                for(int j=0; j<n1; j++){
                    d[i][j]= a[i][j] + b[i][j];
                }
            }

            System.out.println("The resultant matrix by matrix addition: ");
            for(int i=0; i<m1; i++){
                for(int j=0; j<n1; j++){
                    System.out.print(d[i][j]+ " ");
                }
                System.out.println();
            }
        }

        System.out.println();

        if(n1!=m2){
            System.out.println("matrix multiplication not possible");
        } else {
            for(int i=0; i<m1; i++){
                for(int j=0; j<n2; j++){
                    for(int k=0; k<n1; k++){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }

            System.out.println("The resultant matrix by matrix multiplication: ");
            for(int i=0; i<m1; i++){
                for(int j=0; j<n2; j++){
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
