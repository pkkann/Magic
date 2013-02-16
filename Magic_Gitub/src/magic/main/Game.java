/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.main;

import magic.gui.GameGUI;
import magic.gui.LauncherGUI;

/**
 *
 * @author tobi6053
 */
public class Game {
    
    private final String gameTitle = "Magic";
    
    private GameGUI gGUI;
    private LauncherGUI lGUI;
    
    
    public Game() {
        startLauncher(gGUI);
    }
    
    public void startGUI() {
        gGUI = new GameGUI();
    }
    
    public void startLauncher(GameGUI gameGUI) {
        lGUI = new LauncherGUI(gameGUI);
        lGUI.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();
    }
}
