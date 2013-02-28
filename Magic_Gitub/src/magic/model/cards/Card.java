/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model.cards;

import java.util.ArrayList;
import magic.model.mechanics.Ability;

/**
 *
 * @author tobi6053
 */
public class Card {
    private String name;
    private String text;
    private String manaCost;
    private String type;
    private Boolean isLegendary;
    private ArrayList<Ability> abilities;
    private String rarity;

    public Card(String name, String text, String manaCost, Boolean isLegendary, ArrayList<Ability> abilities) {
        this.name = name;
        this.text = text;
        this.manaCost = manaCost;
        this.isLegendary = isLegendary;
        this.abilities = abilities;
    }

    public Card(String name, String text, String manaCost, Boolean isLegendary) {
        this.name = name;
        this.text = text;
        this.manaCost = manaCost;
        this.isLegendary = isLegendary;
        abilities = new ArrayList<>();
    }

    public Card(String name, String text, Boolean isLegendary) {
        this.name = name;
        this.text = text;
        this.isLegendary = isLegendary;
        abilities = new ArrayList<>();
    }

    public Card(String name, String text, String manaCost) {
        this.name = name;
        this.text = text;
        this.manaCost = manaCost;
        abilities = new ArrayList<>();
    }
    

    public Card() {
        abilities = new ArrayList<>();
    }
    

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public Boolean getIsLegendary() {
        return isLegendary;
    }

    public void setIsLegendary(Boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    
    
}
