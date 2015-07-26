
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
public class inetadrdress_net {
    public static void main(String[] args) throws IOException {
        //get name of website from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str =  br.readLine();
        System.out.println(str);
        InetAddress ip = InetAddress.getByName(str);
        System.out.println(ip);
    }
}
