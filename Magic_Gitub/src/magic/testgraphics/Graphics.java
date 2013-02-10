
package magic.testgraphics;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Patrick
 */
public class Graphics extends BasicGame{
    
    public Graphics()
    {
        super("Graphics test");
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        
    }

    @Override
    public void render(GameContainer gc, org.newdawn.slick.Graphics g) throws SlickException {
        g.setColor(Color.white);
        g.drawString("This is a graphics test", 50, 50);
    }

}
