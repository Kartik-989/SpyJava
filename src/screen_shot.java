import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.AWTException;

import javax.imageio.ImageIO;

public class screen_shot {
	
    public static void main(String[] args) throws Exception
    {
    	try {
            
            Robot r = new Robot();
            String path = "/home/kartik/Desktop/screenshot.jpg"; 
            BufferedImage screenShot = r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(screenShot, "JPG", new File(path));
            System.out.println("screenshot saved");
        }
        catch(AWTException | IOException ex){
                System.out.println(ex);
        }
    }
        
}