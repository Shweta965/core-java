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
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author Shweta
 */
public class inptstream_prac {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL obj = new URL("http://news.yahoo.com/british-police-close-peaches-geldof-heroin-inquiry-103758465.html");
        URLConnection conn = obj.openConnection();
        System.out.println("Date" + new Date(conn.getDate()));
        System.out.println("Last modified" + conn.getLastModified());
        // now to check length of file and then print content of file
        int l = conn.getContentLength();
        if (l == 0) {
            System.out.println("nothing to display");

        } else {
            int a;
            InputStream ip = conn.getInputStream();
           while ((a = ip.read())!= -1){
            System.out.print((char)a);
        }
           
        }
    }

}
