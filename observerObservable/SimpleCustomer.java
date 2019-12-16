package observerObservable;

public class SimpleCustomer implements Observer {
    private final String customerName;

    public SimpleCustomer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update() {
        System.out.println(this.customerName + " Yay, nu har de uppdaterat produkten!");
    }

    @Override
    public void update(int newState, int oldState) {
        System.out.println(this.customerName + " Yay, nu har de uppdaterat produkten! tidigare var den: " + oldState + " , nu är den: " + newState);
    }
}
