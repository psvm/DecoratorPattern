package decorator;

public class Pizzeria {
    public static void main(String[] args) {

        Pizza firstPizza = new BasePizza();
        System.out.println(firstPizza.makePizza("shrimp"));
        Pizza secondPizza = new CheesePizza(new BasePizza());
        System.out.println(secondPizza.makePizza("shrimp"));
        Pizza thirdPizza = new VeganPizza(new BasePizza());
        System.out.println(thirdPizza.makePizza("shrimp"));
        Pizza fourthPizza = new CheesePizza(new VeganPizza(new BasePizza()));
        System.out.println(fourthPizza.makePizza("shrimp"));
        Pizza fifthPizza = new VeganPizza(new CheesePizza(new BasePizza()));
        System.out.println(fifthPizza.makePizza("shrimp"));
    }
}
