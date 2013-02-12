/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import magic.graphics.GraphicsHandler;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 *
 * @author tobi6053
 */
public class Game {
    
    private final String gameTitle = "Magic";
    
    private AppGameContainer app;
    
    public Game() {
        
    }
    
    public void startGraphics() {
        try {
            app = new AppGameContainer(new GraphicsHandler(gameTitle));
            app.setDisplayMode(1024, 768, false);
            app.start();
        } catch (SlickException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game  = new Game();
        game.startGraphics();
    }
}
