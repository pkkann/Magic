/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.register;

import java.util.ArrayList;
import magic.model.cards.Card;

/**
 *
 * @author tobi6053
 */
public class CardRegister {

    private ArrayList<Card> al;

    public CardRegister() {
        al = new ArrayList<>();
    }

    public ArrayList<Card> getAl() {
        return al;
    }

    public ArrayList<String> getNames() {
        ArrayList<String> as = new ArrayList<>();
        for (int i = 0; i <al.size(); i++) {
            as.add(al.get(i).getName());
        }
        return as;
    }
}
