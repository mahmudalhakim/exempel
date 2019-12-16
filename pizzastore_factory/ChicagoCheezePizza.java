package pizzastore_factory;

public class ChicagoCheezePizza extends Pizza {

    public ChicagoCheezePizza() {
        super("Chicago Cheeze Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bakar en cheeze pizza chicago style");
    }
}
