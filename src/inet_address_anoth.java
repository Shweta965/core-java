
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
public class inet_address_anoth {

    public static void main(String[] args) throws MalformedURLException, UnknownHostException {

        URL obj = new URL("http://stackoverflow.com/questions/15984789/what-exactly-does-stream-and-buffer-mean-in-java-i-o");
InetAddress ip = InetAddress.getByName(obj.getHost());
        System.out.println(obj.getHost());
        System.out.println(ip);
    }
}
