package magic.testgraphics;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Patrick
 */
public class Graphics extends StateBasedGame {

    public static final int MENUSTATE = 0;

    public Graphics() {
        super("Graphics test");
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        this.addState(new Menu(MENUSTATE));
    }
}
