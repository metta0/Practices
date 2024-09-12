package Singleton;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SingletonTest {
    
    @Test
    public void singletonTest(){
        PayCard card1 = PayCard.getInstance();
        PayCard card2 = PayCard.getInstance();

        assertEquals(card1, card2);
    }
    
}
