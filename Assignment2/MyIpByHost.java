//A program to find the IP from a host URL

import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class MyIpByHost{
 
    public static void main(String a[]){
     
        try {
            InetAddress host = InetAddress.getByName("www.facebook.com");
            System.out.println(host.getHostAddress());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}

