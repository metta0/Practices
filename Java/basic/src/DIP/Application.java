package DIP;

public class Application {
    
    private Service service;
    
    public Application(ServiceFactory factory){
        this.service = factory.makeService();
    }

    public void doSomething(){
        this.service.perform();
    }
    
}
