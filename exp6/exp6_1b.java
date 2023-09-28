package exp6;
import java.util.Scanner;

class Distance{
    double d;
    
    Distance() {
        d = 0;
    }
    Distance(double d) {
        this.d = d;
    }
    Distance add (Distance other){
        Distance result = new Distance();
        result.d = this.d + other.d;
        return result;
    }
    Distance sub (Distance other){
        Distance result = new Distance();
        if(this.d > other.d){
            result.d = this.d - other.d;
        }else{
            result.d = other.d - this.d;
        }
        return result;
    }
    void printDistance(){
        System.out.println(this.d+" meters");
    }   
}

class dInches extends Distance{
    dInches(){
        this.d = 0;
    }
    dInches(double d){
        this.d = ((d)*(2.54))/100;
    }
    dInches add (dInches other){
        dInches result = new dInches();
        result.d = this.d + other.d;
        return result;
    }
    dInches sub (dInches other){
        dInches result = new dInches();
        if(this.d > other.d){
            result.d = this.d - other.d;
        }else{
            result.d = other.d - this.d;
        }
        return result;
    }
    void printDistance(){
        System.out.println("Result : "+this.d+" inches");
    }   
}
class dMiles extends Distance{
    dMiles(){
        this.d = 0;
    }
    dMiles(double d){
        this.d = d* 0.000621;
    }
    dMiles add (dMiles other){
        dMiles result = new dMiles();
        result.d = this.d + other.d;
        return result;
    }
    dMiles sub (dMiles other){
        dMiles result = new dMiles();
        if(this.d > other.d){
            result.d = this.d - other.d;
        }else{
            result.d = other.d - this.d;
        }
        return result;
    }
    void printDistance(){
        System.out.println("Result : "+this.d+" miles");
    }   
}
public class exp6_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance d1 : ");
        double a = sc.nextDouble();
        System.out.print("Enter distance d2 : ");
        double b = sc.nextDouble();

        Distance d1 = new Distance(a);
        Distance d2 = new Distance(b);

        Distance d3 = d1.add(d2);
        System.out.print("The resultant distance after adding : ");
        d3.printDistance();

        Distance d4 = d1.sub(d2);
        System.out.print("The resultant distance after subtracting : ");
        d4.printDistance();

        dInches dI_1 = new dInches(a);
        System.out.print("The distance d1 in Inches : ");
        dI_1.printDistance();
        dInches dI_2 = new dInches(b);
        System.out.print("The distance d2 in Inches : ");
        dI_2.printDistance();

        dMiles dM_1 = new dMiles(a);
        System.out.print("The distance d1 in Miles : ");
        dM_1.printDistance();
        dMiles dM_2 = new dMiles(b);
        System.out.print("The distance d2 in Miles : ");
        dM_2.printDistance();

        sc.close();
    }
    
}
