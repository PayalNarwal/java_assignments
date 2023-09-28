package exp9;

import java.io.*;

class emp implements Serializable{
    String name;
    String designation;
    int salary;
    String department;

    emp(String name, String designation, int salary, String department) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    void getDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Designation : "+this.designation);
        System.out.println("Salary : "+this.salary);
        System.out.println("Department : "+this.department);
    }
}
class exp9_1{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        emp e1 = new emp("Payal","Data analyst",234500,"IT");
        FileOutputStream fos = new FileOutputStream("file1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e1);
        oos.close();

        FileInputStream fis = new FileInputStream("file1.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        emp e2 = new emp("","",0,"");
        e2 = (emp)ois.readObject();
        ois.close();

        System.out.println("The details of employee 1: ");
        e1.getDetails();
        System.out.println("The read details of employee 1: ");
        e2.getDetails();
    }
}

