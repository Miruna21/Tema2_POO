package game.abilities;

import game.players.Knight;
import game.players.Pyromancer;
import game.players.Rogue;
import game.players.Wizard;

public final class DefenceFightBehavior implements FightBehavior {
    private static final float KNIGHT_ATTACKER_MODIFIER = 0.2f;
    private static final float ROGUE_ATTACKER_MODIFIER = 0.1f;
    private static final float WIZARD_ATTACKER_MODIFIER = 0.2f;
    private static final float PYROMANCER_ATTACKER_MODIFIER = 0.3f;

    private static final float HP_PROCENT_KNIGHT_MODIFIER = 1 / 4f;
    private static final float HP_PROCENT_ROGUE_MODIFIER = 1 / 2f;
    private static final float HP_PROCENT_WIZARD_MODIFIER = 1 / 5f;
    private static final float HP_PROCENT_PYROMANCER_MODIFIER = 1 / 3f;

    @Override
    public void changeFightPowers(final Knight knight) {
        // jucatorul primeste un anumit procent din hp
        int newHp = (int) (knight.getHp() + HP_PROCENT_KNIGHT_MODIFIER * knight.getHp());
        knight.setHp(newHp);
        // scad modificatorii de damage pentru fiecare abilitate a jucatorului
        knight.getFirstAbility().changeAllVictimModifier(-KNIGHT_ATTACKER_MODIFIER);
        knight.getSecondAbility().changeAllVictimModifier(-KNIGHT_ATTACKER_MODIFIER);
    }

    @Override
    public void changeFightPowers(final Rogue rogue) {
        // jucatorul primeste un anumit procent din hp
        int newHp = (int) (rogue.getHp() + HP_PROCENT_ROGUE_MODIFIER * rogue.getHp());
        rogue.setHp(newHp);
        // scad modificatorii de damage pentru fiecare abilitate a jucatorului
        rogue.getFirstAbility().changeAllVictimModifier(-ROGUE_ATTACKER_MODIFIER);
        rogue.getSecondAbility().changeAllVictimModifier(-ROGUE_ATTACKER_MODIFIER);
    }

    @Override
    public void changeFightPowers(final Wizard wizard) {
        // jucatorul primeste un anumit procent din hp
        int newHp = (int) (wizard.getHp() + HP_PROCENT_WIZARD_MODIFIER * wizard.getHp());
        wizard.setHp(newHp);
        // scad modificatorii de damage pentru fiecare abilitate a jucatorului
        wizard.getFirstAbility().changeAllVictimModifier(-WIZARD_ATTACKER_MODIFIER);
        wizard.getSecondAbility().changeAllVictimModifier(-WIZARD_ATTACKER_MODIFIER);
    }

    @Override
    public void changeFightPowers(final Pyromancer pyromancer) {
        // jucatorul primeste un anumit procent din hp
        int newHp = (int) (pyromancer.getHp() + HP_PROCENT_PYROMANCER_MODIFIER
                * pyromancer.getHp());
        pyromancer.setHp(newHp);
        // scad modificatorii de damage pentru fiecare abilitate a jucatorului
        pyromancer.getFirstAbility().changeAllVictimModifier(-PYROMANCER_ATTACKER_MODIFIER);
        pyromancer.getSecondAbility().changeAllVictimModifier(-PYROMANCER_ATTACKER_MODIFIER);
    }
}
