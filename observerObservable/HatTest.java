package observerObservable;

import org.junit.Assert;
import org.junit.Test;

public class HatTest {

    @Test
    public void attach(){
        Shirt shirt = new Shirt();
        shirt.setColour("Blue");
        Assert.assertEquals("Blue",shirt.getColour());
    }

}
