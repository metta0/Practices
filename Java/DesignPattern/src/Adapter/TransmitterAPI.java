package Adapter;

public class TransmitterAPI {

    public String modifyFrequency(String frequency){
        return frequency.replace('9','0');
    }

    public String modifyStream(String stream){
        return stream.replace('a','A');
    }
}
