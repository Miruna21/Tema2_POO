package game.angels;

import game.players.*;

public class DarkAngel extends Angel {
    private static final int HP_MODIFIER_FOR_KNIGHT = 40;
    private static final int HP_MODIFIER_FOR_PYROMANCER = 30;
    private static final int HP_MODIFIER_FOR_ROGUE = 10;
    private static final int HP_MODIFIER_FOR_WIZARD = 20;

    public DarkAngel(int id, int xPos, int yPos) {
        super(id, xPos, yPos);
    }

    public String getName() {
        return "DarkAngel";
    }

    @Override
    public void visit(Knight knight) {
        // daca jucatorul este in viata
        if (knight.getLife()){
            // scad hp-ul jucatorului
            knight.subHp(HP_MODIFIER_FOR_KNIGHT);
            // verific daca ingerul a omorat jucatorul
            verifyPlayerKilledByAngel(knight, this);
        }
    }

    @Override
    public void visit(Rogue rogue) {
        // daca jucatorul este in viata
        if (rogue.getLife()){
            // scad hp-ul jucatorului
            rogue.subHp(HP_MODIFIER_FOR_ROGUE);
            // verific daca ingerul a omorat jucatorul
            verifyPlayerKilledByAngel(rogue, this);
        }
    }

    @Override
    public void visit(Wizard wizard) {
        // daca jucatorul este in viata
        if (wizard.getLife()){
            // scad hp-ul jucatorului
            wizard.subHp(HP_MODIFIER_FOR_WIZARD);
            // verific daca ingerul a omorat jucatorul
            verifyPlayerKilledByAngel(wizard, this);
        }
    }

    @Override
    public void visit(Pyromancer pyromancer) {
        // daca jucatorul este in viata
        if (pyromancer.getLife()){
            // scad hp-ul jucatorului
            pyromancer.subHp(HP_MODIFIER_FOR_PYROMANCER);
            // verific daca ingerul a omorat jucatorul
            verifyPlayerKilledByAngel(pyromancer, this);
        }
    }

    private void verifyPlayerKilledByAngel(final Player attacker, final Angel angel){
        // daca jucatorul a fost omorat de inger, anunt magicianul
        if (!attacker.getLife()){

        }
    }
}
