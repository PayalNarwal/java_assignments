package exp1;

public class exp1_5 {
    public static void main(String[] args) {
        // x^2 - 5x - 6 = 0
        int coeffx2 = 1;
        int coeffx = -5;
        int constant = -6;
        double d = (coeffx*coeffx-4*(coeffx2*constant));
        double rootd = Math.sqrt(d);
        double root1 = (-coeffx+rootd)/(2*coeffx2);
        double root2 = (-coeffx-rootd)/(2*coeffx2);
        System.out.println("The first root is : "+root1);
        System.out.println("The second root is : "+root2);
    }   
}
