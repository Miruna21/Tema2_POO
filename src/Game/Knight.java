package Game;

public class Knight extends Player {
    private final static int initialHp = 900;
    private final static int plusHpPerLevel = 80;
    private Ability slam = new Slam();
    private Ability execute = new Execute();
    public Knight(final int id, final int xPos, final int yPos){
        super(id, xPos, yPos);
        this.setHp(initialHp);
    }

    public static int getInitialHp() {
        return initialHp;
    }

    public static int getPlusHpPerLevel() {
        return plusHpPerLevel;
    }

    @Override
    public void isHitBy(Player attacker, Ground ground) {
        attacker.fight(this, ground, attacker);
    }

    @Override
    public float acceptLandModifier(Ground g) {
        return g.transferGroundModifier(this);
    }

    @Override
    public void fight(Rogue rogue, Ground ground, Player attacker){
        slam.attack(rogue, ground, attacker);
        execute.attack(rogue, ground, attacker);
    }

    @Override
    public void fight(Wizard wizard, Ground ground, Player attacker){
        slam.attack(wizard, ground, attacker);
        execute.attack(wizard, ground, attacker);
    }

    @Override
    public void fight(Knight knight, Ground ground, Player attacker){
        slam.attack(knight, ground, attacker);
        execute.attack(knight, ground, attacker);
    }

    @Override
    public void fight(Pyromancer pyromancer, Ground ground, Player attacker){
        slam.attack(pyromancer, ground, attacker);
        execute.attack(pyromancer, ground, attacker);
    }
}
