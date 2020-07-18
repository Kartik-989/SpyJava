/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kartik
 */
import java.net.*;
import java.io.*;
public class socket_server {
    public static void socket (){
        try{  
            ServerSocket ss=new ServerSocket(5555);  
            System.out.println("socket created");
            Socket s=ss.accept();//establishes connection   
            System.out.println("client connected");
            BufferedReader dis = new BufferedReader (new InputStreamReader(s.getInputStream())); 
            System.out.println("waiting for data");
            while (true){
            String  str=(String)dis.readLine(); 
            System.out.println("message= "+str);  
            
            saving_events window = new saving_events();
            window.savefile(str);
            System.out.println("saving file called");
            if (str == null ){break;}
            }
 
            ss.close();  
        }
        catch(IOException e){
            System.out.println(e);
        }  
    } 
    
}
    

