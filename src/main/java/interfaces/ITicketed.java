package interfaces;

import visitors.Visitor;

public interface ITicketed {

    double defaultPrice();

    double priceFor(Visitor visitor);

}
