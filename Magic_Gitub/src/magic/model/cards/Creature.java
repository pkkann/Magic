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
public class Creature extends Card
{
    private int power;
    private int toughness;
    private String creatureType;

    public Creature(int power, int toughness, String creatureType, String name, String text, String manaCost, Boolean isLegendary) {
        super(name, text, manaCost, isLegendary);
        this.power = power;
        this.toughness = toughness;
        this.creatureType = creatureType;
        super.setType("Creature");
    }

    public Creature(int power, int toughness, String creatureType, String name, String text, String manaCost, String type,Boolean isLegendary, ArrayList<Ability> abilities) {
        super(name, text, manaCost, isLegendary, abilities);
        this.power = power;
        this.toughness = toughness;
        this.creatureType = creatureType;
        super.setType("Creature");
    }

    public String getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(String creatureType) {
        this.creatureType = creatureType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }
    
}
