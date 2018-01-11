package Obiekt21;

public class Peasant extends Citizen {
    @Override
    public boolean canVote() {
        return false;
    }
    Peasant peasant = new Peasant();
}
