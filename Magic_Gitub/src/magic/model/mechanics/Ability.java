/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model.mechanics;

/**
 *
 * @author Tobias
 */
public class Ability {
    private String Text;

    public Ability() {
    }

    public Ability(String Text) {
        this.Text = Text;
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }
    
}
