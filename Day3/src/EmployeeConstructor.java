public class EmployeeConstructor {
    int id;
    public void show(){
        System.out.println("Show method called");
        System.out.println(id);
    }
    public EmployeeConstructor(){
        System.out.println("EMP Constructor called");
    }
    public EmployeeConstructor(int id){
        this.id = id;
        System.out.println("EMP Constructor will Parameter Called"+id);
    }
    public static void main(String[] args) {
        EmployeeConstructor obj = new EmployeeConstructor();
        EmployeeConstructor obj1 = new EmployeeConstructor(5);
        obj.show();
        obj1.show();
    }
}
