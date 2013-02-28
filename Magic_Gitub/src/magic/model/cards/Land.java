/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model.cards;

/**
 *
 * @author Tobias
 */
public class Land extends Card{

    public Land(String name, String text, Boolean isLegendary) {
        super(name, text, isLegendary);
        super.setType("Land");
    }
    
}
