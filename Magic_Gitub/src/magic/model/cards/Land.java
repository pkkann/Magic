/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model.cards;

import java.util.ArrayList;
import magic.model.mechanics.Ability;

/**
 *
 * @author Tobias
 */
public class Land extends Card{

    public Land(String name, String text, Boolean isLegendary, ArrayList<Ability> abilities) {
        super(name, text, isLegendary, abilities);
        super.setType("Land");
    }
    
}
