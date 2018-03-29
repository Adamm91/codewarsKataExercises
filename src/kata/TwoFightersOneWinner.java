package kata;

public class TwoFightersOneWinner {
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
