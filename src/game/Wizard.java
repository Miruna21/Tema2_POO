package game;

public final class Wizard extends Player {
    private static final int INITIALHP = 400;
    private static final int PLUSHPPERLEVEL = 30;
    private Character race = 'W';
    private Ability drain = new Drain();
    private Ability deflect = new Deflect();

    public Wizard(final int id, final int xPos, final int yPos) {
        super(id, xPos, yPos);
        this.setHp(INITIALHP);
    }

    public Character getRace() {
        return race;
    }

    public int getInitialHp() {
        return INITIALHP;
    }

    public int getPlusHpPerLevel() {
        return PLUSHPPERLEVEL;
    }

    @Override
    public void isHitBy(final Player attacker, final Ground ground) {
        attacker.fight(this, ground, attacker);
    }

    @Override
    public float acceptLandModifier(final Ground g) {
        return g.transferGroundModifier(this);
    }

    @Override
    public void fight(final Rogue rogue, final Ground ground, final Player attacker) {
        drain.attack(rogue, ground, attacker);
        deflect.attack(rogue, ground, attacker);
    }

    @Override
    public void fight(final Wizard wizard, final Ground ground, final Player attacker) {
        drain.attack(wizard, ground, attacker);
        deflect.attack(wizard, ground, attacker);
    }

    @Override
    public void fight(final Knight knight, final Ground ground, final Player attacker) {
        drain.attack(knight, ground, attacker);
        deflect.attack(knight, ground, attacker);
    }

    @Override
    public void fight(final Pyromancer pyromancer, final Ground ground, final Player attacker) {
        drain.attack(pyromancer, ground, attacker);
        deflect.attack(pyromancer, ground, attacker);
    }
}