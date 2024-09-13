package Adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommunicationController {
    
    

    @Test
    public void testTransmitter(){
        TransmitterAPI api = new TransmitterAPI();
        Transmitter transmitter = new TransmitterAdapter(api);
        String result = transmitter.transmit("97.5Mhz","abcdefghizklmnopqrstuvwxyz");
        assertEquals("07.5Mhz 주파수를 이용하여 Abcdefghizklmnopqrstuvwxyz를 아날로그 신호로 변경하겠습니다.", result);
    }
}
