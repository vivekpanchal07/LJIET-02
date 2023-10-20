import java.net.*;
public class Inet2 {
    public static void main(String[] args) throws Exception{
        InetAddress[] ip = InetAddress.getAllByName("wixnets.com");
        for (int i = 0; i < ip.length; i++) {
            System.out.println(ip[i]);
        }
    }
}
