import java.util.Scanner;

public class Customer {
//    variables
    int custNo;
    String custName,address;
    double balance;

//    methods
    public void setData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        custNo = sc.nextInt();
        System.out.println("Enter Name: ");
        custName = sc.next();
        System.out.println("Enter Address: ");
        address = sc.next();
        System.out.println("Enter Balance: ");
        balance = sc.nextDouble();
//        custNo = 101;
//        custName = "Vivek";
//        address = "Ahmedabad";
//        balance = 150.00;
    }
    public void getData(){
        System.out.println("Customer ID: "+custNo);
        System.out.println("Customer Name: "+custName);
        System.out.println("Address: "+address);
        System.out.println("A/c Balance: "+ balance);
    }

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();
        cust1.setData();
        cust1.getData();
        cust2.setData();
        cust2.getData();
    }
}
