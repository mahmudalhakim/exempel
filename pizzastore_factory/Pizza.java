package pizzastore_factory;

public abstract class Pizza {

    protected String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing the " + this.name + " pizza");
    }
    
    abstract public void bake();
}
