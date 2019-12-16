package pizzastore_factory;

public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        super("Chicago Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bakar en veggie pizza chicago style");

    }
}
