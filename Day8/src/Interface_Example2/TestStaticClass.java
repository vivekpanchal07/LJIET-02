package Interface_Example2;
interface iVehicle{
    static void startMyVehicle(){
        System.out.println("Starting Vehicle");
    }
}
class Car implements iVehicle{
    public void startMyVehicle(){
        System.out.println("Starting a Vehicle");
    }
}
public class TestStaticClass {
    public static void main(String[] args) {
        iVehicle.startMyVehicle();
    }
}
