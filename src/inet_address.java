
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shweta
 */
public class inet_address {
    public static void main(String[] args) throws IOException {
        // how to accept the name of website.
        // if we want to accept the name of website from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("accept the name of website from keyboard");
     //  System.out.println(br);
        String str = br.readLine();
        System.out.println(str);
   InetAddress ip ;
        ip = InetAddress.getByName(str);
    }
}
