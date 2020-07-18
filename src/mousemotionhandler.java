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
public class mousemotionhandler  implements NativeMouseWheelListener{

    @Override
    public void nativeMouseWheelMoved(NativeMouseWheelEvent mme) {
        String x = "mouse rotation "+mme.getWheelRotation();
        //System.out.println(x);
        saving_events mouse_rotation = new saving_events();
        mouse_rotation.savefile(x);
    }
    
}
