import java.util.Scanner;

public class DateClass {
    int date = 0;
    int month = 0;
    int year = 0;
    public DateClass() {
        this.date = 0;
        this.month = 0;
        this.year = 0;
        System.out.println("Default Constructor Called");
        System.out.println(this.date+" "+this.month+" "+this.year);
    }
    public DateClass(int date,int month) {
        this.date = date;
        this.month = month;
        System.out.println("Constructor with 2 Param Called");
        System.out.println(this.date+" "+this.month);
    }
    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
        System.out.println("Constructor with 3 Param Called");
        System.out.println(this.date+" "+this.month+" "+this.year);
    }

    public void setDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Date");
        date = sc.nextInt();
        System.out.println("Please Enter Month");
        month = sc.nextInt();
        System.out.println("Please Enter Year");
        year = sc.nextInt();
    }

    public static void main(String[] args) {
        DateClass d1 = new DateClass();
        DateClass d2 = new DateClass(7,1);
        DateClass d3 = new DateClass(8,2,2001);
    }
}
