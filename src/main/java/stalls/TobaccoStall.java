package stalls;

import interfaces.ISecurity;
import visitors.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

}
