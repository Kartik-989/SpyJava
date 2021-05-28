/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kartik
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class saving_events {
    
 
    void savefile(String x) {
        File f = new File("/home/kartik/Desktop/data.txt");
        if(f.exists()){
            //System.out.println("File exists");
            if(f.canWrite()){
                FileWriter fw = null;
                try {
                    fw = new FileWriter("/home/kartik/Desktop/data.txt", true);
                    fw.write(x+"\n");
                    fw.close();
                    //System.out.println("String writed");
                } catch (IOException ex) {
                    Logger.getLogger(saving_events.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(saving_events.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
            
        }
        else{
            try {
                if(f.createNewFile()){
                   // System.out.println("File created");
                    if(f.canWrite()){
                        FileWriter fw = new FileWriter("/home/kartik/Desktop/data.txt");
                        fw.write(x+"\n");
                        fw.close();
                       // System.out.println("String writed");
                        
                        
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(saving_events.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
     
 }
