

import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kartik
 */
public class mousewheelhandler implements NativeMouseWheelListener {

    @Override
    public void nativeMouseWheelMoved(NativeMouseWheelEvent mwe) {
        String x = "mouse rotation "+mwe.getWheelRotation();
        //System.out.println(x);
        saving_events mouse_rotation = new saving_events();
        mouse_rotation.savefile(x);    
    }
    
}
