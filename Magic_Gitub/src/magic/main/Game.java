/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.main;

import magic.gui.GameGUI;
import magic.gui.LauncherGUI;
import magic.gui.dialogs.Deck_buildDIA;

/**
 *
 * @author tobi6053
 */
public class Game {
    
    private GameGUI gGUI;
    private LauncherGUI lGUI;
    
    private Deck_buildDIA d_BDIA;
    
    
    public Game() {
        startGUI();
    }
    
    public void startGUI () {
        
        
        d_BDIA = new Deck_buildDIA(gGUI, true);
        
        gGUI = new GameGUI(d_BDIA);
        
        lGUI = new LauncherGUI(gGUI);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();
        game.lGUI.setVisible(true);
    }
}
