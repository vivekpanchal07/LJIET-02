package Assignments;

import java.util.*;
class student {
    int rollNo;
    float marks;
    String name;

    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No. : ");
        this.rollNo = sc.nextInt();
        System.out.println("Enter the Name : ");
        this.name = sc.next();
        System.out.println("Enter the Marks : ");
        this.marks = sc.nextFloat();
        System.out.println();
    }

    public void getData(){
        System.out.println("Roll No. : "+rollNo);
        System.out.println("Marks : "+marks);
        System.out.println("Name : "+name);
    }
}

public class ArrayOfObj {
    public static void main (String args[]){
        int i=1;
        student s1[] = new student[5];
        do{
            System.out.println("Enter Data of student "+i);
            s1[i]=new student();
            s1[i].setData();
            i++;
        }while(i<=5);

        System.out.println("--- Details of the studens ---");
        System.out.println();

        for(i=1;i<=5;i++){
            System.out.println("Details of student "+i);
            s1[i].getData();
            System.out.println();
        }
    }


}
