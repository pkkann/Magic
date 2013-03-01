/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model.cards;

/**
 *
 * @author Tobias
 */
public class Instant extends Card{

    public Instant(String name, String text, String manaCost) {
        super(name, text, manaCost);
        super.setType("Instant");
        super.setIsLegendary(false);
    }

    public Instant() {
        super();
        super.setType("Instant");
        super.setIsLegendary(false);
    }
    
    
}
