package decorator;

public class CheesePizza extends DecoratorPizza {
    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    public String makePizza(String s) {
        return super.makePizza(s) + " Cheese was added.";
    }

}
