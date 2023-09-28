package exp6;

import java.util.Scanner;

class Employee {
    private String name;
    private String address;
    private int age;
    private String gender;

    Employee(String n, String a, int age, String g) {
        this.name = n;
        this.address = a;
        this.age = age;
        this.gender = g;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class FullTimeEmployee extends Employee {
    private double salary;
    private String designation;

    FullTimeEmployee(String n, String a, int age, String g, double s, String d) {
        super(n, a, age, g);
        this.salary = s;
        this.designation = d;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

class PartTimeEmployee extends Employee {
    private int workHours;
    private double ratePerHour;

    PartTimeEmployee(String n, String a, int age, String g, int wh, double rph) {
        super(n, a, age, g);
        this.workHours = wh;
        this.ratePerHour = rph;
    }

    void calculatePay() {
        double pay = workHours * ratePerHour;
        System.out.println("Pay: " + pay + " rupees");
    }
}

public class exp6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----employee----");
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee address: ");
        String address = sc.nextLine();
        System.out.print("Enter employee age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee gender: ");
        String gender = sc.nextLine();

        Employee emp1= new Employee(name, address, age, gender);
        System.out.println("Employee Details:");
        emp1.displayDetails();
        System.out.println();

        System.out.println("----full-time employee---- ");
        System.out.print("Enter full-time employee salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter full-time employee designation: ");
        String designation = sc.nextLine();

        FullTimeEmployee emp2 = new FullTimeEmployee("Abcd", "xxxx", 24, "m", salary, designation);
        System.out.println("Full-Time Employee Details:");
        emp2.displayDetails();
        System.out.println();

        System.out.println("----part-time employee----");
        System.out.print("Enter part-time employee work hours: ");
        int workHours = sc.nextInt();
        System.out.print("Enter part-time employee rate per hour: ");
        double ratePerHour = sc.nextDouble();

        PartTimeEmployee emp3 = new PartTimeEmployee("Bcde", "yyyy", 18, "m", workHours, ratePerHour);
        System.out.println("Part-Time Employee Details:");
        emp3.displayDetails();
        emp3.calculatePay();

        sc.close();
    }
}

