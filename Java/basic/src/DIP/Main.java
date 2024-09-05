package DIP;

public class Main {

    public static void main(String[] args){
        
        // Service service = new ConcreteImpl();
        ServiceFactoryImpl serviceFactory= new ServiceFactoryImpl();
        Application app = new Application(serviceFactory);
        app.doSomething();

    }
    
}
