/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author pc15
 */
public class PrimoServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ServerSocket ss = new ServerSocket(5049);
            for (;;) {
                Socket s;
                s = ss.accept();
                int i = s.getInputStream().read();
                System.out.println("Il server ha ricevuto: " + i);
                s.close();
            }
        } catch (IOException ex) {
             
        }
    }

}
