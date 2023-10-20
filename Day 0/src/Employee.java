import java.util.Scanner;

public class Employee {
//    int empId;
    String empName,empAddress;
    float grossSalary,basicSalary,DA,TA;

    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.println("Enter Employee Address: ");
        empAddress = sc.nextLine();
        System.out.println("Enter Employee Basic Salary: ");
        basicSalary = sc.nextFloat();
        System.out.println("Enter Employee Daily Allowance: ");
        DA = sc.nextFloat();
        System.out.println("Enter Employee Travel Allowance: ");
        TA = sc.nextFloat();
    }
    public void getData(){
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Address: "+empAddress);
        System.out.println("Employee Basic Salary: "+basicSalary);
        System.out.println("Employee Daily Allowance: "+DA);
        System.out.println("Employee Travel Allowance: "+TA);
        calSalary();
    }
    public void calSalary(){
        grossSalary = basicSalary+DA+TA;
        System.out.println("Total Salary: "+grossSalary);
}

}