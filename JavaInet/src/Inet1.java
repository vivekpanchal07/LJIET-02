import java.io.InputStream;
import java.net.*;
import java.util.*;
public class Inet1 {
    public static void main(String[] args) throws Exception{
//        Factory Methods of inet
//        getByName Method
       /* InetAddress ip = InetAddress.getByName("www.google.com");
        System.out.println(ip);
        System.out.println(InetAddress.getByName("www.facebook.com"));
        System.out.println(InetAddress.getByName("localhost"));
        -----------------------------------------------------------------*/
//        getAllByName method
        /*InetAddress[] ip = InetAddress.getAllByName("wixnets.com");
        for (int i = 0; i < ip.length; i++) {
            System.out.println(ip[i]);
        ----------------------------------------------------------------*/
//        getLocalHost method
        /*InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);*/
//        getHostName Method
        /*InetAddress ip = InetAddress.getByName("127.0.0.1");
        System.out.println("Hostname: "+ip.getHostName());*/
//        Program to accept a Website name and return its IP Address, after checking it on internet
        /*InetAddress ip = InetAddress.getByName("www.google.com");
        System.out.println("Host Name: "+ip.getHostName());
        System.out.println("Host Address: "+ip.getHostAddress());*/
//        getAllByName method
        /*InetAddress inet[] = InetAddress.getAllByName("localhost");
        for(InetAddress i:inet){
            System.out.println(i);
        }*/
//        Program to get Protocol, Host Name, Port Number, Default File Name from given URL
        /*URL url = new URL("http://www.google.com/search?q=Vivek");
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Host Name: "+url.getHost());
        System.out.println("Port Number: "+url.getPort());
        System.out.println("Default File: "+url.getFile());
        System.out.println("Authority: "+url.getAuthority());
        System.out.println("Query String: "+url.getQuery());*/
//        Program to display details and page content of your Website
        /*URL url = new URL("https://www.w3schools.com/html/default.asp");
        URLConnection con = url.openConnection();
        System.out.println("Date "+new Date(con.getDate()));
        System.out.println("Content Type: "+con.getContentType());
        System.out.println("Expiry Date "+ new Date(con.getExpiration()));
        System.out.println("Length of Content: "+ con.getContentLength());
        if(con.getContentLength()>0){
            int ch,count =0;
            InputStream in = con.getInputStream();
            while ((ch = in.read())!=1 && count<200){
                System.out.print((char) ch);
                count++;
            }
        }*/
//        instance Method of inet
        /*InetAddress inet = InetAddress.getByName("localhost");
        InetAddress inet1 = InetAddress.getByName("www.google.com");

        System.out.println(""+inet.equals(inet1));
        System.out.println(""+inet.equals(inet));*/


    }
}
