package exp5;
import java.util.Scanner;

class account {
    static int acc_no = 0;
    String name;
    double balance;
    double rate; 
    String type;

    Scanner sc = new Scanner(System.in);
    
    account(){
        System.out.println(".........WELCOME TO OUR BANK.........");
    }

    void create() {
        
        System.out.println("Creating a bank account ");
        this.balance = 0.0;
        account.acc_no++;
        System.out.println("Account Number: "+account.acc_no);
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Rate of interest : ");
        rate = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Type(current/saving) : ");
        type = sc.nextLine();
        System.out.println("Account created successfully...");
    }

    void check() {
        System.out.println("Current Balance : "+balance);
    }
    void deposit() {
        System.out.print("Enter amount to be deposited : ");
        int z = sc.nextInt();
        balance = balance+z;
        System.out.println("Current Balance: "+balance);  
    }
    void update() {
        if(type.equalsIgnoreCase("current")){
            balance = balance + (rate * balance) /2;
        }else if (type.equalsIgnoreCase("saving")){
            balance = balance + balance*rate;
        }
        System.out.println("Updated Balance after interest : "+balance);
    }
    void withdraw() {
        System.out.print("Enter amount to be withdrawn : ");
        int z = sc.nextInt();
        balance = balance-z;
        System.out.println("Current Balance : "+balance);
    }
}

class exp5_2b {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        boolean choice = true;
        while(choice){
            account a1 = new account();
            a1.create();
            a1.check();
            a1.deposit();
            a1.update();
            a1.withdraw();
            System.out.print("Do you want to continue (y/n) : ");
            String c = s.nextLine();
            if (c.equalsIgnoreCase("n")){
                choice = false;
                System.out.println("......... THANK YOU ! .........");
            }
        }
        s.close();
        
    }
}

