package decorator;

public class DecoratorPizza extends BasePizza{
    protected Pizza decoratedPizza;
    public DecoratorPizza(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
    @Override
    public String makePizza(String s){
        return decoratedPizza.makePizza(s);
    }
}
