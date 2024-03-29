package game.angels;

import game.players.Knight;
import game.players.Pyromancer;
import game.players.Rogue;
import game.players.Wizard;

public final class XpAngel extends Angel {
    private static final int XP_MODIFIER_FOR_KNIGHT = 45;
    private static final int XP_MODIFIER_FOR_PYROMANCER = 50;
    private static final int XP_MODIFIER_FOR_ROGUE = 40;
    private static final int XP_MODIFIER_FOR_WIZARD = 60;

    public XpAngel(final int id, final int xPos, final int yPos) {
        super(id, xPos, yPos);
    }

    public String getName() {
        return "XPAngel";
    }

    @Override
    public boolean visitLivePlayers() {
        return true;
    }

    @Override
    public void visit(final Knight knight) {
        // anunt magicianul de ajutorul ingerului
        knight.getEvent().anEventHappened(knight, this, "help");
        // cresc xp-ul jucatorului
        knight.gainXp(knight.getXp() + XP_MODIFIER_FOR_KNIGHT);
    }

    @Override
    public void visit(final Rogue rogue) {
        // anunt magicianul de ajutorul ingerului
        rogue.getEvent().anEventHappened(rogue, this, "help");
        // cresc xp-ul jucatorului
        rogue.gainXp(rogue.getXp() + XP_MODIFIER_FOR_ROGUE);
    }

    @Override
    public void visit(final Wizard wizard) {
        // anunt magicianul de ajutorul ingerului
        wizard.getEvent().anEventHappened(wizard, this, "help");
        // cresc xp-ul jucatorului
        wizard.gainXp(wizard.getXp() + XP_MODIFIER_FOR_WIZARD);
    }

    @Override
    public void visit(final Pyromancer pyromancer) {
        // anunt magicianul de ajutorul ingerului
        pyromancer.getEvent().anEventHappened(pyromancer, this, "help");
        // cresc xp-ul jucatorului
        pyromancer.gainXp(pyromancer.getXp() + XP_MODIFIER_FOR_PYROMANCER);
    }
}
