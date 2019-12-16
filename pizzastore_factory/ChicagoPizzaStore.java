package pizzastore_factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        if ("cheese".equals(type)) {
            return new ChicagoCheezePizza();
        } else if ("veggie".equals(type)) {
            return new ChicagoVeggiePizza();
        } else {
            throw new RuntimeException();
        }
    }
}
