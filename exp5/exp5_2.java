// package exp5;
// import java.util.*;

// class account{
//     static public int accNo = 0;
//     String name;
//     Double balance;
//     Double rate ;
//     String type ;

//     public account(){
//         name = "None";
//         balance = 0.0;
//         rate = 0.0;
//         type = "None";
//     }
//     public account(String name, Double balance, Double rate, String type) {
//         account.accNo ++;
//         this.name = name;
//         this.balance = balance;
//         this.rate = rate;
//         this.type = type;
//     }
    
//     account(int accNo){
//     }
    
//     public void calcBalance(){
//         if(type.equalsIgnoreCase("current")){
//             balance = balance + (rate * balance) /2;
//         }else if (type.equalsIgnoreCase("savings")){
//             balance = balance + balance*rate;
//         }
//     }
//     public void showDetails(){       
//         System.out.println("Your account no is : " +accNo);
//         System.out.println("Name : "+this.name);
//         System.out.println("Type : "+this.type);
//         System.out.println("Balance : "+this.balance);
//     }
// }

// class exp5_2{
//     public static void main(String[] args) {
//         boolean temp = true;
//         while(temp){
//             System.out.println("Enter 1 -> Create account ");
//             System.out.println("Enter 2 -> Check balance  ");
//             System.out.println("Enter 3 -> Update balance ");
//             System.out.println("Enter 4 -> Withdraw ");
//             System.out.println("Enter 5 -> Deposit  ");
//             System.out.println("Enter 6 -> Exit ");
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             sc.nextLine();
//             System.out.println();
//             if (n==1){
//                 System.out.println("Creating a bank account ");
//                 Double balance = 0.0;
//                 System.out.print("Enter Name : ");
//                 String name = sc.nextLine();
//                 System.out.print("Enter Rate of interest : ");
//                 Double rate = sc.nextDouble();
//                 sc.nextLine();
//                 System.out.print("Enter Type : ");
//                 String type = sc.nextLine();
//                 account a1 = new account(name,balance,rate,type);
//                 System.out.println("Account created successfully...");
//                 a1.showDetails();
//             }else if (n==2){
//                 // System.out.print("Enter Account number : ");
//                 // int a = sc.nextInt();
//                 // if(a1.accNo == a){
//                 //     a1.showDetails;
//                 // }
                
//                 // account a2 = new account(a);
//                 // a2.showDetails();
//             }else if (n==3){

//             }else if (n==4){
                
//             }else if (n==5){
                
//             }else{
//                 System.out.println("Exit");
//                 temp = false;
//             }
//             sc.close();
//         } 
//     }
// }