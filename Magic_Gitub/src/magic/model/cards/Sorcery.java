/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model.cards;

/**
 *
 * @author Tobias
 */
public class Sorcery extends Card{

    public Sorcery(String name, String text, String manaCost) {
        super(name, text, manaCost);
        super.setType("Sorcery");
        super.setIsLegendary(false);
    }

    public Sorcery() {
        super();
        super.setType("Sorcery");
        super.setIsLegendary(false);
    }
    
}
