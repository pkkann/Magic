/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.model;

import java.util.Random;
import magic.model.cards.*;
import magic.model.mechanics.Ability;

/**
 *
 * @author Tobias
 */
public class CardGenerator {

    private Card card;
    private Random r;

    public Card createCard() {
        card = new Card();
        randomType();
        return card;
    }

    public Card createCard1() {
        Creature creature = new Creature();
        creature.setPower(4);
        creature.setToughness(5);
        creature.setCreatureType("Griffin");
        card = (Creature) creature;
        card.setName("Hellborn Griffin");
        card.setIsLegendary(true);
        card.setManaCost("4R");
        card.setRarity("Rare");
        card.setText("Trample, Flying");
        card.setType("Creature");
        return card;
    }

    private void randomType() {
        r = new Random();
        int roll = r.nextInt(100);
        // 50
        if (roll < 100) {
            makeCreature();
        } else if (roll < 65) {
            card.setType("Instant");
            makeInstant();
        } else if (roll < 80) {
            card.setType("Sorcery");
            makeSorcery();
        } else if (roll < 90) {
            card.setType("Artifact");
            makeArtifact();
        } else if (roll < 95) {
            card.setType("Enchantment");
            makeEnchantment();
        } else if (roll == 100) {
            card.setType("Land");
            makeLand();
        }
    }

    private void makeCreature() {
        Creature creature = new Creature();
        setPowerAndToughness(creature);
        creature.setCreatureType(randomCreatureType());
        creature.setRarity(randomRarity());
        card = (Creature) creature;
        card.setType("Creature");
        card.setName(randomName());
        card.setManaCost(randomCMC());
        card.getAbilities().add(new Ability(randomAbility()));
        card.setText(randomAbility());
        randomLegendarity();
    }

    private void makeInstant() {
    }

    private void makeSorcery() {
    }

    private void makeArtifact() {
    }

    private void makeEnchantment() {
    }

    private void makeLand() {
    }

    private String randomCMC() {
        String s = "";
        r = new Random();
        int roll = r.nextInt(6);

        if (roll == 0) {
            s = s + "G";
        } else if (roll == 1) {
            s = s + "U";
        } else if (roll == 2) {
            s = s + "W";
        } else if (roll == 3) {
            s = s + "R";
        } else if (roll == 4) {
            s = s + "B";
        } else if (roll == 5) {
            if (card.getType().equals("Creature")) {
                card.setType("Artifact " + card.getType());
            } else {
                randomCMC();
            }
        }
        roll = r.nextInt(8);
        if (roll != 0) {
            s = roll + s;
        } else {
        }
        return s;
    }

    private void randomLegendarity() {
        r = new Random();
        int roll = r.nextInt(100);
        if (roll < 15) {
            card.setIsLegendary(true);
        } else {
            card.setIsLegendary(false);
        }
    }

    private String randomName() {
        return "lars";
    }

    private String randomCreatureType() {
        return "Griffin";
    }

    private String randomAbility() {
        return "Trample";
    }

    private String randomEOTAffect() {
        return "Target creature gains Trample until end of turn";
    }

    private void setPowerAndToughness(Creature c) {
        r = new Random();
        int roll = r.nextInt(6);
        c.setPower(roll);
        roll = r.nextInt(6);
        c.setToughness(roll + 1);
        card = (Creature) c;
    }

    private String randomRarity() {
        r = new Random();
        int roll = r.nextInt(5);
        if (roll == 0) {
            return "Common";
        } else if (roll == 1) {
            return "Uncommon";
        } else if (roll == 2) {
            return "Rare";
        } else if (roll == 3) {
            return "Mythic";
        } else if (roll == 4) {
            return "Epic";
        }
        return null;
    }
}
