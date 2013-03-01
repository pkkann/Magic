/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model.cards;

/**
 *
 * @author Tobias
 */
public class Artifact extends Card{

    public Artifact(String name, String text, String manaCost, Boolean isLegendary) {
        super(name, text, manaCost, isLegendary);
        super.setType("Artifact");
    }

    public Artifact() {
        super();
        super.setType("Artifact");
    }
    
}
