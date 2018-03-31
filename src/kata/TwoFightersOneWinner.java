package kata;

public class TwoFightersOneWinner {

    /*
    Create a function that returns the name of the winner in a fight between two fighters.

    Each fighter takes turns attacking the other and whoever kills the other first is victorious.
    Death is defined as having health <= 0.
    Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
    Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
    You can mutate the Fighter objects.
     */

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter first = fighter1;
        Fighter second = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            first = fighter2;
            second = fighter1;
        }
        while (fighter1.health > 0 && fighter2.health > 0) {
            second.health -= first.damagePerAttack;
            if (second.health <= 0) return first.name;
            first.health -= second.damagePerAttack;
            if (first.health <= 0) return second.name;
        }
        return null;
    }
}

class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
