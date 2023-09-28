package exp5;
import java.lang.Math;
import java.util.Scanner;

class triangle {
    String color; String type; 
    double side1, side2 , side3;
    double area;
    triangle(){
        color="White";
        type="None";
        side1=0.0;
        side2=0.0;
        side3=0.0;
    }
    triangle(double a){
        side1 = a;
        side2 = a;
        side3 = a;
        type = "Equilateral";
    }
    triangle(double a, double b){
        side1 = a;
        side2 = a;
        side3 = b;
        type = "Isosceles";
    }
    triangle(double a , double b , double c){
        side1 = a;
        side2 = b;
        side3 = c;
        type = "Scalene";
    }
    void calcArea(){
        double s = (side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    void printDetails(){    
        System.out.println("Type of traingle :"+type);
        System.out.println("Area of the triangle is :"+ area);
        System.out.println("Color of triangle :"+color);
    }
}
class exp5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("side 1 : ");
        double a = sc.nextInt();
        System.out.print("side 2 : ");
        double b = sc.nextInt();
        System.out.print("side 3 : ");
        double c = sc.nextInt();

        if(a+b>c && b+c>a && a+c>b) {
            if(a==b && a==c && b==c){
                triangle t1 = new triangle(a);
                t1.color = "Purple";
                t1.calcArea();
                t1.printDetails();
            }else if(a==b && a!=c){
                triangle t2 = new triangle(a,c);
                t2.color = "Red";
                t2.calcArea();
                t2.printDetails();
            }else if(a==c && a!=b){
                triangle t2 = new triangle(a,b);
                t2.color = "Red";
                t2.calcArea();
                t2.printDetails();
            }else if(b==c && b!=a){
                triangle t2 = new triangle(b,a);
                t2.color = "Red";
                t2.calcArea();
                t2.printDetails();
            }else{
                triangle t3 = new triangle(a,b,c);
                t3.color = "Blue";
                t3.calcArea();
                t3.printDetails();
            }
        }else{
            System.out.println("Triangle not possible ");
        }    
        sc.close();
    }
}
