public class Encapsulation {
    String sName;
    void showName(){
        System.out.println("Student Name is "+sName);

    }

    public static void main(String[] args) {
        Encapsulation s1 = new Encapsulation();
        s1.showName();

        teacher t1 = new teacher();
        t1.showName();
//        t1.showSalary();
    }
}
class teacher{
    String name;
    int salary = 3000;
    String tName = "My Teacher";
    public void showName(){
        System.out.println("Teacher Name is "+tName);
    }
    private void showSalary(){
        System.out.println("Teacher Salary is 3000");
    }
}