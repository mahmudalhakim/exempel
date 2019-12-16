package UMLToCodeExample;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private int ShippingWeight;
    private String description;
    private List<OrderDetail> orderDetailList;

    public Item(int shippingWeight, String description) {
        this.ShippingWeight = shippingWeight;
        this.description = description;
        this.orderDetailList = new ArrayList<>();
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void addOrderDetail(OrderDetail orderDetailList) {
        this.orderDetailList.add(orderDetailList);
    }

    public int getShippingWeight() {
        return ShippingWeight;
    }

    public void setShippingWeight(int shippingWeight) {
        ShippingWeight = shippingWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
