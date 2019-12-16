package observerObservable;

public class Main {
    public static void main(String[] args) {
        SimpleCustomer customer1 = new SimpleCustomer("Customer 1");
        SimpleCustomer customer2 = new SimpleCustomer("Customer 2");

        Hat hat  = new Hat();
        hat.attach(customer1);
        hat.attach(customer2);

        hat.setPrice(1000);
        hat.setColour("Green");
    }
}
