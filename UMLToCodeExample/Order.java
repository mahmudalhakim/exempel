package UMLToCodeExample;

import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private String status;
    private Customer customer;
    private List<OrderDetail> orderDetailList;
    private List<Payment> paymentList;

    public Order(Date date, String status, Customer customer, List<OrderDetail> orderDetailList, List<Payment> paymentList) throws Exception {
        this.date = date;
        this.status = status;
        this.customer = customer;
        if (orderDetailList.size() <= 0) {
            throw new Exception("OrderDetailList must contain at least one order detail");
        }
        this.orderDetailList = orderDetailList;
        if (paymentList.size() <= 0) {
            throw new Exception("PaymentList must contain at least one payment method");
        }
        this.paymentList = paymentList;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetailList.add(orderDetail);
    }

    public OrderDetail removeOrderDetail(OrderDetail orderDetail){
        if(this.orderDetailList.remove(orderDetail)){
            return orderDetail;
        }
        return null;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
}
