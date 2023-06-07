package Interface_Example2;
@FunctionalInterface
interface MySquare{
    //FunctionalInterface means that you can have only one method
    int calculate(int num);
//    int add(int num1,int num2);
}
class ImplementMySquare implements MySquare{

    @Override
    public int calculate(int num) {
        return num*num;
    }
}
public class TestFunctionalInterface {

    public static void main(String[] args) {
        ImplementMySquare obj = new ImplementMySquare();
        int answer = obj.calculate(5);
        System.out.println("Square is "+answer);
    }
}
