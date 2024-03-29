package game.angels;

import game.players.Knight;
import game.players.Pyromancer;
import game.players.Rogue;
import game.players.Wizard;

public final class GoodBoy extends Angel {
    private static final float DAMAGE_MODIFIER_FOR_KNIGHT = 0.4f;
    private static final float DAMAGE_MODIFIER_FOR_PYROMANCER = 0.5f;
    private static final float DAMAGE_MODIFIER_FOR_ROGUE = 0.4f;
    private static final float DAMAGE_MODIFIER_FOR_WIZARD = 0.3f;

    private static final int HP_MODIFIER_FOR_KNIGHT = 20;
    private static final int HP_MODIFIER_FOR_PYROMANCER = 30;
    private static final int HP_MODIFIER_FOR_ROGUE = 40;
    private static final int HP_MODIFIER_FOR_WIZARD = 50;

    public GoodBoy(final int id, final int xPos, final int yPos) {
        super(id, xPos, yPos);
    }

    public String getName() {
        return "GoodBoy";
    }

    @Override
    public boolean visitLivePlayers() {
        return true;
    }

    @Override
    public void visit(final Knight knight) {
        // cresc modificatorii de damage pentru fiecare abilitate a jucatorului
        knight.getFirstAbility().changeAllVictimModifier(DAMAGE_MODIFIER_FOR_KNIGHT);
        knight.getSecondAbility().changeAllVictimModifier(DAMAGE_MODIFIER_FOR_KNIGHT);
        // cresc hp-ul jucatorului
        knight.addHp(HP_MODIFIER_FOR_KNIGHT);
        // anunt magicianul de ajutorul ingerului
        knight.getEvent().anEventHappened(knight, this, "help");
    }

    @Override
    public void visit(final Rogue rogue) {
        // cresc modificatorii de damage pentru fiecare abilitate a jucatorului
        rogue.getFirstAbility().changeAllVictimModifier(DAMAGE_MODIFIER_FOR_ROGUE);
        rogue.getSecondAbility().changeAllVictimModifier(DAMAGE_MODIFIER_FOR_ROGUE);
        // cresc hp-ul jucatorului
        rogue.addHp(HP_MODIFIER_FOR_ROGUE);
        // anunt magicianul de ajutorul ingerului
        rogue.getEvent().anEventHappened(rogue, this, "help");
    }

    @Override
    public void visit(final Wizard wizard) {
        // cresc modificatorii de damage pentru fiecare abilitate a jucatorului
        wizard.getFirstAbility().changeAllVictimModifier(DAMAGE_MODIFIER_FOR_WIZARD);
        wizard.getSecondAbility().changeAllVictimModifier(DAMAGE_MODIFIER_FOR_WIZARD);
        // cresc hp-ul jucatorului
        wizard.addHp(HP_MODIFIER_FOR_WIZARD);
        // anunt magicianul de ajutorul ingerului
        wizard.getEvent().anEventHappened(wizard, this, "help");
    }

    @Override
    public void visit(final Pyromancer pyromancer) {
        // cresc modificatorii de damage pentru fiecare abilitate a jucatorului
        pyromancer.getFirstAbility().
                    changeAllVictimModifier(DAMAGE_MODIFIER_FOR_PYROMANCER);
        pyromancer.getSecondAbility().
                    changeAllVictimModifier(DAMAGE_MODIFIER_FOR_PYROMANCER);
        // cresc hp-ul jucatorului
        pyromancer.addHp(HP_MODIFIER_FOR_PYROMANCER);
        // anunt magicianul de ajutorul ingerului
        pyromancer.getEvent().anEventHappened(pyromancer, this, "help");
    }
}
