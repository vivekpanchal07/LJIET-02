import java.util.Date;

public class Date1 {
    public void date(){
        Date d1 = new Date();
        System.out.println("Current Date is "+d1);
    }
    public void date2(){
        Date d2 = new Date();
        System.out.printf("%1$s - %2$tB %2$tD %2$tY","Today is : ",d2);
    }

    public static void main(String[] args) {
        Date1 dd = new Date1();
        dd.date();
        dd.date2();
    }
}
