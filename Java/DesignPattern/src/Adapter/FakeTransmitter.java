package Adapter;

public class FakeTransmitter implements Transmitter {

    @Override
    public String transmit(String frequency, String stream) {
        
        String result = String.format("%s 주파수를 이용하여 %s를 아날로그 신호로 변경하겠습니다.", frequency, stream);
        
        return result;

    }
    
}
