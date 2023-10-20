import java.net.*;

public class practice {

    public static void main(String[] args) throws Exception {
        printMachineInfo();
    }

    public static void printMachineInfo() throws Exception {
            InetAddress localhost = InetAddress.getLocalHost();
            String hostName = localhost.getHostName();
            String ipAddress = localhost.getHostAddress();

            System.out.println("Host Name: " + hostName);
            System.out.println("IP Address: " + ipAddress);
            System.out.println("Google IP: " + InetAddress.getByName("www.google.com"));
            InetAddress allIPs[] = InetAddress.getAllByName("www.ljinstitutes.org");
            System.out.println("Multiple IPs: ");
            for (int i=0; i<allIPs.length; i++)
                System.out.println(allIPs[i]);
    }
}