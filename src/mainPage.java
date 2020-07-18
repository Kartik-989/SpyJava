/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kartik
 */

import java.awt.*;
import org.jnativehook.GlobalScreen;
import javax.swing.*;
import org.jnativehook.NativeHookException;

class events extends Thread{
    @Override
    public void run(){
           
        try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}   
       
        
        
        
        keyhandler ke = new keyhandler();
        mouselistner me = new mouselistner();
        mousemotionhandler mme  = new mousemotionhandler(); 
       
        GlobalScreen.addNativeKeyListener(ke);
        GlobalScreen.addNativeMouseListener(me);
        GlobalScreen.addNativeMouseMotionListener(me);
        GlobalScreen.addNativeMouseWheelListener(mme);
        
    }
    
}
class socket extends Thread{
    @Override
    public void run(){
        socket_server windows_event = new socket_server();
        windows_event.socket();
        
    }
    
}
class gui extends Thread{
    @Override
    public void run(){
         JFrame jf;
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600, 600);
        jf.setLayout(new GridLayout());
        jf.setVisible(true);
    
}
}

public class mainPage {
    
    
    public static void main(String[] args)
            
	{   
            gui th1 = new gui();
            th1.start();
            events th2 = new events();
            th2.start();
            socket th3 = new socket();
            th3.start();
           
                
	}

   
    
}

