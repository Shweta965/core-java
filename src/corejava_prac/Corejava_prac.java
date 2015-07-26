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
import java.net.*;
import java.util.Date;

/**
 *
 * @author Shweta
 */
public class Corejava_prac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        URL obj = new URL("http://finance.yahoo.com/news/studying-500-millionaires-journalist-noticed-183000062.html");
        URLConnection conn = obj.openConnection();
        System.out.println(new Date(conn.getDate()));
    }
}