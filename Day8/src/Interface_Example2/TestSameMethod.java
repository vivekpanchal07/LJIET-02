package Interface_Example2;

interface iInterface1 {
    default void dosomething(){
        System.out.println("First Interface");
    }
}
interface iInterface2{
    default void dosomething(){
        System.out.println("Second Interface");
    }
}
class ImplementInterface implements iInterface1,iInterface2{

    @Override
    public void dosomething() {
        iInterface1.super.dosomething();
        iInterface2.super.dosomething();
    }
}
public class TestSameMethod {
    public static void main(String[] args) {
        ImplementInterface obj = new ImplementInterface();
        obj.dosomething();
    }
}
