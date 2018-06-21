package decorator;

public class VeganPizza extends DecoratorPizza {
    public VeganPizza(Pizza pizza) {
        super(pizza);
    }

    public String makePizza(String s) {
        return super.makePizza(s) + " Meet was removed.";
    }

}