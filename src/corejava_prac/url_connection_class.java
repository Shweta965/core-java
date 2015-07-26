/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava_prac;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 *
 * @author Shweta
 */
public class url_connection_class {

    public static void main(String[] args) throws MalformedURLException, IOException {

        URL obj = new URL("http://finance.yahoo.com/news/78-years-ago-journalist-studied-150000180.html");
        URLConnection conn = obj.openConnection();
        System.out.println(new Date(conn.getDate()));
       // System.out.println(conn.getContentLength());
        int l = conn.getContentLength();
        System.out.println("legnth "+l);
        if (l == 0) {
            System.out.print("nothing to display ");
        } else {
            int ch;
            InputStream ip = conn.getInputStream();
            while ((ch = ip.read()) != -1) {
                System.out.print((char)ch);  
            }
        }
    }
}


