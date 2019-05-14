package attraction;

import interfaces.ISecurity;
import visitors.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getHeight() > 1.45 && visitor.getAge() > 12);
    }
}
