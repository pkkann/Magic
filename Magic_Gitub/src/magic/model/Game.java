/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model;

import java.util.ArrayList;
import magic.model.cards.Card;

/**
 *
 * @author tobi6053
 */
public class Game {
    private ArrayList<Card> stack;
    private ArrayList<Card> battlefield;
    private ArrayList<Card> hand;
    private ArrayList<Card> graveyard;
    private ArrayList<Card> exiled;
    private ArrayList<Card> attackzone;
    private ArrayList<Card> defendzone;
    //ArrayList<ArrayList> al;
    private Player p1;
    private Player p2;
}
