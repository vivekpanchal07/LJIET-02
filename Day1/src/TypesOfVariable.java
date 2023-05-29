public class TypesOfVariable {
    int empId = 1; //instane Variable
    static String org_name = "TCS"; //class variable
    int salary = 1234;

    public void calSalary() {
        int da,ta,hra,basic; //local Variable
        basic = 999;
        System.out.println("Basic Salary: "+basic);
    }

    public static void main(String[] args) {
        TypesOfVariable t1 = new TypesOfVariable();
        System.out.println("Emp ID: "+ t1.empId);
        System.out.println("Organization Name: "+ org_name);
        t1.calSalary();
    }
}
