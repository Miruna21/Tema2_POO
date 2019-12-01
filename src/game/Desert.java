package game;

import java.util.ArrayList;

public final class Desert implements Ground {
    private static final float SPECIALLANDMODIFIER = 1.1f;
    private static final int NRROUNDSPARALYZED = 3;
    private ArrayList<Integer> playersOnThisPlaceId;
    public Desert() {
        this.playersOnThisPlaceId = new ArrayList<>();
    }

    public ArrayList<Integer> getPlayersOnThisPlaceId() {
        return playersOnThisPlaceId;
    }

    @Override
    public void addPlayerOnThisPlaceId(final Integer playerOnThisPlaceId) {
        this.playersOnThisPlaceId.add(playerOnThisPlaceId);
    }

    @Override
    public void removePlayerOnThisPlaceId(final Integer playerOnThisPlaceId) {
        this.playersOnThisPlaceId.remove(playerOnThisPlaceId);
        this.playersOnThisPlaceId.trimToSize();
    }

    @Override
    public boolean hasTwoPlayersOnThisPlace() {
        if (playersOnThisPlaceId.size() == 2) {
            return true;
        }
        return false;
    }

    public int getNrRoundsParalyzed() {
        return NRROUNDSPARALYZED;
    }

    @Override
    public float transferGroundModifier(final Pyromancer pyromancer) {
        return 1f;
    }

    @Override
    public float transferGroundModifier(final Rogue rogue) {
        return 1f;
    }

    @Override
    public float transferGroundModifier(final Wizard wizard) {
        return SPECIALLANDMODIFIER;
    }

    @Override
    public float transferGroundModifier(final Knight knight) {
        return 1f;
    }
}