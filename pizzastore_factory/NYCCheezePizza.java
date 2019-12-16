package pizzastore_factory;

public class NYCCheezePizza extends Pizza {

    public NYCCheezePizza() {
        super("NYC Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bakar NYC pizza i vedugn 350 C grader");

    }
}
