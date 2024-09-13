package Adapter;

public class TransmitterAdapter implements Transmitter{

    private TransmitterAPI transmitterAPI = new TransmitterAPI();
    
    @Override
    public String transmit(String frequency, String stream) {
        
        String modifiedFrequency = transmitterAPI.modifyFrequency(frequency);
        String modifiedStream = transmitterAPI.modifyStream(stream);
        String result = String.format("%s 주파수를 이용하여 %s를 아날로그 신호로 변경하겠습니다.", modifiedFrequency, modifiedStream);
        
        return result;

    }

    public TransmitterAdapter(TransmitterAPI api){
        this.transmitterAPI = api;
    }
}
