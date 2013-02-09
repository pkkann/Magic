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
public class Enchantment extends Card{

    public Enchantment(String name, String text, String manaCost, ArrayList<Ability> abilities) {
        super(name, text, manaCost, abilities);
        super.setType("Enchantment");
    }
    
}
