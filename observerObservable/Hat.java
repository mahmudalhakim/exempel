package observerObservable;


import java.util.ArrayList;
import java.util.List;

public class Hat implements Observable {

    private List<Observer> observerList = new ArrayList<>();
    private int price = 500;
    private String colour = "red";

    @Override
    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    public void setPrice(int newPrice){
        for(Observer o : observerList){
            o.update(newPrice, this.price);
        }
        this.price = newPrice;
    }

    public void setColour(String newColor){
        for (Observer o: observerList) {
            o.update();
        }
    }

    public List<Observer> getObserverList(){
        return this.observerList;
    }
}
