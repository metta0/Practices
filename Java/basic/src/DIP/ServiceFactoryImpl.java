package DIP;

public class ServiceFactoryImpl implements ServiceFactory {


    public Service makeService(){
        return new ConcreteImpl();
    };
    
}
