
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shweta
 */
public class ip_address {

    public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        URL obj = new URL("https://www.google.com");
        System.out.println(obj.getHost());
        InetAddress ip = InetAddress.getByName(obj.getHost());
        
        System.out.println(ip);
    }

}
