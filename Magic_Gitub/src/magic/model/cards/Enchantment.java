/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model.cards;

/**
 *
 * @author Tobias
 */
public class Enchantment extends Card{

    public Enchantment(String name, String text, String manaCost) {
        super(name, text, manaCost);
        super.setType("Enchantment");
        super.setIsLegendary(false);
    }

    public Enchantment() {
        super();
        super.setType("Enchantment");
        super.setIsLegendary(false);
    }
    
}
