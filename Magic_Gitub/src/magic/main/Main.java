/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import magic.testgraphics.Graphics;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 *
 * @author tobi6053
 */
public class Main {

    public Main() {
        // Graphics test
        try {
            AppGameContainer app = new AppGameContainer(new Graphics());
            app.setDisplayMode(1024, 768, false);
            app.start();
        } catch (SlickException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }
}
