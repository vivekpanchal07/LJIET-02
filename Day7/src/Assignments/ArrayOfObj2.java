package Assignments;

import java.util.*;

class employee{
    int empId;
    float salary;
    String empName;

    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id : ");
        this.empId = sc.nextInt();
        System.out.println("Enter the salary  : ");
        this.salary = sc.nextInt();
        System.out.println("Enter the employee name : ");
        this.empName = sc.next();
        System.out.println();
    }

    public void getData(){
        System.out.println("Employee Id : "+empId);
        System.out.println("Salary : "+salary);
        System.out.println("Employee Name : "+empName);
    }
}

public class ArrayOfObj2 {
    public static void main(String args[]){
        int n = 5;
        String a = "";
        Scanner sc = new Scanner (System.in);
        employee e1[] = new employee[5];
        int i=1;
        System.out.println("Enter Details of 5 Employees ");
        do{
            System.out.println("\nEnter Data of employee "+i);
            e1[i-1]=new employee();
            e1[i-1].setData();
            i++;
        }while(i<=5);

        System.out.println("\nTotal number of emloyees are : "+n+"\n");

        if(n>0){
            System.out.println("--- Details of the employees ---");
            System.out.println();
            for(i=1;i<=n;i++)
            {
                System.out.println("Details of employee "+i);
                e1[i].getData();
                System.out.println();
            }
        }
    }
}
