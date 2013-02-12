
package magic.graphics;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Patrick
 */
public class GraphicsHandler extends StateBasedGame{
    
    private static final int MAINMENU_stateID = 0;
    
    public GraphicsHandler(String gameTitle) {
        super(gameTitle);
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        addState(new MainMenu(MAINMENU_stateID));
    }

}
