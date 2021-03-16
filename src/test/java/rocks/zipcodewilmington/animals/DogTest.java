package rocks.zipcodewilmington.animals;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.Food;

import java.util.Date;

public class DogTest {

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Rex";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog1.getName();
        Date retrievedBirthDate = dog1.getBirthDate();
        Integer retrievedId = dog1.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void  setNameTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        dog1.setName("Azula");
        String namePassedIn = dog1.getName();

        Assert.assertEquals("Azula", namePassedIn);

    }
    @Test
    public void  setNameTest2() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        dog1.setName("Azula");
        String namePassedIn = dog1.getName();

        Assert.assertNotEquals("123", namePassedIn);

    }

    @Test
    public void  setBirthDateTest1() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        dog1.setBirthDate(newBirthdate);
        Date retrievedBirthDate = dog1.getBirthDate();

        Assert.assertEquals(newBirthdate, retrievedBirthDate);

    }

    @Test
    public void  setBirthDateTest2() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        dog1.setBirthDate(newBirthdate);
        Date retrievedBirthDate = dog1.getBirthDate();

        Assert.assertNotEquals(5, retrievedBirthDate);

    }

    @Test
    public void speakTest1() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        String dogTalk = dog1.speak();

        Assert.assertEquals("bark!", dogTalk);
    }

    @Test
    public void speakTest2() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        String dogTalk = dog1.speak();

        Assert.assertNotEquals("meow!", dogTalk);
    }

    @Test
    public void eatTest1() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        Food kibble = new Food();
        dog1.eat(kibble);
        dog1.eat(kibble);
        int mealHolder = dog1.getNumberOfMealsEaten();

        Assert.assertEquals(2, mealHolder);
    }

    @Test
    public void eatTest2() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        Food kibble = new Food();
        dog1.eat(kibble);
        dog1.eat(kibble);
        dog1.eat(kibble);
        dog1.eat(kibble);
        int mealHolder = dog1.getNumberOfMealsEaten();

        Assert.assertEquals(4, mealHolder);
    }

    @Test
    public void getId1() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 8675369;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        Integer returnedID = dog1.getId();

        Assert.assertEquals(givenId, returnedID);
    }

    @Test
    public void getId2() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 1793;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);
        Integer returnedID = dog1.getId();

        Assert.assertEquals(givenId, returnedID);
    }

    @Test
    public void instanceOfAnimalTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 1793;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog1 instanceof Mammal);
    }

    @Test
    public void instanceOfMammalTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 1793;

        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog1 instanceof Animal);
    }
}
