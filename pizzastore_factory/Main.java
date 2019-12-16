package pizzastore_factory;

// Example from Head First Design Patterns
public class Main {


    public static void main(String[] args) {
        // Baserat på args så vill jag ha olika pizzor

        PizzaStore nycPizzaStore = new NYCPizzaStore();
        Pizza cheese = nycPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza veggie = chicagoPizzaStore.orderPizza("veggie");

        System.out.println(cheese);
        System.out.println(veggie);




    }
}
