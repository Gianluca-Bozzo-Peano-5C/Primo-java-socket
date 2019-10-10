/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondoclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author pc15
 */
public class SecondoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket s = new Socket("10.100.21.159", 1050);
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            pw.println("CIAO STUDENTI");
            s.close();
        } catch (IOException ex) {

        }
    }
    
}
