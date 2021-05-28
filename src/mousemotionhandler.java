/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kartik
 */

import org.jnativehook.mouse.*;
public class mousemotionhandler  implements NativeMouseMotionListener{

   

    @Override
    public void nativeMouseMoved(NativeMouseEvent me) {
        String x = "mouse moved " + me.getX() + ", " + me.getY();
       // System.out.println(x);
        saving_events mouse_events = new saving_events();
        mouse_events.savefile(x);
    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent me) {
       /* String x = "mouse dragged " + me.getX() + ", " + me.getY();
       // System.out.println(x);
        saving_events mouse_events = new saving_events();
        mouse_events.savefile(x);*/
    }    

   
    
}
