package Interface_Example2;

public class TestMarkerInterface {
    interface iRegisterStudent{ //marker Interface

    }
    static class Student implements iRegisterStudent{
        public static void isRegistered(){
            System.out.println("Yes! You are registered");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.isRegistered();

    }
}
