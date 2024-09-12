package Stratedgy;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StrategyTest {
    
    @Test
    public void legacyPayTest(){
        PurchaseService service = new PurchaseService();
        

        /* String result = service.pay("card");
        assertEquals("카드로 지급",  result);
        
        String result2 = service.pay("money");
        assertEquals("현금으로 지급", result2);

        String result3 = service.pay("applepay");
        assertEquals("애플로 지급", result3); */
    } 

    @Test
    public void newPayTest(){
        PurchaseService service = new PurchaseService();

        String result = service.pay(new PayCard());
        assertEquals("카드로 지급", result);
        
        String result2 = service.pay(new PayCash());
        assertEquals("현금으로 지급", result2);

        String result3 = service.pay(new PayApple());
        assertEquals("애플로 지급", result3);

        String result4 = service.pay(new PaySamsung());
        assertEquals("삼성페이로 지급", result4);

    }
    
}
