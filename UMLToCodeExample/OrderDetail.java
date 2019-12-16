package UMLToCodeExample;

public class OrderDetail {
    private int quantity;
    private String taxStatus;
    private Item item;
    private Order order;

    public OrderDetail(int quantity, String taxStatus, Item item, Order order) {
        this.quantity = quantity;
        this.taxStatus = taxStatus;
        this.item = item;
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public float calcSubTotal(){
        //?
        return 0;
    }

    public int calcWeith(){
        return this.quantity * item.getShippingWeight();
    }
}
