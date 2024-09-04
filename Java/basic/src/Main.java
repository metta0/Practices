import java.util.ArrayList;

import Abstraction.Animal;
import Abstraction.Dog;
import Abstraction.Pig;

public class Main {
    public static void main(String[] args){

        Dog myDog = new Dog();
        myDog.cry();
        Pig myPig = new Pig();
        myPig.cry();
        myDog.sleep();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(myPig);
        animals.add(myDog);

        for(Animal animal:animals){
            animal.cry();
        }
    }
    
}
