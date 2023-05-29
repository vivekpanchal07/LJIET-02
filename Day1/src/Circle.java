import java.util.Scanner;

public class Circle {
    float radius ,area ,circumference;
    final float PI = (float) Math.PI;
    Scanner sc = new Scanner(System.in);
    public void setData(){
        System.out.println("Enter Radius of the Circle: ");
        radius = sc.nextFloat();
        circumference = 2*PI*radius;
        area = PI*radius*radius;
    }
    public void getData(){
        System.out.println("Radius of Circle: "+ radius);
        System.out.println("Area of Circle: "+ area);
        System.out.println("Circumference of Circle: "+ circumference);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setData();
        c1.getData();
    }
}
