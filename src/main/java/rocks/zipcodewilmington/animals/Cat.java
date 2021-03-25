package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {

    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public Cat(String name){
        super(name,new Date(), -1);
    }

    public Cat(String name, Integer id){
        super(name, new Date(), id);
    }

    @Override
    public String speak() {
        return "meow!";
    }


}


