/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava_prac;

/**
 *
 * @author Shweta
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

class Inputstream {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL obj = new URL("http://news.yahoo.com/british-police-close-peaches-geldof-heroin-inquiry-103758465.html");
        URLConnection conn = obj.openConnection();
        System.out.println(new Date(conn.getDate()));
        System.out.println(conn.getExpiration());
        System.out.println(new Date(conn.getLastModified()));

        int l = conn.getContentLength();
        if (l == 0) {
            System.out.println("nothing to display");
        } else {
            int ch;
            InputStream ip = conn.getInputStream();
            while ((ch = ip.read()) != -1) {
                System.out.print((char) ch);
            }
        }

    }

}
